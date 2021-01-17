
package classes;

import DB.dbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinuka
 */
public class Supply {
   
    private String S_id;
    private String Date;
    private String quantity;
    private String Sup_Id;
    private String Pro_Code;
    
    
    public static ResultSet getSupplyDetails(){
        
        
        ResultSet rst=null;
        
        try{
            Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();
            rst=st.executeQuery("SELECT * FROM supply");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return rst;
        
    }
    
    public static ResultSet getSup_Ids(){
        
        
        ResultSet rst=null;
        
        try{
            Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();
            rst=st.executeQuery("SELECT Sup_Id FROM supplier");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return rst;
        
    }
    
    
    public static ResultSet getPro_Codes(){
        
        
        ResultSet rst=null;
        
        try {
            Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();
            rst=st.executeQuery("SELECT Pro_Code FROM product");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return rst;
        
    }
    
    public static String[] getClickedTableContents(JTable table){
        
        
        int selectedRawIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        String data[]={model.getValueAt(selectedRawIndex, 0).toString(),model.getValueAt(selectedRawIndex, 1).toString(),model.getValueAt(selectedRawIndex, 2).toString(),model.getValueAt(selectedRawIndex, 3).toString(),model.getValueAt(selectedRawIndex, 4).toString()};
        
        return data;
    }
    
    public static boolean addSupply(String Date, String quantity, String Sup_Id, String Pro_Code){
        
        boolean isDone=false;
       
        
        try (
            Connection con=dbConnect.getConnection();
            Statement st= con.createStatement();){
            st.execute("INSERT INTO supply(Date,quantity,Sup_Id,Pro_Code) VALUES ('"+Date+"',"+quantity+",'"+Sup_Id+"','"+Pro_Code+"');");
            st.execute("UPDATE product SET quantity=quantity+"+quantity+" WHERE Pro_Code='"+Pro_Code+"'");
            isDone=true;
            
        } catch (Exception e) {
        }
        
        return isDone;
    }
    
    public static ResultSet searchSupply(String keyWord){
        
        keyWord="%"+keyWord+"%";
        ResultSet rst=null;
         
         try {
            Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT * FROM supply WHERE S_id LIKE '"+keyWord+"' OR  Date LIKE '"+keyWord+"' OR quantity LIKE '"+keyWord+"' OR Sup_Id LIKE '"+keyWord+"' OR Pro_Code LIKE '"+keyWord+"';");
        } catch (Exception e) {
        }
         
        
        return rst;
    }
    
    //add data to a jtable
    public static void insertDataToTable(JTable table, ResultSet rst){
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        try {
            while(rst.next()){
                String data[]={rst.getString("S_id"),rst.getString("Date"),rst.getString("quantity") ,rst.getString("Sup_Id"),rst.getString("Pro_Code")};
                model.addRow(data);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            
        }
        
        
    }
    
    //update supply
    public static boolean updateSupply(String Date,String quantity,String Sup_Id,String Pro_Code ,JTable myTable){
        
        String data[]=getClickedTableContents(myTable);
        
        boolean isDone=false;
        
        try (
            Connection con =dbConnect.getConnection();
            Statement st=con.createStatement();){
            st.execute("UPDATE supply SET Date='"+Date+"',quantity="+quantity+", Sup_Id='"+Sup_Id+"', Pro_Code='"+Pro_Code+"' WHERE S_id='"+data[0]+"';");
            isDone=true;
            
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        return isDone;
    }
}
