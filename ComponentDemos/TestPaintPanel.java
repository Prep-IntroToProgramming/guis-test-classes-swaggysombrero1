package ComponentDemos;
import javax.swing.*;
import java.awt.*;
public class TestPaintPanel{
    public static void main(){
        JFrame frame= new JFrame();
        PaintedPanel p = new PaintedPanel();
        frame.add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
        //p.paintComponent();
        //System.out.println(p);
    }
}
