package assignment6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LinePanel {	
public static void main(String[] args) {
JFrame frame = new JFrame("Line move");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add(new Linep());
frame.pack();
frame.setVisible(true);
}
}
