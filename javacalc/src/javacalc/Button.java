package javacalc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class Button extends JButton{

	private static final long serialVersionUID = 1L;
	
	public Button(String text) {
		
		this.setText(text);
		this.setBackground(Color.YELLOW);  // Doesn't work just like that, try setOpaque or more
	    this.setPreferredSize(new Dimension(60, 40));
	    this.setFont(new Font("Arial", Font.PLAIN, 20));
		
	}	
	
}
