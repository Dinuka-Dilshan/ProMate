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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class customer {
    
    
    public static void searchCustomer(String name,JTable list){
        name=name+"%";
        ResultSet rst;
        DefaultTableModel newlist= (DefaultTableModel)list.getModel();
        String[] s=new String[1];
        try {
           Connection con= dbConnect.getConnection();
           Statement st=con.createStatement();
           rst=st.executeQuery("SELECT Cus_NIC,CName FROM customer WHERE Cus_NIC LIKE '"+name+"';");
           rst.next();
           newlist.setRowCount(0);
           for (int i=0; i<8; i++){
               s[0] = rst.getString("Cus_NIC");
//               newlist.setValueAt(rst.getString("Cus_NIC"),i,0);
               newlist.addRow(s);
               if(!rst.next()){
                   break;
               }
           }
        } catch (NullPointerException e) {
            newlist.setRowCount(0);
            s[0] = "No suggestions";
            newlist.addRow(s);
        }catch(SQLException e){
            
        }
    }
    public static String getName(String name){
        String output = "Guest";
        ResultSet rst;
         
         try {
            Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT CName FROM customer WHERE Cus_NIC= '"+name+"';");
            rst.next();
           output = rst.getString("CName");
            
        } catch (SQLException | NullPointerException e) {
        }
         return output;
    }
    public static void NewCutomer(String cusNIC,String cusName,String cusTPNO, String addressNO, String addressStreet, String addressCity ){
        try {
             Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();
            st.execute("INSERT INTO customer VALUES ('"+cusNIC+"','"+cusName+"',"+cusTPNO+",'"+addressNO+"','"+addressStreet+"','"+addressCity+"');");
  
        } catch (SQLException e) {
        }
        
        
    }
}
