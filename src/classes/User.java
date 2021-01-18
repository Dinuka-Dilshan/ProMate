
package classes;

import DB.dbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Made by @dinuka
 */
public class User {
    
    private String name;
    private String userName;
    private String Usr_NIC;
    private String phone_num;
    private String Password;
    private String Type;
    
    public static ResultSet getUserDetails(){

        ResultSet rst=null;
        
        try {
           Connection con=dbConnect.getConnection();
           Statement st= con.createStatement();
           rst= st.executeQuery("SELECT * FROM user;");
           
           
        } catch (SQLException e) {
           // e.printStackTrace();
        }
        
        
        return  rst;
        
        
    }
    
    
  public static boolean updateUser(String Usr_NIC,String name, String userName, String phone_num, String Password, String Type) {
        
       
        boolean isDone=false;
        try {
            Connection con =dbConnect.getConnection();
            Statement st=con.createStatement();
            st.execute("UPDATE user SET name='"+name+"',Usr_NIC='"+Usr_NIC+"', userName='"+userName+"', phone_num="+phone_num+",Password='"+Password+"' WHERE Usr_NIC='"+Usr_NIC+"';");
            isDone=true;
            
        } catch (SQLException e) {
            //e.printStackTrace();

        }
        
        return isDone;
    }
    
    
      //get data from the jtable
    public static String[] getClickedTableContents(JTable table){
        
        
        int selectedRawIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        String data[]={model.getValueAt(selectedRawIndex, 0).toString(),model.getValueAt(selectedRawIndex, 1).toString(),model.getValueAt(selectedRawIndex, 2).toString(),model.getValueAt(selectedRawIndex, 3).toString(),model.getValueAt(selectedRawIndex, 4).toString()};
        
        return data;
    }
    
    
    public static void insertDataToTable(JTable table, ResultSet rst){
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        try {
            while(rst.next()){
                String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC") ,rst.getString("phone_num"),rst.getString("type")};
                model.addRow(data);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            
        }
        
        
    }
    
    public static boolean addUser(String Usr_NIC,String name, String userName, String phone_num, String Password, String Type){
        boolean isDone=false;
        try {
            Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();
            st.execute("INSERT INTO user( name, userName, Usr_NIC, phone_num, Password, type) VALUES ('"+name+"','"+userName+"','"+Usr_NIC+"',"+phone_num+",'"+Password+"','"+Type+"');");
            isDone=true;
            
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return isDone;
    }
    
    
    //search a user
    public static ResultSet searchPUser(String keyWord){
        
        keyWord="%"+keyWord+"%";
        ResultSet rst=null;
         
         try {
            Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT * FROM user WHERE name LIKE '"+keyWord+"' OR  userName LIKE '"+keyWord+"' OR Usr_NIC LIKE '"+keyWord+"' OR phone_num LIKE '"+keyWord+"' OR type LIKE '"+keyWord+"' ;");
        } catch (Exception e) {
            //e.printStackTrace();
        }
         
        
        return rst;
    }
    
    
    public static  boolean deleteUser(String Usr_NIC){
        
        boolean isDone=false;
        
        try {
           Connection con=dbConnect.getConnection();
           Statement st=con.createStatement();
           st.execute("DELETE FROM user WHERE Usr_NIC='"+Usr_NIC+"';");
           isDone=true;
           
        } catch (SQLException e) {
            //
        }
        
        return isDone;
    }
}
