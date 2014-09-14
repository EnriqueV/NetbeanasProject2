
package clinica;


public class paciente {
    //Instanciamiento de Variables
    private int id_expediente;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String edad;
    private String ocupacion;
    private String talla;
    private String peso;

    //Constructores
    public paciente (){
    }

    public paciente(int id_expediente, String nombre, String apellidos, String sexo, String edad, String ocupacion, String talla, String peso){
        this.id_expediente = id_expediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.talla = talla;
        this.peso = peso;
        this.edad = edad;
    }
    
    //Métodos Getter y Setter
    public int getId_expediente() {
        return id_expediente;
    }
    
    public void setId_expediente(int id_expediente) {
        this.id_expediente = id_expediente;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getSexo() {
        return sexo;
    }
   
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getEdad() {
        return edad;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getOcupacion() {
        return ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public String getTalla() {
        return talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;                
    }
    
    public String getPeso() {
        return peso;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
}
