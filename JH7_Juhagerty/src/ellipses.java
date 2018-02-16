import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JFrame;

public class ellipses extends JFrame {

	ellipses(String name){
		super("Drawing an Ellipses.");
		setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics graphicObject){
		//create window with dimensions
		Dimension d = getSize();
        graphicObject.setColor(Color.gray);
        graphicObject.fillRect(5,5, d.width, d.height); 
        for (int i = 0; i < 200; i = i + 5){
        	
		int W = d.width;
		int H = d.height;
        int x = 50 + i;
		int y = 50 + i;
		int x1 = 500 - (i*2);
		int y1 = 400 - (i*2);
		
		graphicObject.setColor(Color.red);
		graphicObject.fillOval(x, y, x1, y1);
		graphicObject.setColor(Color.blue);
		graphicObject.drawOval(x, y, x1, y1);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ellipses TestEllipses = new ellipses("Ellipses Test");
	}

}
