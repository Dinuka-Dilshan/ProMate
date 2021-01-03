/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Lasith
 */
import javax.swing.*;
public class MyFrame extends  javax.swing.JFrame{
    GraphicsDemo demo = new GraphicsDemo();
    public MyFrame(){
        
        this.setSize(420,420);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(demo);
        this.setVisible(true);
    
    } 
    
    
    
}
