import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class TicTacToe implements ActionListener{
    private JFrame frame;
    private JButton [][] button1;
    private JButton [][] button2;
    private JButton [][] button3;
    private JButton [][] button4;
    private JButton [][] button5;
    private JButton [][] button6;
    private JButton [][] button7;
    private JButton [][] button8;
    private JButton [][] button9;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private int turn;
    private int p1;
    private int p2;
    private int p3;
    private int p4;
    private int p5;
    private int p6;
    private int p7;
    private int p8;
    private int p9;
    private int previous;

    public TicTacToe(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TicTacToe");
        frame.setSize(new Dimension(500,500));
        frame.setLocation(new Point(250,100));
        frame.setLayout(new GridLayout(3,3));

        button1 = new JButton[3][3];
        button2 = new JButton[3][3];
        button3 = new JButton[3][3];
        button4 = new JButton[3][3];
        button5 = new JButton[3][3];
        button6 = new JButton[3][3];
        button7 = new JButton[3][3];
        button8 = new JButton[3][3];
        button9 = new JButton[3][3];

        panel1= new JPanel(new GridLayout(3,3));
        panel2= new JPanel(new GridLayout(3,3));
        panel3= new JPanel(new GridLayout(3,3));
        panel4= new JPanel(new GridLayout(3,3));
        panel5= new JPanel(new GridLayout(3,3));
        panel6= new JPanel(new GridLayout(3,3));
        panel7= new JPanel(new GridLayout(3,3));
        panel8= new JPanel(new GridLayout(3,3));
        panel9= new JPanel(new GridLayout(3,3));

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button1[i][j]=new JButton();
                panel1.add(button1[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button2[i][j]=new JButton();
                panel2.add(button2[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button3[i][j]=new JButton();
                panel3.add(button3[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button4[i][j]=new JButton();
                panel4.add(button4[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button5[i][j]=new JButton();
                panel5.add(button5[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button6[i][j]=new JButton();
                panel6.add(button6[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button7[i][j]=new JButton();
                panel7.add(button7[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button8[i][j]=new JButton();
                panel8.add(button8[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button9[i][j]=new JButton();
                panel9.add(button9[i][j]);
            }
        }

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);

        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel6.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel7.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel8.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panel9.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));   

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)   {
                button1[i][j].addActionListener(this);
                button2[i][j].addActionListener(this);
                button3[i][j].addActionListener(this);
                button4[i][j].addActionListener(this);
                button5[i][j].addActionListener(this);
                button6[i][j].addActionListener(this);
                button7[i][j].addActionListener(this);
                button8[i][j].addActionListener(this);
                button9[i][j].addActionListener(this);
            }
        }

        p1=0;
        p2=0;
        p3=0;
        p4=0;
        p5=0;
        p6=0;
        p7=0;
        p8=0;
        p9=0;

        previous=0;
        turn=2;
        frame.setVisible(true);
    }

    public void checkSingleVictory(){
        if((button1[0][0].getBackground()==Color.blue && button1[0][1].getBackground()==Color.blue && button1[0][2].getBackground()==Color.blue) || (button1[1][0].getBackground()==Color.blue && button1[1][1].getBackground()==Color.blue && button1[1][2].getBackground()==Color.blue) || (button1[2][0].getBackground()==Color.blue && button1[2][1].getBackground()==Color.blue && button1[2][2].getBackground()==Color.blue) || (button1[0][0].getBackground()==Color.blue && button1[1][0].getBackground()==Color.blue && button1[2][0].getBackground()==Color.blue) || (button1[0][1].getBackground()==Color.blue && button1[1][1].getBackground()==Color.blue && button1[2][1].getBackground()==Color.blue) || (button1[0][2].getBackground()==Color.blue && button1[1][2].getBackground()==Color.blue && button1[2][2].getBackground()==Color.blue) || (button1[0][0].getBackground()==Color.blue && button1[1][1].getBackground()==Color.blue && button1[2][2].getBackground()==Color.blue) || (button1[0][2].getBackground()==Color.blue && button1[1][1].getBackground()==Color.blue && button1[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button1[i][j].setBackground(Color.blue);
                    p1=1;
                }
            }
        }
        if((button1[0][0].getBackground()==Color.red && button1[0][1].getBackground()==Color.red && button1[0][2].getBackground()==Color.red) || (button1[1][0].getBackground()==Color.red && button1[1][1].getBackground()==Color.red && button1[1][2].getBackground()==Color.red) || (button1[2][0].getBackground()==Color.red && button1[2][1].getBackground()==Color.red && button1[2][2].getBackground()==Color.red) || (button1[0][0].getBackground()==Color.red && button1[1][0].getBackground()==Color.red && button1[2][0].getBackground()==Color.red) || (button1[0][1].getBackground()==Color.red && button1[1][1].getBackground()==Color.red && button1[2][1].getBackground()==Color.red) || (button1[0][2].getBackground()==Color.red && button1[1][2].getBackground()==Color.red && button1[2][2].getBackground()==Color.red) || (button1[0][0].getBackground()==Color.red && button1[1][1].getBackground()==Color.red && button1[2][2].getBackground()==Color.red) || (button1[0][2].getBackground()==Color.red && button1[1][1].getBackground()==Color.red && button1[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button1[i][j].setBackground(Color.red);
                    p1=2;
                }
            }
        }

        if((button2[0][0].getBackground()==Color.blue && button2[0][1].getBackground()==Color.blue && button2[0][2].getBackground()==Color.blue) || (button2[1][0].getBackground()==Color.blue && button2[1][1].getBackground()==Color.blue && button2[1][2].getBackground()==Color.blue) || (button2[2][0].getBackground()==Color.blue && button2[2][1].getBackground()==Color.blue && button2[2][2].getBackground()==Color.blue) || (button2[0][0].getBackground()==Color.blue && button2[1][0].getBackground()==Color.blue && button2[2][0].getBackground()==Color.blue) || (button2[0][1].getBackground()==Color.blue && button2[1][1].getBackground()==Color.blue && button2[2][1].getBackground()==Color.blue) || (button2[0][2].getBackground()==Color.blue && button2[1][2].getBackground()==Color.blue && button2[2][2].getBackground()==Color.blue) || (button2[0][0].getBackground()==Color.blue && button2[1][1].getBackground()==Color.blue && button2[2][2].getBackground()==Color.blue) || (button2[0][2].getBackground()==Color.blue && button2[1][1].getBackground()==Color.blue && button2[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button2[i][j].setBackground(Color.blue);
                    p2=1;
                }
            }
        }
        if((button2[0][0].getBackground()==Color.red && button2[0][1].getBackground()==Color.red && button2[0][2].getBackground()==Color.red) || (button2[1][0].getBackground()==Color.red && button2[1][1].getBackground()==Color.red && button2[1][2].getBackground()==Color.red) || (button2[2][0].getBackground()==Color.red && button2[2][1].getBackground()==Color.red && button2[2][2].getBackground()==Color.red) || (button2[0][0].getBackground()==Color.red && button2[1][0].getBackground()==Color.red && button2[2][0].getBackground()==Color.red) || (button2[0][1].getBackground()==Color.red && button2[1][1].getBackground()==Color.red && button2[2][1].getBackground()==Color.red) || (button2[0][2].getBackground()==Color.red && button2[1][2].getBackground()==Color.red && button2[2][2].getBackground()==Color.red) || (button2[0][0].getBackground()==Color.red && button2[1][1].getBackground()==Color.red && button2[2][2].getBackground()==Color.red) || (button2[0][2].getBackground()==Color.red && button2[1][1].getBackground()==Color.red && button2[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button2[i][j].setBackground(Color.red);
                    p2=2;
                }
            }
        }

        if((button3[0][0].getBackground()==Color.blue && button3[0][1].getBackground()==Color.blue && button3[0][2].getBackground()==Color.blue) || (button3[1][0].getBackground()==Color.blue && button3[1][1].getBackground()==Color.blue && button3[1][2].getBackground()==Color.blue) || (button3[2][0].getBackground()==Color.blue && button3[2][1].getBackground()==Color.blue && button3[2][2].getBackground()==Color.blue) || (button3[0][0].getBackground()==Color.blue && button3[1][0].getBackground()==Color.blue && button3[2][0].getBackground()==Color.blue) || (button3[0][1].getBackground()==Color.blue && button3[1][1].getBackground()==Color.blue && button3[2][1].getBackground()==Color.blue) || (button3[0][2].getBackground()==Color.blue && button3[1][2].getBackground()==Color.blue && button3[2][2].getBackground()==Color.blue) || (button3[0][0].getBackground()==Color.blue && button3[1][1].getBackground()==Color.blue && button3[2][2].getBackground()==Color.blue) || (button3[0][2].getBackground()==Color.blue && button3[1][1].getBackground()==Color.blue && button3[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button3[i][j].setBackground(Color.blue);
                    p3=1;
                }
            }
        }
        if((button3[0][0].getBackground()==Color.red && button3[0][1].getBackground()==Color.red && button3[0][2].getBackground()==Color.red) || (button3[1][0].getBackground()==Color.red && button3[1][1].getBackground()==Color.red && button3[1][2].getBackground()==Color.red) || (button3[2][0].getBackground()==Color.red && button3[2][1].getBackground()==Color.red && button3[2][2].getBackground()==Color.red) || (button3[0][0].getBackground()==Color.red && button3[1][0].getBackground()==Color.red && button3[2][0].getBackground()==Color.red) || (button3[0][1].getBackground()==Color.red && button3[1][1].getBackground()==Color.red && button3[2][1].getBackground()==Color.red) || (button3[0][2].getBackground()==Color.red && button3[1][2].getBackground()==Color.red && button3[2][2].getBackground()==Color.red) || (button3[0][0].getBackground()==Color.red && button3[1][1].getBackground()==Color.red && button3[2][2].getBackground()==Color.red) || (button3[0][2].getBackground()==Color.red && button3[1][1].getBackground()==Color.red && button3[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button3[i][j].setBackground(Color.red);
                    p3=2;
                }
            }
        }

        if((button4[0][0].getBackground()==Color.blue && button4[0][1].getBackground()==Color.blue && button4[0][2].getBackground()==Color.blue) || (button4[1][0].getBackground()==Color.blue && button4[1][1].getBackground()==Color.blue && button4[1][2].getBackground()==Color.blue) || (button4[2][0].getBackground()==Color.blue && button4[2][1].getBackground()==Color.blue && button4[2][2].getBackground()==Color.blue) || (button4[0][0].getBackground()==Color.blue && button4[1][0].getBackground()==Color.blue && button4[2][0].getBackground()==Color.blue) || (button4[0][1].getBackground()==Color.blue && button4[1][1].getBackground()==Color.blue && button4[2][1].getBackground()==Color.blue) || (button4[0][2].getBackground()==Color.blue && button4[1][2].getBackground()==Color.blue && button4[2][2].getBackground()==Color.blue) || (button4[0][0].getBackground()==Color.blue && button4[1][1].getBackground()==Color.blue && button4[2][2].getBackground()==Color.blue) || (button4[0][2].getBackground()==Color.blue && button4[1][1].getBackground()==Color.blue && button4[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button4[i][j].setBackground(Color.blue);
                    p4=1;
                }
            }
        }
        if((button4[0][0].getBackground()==Color.red && button4[0][1].getBackground()==Color.red && button4[0][2].getBackground()==Color.red) || (button4[1][0].getBackground()==Color.red && button4[1][1].getBackground()==Color.red && button4[1][2].getBackground()==Color.red) || (button4[2][0].getBackground()==Color.red && button4[2][1].getBackground()==Color.red && button4[2][2].getBackground()==Color.red) || (button4[0][0].getBackground()==Color.red && button4[1][0].getBackground()==Color.red && button4[2][0].getBackground()==Color.red) || (button4[0][1].getBackground()==Color.red && button4[1][1].getBackground()==Color.red && button4[2][1].getBackground()==Color.red) || (button4[0][2].getBackground()==Color.red && button4[1][2].getBackground()==Color.red && button4[2][2].getBackground()==Color.red) || (button4[0][0].getBackground()==Color.red && button4[1][1].getBackground()==Color.red && button4[2][2].getBackground()==Color.red) || (button4[0][2].getBackground()==Color.red && button4[1][1].getBackground()==Color.red && button4[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button4[i][j].setBackground(Color.red);
                    p4=2;
                }
            }
        }

        if((button5[0][0].getBackground()==Color.blue && button5[0][1].getBackground()==Color.blue && button5[0][2].getBackground()==Color.blue) || (button5[1][0].getBackground()==Color.blue && button5[1][1].getBackground()==Color.blue && button5[1][2].getBackground()==Color.blue) || (button5[2][0].getBackground()==Color.blue && button5[2][1].getBackground()==Color.blue && button5[2][2].getBackground()==Color.blue) || (button5[0][0].getBackground()==Color.blue && button5[1][0].getBackground()==Color.blue && button5[2][0].getBackground()==Color.blue) || (button5[0][1].getBackground()==Color.blue && button5[1][1].getBackground()==Color.blue && button5[2][1].getBackground()==Color.blue) || (button5[0][2].getBackground()==Color.blue && button5[1][2].getBackground()==Color.blue && button5[2][2].getBackground()==Color.blue) || (button5[0][0].getBackground()==Color.blue && button5[1][1].getBackground()==Color.blue && button5[2][2].getBackground()==Color.blue) || (button5[0][2].getBackground()==Color.blue && button5[1][1].getBackground()==Color.blue && button5[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button5[i][j].setBackground(Color.blue);
                    p5=1;
                }
            }
        }
        if((button5[0][0].getBackground()==Color.red && button5[0][1].getBackground()==Color.red && button5[0][2].getBackground()==Color.red) || (button5[1][0].getBackground()==Color.red && button5[1][1].getBackground()==Color.red && button5[1][2].getBackground()==Color.red) || (button5[2][0].getBackground()==Color.red && button5[2][1].getBackground()==Color.red && button5[2][2].getBackground()==Color.red) || (button5[0][0].getBackground()==Color.red && button5[1][0].getBackground()==Color.red && button5[2][0].getBackground()==Color.red) || (button5[0][1].getBackground()==Color.red && button5[1][1].getBackground()==Color.red && button5[2][1].getBackground()==Color.red) || (button5[0][2].getBackground()==Color.red && button5[1][2].getBackground()==Color.red && button5[2][2].getBackground()==Color.red) || (button5[0][0].getBackground()==Color.red && button5[1][1].getBackground()==Color.red && button5[2][2].getBackground()==Color.red) || (button5[0][2].getBackground()==Color.red && button5[1][1].getBackground()==Color.red && button5[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button5[i][j].setBackground(Color.red);
                    p5=2;
                }
            }
        }

        if((button6[0][0].getBackground()==Color.blue && button6[0][1].getBackground()==Color.blue && button6[0][2].getBackground()==Color.blue) || (button6[1][0].getBackground()==Color.blue && button6[1][1].getBackground()==Color.blue && button6[1][2].getBackground()==Color.blue) || (button6[2][0].getBackground()==Color.blue && button6[2][1].getBackground()==Color.blue && button6[2][2].getBackground()==Color.blue) || (button6[0][0].getBackground()==Color.blue && button6[1][0].getBackground()==Color.blue && button6[2][0].getBackground()==Color.blue) || (button6[0][1].getBackground()==Color.blue && button6[1][1].getBackground()==Color.blue && button6[2][1].getBackground()==Color.blue) || (button6[0][2].getBackground()==Color.blue && button6[1][2].getBackground()==Color.blue && button6[2][2].getBackground()==Color.blue) || (button6[0][0].getBackground()==Color.blue && button6[1][1].getBackground()==Color.blue && button6[2][2].getBackground()==Color.blue) || (button6[0][2].getBackground()==Color.blue && button6[1][1].getBackground()==Color.blue && button6[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button6[i][j].setBackground(Color.blue);
                    p6=1;
                }
            }
        }
        if((button6[0][0].getBackground()==Color.red && button6[0][1].getBackground()==Color.red && button6[0][2].getBackground()==Color.red) || (button6[1][0].getBackground()==Color.red && button6[1][1].getBackground()==Color.red && button6[1][2].getBackground()==Color.red) || (button6[2][0].getBackground()==Color.red && button6[2][1].getBackground()==Color.red && button6[2][2].getBackground()==Color.red) || (button6[0][0].getBackground()==Color.red && button6[1][0].getBackground()==Color.red && button6[2][0].getBackground()==Color.red) || (button6[0][1].getBackground()==Color.red && button6[1][1].getBackground()==Color.red && button6[2][1].getBackground()==Color.red) || (button6[0][2].getBackground()==Color.red && button6[1][2].getBackground()==Color.red && button6[2][2].getBackground()==Color.red) || (button6[0][0].getBackground()==Color.red && button6[1][1].getBackground()==Color.red && button6[2][2].getBackground()==Color.red) || (button6[0][2].getBackground()==Color.red && button6[1][1].getBackground()==Color.red && button6[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button6[i][j].setBackground(Color.red);
                    p6=2;
                }
            }
        }

        if((button7[0][0].getBackground()==Color.blue && button7[0][1].getBackground()==Color.blue && button7[0][2].getBackground()==Color.blue) || (button7[1][0].getBackground()==Color.blue && button7[1][1].getBackground()==Color.blue && button7[1][2].getBackground()==Color.blue) || (button7[2][0].getBackground()==Color.blue && button7[2][1].getBackground()==Color.blue && button7[2][2].getBackground()==Color.blue) || (button7[0][0].getBackground()==Color.blue && button7[1][0].getBackground()==Color.blue && button7[2][0].getBackground()==Color.blue) || (button7[0][1].getBackground()==Color.blue && button7[1][1].getBackground()==Color.blue && button7[2][1].getBackground()==Color.blue) || (button7[0][2].getBackground()==Color.blue && button7[1][2].getBackground()==Color.blue && button7[2][2].getBackground()==Color.blue) || (button7[0][0].getBackground()==Color.blue && button7[1][1].getBackground()==Color.blue && button7[2][2].getBackground()==Color.blue) || (button7[0][2].getBackground()==Color.blue && button7[1][1].getBackground()==Color.blue && button7[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button7[i][j].setBackground(Color.blue);
                    p7=1;
                }
            }
        }
        if((button7[0][0].getBackground()==Color.red && button7[0][1].getBackground()==Color.red && button7[0][2].getBackground()==Color.red) || (button7[1][0].getBackground()==Color.red && button7[1][1].getBackground()==Color.red && button7[1][2].getBackground()==Color.red) || (button7[2][0].getBackground()==Color.red && button7[2][1].getBackground()==Color.red && button7[2][2].getBackground()==Color.red) || (button7[0][0].getBackground()==Color.red && button7[1][0].getBackground()==Color.red && button7[2][0].getBackground()==Color.red) || (button7[0][1].getBackground()==Color.red && button7[1][1].getBackground()==Color.red && button7[2][1].getBackground()==Color.red) || (button7[0][2].getBackground()==Color.red && button7[1][2].getBackground()==Color.red && button7[2][2].getBackground()==Color.red) || (button7[0][0].getBackground()==Color.red && button7[1][1].getBackground()==Color.red && button7[2][2].getBackground()==Color.red) || (button7[0][2].getBackground()==Color.red && button7[1][1].getBackground()==Color.red && button7[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button7[i][j].setBackground(Color.red);
                    p7=2;
                }
            }
        }

        if((button8[0][0].getBackground()==Color.blue && button8[0][1].getBackground()==Color.blue && button8[0][2].getBackground()==Color.blue) || (button8[1][0].getBackground()==Color.blue && button8[1][1].getBackground()==Color.blue && button8[1][2].getBackground()==Color.blue) || (button8[2][0].getBackground()==Color.blue && button8[2][1].getBackground()==Color.blue && button8[2][2].getBackground()==Color.blue) || (button8[0][0].getBackground()==Color.blue && button8[1][0].getBackground()==Color.blue && button8[2][0].getBackground()==Color.blue) || (button8[0][1].getBackground()==Color.blue && button8[1][1].getBackground()==Color.blue && button8[2][1].getBackground()==Color.blue) || (button8[0][2].getBackground()==Color.blue && button8[1][2].getBackground()==Color.blue && button8[2][2].getBackground()==Color.blue) || (button8[0][0].getBackground()==Color.blue && button8[1][1].getBackground()==Color.blue && button8[2][2].getBackground()==Color.blue) || (button8[0][2].getBackground()==Color.blue && button8[1][1].getBackground()==Color.blue && button8[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button8[i][j].setBackground(Color.blue);
                    p8=1;
                }
            }
        }
        if((button8[0][0].getBackground()==Color.red && button8[0][1].getBackground()==Color.red && button8[0][2].getBackground()==Color.red) || (button8[1][0].getBackground()==Color.red && button8[1][1].getBackground()==Color.red && button8[1][2].getBackground()==Color.red) || (button8[2][0].getBackground()==Color.red && button8[2][1].getBackground()==Color.red && button8[2][2].getBackground()==Color.red) || (button8[0][0].getBackground()==Color.red && button8[1][0].getBackground()==Color.red && button8[2][0].getBackground()==Color.red) || (button8[0][1].getBackground()==Color.red && button8[1][1].getBackground()==Color.red && button8[2][1].getBackground()==Color.red) || (button8[0][2].getBackground()==Color.red && button8[1][2].getBackground()==Color.red && button8[2][2].getBackground()==Color.red) || (button8[0][0].getBackground()==Color.red && button8[1][1].getBackground()==Color.red && button8[2][2].getBackground()==Color.red) || (button8[0][2].getBackground()==Color.red && button8[1][1].getBackground()==Color.red && button8[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button8[i][j].setBackground(Color.red);
                    p8=2;
                }
            }
        }

        if((button9[0][0].getBackground()==Color.blue && button9[0][1].getBackground()==Color.blue && button9[0][2].getBackground()==Color.blue) || (button9[1][0].getBackground()==Color.blue && button9[1][1].getBackground()==Color.blue && button9[1][2].getBackground()==Color.blue) || (button9[2][0].getBackground()==Color.blue && button9[2][1].getBackground()==Color.blue && button9[2][2].getBackground()==Color.blue) || (button9[0][0].getBackground()==Color.blue && button9[1][0].getBackground()==Color.blue && button9[2][0].getBackground()==Color.blue) || (button9[0][1].getBackground()==Color.blue && button9[1][1].getBackground()==Color.blue && button9[2][1].getBackground()==Color.blue) || (button9[0][2].getBackground()==Color.blue && button9[1][2].getBackground()==Color.blue && button9[2][2].getBackground()==Color.blue) || (button9[0][0].getBackground()==Color.blue && button9[1][1].getBackground()==Color.blue && button9[2][2].getBackground()==Color.blue) || (button9[0][2].getBackground()==Color.blue && button9[1][1].getBackground()==Color.blue && button9[2][0].getBackground()==Color.blue)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button9[i][j].setBackground(Color.blue);
                    p9=1;
                }
            }
        }
        if((button9[0][0].getBackground()==Color.red && button9[0][1].getBackground()==Color.red && button9[0][2].getBackground()==Color.red) || (button9[1][0].getBackground()==Color.red && button9[1][1].getBackground()==Color.red && button9[1][2].getBackground()==Color.red) || (button9[2][0].getBackground()==Color.red && button9[2][1].getBackground()==Color.red && button9[2][2].getBackground()==Color.red) || (button9[0][0].getBackground()==Color.red && button9[1][0].getBackground()==Color.red && button9[2][0].getBackground()==Color.red) || (button9[0][1].getBackground()==Color.red && button9[1][1].getBackground()==Color.red && button9[2][1].getBackground()==Color.red) || (button9[0][2].getBackground()==Color.red && button9[1][2].getBackground()==Color.red && button9[2][2].getBackground()==Color.red) || (button9[0][0].getBackground()==Color.red && button9[1][1].getBackground()==Color.red && button9[2][2].getBackground()==Color.red) || (button9[0][2].getBackground()==Color.red && button9[1][1].getBackground()==Color.red && button9[2][0].getBackground()==Color.red)){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button9[i][j].setBackground(Color.red);
                    p9=2;
                }
            }
        }
    }

    public void checkVictory(){
        if((p1==1 && p2==1 && p3==1) || (p4==1 && p5==1 && p6==1) || (p7==1 && p8==1 && p9==1) || (p1==1 && p4==1 && p7==1) || (p2==1 && p5==1 && p8==1) || (p3==1 && p6==1 && p9==1) || (p1==1 && p5==1 && p9==1) || (p3==1 && p5==1 && p7==1)){
            JOptionPane.showMessageDialog(null, "Player 1 Wins!");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button1[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button2[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button3[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button4[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button5[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button6[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button7[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button8[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button9[i][j].setBackground(null);
                }
            }
            p1=0;
            p2=0;
            p3=0;
            p4=0;
            p5=0;
            p6=0;
            p7=0;
            p8=0;
            p9=0;
            previous=0;
            turn=2;
        }

        if((p1==2 && p2==2 && p3==2) || (p4==2 && p5==2 && p6==2) || (p7==2 && p8==2 && p9==2) || (p1==2 && p4==2 && p7==2) || (p2==2 && p5==2 && p8==2) || (p3==2 && p6==2 && p9==2) || (p1==2 && p5==2 && p9==2) || (p3==2 && p5==2 && p7==2)){
            JOptionPane.showMessageDialog(null, "Player 2 Wins!");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button1[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button2[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button3[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button4[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button5[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button6[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button7[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button8[i][j].setBackground(null);
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    button9[i][j].setBackground(null);
                }
            }
            p1=0;
            p2=0;
            p3=0;
            p4=0;
            p5=0;
            p6=0;
            p7=0;
            p8=0;
            p9=0;
            previous=0;
            turn=2;
        }
    }

    public void actionPerformed(ActionEvent event){
        boolean isValid = true;
        if((previous==1 && p1!=0) || (previous==2 && p2!=0) || (previous==3 && p3!=0) || (previous==4 && p4!=0) || (previous==5 && p5!=0) || (previous==6 && p6!=0) || (previous==7 && p7!=0) || (previous==8 && p8!=0) || (previous==9 && p9!=0)){
            previous=0;
        }

        //restricted domain
        if(previous==1 && (event.getSource()!=button1[0][0] && event.getSource()!=button1[0][1] && event.getSource()!=button1[0][2] && event.getSource()!=button1[1][0] && event.getSource()!=button1[1][1] && event.getSource()!=button1[1][2] && event.getSource()!=button1[2][0] && event.getSource()!=button1[2][1] && event.getSource()!=button1[2][2])){
            isValid=false;
        }
        if(previous==2 && (event.getSource()!=button2[0][0] && event.getSource()!=button2[0][1] && event.getSource()!=button2[0][2] && event.getSource()!=button2[1][0] && event.getSource()!=button2[1][1] && event.getSource()!=button2[1][2] && event.getSource()!=button2[2][0] && event.getSource()!=button2[2][1] && event.getSource()!=button2[2][2])){
            isValid=false;
        }
        if(previous==3 && (event.getSource()!=button3[0][0] && event.getSource()!=button3[0][1] && event.getSource()!=button3[0][2] && event.getSource()!=button3[1][0] && event.getSource()!=button3[1][1] && event.getSource()!=button3[1][2] && event.getSource()!=button3[2][0] && event.getSource()!=button3[2][1] && event.getSource()!=button3[2][2])){
            isValid=false;
        }
        if(previous==4 && (event.getSource()!=button4[0][0] && event.getSource()!=button4[0][1] && event.getSource()!=button4[0][2] && event.getSource()!=button4[1][0] && event.getSource()!=button4[1][1] && event.getSource()!=button4[1][2] && event.getSource()!=button4[2][0] && event.getSource()!=button4[2][1] && event.getSource()!=button4[2][2])){
            isValid=false;
        }
        if(previous==5 && (event.getSource()!=button5[0][0] && event.getSource()!=button5[0][1] && event.getSource()!=button5[0][2] && event.getSource()!=button5[1][0] && event.getSource()!=button5[1][1] && event.getSource()!=button5[1][2] && event.getSource()!=button5[2][0] && event.getSource()!=button5[2][1] && event.getSource()!=button5[2][2])){
            isValid=false;
        }
        if(previous==6 && (event.getSource()!=button6[0][0] && event.getSource()!=button6[0][1] && event.getSource()!=button6[0][2] && event.getSource()!=button6[1][0] && event.getSource()!=button6[1][1] && event.getSource()!=button6[1][2] && event.getSource()!=button6[2][0] && event.getSource()!=button6[2][1] && event.getSource()!=button6[2][2])){
            isValid=false;
        }
        if(previous==7 && (event.getSource()!=button7[0][0] && event.getSource()!=button7[0][1] && event.getSource()!=button7[0][2] && event.getSource()!=button7[1][0] && event.getSource()!=button7[1][1] && event.getSource()!=button7[1][2] && event.getSource()!=button7[2][0] && event.getSource()!=button7[2][1] && event.getSource()!=button7[2][2])){
            isValid=false;
        }
        if(previous==8 && (event.getSource()!=button8[0][0] && event.getSource()!=button8[0][1] && event.getSource()!=button8[0][2] && event.getSource()!=button8[1][0] && event.getSource()!=button8[1][1] && event.getSource()!=button8[1][2] && event.getSource()!=button8[2][0] && event.getSource()!=button8[2][1] && event.getSource()!=button8[2][2])){
            isValid=false;
        }
        if(previous==9 && (event.getSource()!=button9[0][0] && event.getSource()!=button9[0][1] && event.getSource()!=button9[0][2] && event.getSource()!=button9[1][0] && event.getSource()!=button9[1][1] && event.getSource()!=button9[1][2] && event.getSource()!=button9[2][0] && event.getSource()!=button9[2][1] && event.getSource()!=button9[2][2])){
            isValid=false;
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //move taken
                if(event.getSource() == button1[i][j] && (button1[i][j].getBackground()==Color.blue ||button1[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button2[i][j] && (button2[i][j].getBackground()==Color.blue ||button2[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button3[i][j] && (button3[i][j].getBackground()==Color.blue ||button3[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button4[i][j] && (button4[i][j].getBackground()==Color.blue ||button4[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button5[i][j] && (button5[i][j].getBackground()==Color.blue ||button5[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button6[i][j] && (button6[i][j].getBackground()==Color.blue ||button6[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button7[i][j] && (button7[i][j].getBackground()==Color.blue ||button7[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button8[i][j] && (button8[i][j].getBackground()==Color.blue ||button8[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
                if(event.getSource() == button9[i][j] && (button9[i][j].getBackground()==Color.blue ||button9[i][j].getBackground()==Color.red)){
                    isValid=false;
                }
            }
        }

        if(isValid){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    //move
                    if(event.getSource() == button1[i][j] && turn==2 && button1[i][j].getBackground() != Color.red && button1[i][j].getBackground() != Color.red){
                        button1[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button1[i][j] && turn==1 && button1[i][j].getBackground() != Color.red && button1[i][j].getBackground() != Color.red){
                        button1[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button2[i][j] && turn==2 && button2[i][j].getBackground() != Color.red && button2[i][j].getBackground() != Color.red){
                        button2[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button2[i][j] && turn==1 && button2[i][j].getBackground() != Color.red && button2[i][j].getBackground() != Color.red){
                        button2[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button3[i][j] && turn==2 && button3[i][j].getBackground() != Color.red && button3[i][j].getBackground() != Color.red){
                        button3[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button3[i][j] && turn==1 && button3[i][j].getBackground() != Color.red && button3[i][j].getBackground() != Color.red){
                        button3[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button4[i][j] && turn==2 && button4[i][j].getBackground() != Color.red && button4[i][j].getBackground() != Color.red){
                        button4[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button4[i][j] && turn==1 && button4[i][j].getBackground() != Color.red && button4[i][j].getBackground() != Color.red){
                        button4[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button5[i][j] && turn==2 && button5[i][j].getBackground() != Color.red && button5[i][j].getBackground() != Color.red){
                        button5[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button5[i][j] && turn==1 && button5[i][j].getBackground() != Color.red && button5[i][j].getBackground() != Color.red){
                        button5[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button6[i][j] && turn==2 && button6[i][j].getBackground() != Color.red && button6[i][j].getBackground() != Color.red){
                        button6[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button6[i][j] && turn==1 && button6[i][j].getBackground() != Color.red && button6[i][j].getBackground() != Color.red){
                        button6[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button7[i][j] && turn==2 && button7[i][j].getBackground() != Color.red && button7[i][j].getBackground() != Color.red){
                        button7[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button7[i][j] && turn==1 && button7[i][j].getBackground() != Color.red && button7[i][j].getBackground() != Color.red){
                        button7[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button8[i][j] && turn==2 && button8[i][j].getBackground() != Color.red && button8[i][j].getBackground() != Color.red){
                        button8[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button8[i][j] && turn==1 && button8[i][j].getBackground() != Color.red && button8[i][j].getBackground() != Color.red){
                        button8[i][j].setBackground(Color.red);
                    }
                    if(event.getSource() == button9[i][j] && turn==2 && button9[i][j].getBackground() != Color.red && button9[i][j].getBackground() != Color.red){
                        button9[i][j].setBackground(Color.blue);
                    }
                    else if(event.getSource() == button9[i][j] && turn==1 && button9[i][j].getBackground() != Color.red && button9[i][j].getBackground() != Color.red){
                        button9[i][j].setBackground(Color.red);
                    }
                }
            }

            //set previous
            if(event.getSource() == button1[0][0] || event.getSource() == button2[0][0] || event.getSource() == button3[0][0] || event.getSource() == button4[0][0] || event.getSource() == button5[0][0] || event.getSource() == button6[0][0] || event.getSource() == button7[0][0] || event.getSource() == button8[0][0] || event.getSource() == button9[0][0]){
                previous=1;
            }
            if(event.getSource() == button1[0][1] || event.getSource() == button2[0][1] || event.getSource() == button3[0][1] || event.getSource() == button4[0][1] || event.getSource() == button5[0][1] || event.getSource() == button6[0][1] || event.getSource() == button7[0][1] || event.getSource() == button8[0][1] || event.getSource() == button9[0][1]){
                previous=2;
            }
            if(event.getSource() == button1[0][2] || event.getSource() == button2[0][2] || event.getSource() == button3[0][2] || event.getSource() == button4[0][2] || event.getSource() == button5[0][2] || event.getSource() == button6[0][2] || event.getSource() == button7[0][2] || event.getSource() == button8[0][2] || event.getSource() == button9[0][2]){
                previous=3;
            }
            if(event.getSource() == button1[1][0] || event.getSource() == button2[1][0] || event.getSource() == button3[1][0] || event.getSource() == button4[1][0] || event.getSource() == button5[1][0] || event.getSource() == button6[1][0] || event.getSource() == button7[1][0] || event.getSource() == button8[1][0] || event.getSource() == button9[1][0]){
                previous=4;
            }
            if(event.getSource() == button1[1][1] || event.getSource() == button2[1][1] || event.getSource() == button3[1][1] || event.getSource() == button4[1][1] || event.getSource() == button5[1][1] || event.getSource() == button6[1][1] || event.getSource() == button7[1][1] || event.getSource() == button8[1][1] || event.getSource() == button9[1][1]){
                previous=5;
            }
            if(event.getSource() == button1[1][2] || event.getSource() == button2[1][2] || event.getSource() == button3[1][2] || event.getSource() == button4[1][2] || event.getSource() == button5[1][2] || event.getSource() == button6[1][2] || event.getSource() == button7[1][2] || event.getSource() == button8[1][2] || event.getSource() == button9[1][2]){
                previous=6;
            }
            if(event.getSource() == button1[2][0] || event.getSource() == button2[2][0] || event.getSource() == button3[2][0] || event.getSource() == button4[2][0] || event.getSource() == button5[2][0] || event.getSource() == button6[2][0] || event.getSource() == button7[2][0] || event.getSource() == button8[2][0] || event.getSource() == button9[2][0]){
                previous=7;
            }
            if(event.getSource() == button1[2][1] || event.getSource() == button2[2][1] || event.getSource() == button3[2][1] || event.getSource() == button4[2][1] || event.getSource() == button5[2][1] || event.getSource() == button6[2][1] || event.getSource() == button7[2][1] || event.getSource() == button8[2][1] || event.getSource() == button9[2][1]){
                previous=8;
            }
            if(event.getSource() == button1[2][2] || event.getSource() == button2[2][2] || event.getSource() == button3[2][2] || event.getSource() == button4[2][2] || event.getSource() == button5[2][2] || event.getSource() == button6[2][2] || event.getSource() == button7[2][2] || event.getSource() == button8[2][2] || event.getSource() == button9[2][2]){
                previous=9;
            }

            if(turn==2){
                turn=1;}
            else{
                turn=2;
            }
        }

        else{
            JOptionPane.showMessageDialog(null, "Invalid move!");
        }

        checkSingleVictory();
        checkVictory();
    }
}