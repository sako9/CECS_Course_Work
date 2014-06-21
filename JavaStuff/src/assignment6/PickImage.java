package assignment6;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
public class PickImage
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Pick Image");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel imageLabel = new JLabel();
		JScrollPane imagePanel = new JScrollPane(imageLabel);
		imagePanel.setPreferredSize(new Dimension(200,200));
		ListPanel imageList = new ListPanel(imageLabel);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, imageList, imagePanel);

		sp.setOneTouchExpandable(true);
		frame.getContentPane().add(sp);
		frame.pack();
		frame.setVisible(true);
	}
}
