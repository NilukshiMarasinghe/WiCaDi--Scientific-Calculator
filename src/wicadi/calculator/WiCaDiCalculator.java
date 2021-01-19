
package wicadi.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


public class WiCaDiCalculator {

    private String expression;
    protected int returnType = 0;
    protected String result[] = {"Syntax Error !", "Math Error !", ""};
    
    private StringTokenizer element;
    private List<String> infix, prefix;
    
    public static void main(String[] args) 
    {
        
        Standard_Calculator st = new Standard_Calculator();
        st.setVisible(true);
        st.setLocationRelativeTo(null);  
    }

    protected void solveEquation(String expression) 
    {
        this.expression = expression;
        if (!Error()) 
        {
            infixToPrefix(); 
            calculatePrefix();
        }
    }
    
    protected String Result() 
    {
        return result[returnType];
    }
    
    private boolean Error() 
    {
        element = new StringTokenizer(expression, "+-x/()*", true);
        infix = new ArrayList<String>();
        while (element.hasMoreElements()) 
            infix.add(new String(element.nextElement().toString()));
        
        for (int i = 0; i < infix.size(); i++) 
        {
            String s1 = infix.get(i);
            if (s1.equals("+") || s1.equals("-") || s1.equals("(")) 
            {
                if (i == infix.size()-1) 
                    return true;
                String s2 = infix.get(i+1);
                if (s2.equals("*") || s2.equals("/") || s2.equals(")")) 
                    return true;
                if (s1.equals("+") || s1.equals("-")) 
                {
                    if (s2.equals("+")) 
                    {
                        infix.remove(i+1);
                        i--;
                    }
                    else if (s2.equals("-")) 
                    {
                        infix.set(i, s1.equals("+") ? "-" : "+");
                        infix.remove(i+1);
                        i--;
                    }
                    else 
                    {
                        if (i == 0) 
                        {
                            infix.add(i--, "0"); 
                        continue;
                        }
                        String s3 = infix.get(i-1);
                        if (s2.equals("(")) 
                        {
                            if (s3.equals("*") || s3.equals("/")) 
                            {
                                infix.set(i, s1.equals("+") ? "1" : "-1");
                                infix.add(i+1, s3);
                                i--;
                            }
                            else if (s3.equals("(")) 
                            {
                                if (s1.equals("+")) infix.remove(i--);
                                else infix.add(i--, "0");
                            }
                            continue;
                        }
                        if (s3.equals("(") || s3.equals("*") || s3.equals("/")) 
                        {
                            if (s1.equals("+")) infix.remove(i--);
                            else 
                            {
                                infix.remove(i);
                                StringBuilder num = new StringBuilder("-");
                                num.append(infix.get(i));
                                infix.set(i, new String(num));
                                i--;
                            }
                        }
                    }
                }
            }
            else if (s1.equals("*") || s1.equals("/")) 
            {
                if (i == 0 || i == infix.size()-1) 
                    return true;
                String s2 = infix.get(i+1);
                if (s2.equals("*") || s2.equals("/") || s2.equals(")")) 
                    return true;
            }
            else if (s1.equals(")")) 
            {
                if (i == 0) 
                    return true;
                if (i == infix.size()-1) 
                    continue;
                String s2 = infix.get(i+1);
                if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/") || s2.equals(")")) 
                    continue;
                if (s2.equals("(")) 
                {
                    infix.add(i+1, "*"); 
                    continue;
                }
                return true;
            }
            else 
            {
                try 
                {
                    double d = (double) Double.parseDouble(s1);
                } 
                catch (NumberFormatException e) 
                {
                    return true;
                }
                if (i == infix.size()-1) 
                    continue;
                String s2 = infix.get(i+1);
                if (s2.equals("(")) infix.add(i+1, "*");
            }
        }
        return BracketOpenClose();
    }
    
    private boolean BracketOpenClose() 
    {
        int count = 0;
        for (String s : infix) {
            if (s.equals("(")) count++;
            else if (s.equals(")")) {
                if (count == 0) 
                    return true;
                count--;
            }
        }
        for (; count > 0; count--) 
            infix.add(")");
        return count == 0 ? false : true;
    }
    
    private int rank(String s) 
    {
        if (s.equals("*") || s.equals("/")) 
            return 2;
        if (s.equals("+") || s.equals("-")) 
            return 1;
        return 0;
    }
    
    private void infixToPrefix() 
    {
        Collections.reverse(infix);
        Deque<String> stack = new LinkedList<String>();
        prefix = new ArrayList<String>();

        for (String s2 : infix) 
        {
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) 
            {
                while (!stack.isEmpty() && rank(stack.peek()) > rank(s2)) 
                {
                    prefix.add(stack.pop());
                }
                stack.push(s2);
            }
            else if (s2.equals(")")) 
            {
                stack.push(s2);
            }
            else if (s2.equals("(")) 
            {
                while (!stack.isEmpty() && !stack.peek().equals(")")) 
                {
                    prefix.add(stack.pop());
                }
                stack.pop();
            }
            else 
            {
                prefix.add(s2);
            }
        }
        while (!stack.isEmpty()) prefix.add(stack.pop());
        Collections.reverse(prefix);
    }
    
    private void calculatePrefix() 
    {
        Collections.reverse(prefix);
        Deque<Double> stack = new LinkedList<Double>();
        for (String s2 : prefix) 
        {
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) 
            {
                double a = stack.pop(), b = stack.pop();
                if (s2.equals("+")) a += b;
                else if (s2.equals("-")) a -= b;
                else if (s2.equals("*")) a *= b;
                else 
                {
                    if (Math.abs(b) <= Double.MIN_NORMAL) 
                    {
                        returnType = 1;
                        return ;
                    }
                    a /= b;
                }
                stack.push(a);
            }
            else 
            {
                stack.push(Double.parseDouble(s2));
            }
        }
        returnType = 2;
        result[2] = stack.pop().toString();
    }
    
    
}
