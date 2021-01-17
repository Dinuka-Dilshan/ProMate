/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import DB.dbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;


/**
 *
 * @author Gunasekara
 */
public class Satistic {
    
    private String finalquery = "";
    private int days;
    
    public  JDBCCategoryDataset creategraph(String todate, String fromdate) throws SQLException{
       
        JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnect.getConnection()," ");
        try{
            
            //SELECT DATEDIFF('2020-12-16','2020-12-09') AS DiffDays (counting dates on sql
            Connection conn = dbConnect.getConnection();
            String sql = "SELECT DATEDIFF('" + todate + "','" + fromdate + "') AS days";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            
            
            rs.next();
            
            String sql2=null;
            String sql3=null;
            String sql4=null;
            
            days=rs.getInt("days");
            
            if(days >=0 ){
                
                sql2 = "SELECT Pay_Date,SUM(Amount) AS Amount FROM payment GROUP BY Pay_Date HAVING Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                sql3 = "SELECT COUNT(Pay_ID) AS count FROM payment WHERE Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                sql4 = "SELECT SUM(Amount) AS total FROM payment WHERE Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                finalquery = sql3 + sql4;
            }
            else if(days <0 ){
                sql2 = "SELECT Pay_Date,SUM(Amount) AS Amount FROM payment GROUP BY Pay_Date HAVING Pay_Date BETWEEN '" + todate + "' AND '" + fromdate+ "';";
                sql3 = "SELECT COUNT(Pay_ID) AS count FROM payment WHERE Pay_Date BETWEEN '" + todate + "' AND '" + fromdate + "';";
                sql4 = "SELECT SUM(Amount) AS total FROM payment WHERE Pay_Date BETWEEN '" + todate + "' AND '" + fromdate + "';";
                finalquery = sql3 + sql4;
            }
            else{
                
                finalquery = "";
            }
            
            dataset = new JDBCCategoryDataset(dbConnect.getConnection(),sql2);
            conn.close();
            
            
        }
        catch(Exception e){
            //e.printStackTrace();
        //    JOptionPane.showMessageDialog(rootPane, "Date range shoube be withing maximum 31 days");
            
        }
        
       return dataset;
   }
    
    public String getfinalquery(){
        
        return finalquery;
    }
    
    public int getContDays(){
        
        return days;
    }
    
}
