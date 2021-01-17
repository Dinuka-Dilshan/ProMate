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
import org.jfree.data.jdbc.JDBCCategoryDataset;


/**
 *
 * @author Gunasekara
 */
public class StatisticsData {
    
    private int days;
    private String sql2=null;
    private String sql3=null;
    private String sql4=null;
    public  JDBCCategoryDataset creategraph(String todate, String fromdate) throws SQLException{
        String sql = "SELECT DATEDIFF('" + todate + "','" + fromdate + "') AS days";
        
            //SELECT DATEDIFF('2020-12-16','2020-12-09') AS DiffDays (counting dates on sql
        try(Connection conn = dbConnect.getConnection();
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);){
            rs.next();
            days=rs.getInt("days");
            if(days >=0 ){
                
                sql2 = "SELECT Pay_Date,SUM(Amount) AS Amount FROM payment GROUP BY Pay_Date HAVING Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                sql3 = "SELECT COUNT(Pay_ID) AS count FROM payment WHERE Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                sql4 = "SELECT SUM(Amount) AS total FROM payment WHERE Pay_Date BETWEEN '" + fromdate + "' AND '" + todate + "';";
                
            }
            else if(days <0 ){
                sql2 = "SELECT Pay_Date,SUM(Amount) AS Amount FROM payment GROUP BY Pay_Date HAVING Pay_Date BETWEEN '" + todate + "' AND '" + fromdate+ "';";
                sql3 = "SELECT COUNT(Pay_ID) AS count FROM payment WHERE Pay_Date BETWEEN '" + todate + "' AND '" + fromdate + "';";
                sql4 = "SELECT SUM(Amount) AS total FROM payment WHERE Pay_Date BETWEEN '" + todate + "' AND '" + fromdate + "';";
                
            }
        }
        catch(SQLException e){
            //e.printStackTrace();
        //    JOptionPane.showMessageDialog(rootPane, "Date range shoube be withing maximum 31 days");
            
        }
        
       return (new JDBCCategoryDataset(dbConnect.getConnection(),sql2));
   }
    
    public String getCusQuery(){
        return sql3;
    }
    public String getTotQuery(){
        return sql4;
    }
    public int getContDays(){
        
        return days;
    }
    
}
