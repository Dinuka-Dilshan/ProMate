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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class customer {
    
    
    public static void searchCustomer(String name,JList list){
        name=name+"%";
        ResultSet rst;
         
         DefaultListModel newlist = new DefaultListModel();
         try {
            Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT Cus_NIC,CName FROM customer WHERE Cus_NIC LIKE '"+name+"';");
            rst.next();
            for (int i=0; i<10; i++){
                newlist.addElement(rst.getString("Cus_NIC"));
                if(!rst.next()){
                    break;
                }
            }
            list.setModel(newlist);
            
        } catch (SQLException | NullPointerException e) {
            
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
}
