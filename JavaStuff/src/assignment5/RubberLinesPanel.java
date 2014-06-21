package assignment5;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RubberLinesPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Point point1 = null, point2 = null;
	private ArrayList<Point> pointList;
	private ArrayList<Point> pointList2;
	
	public RubberLinesPanel(){
		pointList = new ArrayList<Point>();
		pointList2 = new ArrayList<Point>();
		LineListener listener = new LineListener();
		addMouseListener (listener);
		addMouseMotionListener(listener);
		
		setBackground (Color.black);
		setPreferredSize (new Dimension(400,200));
	}
	
	public void paintComponent (Graphics page){
		super.paintComponent(page);
		
		page.setColor(Color.yellow);
		for(int i = 0; i<pointList.size();i++){
			page.drawLine(pointList.get(i).x,pointList.get(i).y,pointList2.get(i).x,pointList2.get(i).y);
	}
	}
	
	private class LineListener implements MouseListener,MouseMotionListener{
		
		public void mousePressed (MouseEvent event){
			pointList.add(event.getPoint());
		}
		
		public void mouseDragged (MouseEvent event){			
			
		}
		
		public void mouseClicked (MouseEvent event){}
		public void mouseReleased (MouseEvent event){
			pointList2.add(event.getPoint());
			repaint();
		}
		public void mouseEntered (MouseEvent event){}
		public void mouseExited (MouseEvent event){}
		public void mouseMove (MouseEvent event){}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
