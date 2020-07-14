package javacalc;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import javax.swing.JPanel;


public class Container extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Container(String askedColor, int lenght, int height)
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
	} 	

}
