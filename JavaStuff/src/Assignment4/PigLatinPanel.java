package Assignment4;

import javax.swing.JFrame;


public class PigLatinPanel {
	public static void main (String[] args){
	JFrame frame = new JFrame ("Wordstat");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	
	PigLatin panel = new PigLatin();
	
	frame.getContentPane().add(panel);
	frame.pack();
	frame.setVisible(true);
}
}

