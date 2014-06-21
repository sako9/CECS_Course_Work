package assignment3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel inputLabel, outputLabel;//,resultLabel;
	private JTextField fahrenheit,resultLabel;
	private Button b;
	
	public FahrenheitPanel(){
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JTextField(5);
		
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		b = new Button("Click me");
		b.addActionListener(new TempListener());
		
		add (inputLabel);
		add (fahrenheit);
		add (outputLabel);
		add (resultLabel);
		add(b);
		
		setPreferredSize (new Dimension(300, 75));
		setBackground (Color.yellow);
	}
	
	
	private class TempListener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp - 32) *5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
