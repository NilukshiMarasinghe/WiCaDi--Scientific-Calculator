package wicadi.calculator;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;

public class EquationParser extends JPanel{
	 
	private static Scanner x;
	String formula;
	double xmin,xmax,ymin,ymax,inc;
	String path="graphdata.txt";
       // @Override
	public EquationParser(){
		//set window properties
		
                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(800,480));
                
                for(int i=1;i<=1;i++)
                {
		//get min
		xmin = Integer.parseInt(JOptionPane.showInputDialog("X Min: ", "-10"));
                
		//get max
		xmax = Integer.parseInt(JOptionPane.showInputDialog("X Max: ", "10"));
		
		//get min
		ymin = Integer.parseInt(JOptionPane.showInputDialog("Y Min: ", "-10"));
		//get max
		ymax = Integer.parseInt(JOptionPane.showInputDialog("Y Max: ", "10"));
		
		//get inc
		inc = Math.abs(Double.parseDouble(JOptionPane.showInputDialog("Increment: ", ".1")));	
                }
		
		repaint();
               
                
	}
	
   
        @Override
	public void paint(Graphics g){
                
		//paint the axes
		g.setColor(Color.red);
		g.drawLine(1, this.getWidth()/2, this.getHeight(), this.getWidth()/2); //x axis
		g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight()); //y axis
		//draw minimum/maximum labels
		g.drawString("" + xmax, this.getWidth()-14, this.getHeight()/2 - 3);
		g.drawString("" + xmin, 0, this.getHeight()/2 - 3);
		g.drawString("" + ymax, this.getWidth()/2, 10);
		g.drawString("" + ymin, this.getWidth()/2, this.getHeight()-10);
                
                
                Object[] options = {2, "No", 5.6};
        Object l = JOptionPane.showInputDialog(null, "Select your Need:(2)Draw Funtion (no)Save Draw Funtion (5.6) Reload Funtion", 
                "Selection", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if(l instanceof Integer){
           String func1 = JOptionPane.showInputDialog("Enter the function.\ny[x]=");
		if(func1 != null){
			formula = func1;
			//graph function
			Equation eqn = new Equation(formula);
			int yfrom, yto = 0, xfrom, xto = 0;
			g.setColor(Color.blue);
			boolean first = true;
			for(double i = xmin; i < xmax; i += inc){
				xfrom = xto;
				yfrom = yto;
				yto = mapY(eqn.findOutput(i));
				xto = mapX(i);
				if(!first)
					g.drawLine(xfrom, yfrom, xto, yto);
				else 
					first = false;
			}
			repaint();
		}
        }else if(l instanceof String){
         String sFunc = JOptionPane.showInputDialog("Enter Funtion to save.\ny[x]=");
                if(sFunc!=null){
                 String funcName = JOptionPane.showInputDialog("Funtion Name");
                 saveRecodes(sFunc,funcName);
                }
                else{
                repaint();
                }
		
        }else if(l instanceof Double){
           String searchTerm = JOptionPane.showInputDialog("Enter your Function Name");
		loadRecodes(searchTerm, path);
                        
			
		}
        
        
           
        
		
        }	
        public void load(){
            EquationParser eq = new EquationParser();
            //eq.init();
            JFrame jf = new JFrame("intfc");
            jf.add(eq);
            jf.setVisible(true);
            //eq.paint(g);
        
        }   
	
        public  void saveRecodes(String sFunc,String funcName)
        {
        
                    try{
                        
                    FileWriter FW= new FileWriter(path,true);
                    BufferedWriter BW = new BufferedWriter(FW);
                    PrintWriter PW=new PrintWriter(BW);
                    PW.println(sFunc+","+funcName+",");
                    PW.flush();
                    
                    JOptionPane.showMessageDialog(null, "Function Saved");
                    
                    }
                    catch(IOException E){}
        }
        
         public  void loadRecodes(String searchTerm,String path)
        {
        boolean found=false;
        String  sFunc="";
        String  Func="";
                    try{
                        
                 x=new Scanner(new File(path));
                 x.useDelimiter("[,\n]");
                 
                 while(x.hasNext()&& !found)
                 {
                 sFunc=x.next();
                 Func=x.next();
                    if(sFunc.equals(searchTerm))
                    {
                        found=true;
                    }
                 }
                 if (found)
                 {
                   JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setSize(new Dimension(250, 32));
        panel.setLayout(null);

        JLabel label = new JLabel("Do you want draw a graph! :)");
        label.setForeground(new Color(255, 255, 0));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 11));
        label.setBounds(0, 0, 250, 32);
        panel.add(label);

        UIManager.put("OptionPane.minimumSize",new Dimension(270, 120));

        Object[] options = { "False", true};
        Object l = JOptionPane.showInputDialog(null, panel, 
                "Draw a Graph", JOptionPane.PLAIN_MESSAGE, null, options, options[1]);

        if(l instanceof Boolean){
            System.out.println("Reload Data!");
        }else if(l instanceof String){
              System.out.println("Sorry ! Error :Use your Funtion Name");
        }

    

                 }
                 else{
                 JOptionPane.showMessageDialog(null, "Sorry Error");
                 }
                    }
                    catch(Exception E){}
        }
	public int mapY(double num){
		//System.out.println("Output: " + num);
		int height;
		if(num >= 0)
			height = (int)ymax;
		else
			height = (int)ymin;
		double oneInPixels = (this.getHeight()/2)/Math.abs(height);
		//if the answer is even on the map
		return (-1)*(int)(num * oneInPixels) + this.getHeight()/2;
	}
	public int mapX(double num){
		int size;
		if(num >= 0)
			size = (int)xmax;
		else
			size = (int)xmin;
		double oneInPixels = (this.getWidth()/2)/Math.abs(size);
		return (int)(oneInPixels * num) + this.getWidth()/2;
	}
}