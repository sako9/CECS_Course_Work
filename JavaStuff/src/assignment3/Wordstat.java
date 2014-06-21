package assignment3;

import javax.swing.JFrame;

	public class Wordstat {
		public static void main (String[] args){
		JFrame frame = new JFrame ("Wordstat");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		WordstatPanel panel = new WordstatPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

