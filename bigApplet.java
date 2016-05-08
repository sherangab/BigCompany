/*
   Big Company GUI
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class bigApplet extends JApplet {
   public bigApplet() {
      setLayout(new BorderLayout(5,10));
      
      // Panels
      JPanel top = new JPanel();      
      JPanel middle = new JPanel();
      JPanel bottom = new JPanel();
      
      // Top Panel Components
      JLabel jlData = new JLabel("Data");      
      JTextArea jtaDisplay = new JTextArea(10,25);
      jtaDisplay.setLineWrap(true);
      jtaDisplay.setEditable(false);
      
      // Bottom Panel Components
      JButton jbReset = new JButton("Reset");
      JButton jbSort = new JButton("Sort");
      JButton jbAdd = new JButton("Add");
      JButton jbDel = new JButton("Delete");   
      
      // Middle Panel Components
      JLabel jlNew = new JLabel("New");
      JTextField jtfNew = new JTextField(30);
      jtfNew.setToolTipText("Enter exactly as above listing");
      JLabel jlDel = new JLabel("Delete ID");
      JTextField jtfDel = new JTextField(18);
      jtfDel.setToolTipText("Enter ID number of Employee to Delete");
            
      // Add Components to Top Panel
      top.add(jlData);
      top.add(jtaDisplay);      
      
      // Add Components to Middle Panel
      middle.add(jlNew);
      middle.add(jtfNew);
      middle.add(jlDel);
      middle.add(jtfDel);
      
      // Add Components to Bottom Panel
      bottom.add(jbReset);
      bottom.add(jbSort);
      bottom.add(jbAdd);
      bottom.add(jbDel);
      
      // Add Panels to Frame
      add(top, BorderLayout.NORTH);
      add(middle, BorderLayout.CENTER);
      add(bottom, BorderLayout.SOUTH);
            
      // Button Listeners
      jbReset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Company.Reset();
            Company.Display(jtaDisplay);
         }
      });
      
      jbSort.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Company.Sort();
            Company.Display(jtaDisplay);
         }
      });
      
      jbAdd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(jtfNew.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Information Missing", "Add", JOptionPane.ERROR_MESSAGE);
            }
            else {
            Company.Add(jtfNew.getText());
            Company.Display(jtaDisplay);
            jtfNew.setText("");
            }
         }
      });
      
      jbDel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(jtfDel.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Information Missing", "Delete", JOptionPane.ERROR_MESSAGE);
            }
            else {
               Company.Delete(Integer.parseInt(jtfDel.getText()));
               Company.Display(jtaDisplay);
               jtfDel.setText("");
            }
         }
      });
   }
   
   public void init() {
      bigApplet frame = new bigApplet();
   }
}