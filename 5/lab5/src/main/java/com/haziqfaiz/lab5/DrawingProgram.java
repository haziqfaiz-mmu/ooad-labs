/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.haziqfaiz.lab5;

/**
 *
 * @author haziq
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DrawingProgram extends JFrame implements MouseMotionListener, MouseListener, ChangeListener {
    private Point mousePnt = new Point();
    public static Color penColor = new Color(0,0,0);
    private JSlider penSize = new JSlider(JSlider.HORIZONTAL,1,30,4);
    public static int pen =4;
    public DrawingProgram(){
        super("Painter");
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jp = new JPanel();
        toolbar.add(new Label("Drag mouse to draw"));
        toolbar.add(penSize);
        this.add(toolbar,BorderLayout.SOUTH);
        this.add(jp,BorderLayout.CENTER);
        jp.addMouseMotionListener(this);
        jp.addMouseListener(this);
        penSize.addChangeListener(this);
        setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void mouseMoved(MouseEvent me){
    System.out.println("Mouse moved");}
    
    public void mouseDragged(MouseEvent me){
    mousePnt = me.getPoint();
    //repaint is provided by the Jframe
    repaint();
    }
    
    //Override paint method provided by JFrame
    @Override
    public void paint(Graphics g){
        g.setColor(penColor);
        g.drawRect(mousePnt.x, mousePnt.y, pen, pen);
    }
    
    public static void main(String[] a){
        new DrawingProgram();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getModifiers()==MouseEvent.BUTTON3_MASK)//Button3 mask means click right 
            penColor = JColorChooser.showDialog(null,"Change pen color", penColor);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource(); 
        if(!source.getValueIsAdjusting()){
            pen=(int)source.getValue();
        }
    }
}

