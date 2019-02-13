import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel
{
    ImageIcon i = new ImageIcon("prep.JPEG");
    @Override
    public void paintComponent(Graphics g) {
        
        //Image image = new Image(i);
        i.getImage();
        g.drawImage(i.getImage(), 3, 4, this);
        
        //g.setColor(Color.blue);
        //g.fillRect(20, 50,100,100);



    }
}
