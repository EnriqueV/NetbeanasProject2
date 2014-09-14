/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealaboratorio;

/**
 *
 * @author carloscarcamo
 */
public interface modeloPersona {
    
    public void setNombre(String nombre);
    
    public void setApellido(String apellido);
    
    public void setGenero(String genero);
    
    public void setEdad(int edad);
    
    public String getNombre();    
    
    public String getApellido();
    
    public String getGenero(); 
    
    public int getEdad();    
}
