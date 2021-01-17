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
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.jdbc.JDBCCategoryDataset;


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
        try(Connection con = dbConnect.getConnection();
        Statement statement = con.createStatement();){
            if (CusID == null){
               statement.executeUpdate("INSERT INTO payment VALUES("+ID+","+ CusID+",'"+date+"','"+time+"','"+amount+"','"+UserID+"',null);");
            }
            else{
            statement.executeUpdate("INSERT INTO payment VALUES("+ID+",'"+ CusID+"','"+date+"','"+time+"','"+amount+"','"+UserID+"',null);");
            }
        }
    }
    public static int getID()throws SQLException{
        int payID = 0;
            try(Connection con = dbConnect.getConnection();
            //getting the maxID from the payment table
                Statement st = con.createStatement();){
                try(ResultSet rt =st.executeQuery("SELECT MAX(Pay_ID) as max FROM payment");){
                    rt.next();
                    payID = Integer.valueOf(rt.getString("max"))+1;//refers to the max value in the payment table
                }catch(NumberFormatException e){
                    payID = 1;
                }catch(NullPointerException e){
        }
        return payID;
        }
    }
    
    public static String NumOfCustomers(String date) throws  SQLException{
        String total;
        try(Connection con = dbConnect.getConnection();
        Statement stmt3 = con.createStatement();){
            try(ResultSet rt = stmt3.executeQuery("SELECT COUNT(Pay_ID) AS COUNT FROM payment WHERE Pay_Date ='"+date+"';");){
                rt.next();
                total = String.valueOf(rt.getInt("COUNT"));
            }
            return total;
        }
        
    }
    public static String TotalIncome() throws  SQLException{
        String total;
        try(Connection con = dbConnect.getConnection();
            Statement stmt3 = con.createStatement();){
            try(ResultSet rt = stmt3.executeQuery("SELECT SUM(Amount) AS amount FROM payment;");){
                rt.next();
                total = String.valueOf(rt.getInt("amount"));
            }
            return total;
        }
        
    }
    public static String DailyIncome(String today) throws  SQLException{
        String total;
        try (Connection con = dbConnect.getConnection(); 
            Statement stmt3 = con.createStatement();){
            try(ResultSet rt = stmt3.executeQuery("SELECT SUM(Amount) AS amount FROM payment WHERE Pay_Date ='"+today+"';");){
                rt.next();
                total = String.valueOf(rt.getInt("amount"));
            }
                return total;
        
        }
    }
    public static ResultSet PieChartData(LocalDate date)throws SQLException{
        try(Connection con = dbConnect.getConnection();
           Statement st = con.createStatement();){
              try(ResultSet rt = st.executeQuery("SELECT Pay_Date, SUM(Amount) as Amount FROM payment WHERE pay_date ='"+date+"'");){
                   return rt;
               }
        }
    }
    public static JDBCCategoryDataset MonthlyDataset(String date)throws SQLException{
        return (new JDBCCategoryDataset(dbConnect.getConnection(),"SELECT Pay_Date,SUM(Amount) AS Amount FROM payment WHERE Pay_Date LIKE '" +date+"-%' GROUP BY DAY (Pay_Date);"));
    }
    public static JDBCCategoryDataset YearlyDataset(String date)throws SQLException{
        return (new JDBCCategoryDataset(dbConnect.getConnection(),"SELECT Pay_Date,SUM(Amount) AS Amount FROM payment WHERE Pay_Date LIKE '" +date+"-%' GROUP BY DAY (Pay_Date);"));
    }
    
}
