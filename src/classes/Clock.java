/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Lasith
 */
public class Clock {
    
    public static void showTime(JLabel windowTime, JLabel payAt){
    
        new Timer(0, (ActionEvent e) -> {
            Date time = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); 
            windowTime.setText(s.format(time));
            payAt.setText(timeFormat.format(time));
        }).start();
    }
}
