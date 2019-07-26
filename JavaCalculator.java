import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaCalculator extends JFrame {

	JFrame frame;  
	private double sum;
	
	JavaCalculator(){  
	
	frame = new JFrame();//creating instance of JFrame  
	          
	JButton b0 = new JButton("0");//creating instance of JButton  
	b0.setBounds(20,20,50,50);  
	JButton b1 = new JButton("1"); 
	b1.setBounds(80,20,50,50);
	JButton b2 = new JButton("2"); 
	b2.setBounds(140,20,50,50);
	JButton b3 = new JButton("3"); 
	b3.setBounds(200,20,50,50);
	JButton b4 = new JButton("4"); 
	b4.setBounds(260,20,50,50);
	JButton b5 = new JButton("5"); 
	b5.setBounds(320,20,50,50);
	JButton b6 = new JButton("6"); 
	b6.setBounds(20,80,50,50);
	JButton b7 = new JButton("7"); 
	b7.setBounds(80,80,50,50);
	JButton b8 = new JButton("8"); 
	b8.setBounds(140,80,50,50);
	JButton b9 = new JButton("9"); 
	b9.setBounds(200,80,50,50);
	JButton b10 = new JButton("+");
	b10.setBounds(260,80,50,50);
	JButton b11 = new JButton("-");
	b11.setBounds(320,80,50,50);
	JButton b12 = new JButton("*");
	b12.setBounds(20,140,50,50);
	JButton b13 = new JButton("/");
	b13.setBounds(80,140,50,50);
	JButton b14 = new JButton("=");
	b14.setBounds(140,140,50,50);
	
	b0.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	        System.out.println("Patises to 0");
	        e.getSource();
	        
	    }
   });
	
	          
	frame.add(b0);//adding button in JFrame  
	frame.add(b1);
	frame.add(b2);
	frame.add(b3);
	frame.add(b4);
	frame.add(b5);
	frame.add(b6);
	frame.add(b7);
	frame.add(b8);
	frame.add(b9);
	frame.add(b10);
	frame.add(b11);
	frame.add(b12);
	frame.add(b13);
	frame.add(b14);
	
	
	
	          
	frame.setSize(400,500);//400 width and 500 height  
	frame.setLayout(null);//using no layout managers  
	frame.setVisible(true);//making the frame visible  
	}

	
	  
	 
	
}
