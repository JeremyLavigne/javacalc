package javacalc;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JFrame;



public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window(){
		
		this.setTitle("Title"); // Title...
		this.setSize(400, 600); // Size
		this.setLocationRelativeTo(null); // Position : center
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Close with red cross
		
		//---------------------------------------------------------------------		   
		
		// Set the main container
		Container mainContainer = new Container("black", 380, 580); 
	    
	    // Set the number container
	    NumberContainer numberContainer = new NumberContainer("gray", 280, 400); 
	    
	    // Set the screen container
	    Container screenContainer = new Container("white", 340, 80); 
	    
	    // Set the operator container
	    OperatorContainer operatorContainer = new OperatorContainer("orange", 80, 450); 
	    
	    
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
	
}
