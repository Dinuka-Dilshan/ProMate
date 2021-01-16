
package DB;

import Errors.dbError;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbConnect {
    
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/geelssuper?useSSL=false","root","");
        } catch (SQLException e) {
            new dbError().setVisible(true);
        }
        
        return con;
    }
    
   
}
