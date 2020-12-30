
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {
    
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/geelssuper","root","");
        } catch (Exception e) {
            
            //System.err.println("error");
            e.printStackTrace();
        }
        
        return con;
    }
    
   
}
