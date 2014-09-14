/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotas;

/**
 *
 * @author eduardo
 */
public class Estudiante extends Persona{
  private String Telefono;
  private String Email;
  private  String Carnet;
    
    public Estudiante(String nombre, String apellido,String genero,int edad){
    super(nombre,apellido,genero,edad);
  }

    Estudiante() {
       
    }
    public void setTelefono(String Telefono){
    this.Telefono= Telefono;
    
    }
    public void setEmail(String Email){
    this.Email=Email;
    }
    public void setCarnet(String Carnet){
    this.Carnet= Carnet;
    }
    public String getTelefono(){
       return Telefono;
    }
    public String getEamail(){
    return Email;
    }
    public String getCarnet(){
    return Carnet;
    }
}
