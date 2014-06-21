package Assignment4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PigLatin extends JPanel{

	
	private static final long serialVersionUID = 1L;
	private JLabel inputLabel, outputLabel;//,resultLabel;
	private JTextField wordstat,resultLabel;
	private Button b;
	
	public PigLatin(){
		inputLabel = new JLabel("Enter a sentence:");
		outputLabel = new JLabel("Translated: ");
		resultLabel = new JTextField(20);
		
		wordstat = new JTextField(20);
		wordstat.addActionListener(new WordListener());
		b = new Button("Click me");
		b.addActionListener(new WordListener());
		
		add (inputLabel);
		add (wordstat);
		add (outputLabel);
		add (resultLabel);
		add(b);
		
		setPreferredSize (new Dimension(600, 70));
		setBackground (Color.yellow);
	}
	
	
	private class WordListener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			
			String text = wordstat.getText();
			
			text = PigLatinTranslator.translate(text);
			
			resultLabel.setText(text);
		}
	}
}
