import javax.swing.*; //imports whatever is needed to run this GUI

public class SimpleGui1{ 
    public SimpleGui1() {
        JFrame frame = new JFrame(); //create window
        JButton button = new JButton("click me"); //create button object
        JLabel label = new JLabel("Swing is pretty cool"); //create label (left-set, can't click on)

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button); //put button in frame
        frame.add(label); //put label in frame
        frame.setSize(300, 300); //determines the GUI dimensions; (width, height)
        frame.setVisible(true); //takes boolean to determine whether frame is visible
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1(); //just makes a SimpleGui1 to be used
    }
} 
