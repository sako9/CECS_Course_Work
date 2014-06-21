package assignment3;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class WordstatPanel extends JPanel{

	
	private static final long serialVersionUID = 1L;
	private JLabel inputLabel, outputLabel,outputLabel2;//,resultLabel;
	private JTextField wordstat,resultLabel,resultLabel2;
	private Button b;
	
	public WordstatPanel(){
		inputLabel = new JLabel("Enter a sentence:");
		outputLabel = new JLabel("Number of words: ");
		outputLabel2 = new JLabel("Average word Length: ");
		resultLabel = new JTextField(5);
		resultLabel2 = new JTextField(5);
		
		wordstat = new JTextField(5);
		wordstat.addActionListener(new WordListener());
		b = new Button("Click me");
		b.addActionListener(new WordListener());
		
		add (inputLabel);
		add (wordstat);
		add (outputLabel);
		add (resultLabel);
		add (outputLabel2);
		add (resultLabel2);
		add(b);
		
		setPreferredSize (new Dimension(600, 70));
		setBackground (Color.yellow);
	}
	
	
	private class WordListener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			int Numwords,Avwords;
			
			String text = wordstat.getText();
			String[] words = text.split(" ");
			
			Numwords = words.length;
			Avwords = text.length()/words.length;//(fahrenheitTemp - 32) *5/9;
			
			resultLabel.setText(Integer.toString(Numwords));
			resultLabel2.setText(Integer.toString(Avwords));
		}
	}
}


