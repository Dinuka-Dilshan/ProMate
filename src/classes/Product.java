
package classes;


import Alerts.InputError;
import DB.dbConnect;
import Errors.dbError;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    
    private static boolean isExist(String code,int qty, JTable table){
        //finds whether a given code is exist in a given table. if exists it updates the quantity and return true to notify the existence of data 
        boolean exist = false;
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        for (int i=0; i<tb.getRowCount(); i++){
            if (code.equals(tb.getValueAt(i, 1))){
                tb.setValueAt(Integer.valueOf(tb.getValueAt(i, 2).toString())+qty, i, 2);
                tb.setValueAt(Integer.valueOf(tb.getValueAt(i, 2).toString())*(Double.valueOf(tb.getValueAt(i, 3).toString())), i, 4);
                exist = true;
                return exist;
            }
        }
        return exist;
    }
    //returns a resultset which contains a required row by passing the product code
    public static void setProductDetails(String code, JTable table, int quantity,JTextField ItemTypeDisplay, JTextArea ItemNameDisplay){
        Connection con=dbConnect.getConnection();
        ResultSet result;
        try {
           Statement st= con.createStatement();
           result= st.executeQuery("SELECT * FROM product WHERE Pro_Code ='"+code+"';");
           result.next();
           String tbData[] = new String[5];
            if (!isExist(code, quantity, table)){
                tbData[0] = result.getString("name");
                tbData[1] = result.getString("Pro_Code");
                tbData[2] = Integer.toString(quantity);
                tbData[3] = result.getString("unit_price");;
                tbData[4] = Double.toString(Double.valueOf(tbData[3])*quantity);
                //tbData[4] = Double.toString(Integer.valueOf(tbData[2])*quantity-(Integer.valueOf(tbData[2])*quantity*(discount/100.0)));
                ((DefaultTableModel)table.getModel()).addRow(tbData);
                ItemNameDisplay.setText(result.getString("name"));
                ItemTypeDisplay.setText(result.getString("type"));
            }
           
        } catch (SQLException e) {
            if ("Illegal operation on empty result set.".equals(e.getMessage())){
                    new InputError("Code Not Found","Please insert valid code to proceed").setVisible(true);
                }
                else{
                    new dbError().setVisible(true);
                }
        }
        
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
            st.execute("UPDATE product SET Pro_code='"+Pro_Code+"', Name='"+name+"',quantity="+Quantity+",unit_price="+unit_price+" ,type='"+type+"' WHERE Pro_Code='"+data[0]+"';");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void UpdateQTY(String Pro_Code,String quantity){
        //deducts a given number of product related with the given pro_code
        Connection con =dbConnect.getConnection();
        try {
            Statement statement=con.createStatement();
            statement.executeUpdate("UPDATE product SET quantity = quantity-"+quantity+" WHERE Pro_Code = "+Pro_Code+";");
            System.out.println("UPDATE product SET quantity = quantity-"+quantity+" WHERE Pro_Code = "+Pro_Code+";");
               
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
