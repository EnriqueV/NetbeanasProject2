/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg7;
import java.sql.*;
/**
 *
 * @author eduardo
 */
public class conexion {
private Connection conexion= null;
private Statement s= null;
private ResultSet src= null;
private String query= null;
    
// constructor
   public conexion() throws SQLException{
   try{
   Class.forName("com.mysql.jdbc.Driver");
   conexion=DriverManager.getConnection(query)
   }catch{
   
   }
   
   
   }
}
