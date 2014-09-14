/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.*;

/**
 *
 * @author eduardo
 */
public class Conexion {
     private Connection conexion= null;
    private Statement s = null;
 private ResultSet rs= null;
 private String query= null;
    
// constructor
   public Conexion() throws SQLException{
   try{
   Class.forName("com.mysql.jdbc.Driver");
   conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/seminario","root","123456");
         
   s=(Statement) conexion.createStatement();
   }
   catch(ClassNotFoundException el){
       
       System.out.println("Error no encontro el driver de la BD"+ el.getMessage());
       
       
   }
   }
  public ResultSet getRS(){
  return rs;
  }
  public void setRS(String consulta){
  try{
  this.rs= s.executeQuery(consulta);
 
}  catch(SQLException e2){
      
      System.out.println("Error en la consulta sql"+e2.getMessage());
  }
  
  }
  public void setQuery(String query)throws SQLException{
  this.s.executeQuery(query);
  
  }
  public void CerrarConexion () throws SQLException{
  conexion.close();
  
  }
  }



