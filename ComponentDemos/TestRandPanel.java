package ComponentDemos;
import javax.swing.*;
import java.awt.*;
public class TestRandPanel{
    public static void main(){
        JFrame frame= new JFrame();
        RandomPanel p = new RandomPanel();
        frame.add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
        //p.paintComponent();
        //System.out.println(p);
    }
}
