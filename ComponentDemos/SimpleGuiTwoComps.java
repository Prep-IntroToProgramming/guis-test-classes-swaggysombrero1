package ComponentDemos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGuiTwoComps implements ActionListener{
    JFrame frame= new JFrame();
    public SimpleGuiTwoComps(){
        
        JButton button = new JButton("THIS IS MY BUTTON");
        RandomPanel p = new RandomPanel();
        frame.add(BorderLayout.CENTER, p);
        frame.setSize(500, 500);
        
        frame.add(BorderLayout.NORTH, button);
        button.addActionListener(this);
        frame.setVisible(true);
        //p.paintComponent();
        //System.out.println(p);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        frame.repaint();
    }
    public static void main(){
        SimpleGuiTwoComps s = new SimpleGuiTwoComps();
    }
}
