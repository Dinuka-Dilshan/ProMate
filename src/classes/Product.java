
package classes;


import DB.dbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
  made with love @dinuka
*/

//Pro_Code	name	quantity-int	unit_price-int	type	
public class Product {
    
   
    private  String Pro_Code;
    private String name;
    private int quantity;
    private int unit_price;
    private String type;

    public Product() {
        
    }
    
    
    
    //get all the raws of the product table from the data base
    public static ResultSet getProductDetails(){
        
        Connection con=dbConnect.getConnection();
        ResultSet rst=null;
        
        try {
           Statement st= con.createStatement();
           rst= st.executeQuery("SELECT * FROM product;");
           
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return  rst;
        
        
    }
    
    //delete a product from the product table 
    public static  void deleteProduct(String Pro_Code){
        
        Connection con=dbConnect.getConnection();
        
        try {
           Statement st=con.createStatement();
           st.execute("DELETE FROM product WHERE Pro_Code='"+Pro_Code+"';");
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    //update a product
    public static void updateProduct(String Pro_Code, String name, String Quantity, String unit_price, String type,JTable myTable){
        
        String data[]=getClickedTableContents(myTable);
        Connection con =dbConnect.getConnection();
        
        try {
            Statement st=con.createStatement();
            st.execute("UPDATE supplier SET Sup_Id='"+Pro_Code+"', Name='"+name+"',quantity="+Quantity+", ,unit_price="+unit_price+" ,type="+type+" WHERE Pro_Code='"+data[0]+"';");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //search a product
    public static ResultSet searchProduct(String keyWord){
        
        keyWord="%"+keyWord+"%";
        ResultSet rst=null;
         Connection con= dbConnect.getConnection();
         try {
            Statement st=con.createStatement();
            rst=st.executeQuery("SELECT * FROM product WHERE Pro_Code LIKE '"+keyWord+"' OR name LIKE '"+keyWord+"' OR quantity LIKE '"+keyWord+"' OR unit_price LIKE '"+keyWord+"' OR type LIKE '"+keyWord+"';");
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        
        return rst;
    }
    
    public static void addProduct(String Pro_Code, String name, String Quantity, String unit_price, String type){
        
        Connection con=dbConnect.getConnection();
        
        try {
            Statement st= con.createStatement();
            st.execute("INSERT INTO product(Pro_Code, name, quantity, unit_price, type) VALUES ('"+Pro_Code+"','"+name+"',"+Quantity+","+unit_price+",'"+type+"');");
  
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
                String data[]={rst.getString("Pro_Code"),rst.getString("name"),rst.getString("quantity") ,rst.getString("unit_price"),rst.getString("type")};
                model.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        
    }
    
    //get data from the jtable
    public static String[] getClickedTableContents(JTable table){
        
        
        int selectedRawIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        String data[]={model.getValueAt(selectedRawIndex, 0).toString(),model.getValueAt(selectedRawIndex, 1).toString(),model.getValueAt(selectedRawIndex, 2).toString(),model.getValueAt(selectedRawIndex, 3).toString(),model.getValueAt(selectedRawIndex, 4).toString()};
        
        return data;
    }
    
}
