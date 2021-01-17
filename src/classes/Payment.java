/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import DB.dbConnect;
import Errors.dbErrorNonExitOnClose;
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
    
    public static void DeductItems(DefaultTableModel model) throws SQLException{
            for (int i=0; i < model.getRowCount(); i++){
                   Product.UpdateQTY(model.getValueAt(i, 1).toString(),model.getValueAt(i, 2).toString());
            }
    }
    
    public static void UpdatePayment(int ID,String CusID,String date,String time,String amount,String UserID) throws SQLException{
        Connection con = dbConnect.getConnection();
        Statement statement;
            statement = con.createStatement();
            if (CusID == null){
               statement.executeUpdate("INSERT INTO payment VALUES("+ID+","+ CusID+",'"+date+"','"+time+"','"+amount+"','"+UserID+"',null);");
             
            }else{
            statement.executeUpdate("INSERT INTO payment VALUES("+ID+",'"+ CusID+"','"+date+"','"+time+"','"+amount+"','"+UserID+"',null);");
            }
    }
    public static int getID()throws SQLException{
        int payID = 0;
            Connection con = dbConnect.getConnection();
            //getting the maxID from the payment table
            try{
                Statement st = con.createStatement();
                ResultSet rt =st.executeQuery("SELECT MAX(Pay_ID) as max FROM payment");
                rt.next();
                 payID = Integer.valueOf(rt.getString("max"))+1;//refers to the max value in the payment table
            }catch(NumberFormatException e){
                payID = 1;
            }catch(NullPointerException e){
        }
        return payID;
    }
}
