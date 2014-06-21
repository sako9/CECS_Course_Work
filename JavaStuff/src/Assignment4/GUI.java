package Assignment4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {
private JFrame frame;
private JPanel panel;
private JButton button, clearButton;
private JButton [][] buttonArray = new JButton [4][3];
private JLabel label;
private String numLabel = "";

public GUI(){
frame = new JFrame();
frame.setTitle("Phone Keypad");
frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new BorderLayout());
label = new JLabel(" ");
frame.add(label, BorderLayout.NORTH);
clearButton = new JButton();
clearButton.setText("Clear");
clearButton.addActionListener(new ButtonListener());
frame.add(clearButton, BorderLayout.EAST);
createPanel();
frame.setVisible(true);
}

public void createPanel(){
panel = new JPanel();
panel.setLayout(new GridLayout(4,3));
createButtons();
panel.setBorder(BorderFactory.createLineBorder(Color.black));
frame.add(panel, BorderLayout.CENTER);

}

public void createButtons(){
for (int i =0; i < buttonArray.length; i++){
for (int j = 0; j < buttonArray[0].length; j++)
{
button = new JButton();
button.addActionListener(new ButtonListener());
button.setBorder(BorderFactory.createLineBorder(Color.black));
buttonArray[i][j] = button;
panel.add(button);
}
}

buttonArray[0][0].setText("1");
buttonArray[0][1].setText("2");
buttonArray[0][2].setText("3");
buttonArray[1][0].setText("4");
buttonArray[1][1].setText("5");
buttonArray[1][2].setText("6");
buttonArray[2][0].setText("7");
buttonArray[2][1].setText("8");
buttonArray[2][2].setText("9");
buttonArray[3][0].setText("*");
buttonArray[3][1].setText("0");
buttonArray[3][2].setText("#");
}

private class ButtonListener implements ActionListener{

public void actionPerformed(ActionEvent e) {

if (e.getSource() == clearButton){
label.setText(" ");
}
else{
for (int i =0; i < buttonArray.length; i++){
for (int j = 0; j < buttonArray[0].length; j++)
{
if (e.getSource() == buttonArray[i][j]){
numLabel = buttonArray[i][j].getText();
label.setText(label.getText().concat(numLabel));
}
}
}
}
}
}
}