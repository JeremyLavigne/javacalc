package javacalc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Container extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	public JLabel result = new JLabel();
	
	public Container(String askedColor, int lenght, int height, String type)
	{
		Color color;
		try {
		    Field field = Class.forName("java.awt.Color").getField(askedColor);
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		
	    this.setBackground(color); 
	    this.setPreferredSize(new Dimension(lenght, height));
	    
	    switch(type) {
	    
	    case "screen" :
	    	
	    	this.setLayout(new BorderLayout());
			
			result.setText("0");
			result.setFont(new Font("Arial", Font.PLAIN, 50));
			
			this.add(result, BorderLayout.EAST);
			
	    	break;
	    	
	    case "number" :
	    	
	    	GridLayout gl = new GridLayout(4,3);
			gl.setVgap(5);
			gl.setHgap(5);
			this.setLayout(gl);
			
		    // Set buttons
			
			Button button1 = new Button("1");
			button1.addActionListener(this);
			this.add(button1);
			
			Button button2 = new Button("2");
			this.add(button2);
			
			Button button3 = new Button("3");
			this.add(button3);
			
			Button button4 = new Button("4");
			this.add(button4);
			
			Button button5 = new Button("5");
			this.add(button5);
			
			Button button6 = new Button("6");
			this.add(button6);
			
			Button button7 = new Button("7");
			this.add(button7);
			
			Button button8 = new Button("8");
			this.add(button8);
			
			Button button9 = new Button("9");
			this.add(button9);
			
			Button button0 = new Button("0");
			this.add(button0);
			
			Button buttonDot = new Button(".");
			this.add(buttonDot);
			
			Button buttonEqual = new Button("=");
			this.add(buttonEqual);
			
	    	break;
	    	
	    case "operator" :
	    	
	    	GridLayout gl2 = new GridLayout(5,1);
			gl2.setVgap(5);
			this.setLayout(gl2);
			
		    // Set buttons
			
			Button buttonClear = new Button("C");
			buttonClear.setFont(new Font("Arial", Font.PLAIN, 30));
			this.add(buttonClear);
			
			Button buttonTimes = new Button("*");
			this.add(buttonTimes);
			
			Button buttonPlus = new Button("+");
			this.add(buttonPlus);
			
			Button buttonMinus = new Button("-");
			this.add(buttonMinus);
			
			Button buttonDivided = new Button("/");
			this.add(buttonDivided);
			
	    	break;
	    	
	    default: 
	    
	    }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		result.setText("Youhou");
	} 	
	
	

}
