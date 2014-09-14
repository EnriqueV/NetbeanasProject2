/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_minerva;

/**
 *
 * @author eduardo
 */
public class Paciente {
    private int idExpediente;
   private String Nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String ocupacion;
     private double peso;
     private double talla;
     private double imc;
    private String TipoConsulta;
     public Paciente() {
    }
    
 public Paciente(int idExpediente, String Nombre,String apellido,int edad, String sexo,
            String ocupacion,double talla, double peso, double imc, String TipoConsulta ) {
     this.idExpediente= idExpediente;  
     this.Nombre= Nombre;
     this.apellido= apellido;
     this.edad= edad;
     this.sexo= sexo;
     this.ocupacion=ocupacion;
     this.talla= talla;
     this.peso= peso;
     this.imc= imc;
     this.TipoConsulta= TipoConsulta;
     
    
    }

    /**
     * @param idExpediente the idExpediente to set
     */
    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(double talla) {
        this.talla = talla;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * @param TipoConsulta the TipoConsulta to set
     */
    public void setTipoConsulta(String TipoConsulta) {
        this.TipoConsulta = TipoConsulta;
    }

    /**
     * @return the idExpediente
     */
    public int getIdExpediente() {
        return idExpediente;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @return the talla
     */
    public double getTalla() {
        return talla;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return (getPeso()/getTalla())*2;
    }

    /**
     * @return the TipoConsulta
     */
    public String getTipoConsulta() {
       return TipoConsulta;
    }
}

  