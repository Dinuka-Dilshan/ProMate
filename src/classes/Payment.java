/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Alerts.unknownError;
import DB.dbConnect;
import Errors.dbError;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lasith
 */
public class Payment{
    
    public static void DeductItems(DefaultTableModel model){
            for (int i=0; i < model.getRowCount(); i++){
                    Product.UpdateQTY(model.getValueAt(i, 1).toString(),model.getValueAt(i, 2).toString());
            }
    
    }
    
    public static void UpdatePayment(int ID,String CusID,String date,String time,String amount,String UserID){
        Connection con = dbConnect.getConnection();
        Statement statement;
        try{
            statement = con.createStatement();
            statement.executeUpdate("INSERT INTO payment VALUES("+ID+",'"+ CusID+"','"+date+"','"+time+"','"+amount+"','"+UserID+"',null);");
            
        }catch(SQLException e){
            if ("Cannot add or update a child row: a foreign key constraint fails (`geelssuper`.`payment`, CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Usr_NIC`) REFERENCES `user` (`Usr_NIC`))".equals(e.getMessage())){
                new unknownError("Unknown Error!","Could not update the database.").setVisible(true);
            }
            else{
                new dbError().setVisible(true);
            }
        }
    }
    public static int getID(){
        int payID = 0;
        try{
            ResultSet rt =(dbConnect.getConnection().createStatement()).executeQuery("SELECT MAX(Pay_ID) as max FROM payment");
            rt.next();
            //getting the maxID from the payment table
            try{
                 payID = Integer.valueOf(rt.getString("max"))+1;//refers to the max value in the payment table
            }catch(NumberFormatException e){
                payID = 1;
            }

        }catch(SQLException e){
            new dbError().setVisible(true);
        }
        catch(NullPointerException e){
            System.exit(0);
        }
        return payID;
    }
}
