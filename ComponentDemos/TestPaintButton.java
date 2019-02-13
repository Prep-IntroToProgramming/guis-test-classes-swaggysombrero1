package ComponentDemos;
import javax.swing.*;
import java.awt.*;
public class TestPaintButton{
    public static void main(){
        JFrame frame= new JFrame();
        PaintedButton p = new PaintedButton();
        frame.add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
        //p.paintComponent();
        //System.out.println(p);
    }
}

