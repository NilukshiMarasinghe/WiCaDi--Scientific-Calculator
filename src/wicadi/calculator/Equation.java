package wicadi.calculator;
import static com.sun.javafx.css.SizeUnits.CM;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Equation {
	
	private static final String[] possibles = {"x","pi","e"};
	private static final double tooSmall = .00001;
	private String equation;
	

	public Equation(String eqn){
		equation = finish(eqn);
	}
	

	public void changeEqn(String eqn){
		equation = finish(eqn);
	}
	

	public double findOutput(double x){
		return getAns(equation, x);
	}
	

	private double getAns(String teq, double x){
		//here is where we will find the inner functions
		//break it into sets. cos[x^(4/3)] + (3*4). cos[x^(4/3)] is a set. so is (3*4).
		int pos;
		String newFunc = "";
		//evaluate parenthesis as their own functions.
		if(teq.indexOf("(") != -1){
			pos = teq.indexOf("(");
			//find it's pair
			int pair = closeLoc(teq,pos);
			String sub = teq.substring(pos,pair+1);
			newFunc = teq.replace(sub, "" + getAns(teq.substring(pos+1,pair),x));
		}
		//evaluate the inside of a function as it's own function, then plug in the number.
		else if(teq.indexOf("[") != -1){
			pos = teq.indexOf("[");
			int pair = closeLoc(teq,pos);
			double eval = getAns(teq.substring(pos+1, pair),x);
			String sub;
			sub = teq.substring(pos-3, pair+1);
			eval = evalFunc(teq.substring(pos-3, pos),eval);
			newFunc = teq.replace(sub, "" + eval);
		}
		//if it doesn't have bracks/parens, then it can be evaluated to a number.
		else
			return makeNum(teq,x);
		
		//maybe...
		newFunc = fixNegs(newFunc);
		
		//call again, because it is not ready yet.
		return getAns(newFunc,x);
	}
	
	
	private double makeNum(String eqn, double x){
		ArrayList<String> equation = new ArrayList<String>();
		
		int nxt = 0;
		while((nxt = nextOp(eqn)) != -1){
			//add the num and op into the arraylist 
			equation.add(eqn.substring(0,nxt));
			equation.add("" + eqn.charAt(nxt));
			//shrink the string
			eqn = eqn.substring(nxt+1);
		}
		equation.add(eqn);
		//now that the string has been converted into an array list
		Stack<Integer> powhotspots = new Stack<Integer>();
		Stack<Integer> mulhotspots = new Stack<Integer>();
		Stack<Integer> sumhotspots = new Stack<Integer>();
		//do a once through, looking for powers
	
		for(int i = 0; i < equation.size(); i++)
			if(equation.get(i) == "^")
				powhotspots.push(i);
		//fix the zeros
		//equation = fixNegs(equation);
		//do the math for each operator
		equation = evalOps(equation,new char[] {'^'}, x);
		equation = evalOps(equation, new char[] {'/'}, x);
		equation = evalOps(equation, new char[] {'*'}, x);
		equation = evalOps(equation, new char[] {'-'}, x);
		equation = evalOps(equation, new char[] {'+'}, x);
		
		try{
		return Double.parseDouble(equation.get(0));
		}catch(NumberFormatException ex){
			return x;
		}
	}
	
	private String fixNegs(String eqn){
		if(eqn.charAt(0) == '-')
			return "0" + eqn;
		return eqn;
	}

	private int nextOp(String eqn){
		char [] ops = {'+','-','*','/','^'};
		for(int i = 0; i < eqn.length(); i++){
			char v = eqn.charAt(i);
			for(int o = 0; o < ops.length; o++)
				if(v == ops[o])
					return i;
		}
		return -1;
	}
	

	private String finish(String m){
		//close all the open brackets in the group
		Stack<Character> order = new Stack<Character>();
		for(int i = 0; i < m.length(); i++){
			char g = m.charAt(i);
			if(g == '(')
				order.push(')');
			else if(g == '[')
				order.push(']');
			else if(g == ']' || g == ')')
				order.pop();
		}
		while(!order.isEmpty()){
			m += order.pop();
		}
		
	
		m = m.replace(" ", "");
		
	
		String regexString = "[\\x2B\\x2D\\x2F\\x5E\\x2A\\x5B\\x5D\\x50\\x51]"; //the regex string to split on the operators +-*/^()[] (ascii hex)
		String notRegexString = "[^\\x2B\\x2D\\x2F\\x5E\\x2A\\x5B\\x5D\\x50\\x51]"; //the regex string to split on NOT the operators +-*/^()[] (ascii hex)
		
		String[] ops = removeBlanks(m.split(notRegexString));
		
	
		String [] splitup = m.split(regexString);
		
	
		for(int i = 0; i < splitup.length; i++){
			String tmp = splitup[i];
			if(tmp.length() > 0)
			{
				String myNum;
				boolean contE,contPi,contX,contNo = false;
				contE = tmp.contains("e");
				contPi = tmp.contains("pi");
				contX = tmp.contains("x");
				myNum = numOnly(tmp);
				contNo = myNum.length() > 0;
					
				
				String together = "";
				//makes sure the last item stays in the last place
				switch(tmp.charAt(tmp.length()-1)){
				case 'i': //pi
					together += "pi";
					contPi = false;
					break;
				case 'e':
					together = "e";
					contE = false;
					break;
				case 'x':
					together = "x";
					contX = false;
					break;
				default:
					together = myNum;
					contNo = false;
					break;
				}
				//put the rest in there, if need be.
				if(contNo) together = myNum + "*" + together;
				if(contX) together = "x*" + together;
				if(contPi) together = "pi*" + together;
				if(contE) together = "e*" + together;
				
				splitup[i] = together;
			}
		}
		
		//reconstruct the string
		String reconstructed = "";
		for(int i = 0; i < splitup.length; i++){
			reconstructed += splitup[i];
			//add the op
			try{
				reconstructed += ops[i];
			}catch(IndexOutOfBoundsException ex){;}
		}
		
		//replace the constants with the actual numbers
		reconstructed = reconstructed.replace("e", "" + Math.E);
		reconstructed = reconstructed.replace("pi","" + Math.PI);
		return reconstructed;
	}
	

	private int closeLoc(String m, int start){
		char g = m.charAt(start);
		char lookFor;
		if(g == '(') lookFor = ')';
		else lookFor = ']';
		
		int tokensLeft = 1;
		int i = start + 1;
		while(i < m.length() && tokensLeft > 0){
			if(m.charAt(i) == lookFor)
				tokensLeft--;
			else if(m.charAt(i) == g)
				tokensLeft++;
			i++;
		}
		return --i;
	}
	

	private ArrayList<String> evalOps(ArrayList<String> equation,char [] ops, double x){
		Stack<Integer> tokenlocs = new Stack<Integer>();
		
		//find the places in the equation that the token[s] reside
		for(int i = 0; i < equation.size(); i++)
			for(char ch : ops)
				if(equation.get(i).equals("" + ch))
					tokenlocs.add(i);
		
		while(!tokenlocs.isEmpty()){
			//parse the numbers, find an answer
			int b = tokenlocs.pop();
			double a,c;
			//if it breaks, it's an x
			try{
				a = Double.parseDouble(equation.get(b - 1));
			}catch(NumberFormatException ex){ a = x;}
			try{
				c = Double.parseDouble(equation.get(b + 1));
			}catch(NumberFormatException ex){ c = x;}
			double answer = calculate(equation.get(b),a,c);
			
			//replace x, ^, y with =x^y, and delete the extra places
			equation.set(b-1, "" + answer);
			equation.remove(b+1);
			equation.remove(b);
		}
					
		return equation;
	}
	

	private double calculate(String operation, double a1, double a2){
		char op = operation.charAt(0);
		switch(op){
		case '^':
			return Math.pow(a1, a2);
		case '+':
			return a1 + a2;
		case '-':
			return a1 - a2;
		case '/':
			return a1/a2;
		case '*':
			return a1*a2;
		default:
			return 0.0;
		}
	}
	

	private String[] removeBlanks(String[] input){
		ArrayList<String> out = new ArrayList<String>();
		
		for(int i = 0; i < input.length; i++)
			if(input[i].length() > 0)
				out.add(input[i]);
		
		String[] outArray = new String[out.size()];
		return out.toArray(outArray);
	}
	

	private double evalFunc(String code, double value){
		double retVal;
		//trig functions
		if(code.equals("cos") || code.equals("tan")){
			value = mod2PI(value);
			if(value == (Math.PI/2) || value == 3*Math.PI/2)
				retVal = 0.0;
		}
		if(code.equals("sin")){
			value = mod2PI(value);
			if(value == Math.PI || Math.abs(value) <= tooSmall)
				return 0.0;
			retVal = Math.sin(value);
		}
		else if(code.equals("cos"))
			retVal = Math.cos(value);
		else if(code.equals("sqt"))
			retVal = Math.sqrt(value);
		else if(code.equals("tan"))
			retVal = Math.tan(value);
		//end trig functions
		else if(code.equals("abs")) 
			retVal = Math.abs(value);
		else if(code.equals("log")) 
			retVal = Math.log(value);
		else retVal = 0.0;
		
		if(Math.abs(retVal) <= tooSmall)
			return 0.0;
		else
			return retVal;
	}

	private String numOnly(String str){
		String ret = "";
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if((c>='0' && c <= '9') || c == '.')
				ret += c;
		}
		return ret;
	}
	
	
	private double mod2PI(double num){
		double twopi = 2*Math.PI;
		while(num > twopi)
			num -= twopi;
		return num;
	}
        
      /*private void intergration() {                                                 
        double no1 = 0, no2 = 0, a = 0, b = 0;
        double c = 0, z = 0;
        double d = 0;
       String intergrationValue = JOptionPane.showInputDialog("Eneter the intergration Function Name");
        try {
            CM.con(intergrationValue);
        } catch (Exception exception) {
            this.outputdisplay.setText("ERROR");
            return;
        }
        try {
            no1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Starting limit"));
            no2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Ending limit"));

        } catch (Exception exception) {
            return;
        }
        b = 1000 * (no2 - no1);
        c = (double) (no2 - no1) / b;
        z = no1;

        while (a < b) {
            a++;
            z = z + c;
            d = d + (CM.con(str, z) * c);
        }

        outputdisplay.setText("" + round(d, rou) + " ");
    }*/
}