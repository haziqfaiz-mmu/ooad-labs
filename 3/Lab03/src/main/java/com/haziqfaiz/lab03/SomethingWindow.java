/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haziqfaiz.lab03;

/**
 *
 * @author haziq
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SomethingWindow extends JFrame{
    public SomethingWindow(){
        
    }
    
     private class AButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent evt){
	String btn=evt.getActionCommand();  // grab text from button
	JOptionPane.showMessageDialog(null,btn+" was pressed!");
        }       
     }
    // JFrame
    static JFrame f;
  
    // JButton
    static JButton b, b1, b2;
  
    // Label to display text
    static JLabel l;
  
    // Main class
    public void fun()
    {
        // Creating a new frame to store text field and
        // button
        f = new JFrame("panel");
  
        // Creating a label to display text
        l = new JLabel("panel label");
        
        
        
  
        // Creating a panel to add buttons
        JPanel p = new JPanel();
  
        for (int x=0;x<4;x++){
            JButton btnArr = new JButton("Button "+x); 
            btnArr.addActionListener(new AButtonActionListener());
            p.add(btnArr);} // This jp comes from JPanel above
        
        // setbackground of panel
        p.setBackground(Color.red);
  
        // Adding panel to frame
        f.add(p);
  
        // Setting the size of frame
        f.setSize(300, 300);
  
        f.show();
    }
}
