/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;

/**
 *
 * @author eduardo
 */
public class administrador extends vendedor{
    private float horasExtras;
    
    

public void administrador(String nombre,String apellido,float afp,float renta,
        String tipoEmpleado,String horasExtras,float SueldoBase){

  super.vendedor(nombre, apellido, afp, renta, tipoEmpleado, renta,SueldoBase);


}

    /**
     * @return the horasExtras
     */
    public float getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }
}