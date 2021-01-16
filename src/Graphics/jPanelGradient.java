/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Gunasekara
 */


public class jPanelGradient extends JPanel{
    
    protected int width;
    protected int height;
    protected int a,b,c,d,e,f;

    public jPanelGradient(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    //207,217,223,226,235,240 - Cloudy Knoxville
    //245,247,250,195,207,226
    //236,233,230,255,255,255
    //195,207,226,245,247,250 - Saint Petersberg
    //134,143,150,89,97,100   - Mountain Rock
    //41,50,60,72,85,99       - 
   
   
    @Override
    public void paintComponent(Graphics g){
       
        Graphics2D g2d = (Graphics2D) g;
        width = getWidth();
        height = getHeight();

        Color color1 = new Color(a,b,c);
        Color color2 = new Color(d,e,f);
        GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
        
    }
 
}
