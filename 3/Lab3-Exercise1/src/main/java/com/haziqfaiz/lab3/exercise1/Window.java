/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haziqfaiz.lab3.exercise1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author haziq
 */
public class Window {
    
    private class AButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent evt){
	String btn=evt.getActionCommand();  // grab text from button
	JOptionPane.showMessageDialog(null,btn+" was pressed!");
        }       
     }
    
    public void fun()
    {
        // Creating a new frame to store text field and
        // button
        JFrame f = new JFrame("panel");
  
        // Creating a panel to add buttons
        JPanel p = new JPanel();
        
        JButton pushme = new JButton("Push Me");
        p.add(pushme);
        pushme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"A button was pushed!");
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        JButton clickme = new JButton("Click Me");
        p.add(clickme);
        clickme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"B button was clicked!");
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        JButton nothing = new JButton("Nothing");
        p.add(nothing);
  
        for (int x=0;x<4;x++){
            JButton btnArr = new JButton("Button "+x); 
            btnArr.addActionListener(new AButtonActionListener());
            p.add(btnArr);} // This jp comes from JPanel above
        
        // setbackground of panel
        p.setBackground(Color.blue);
  
        // Adding panel to frame
        f.add(p);
  
        // Setting the size of frame
        f.setSize(300, 300);
  
        f.show();
    }
}
