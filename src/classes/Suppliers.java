
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
        ResultSet rst=null;
        try {
           Connection con=dbConnect.getConnection();
           Statement st= con.createStatement();
           rst= st.executeQuery("SELECT * FROM supplier;");
           
           
        } catch (SQLException e) {
        }
        return  rst;
    }
    
    //delete a supplier from the supplier table 
    public static  void deleteSupplier(String supplierId){
        try (
           Connection con=dbConnect.getConnection();
           Statement st=con.createStatement();){
           st.execute("DELETE FROM supplier WHERE Sup_Id='"+supplierId+"';");
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    //update a supplier
    public static boolean updateSupplier( String name, String phone,JTable myTable){
        
        boolean isDone=false;
        String data[]=getClickedTableContents(myTable);
        try (
            Connection con =dbConnect.getConnection();
            Statement st=con.createStatement();){
            st.execute("UPDATE supplier SET Name='"+name+"',phone_num="+phone+" WHERE Sup_Id='"+data[0]+"';");
            isDone=true;
        } catch (Exception e) {
           
        }
        
        return isDone;
    }
    
    //search a supplier
    public static ResultSet searchSupplier(String name){
        
        name="%"+name+"%";
        ResultSet rst=null;
         try{
             Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT * FROM supplier WHERE Name LIKE '"+name+"' OR Sup_Id LIKE '"+name+"' OR phone_num LIKE '"+name+"';");
        } catch (Exception e) {
            
        }
         
        
        return rst;
    }
    
    public static boolean addSupplier(String Sup_Id, String name, String phone){
        

        boolean isDone=false;
        
        try (
             Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();){
            st.execute("INSERT INTO supplier(Sup_Id, Name, phone_num) VALUES ('"+Sup_Id+"','"+name+"',"+phone+");");
            isDone=true;
  
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return isDone;
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
            
        }
        
        
    }
    
    public static String[] getClickedTableContents(JTable table){
        
        
        int selectedRawIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        String data[]={model.getValueAt(selectedRawIndex, 0).toString(),model.getValueAt(selectedRawIndex, 1).toString(),model.getValueAt(selectedRawIndex, 2).toString()};
        
        return data;
    }
    
}
