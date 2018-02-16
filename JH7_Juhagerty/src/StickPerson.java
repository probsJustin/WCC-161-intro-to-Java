
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class StickPerson extends JFrame{

	StickPerson(String name){
		super("Simple Drawing Program");
		setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	 public void paint(Graphics g) {       
	        //super.paint(g);
	    	Dimension d = getSize();
	        g.setColor(Color.gray);
	        //g.fillRect(0,0, 600, 400);
	        g.fillRect(5,5, d.width, d.height); 
	        System.out.println("width= " + d.width + " height= " + d.height);
	        g.setColor(Color.blue);
	        g.drawRect((d.width /2) - 20,(d.height/2)-50, 20, 100);
	        g.fillRect((d.width /2) - 20,(d.height/2)-50, 20, 100);
	        g.fillOval((d.width/2)-35,(d.height/2)-90, 50, 50);
	        g.drawLine((d.width/2),(d.height/2)+50,(d.width/2)+25,(d.height/2)+100);
	        g.drawLine((d.width/2)-20,(d.height/2)+50,(d.width/2)-50,(d.height/2)+100);
	        g.drawLine((d.width/2)-20,(d.height/2)-50,(d.width/2)-50,(d.height/2));
	        g.drawLine((d.width/2),(d.height/2)-50,(d.width/2)+25,(d.height/2));
	       
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StickPerson simple = new StickPerson("Simple Drawing");
	}

}
