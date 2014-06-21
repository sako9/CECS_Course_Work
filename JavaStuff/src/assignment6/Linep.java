package assignment6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Linep extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH =300,HEIGHT = 300;
	private final int DELAY = 70;
	
	private Timer timer;
	private int x,movex,y;
	
	public Linep(){
		timer = new Timer(DELAY, new LineListener());	
		x=0;
		movex =3;
		y=HEIGHT/2;
		
		setBackground(Color.black);
		setPreferredSize (new Dimension(WIDTH,HEIGHT));
		timer.start();
	}
	
	public void paintComponent (Graphics page ){
		super.paintComponent(page);
		
		page.setColor(Color.ORANGE);
		page.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
		page.setColor(Color.red);		
		page.drawLine(x, y, x+30, y);
		if(x+30 >= WIDTH/2 && x<WIDTH/2){
			page.setColor(Color.blue);
			page.drawLine(x+30, y ,WIDTH/2, y);
		}else if(x+30 >= WIDTH/2 && x>=WIDTH/2){
			page.setColor(Color.blue);
			page.drawLine(x+30, y ,x, y);
			
		}
		
	}
	
	private class LineListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			x += movex;
			if (x <= 0 || x+30 >= WIDTH)
				movex = movex * -1;
			
			repaint();
		}
			
	}
	}


