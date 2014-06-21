package assignment6;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
@SuppressWarnings("serial") 
public class ListPanel extends JPanel
{
	private JLabel	label;
	private JList	list;
	// -----------------------------------------------------------------
	// Loads the list of image names into the list.
	// -----------------------------------------------------------------
	public ListPanel(JLabel imageLabel)
	{
		label = imageLabel;
		String[] fileNames = { "circuit.gif", "duke.gif", "hammock.gif", "justin.jpg", 
								"kayla.jpg", "tiger.jpg", "toucan.gif",
								"worldmap.gif" };
		list = new JList(fileNames);
		JScrollPane sp1 = new JScrollPane(list);
		sp1.setPreferredSize(new Dimension(200,100));
		list.addListSelectionListener(new ListListener());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//add(list);
		add(sp1);
		setBackground(Color.white);
		
	}
	// *****************************************************************
	// Represents the listener for the list of images.
	// *****************************************************************
	private class ListListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent event)
		{
			if (list.isSelectionEmpty())
				label.setIcon(null);
			else
			{

				String fileName = list.getSelectedValue().toString();
				ImageIcon image = new ImageIcon(fileName);
				label.setIcon(image);
			}
		}
	}
}
