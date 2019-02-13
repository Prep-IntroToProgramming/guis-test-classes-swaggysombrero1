import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ //needed to know that we have ears?
    JFrame frame;
    JButton button;
    int click = 0;
    public SimpleGui1B() {
        button = new JButton("uR bad lol");
        frame = new JFrame();

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button); //adds the button to 
        //frame.add(label);
        //addActionListener - makes something listening, needed for any action from button object
        //"this" refers to the method itself
        button.addActionListener(this); //idk what "this" does,but probably waits to work until clicked (Listener)
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override//: overrides an already existing method from ActionListener and java.awt.event.*
    public void actionPerformed(ActionEvent event) {
        click++;
        button.setText(click+"");
        if (click==8){
            button.setText(click+", that's a fun number");
        }
        if (click==17){
            button.setText(click+", that's Philip Rivers!");
        }
        if (click==12){
            button.setText(click+", that's the real GOAT Aaron Rodgers!");
        }
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }
} 
