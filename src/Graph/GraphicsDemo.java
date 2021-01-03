/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Lasith
 */
public class GraphicsDemo extends javax.swing.JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        Graphics2D g2d = (Graphics2D) g;
        
//        g2d.setColor(Color.MAGENTA);
//        g2d.setStroke(new BasicStroke(20));
//        g2d.drawLine(0, 0, 100, 100);
        
            int[] xpoints = {50,100,150,200,250,300,350};
            int[] ypoints = {350,250,275,200,275,150,100};
            int npoints=xpoints.length;
            
            g2d.setColor(Color.GREEN);
            g2d.setStroke(new BasicStroke(1));
            g2d.drawLine(50, 350, 350,350);
            g2d.drawLine(50, 350, 50, 50);
            
            g2d.drawPolyline(xpoints, ypoints, npoints);
            
        
        
        
    
    }
    
    
}
