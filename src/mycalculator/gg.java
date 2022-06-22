/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycalculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class gg extends javax.swing.JPanel implements ActionListener{
    
    int x=0, y=0;
    Timer t = new Timer (100, this);
     protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        t.start();
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
      x+=5;
      y+=5; 
      repaint();
    }
    
}

