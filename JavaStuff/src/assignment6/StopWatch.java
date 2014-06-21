package assignment6;
import javax.swing.JFrame;

public class StopWatch {
	
		public static void main (String[] args){
		JFrame frame = new JFrame ("stopwatch");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new StopWatchpanel());
		frame.pack();
		frame.setVisible(true);
	}
	}

