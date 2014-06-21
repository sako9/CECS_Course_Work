package assignment6;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class StopWatchpanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel outputLabel;//,resultLabel;
	private JTextField time;
	private Button start,stop,reset;
    private final int DELAY = 1000;
    private int seconds = 0;
	private Timer timer;
	
	public StopWatchpanel(){
		outputLabel = new JLabel("Time: ");
		time = new JTextField(10);
		
		time.setText(""+seconds);
		timer = new Timer(DELAY,new TimeListener());
		
		setBackground(Color.yellow);
		setPreferredSize (new Dimension(300,300));
		
		start = new Button("start");
		start.addActionListener(new startListener());
		
		stop = new Button("stop");
		stop.addActionListener(new stopListener());
		
		reset = new Button("reset");
		reset.addActionListener(new resetListener());
		
		
		add(outputLabel);
		add(time);
		add(start);
		add(stop);
		add(reset);
		//timer.start();
	}
	
private class TimeListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			seconds++;
			time.setText(""+seconds);
		}
			
	}

private class startListener implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		timer.start();
	}
}

private class stopListener implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		timer.stop();
	}
}

private class resetListener implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		seconds =0;
		time.setText(""+seconds);
		timer.stop();
	}
}
	

}
