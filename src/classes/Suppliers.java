
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
 * @author Dinuka
 */
public class Suppliers {
    
   
    private  String supplierId;
    private String name;
    private int phoneNumber;

    public Suppliers() {
        
    }
    
    public Suppliers(String supplierId,String name, int phoneNumber) {
        
        this.supplierId=supplierId;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    
    //get all the raws of the supplier table from the data base
    public static ResultSet getSupplierDetails(){
        
        Connection con=dbConnect.getConnection();
        ResultSet rst=null;
        
        try {
           Statement st= con.createStatement();
           rst= st.executeQuery("SELECT * FROM supplier;");
           
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return  rst;
        
        
    }
    
    //delete a supplier from the supplier table 
    public static  void deleteSupplier(String supplierId){
        
        Connection con=dbConnect.getConnection();
        
        try {
           Statement st=con.createStatement();
           st.execute("DELETE FROM supplier WHERE Sup_Id='"+supplierId+"';");
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    //update a supplier
    public static void updateSupplier(String Sup_Id, String name, String phone,JTable myTable){
        
        String data[]=getClickedTableContents(myTable);
        Connection con =dbConnect.getConnection();
        
        try {
            Statement st=con.createStatement();
            st.execute("UPDATE supplier SET Sup_Id='"+Sup_Id+"', Name='"+name+"',phone_num="+phone+" WHERE Sup_Id='"+data[0]+"';");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //search a supplier
    public static ResultSet searchSupplier(String name){
        
        name="%"+name+"%";
        ResultSet rst=null;
         Connection con= dbConnect.getConnection();
         try {
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT * FROM supplier WHERE Name LIKE '"+name+"' OR Sup_Id LIKE '"+name+"' OR phone_num LIKE '"+name+"';");
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        
        return rst;
    }
    
    public static void addSupplier(String Sup_Id, String name, String phone){
        
        Connection con=dbConnect.getConnection();
        
        try {
            Statement st= con.createStatement();
            st.execute("INSERT INTO supplier(Sup_Id, Name, phone_num) VALUES ('"+Sup_Id+"','"+name+"',"+phone+");");
  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    //add data to a jtable
    public static void insertDataToTable(JTable table, ResultSet rst){
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        try {
            while(rst.next()){
                String data[]={rst.getString("Sup_Id"),rst.getString("Name"),rst.getString("phone_num")};
                model.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        
    }
    
    public static String[] getClickedTableContents(JTable table){
        
        
        int selectedRawIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        String data[]={model.getValueAt(selectedRawIndex, 0).toString(),model.getValueAt(selectedRawIndex, 1).toString(),model.getValueAt(selectedRawIndex, 2).toString()};
        
        return data;
    }
    
}
