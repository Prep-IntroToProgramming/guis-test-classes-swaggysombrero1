package ComponentDemos;

import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

public class CheckBoxDemo{
    JCheckBox c1 = new JCheckBox("1");;
    JCheckBox c2 = new JCheckBox("2");
    JCheckBox c3 = new JCheckBox("3");
    JCheckBox c4 = new JCheckBox("4");
    JCheckBox c5 = new JCheckBox("5");
    JLabel label;
    JFrame  frame;
    String labelText;
    JCheckBox[] checked = {c1, c2, c3, c4, c5};
    public CheckBoxDemo(){
        frame = new JFrame("JCheckBox Demo");  
        frame.setLayout(new FlowLayout());  
        frame.setSize(500, 50);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //c1 
        //c2 
        //c3 
        //c4 
        //c5 
        c1.addItemListener(new JCheck());
        c2.addItemListener(new JCheck());
        c3.addItemListener(new JCheck());
        c4.addItemListener(new JCheck());
        c5.addItemListener(new JCheck());
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        
        label = new JLabel("Pick a dumb check box");
        frame.add(label);
        frame.setVisible(true);
        System.out.println("working?");
    }
    static public void main(){
        CheckBoxDemo test = new CheckBoxDemo();
    }
    public class JCheck implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent ie) {  
            labelText = "Checked: ";
            System.out.println("working?");
            for (int i = 0; i<checked.length; i++){
                System.out.println("Working now?");
                if (checked[i].isSelected()){
                    System.out.println("working?");
                    labelText = labelText+checked[i].getText()+", ";
                }
            }
            System.out.println("working?");
            label.setText(labelText);
        }
    }
}
