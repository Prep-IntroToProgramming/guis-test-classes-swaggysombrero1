package ComponentDemos;
import javax.swing.*;
import java.awt.*;


public class PaintedPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.red);
        g.fillRect(125, 125, 50, 50);
        for (int i=0; i<255; i++){
            Color c = new Color(i, 0, 0);
            g.setColor(c);
            g.fillRect(300+i, 300+i, 100-i, 100-i);
        }
    }
}
