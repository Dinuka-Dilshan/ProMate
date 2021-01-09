
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbConnect {
    
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/geelssuper?useSSL=false","root","");
        } catch (Exception e) {
            
        }
        
        return con;
    }
    
   
}
