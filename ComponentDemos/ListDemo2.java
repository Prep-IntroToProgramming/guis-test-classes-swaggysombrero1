package ComponentDemos;

import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.*;

class ListDemo2 {  

    JList<String> list; 
    JLabel label; 
    JScrollPane scroller; 

    String names[] = {"Arcia", "Boyle", "Broyles", "Burnham", "Kim", "Lawrence", "Sean"}; 

    ListDemo2() {  
        JFrame frame = new JFrame("JList Demo");  
        frame.setLayout(new FlowLayout());  
        frame.setSize(200, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        list = new JList<String>(names); 
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
        list.addListSelectionListener(new ListListener()); 

        scroller = new JScrollPane(list); 
        scroller.setPreferredSize(new Dimension(120, 90)); 

        label = new JLabel("Please choose a name"); 
        frame.add(label);
        frame.add(scroller); 

        frame.setVisible(true);  
    }  

    public static void main(String args[]) {  
        ListDemo2 ld = new ListDemo2();    
    }  

    class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent le) {  
            if(!le.getValueIsAdjusting()){
                int[] index = list.getSelectedIndices(); 
                //for (int i: index){
                if(!le.getValueIsAdjusting()) {
                    if (index.length==1){
                        label.setText("Current selection: " + names[list.getSelectedIndex()]); 
                        //System.out.println(names[i]);
                    }else  if (index.length>1&&index.length<7){
                        label.setText("Too many names!!");
                    } else{
                        //SimpleGui2 s = new SimpleGui2();
                    }
                }
                //}
                /*ArrayList<String> selectedNames = new ArrayList<String>();
                for (int i:index){
                selectedNames.add(names[i]);
                }
                label.setText("Current selection: "+selectedNames.toString());
                for (int i = 0; i<15; i++){

                }*/
            }
        }
    }
}
