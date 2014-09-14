/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotas;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
   
    
    public Persona(String nombre, String apellido,String genero,int edad){
    
    
        
    this.apellido=apellido;
    this.edad=edad;
    this.nombre=nombre;
    this.genero=genero;
  
    
    }

    Persona() {
       }

    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
