package javacalc;

import java.awt.GridLayout;

public class NumberContainer extends Container {

	private static final long serialVersionUID = 1L;
	
	public NumberContainer(String askedColor, int lenght, int height) {
		
		super(askedColor, lenght, height);
		
		//---------------------------------------------------------------------	
		
		GridLayout gl = new GridLayout(4,3);
		gl.setVgap(5);
		gl.setHgap(5);
		this.setLayout(gl);
		
	    // Set buttons
		
		Button button1 = new Button("1");
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
		
	}
	


}
