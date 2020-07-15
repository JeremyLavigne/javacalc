package javacalc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Window extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel mainContainer = new JPanel();
	private JPanel numberContainer = new JPanel();
	private JPanel screenContainer = new JPanel();
	private JPanel operatorContainer = new JPanel();
	
	private JLabel result = new JLabel();
	
	private String inputNumber1 = "", inputNumber2 = "", operator = "";

	
	

	public Window(){
		
		this.setTitle("Title"); // Title...
		this.setSize(400, 600); // Size
		this.setLocationRelativeTo(null); // Position : center
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Close with red cross
		
		//---------------------------------------------------------------------		   

		
		// Set the main container
		mainContainer.setBackground(Color.GRAY); 
		mainContainer.setPreferredSize(new Dimension(380, 580));
		
		
		//---------------------------------------------------------------------
		// Set the screen container
		screenContainer.setLayout(new BorderLayout());
		screenContainer.setBackground(Color.WHITE); 
		screenContainer.setPreferredSize(new Dimension(340, 80));
		
		result.setText("0");
		result.setFont(new Font("Arial", Font.PLAIN, 50));
		
		screenContainer.add(result, BorderLayout.EAST);
		
		
		//---------------------------------------------------------------------
		// Set the number container
		numberContainer.setBackground(Color.BLACK); 
		numberContainer.setPreferredSize(new Dimension(280, 400));
		
		GridLayout gl = new GridLayout(4,3);
		gl.setVgap(5);
		gl.setHgap(5);
		numberContainer.setLayout(gl);
		
	    // Set buttons
		
		Button button1 = new Button("1");
		button1.addActionListener(this);
		numberContainer.add(button1);
		
		Button button2 = new Button("2");
		button2.addActionListener(this);
		numberContainer.add(button2);
		
		Button button3 = new Button("3");
		button3.addActionListener(this);
		numberContainer.add(button3);
		
		Button button4 = new Button("4");
		button4.addActionListener(this);
		numberContainer.add(button4);
		
		Button button5 = new Button("5");
		button5.addActionListener(this);
		numberContainer.add(button5);
		
		Button button6 = new Button("6");
		button6.addActionListener(this);
		numberContainer.add(button6);
		
		Button button7 = new Button("7");
		button7.addActionListener(this);
		numberContainer.add(button7);
		
		Button button8 = new Button("8");
		button8.addActionListener(this);
		numberContainer.add(button8);
		
		Button button9 = new Button("9");
		button9.addActionListener(this);
		numberContainer.add(button9);
		
		Button button0 = new Button("0");
		button0.addActionListener(this);
		numberContainer.add(button0);
		
		Button buttonDot = new Button(".");
		buttonDot.addActionListener(this);
		numberContainer.add(buttonDot);
		
		Button buttonEqual = new Button("=");
		buttonEqual.addActionListener(this);
		numberContainer.add(buttonEqual);
		
		
		//---------------------------------------------------------------------
		// Set the operator container
		operatorContainer.setBackground(Color.ORANGE); 
		operatorContainer.setPreferredSize(new Dimension(80, 450));
		
		GridLayout gl2 = new GridLayout(5,1);
		gl2.setVgap(5);
		operatorContainer.setLayout(gl2);
		
	    // Set buttons
		
		Button buttonClear = new Button("C");
		buttonClear.setFont(new Font("Arial", Font.PLAIN, 30));
		buttonClear.addActionListener(this);
		operatorContainer.add(buttonClear);
		
		Button buttonTimes = new Button("*");
		buttonTimes.addActionListener(this);
		operatorContainer.add(buttonTimes);
		
		Button buttonPlus = new Button("+");
		buttonPlus.addActionListener(this);
		operatorContainer.add(buttonPlus);
		
		Button buttonMinus = new Button("-");
		buttonMinus.addActionListener(this);
		operatorContainer.add(buttonMinus);
		
		Button buttonDivided = new Button("/");
		buttonDivided.addActionListener(this);
		operatorContainer.add(buttonDivided);
		
		
	    //---------------------------------------------------------------------	
	    // Organize containers
	    
	    Box b1 = Box.createHorizontalBox();
	    b1.add(screenContainer);
	    
	    Box b2 = Box.createHorizontalBox();
	    b2.add(numberContainer);
	    b2.add(Box.createRigidArea(new Dimension(10, 400)));
	    b2.add(operatorContainer);

	    Box b3 = Box.createVerticalBox();
	    b3.add(Box.createRigidArea(new Dimension(380, 20)));
	    b3.add(b1);
	    b3.add(Box.createRigidArea(new Dimension(380, 10)));
	    b3.add(b2);
	    
	    mainContainer.add(b3); 
	    
	    //---------------------------------------------------------------------
	    // Display all
	    
	    this.setContentPane(mainContainer); 
	    this.setVisible(true); 
	    
	}



	public void actionPerformed(ActionEvent e) {
		
		boolean isNumber = false, isOperator = false, isEqual = false, isClean = false;
		
		String input = e.getActionCommand();
		
		switch(input) {
		
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0": 
		case ".":
			isNumber = true;
			isOperator = false;
			isEqual = false;
			isClean = false;
			break;
			
		case "+":
		case "-":
		case "*":
		case "/": 
			isNumber = false;
			isOperator = true;
			isEqual = false;
			isClean = false;
			break;
		
		case "=": 
			isNumber = false;
			isOperator = false;
			isEqual = true;
			isClean = false;
			break;
			
		case "C": 
			isNumber = false;
			isOperator = false;
			isEqual = false;
			isClean = true;
			break;
			
		}
		
		
		
		if (isNumber) {
			
			if (operator == "") { 
				
				inputNumber1 += input;
				result.setText(inputNumber1);
				
			} else {
				
				inputNumber2 += input;
				result.setText(inputNumber2);
				
			}
			
		} else if (isOperator) {
			
			operator = input;
				
			
		} else if (isEqual) {
			
			if ((inputNumber1 != "")&&(inputNumber2 != "")&&(operator != "")) {
			
			result.setText(calc(inputNumber1, inputNumber2, operator));
			
			}
			
		} else if (isClean) {
			
			inputNumber1 = "";
			inputNumber2 = "";
			operator = "";
			
			result.setText("0");
			
		}
		
		
	}



	private String calc(String number1, String number2, String operator) {
		
		double num1 = Double.parseDouble(number1);
		double num2 = Double.parseDouble(number2);
		double result = 0;
		
		switch(operator) {
		
		case "*":
			result = num1*num2;
			break;
			
		case "+":
			result = num1+num2;
			break;
			
		case "-":
			result = num1-num2;
			break;
			
		case "/":
			if (num2 == 0) {
				return ("Err  */0");
			}
			result = num1/num2;
			break;
		
		}
		
		String resultString = result + "";
		
		return (resultString);
	}
	
}
