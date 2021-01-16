/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import DB.dbConnect;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lasith
 */
public class payment_details {
    
    public static void Update_Payment_Details(DefaultTableModel model,int ID){
        Connection con = dbConnect.getConnection();
        Statement statement;
        try{
            statement = con.createStatement();
            for (int i=0; i < model.getRowCount(); i++){
                    statement.executeUpdate("INSERT INTO payment_details VALUES("+model.getValueAt(i, 2)+","+ID+",'"+model.getValueAt(i, 1)+"');");
            } 
        }catch(Exception e){
        
        }
    
    }
    
    
}
