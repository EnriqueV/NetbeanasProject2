/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;

/**
 *
 * @author eduardo
 */
public class vendedor {
    private String nombre;
    private String apellido;
    private float afp= (float) 0.6;
    private float renta=(float) 0.5;
    private String tipoEmpleado;
    private float comision;
    private float SueldoBase;
    
    
    public void vendedor(String nombre,String apellido,float afp,float renta,
            String tipoEmpleado,float comision,float SueldoBase){
        /*this.setApellido(apellido);
        this.setNombre(nombre);
        this.setTipoEmpleado(tipoEmpleado);
        this.setAfp(afp);
        this.setRenta(renta);
        this.setComision(comision); */
        
        
        
        
        
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
     * @return the afp
     */
    public float getAfp() {
        return afp;
    }

    /**
     * @param afp the afp to set
     */
    public void setAfp(float afp) {
        this.afp = afp;
    }

    /**
     * @return the renta
     */
    public float getRenta() {
        return renta;
    }

    /**
     * @param renta the renta to set
     */
    public void setRenta(float renta) {
        this.renta = renta;
    }

    /**
     * @return the tipoEmpleado
     */
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    /**
     * @param tipoEmpleado the tipoEmpleado to set
     */
    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }

    /**
     * @return the SueldoBase
     */
    public float getSueldoBase() {
        return SueldoBase;
    }

    /**
     * @param SueldoBase the SueldoBase to set
     */
    public void setSueldoBase(float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

}
