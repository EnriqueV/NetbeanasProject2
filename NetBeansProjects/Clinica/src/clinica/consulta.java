
package clinica;

/**
 *
 * @author pisto
 */
public class consulta {
    //Instanciamiento de Variables
    private paciente Paciente;
    private String fechaConsulta;
    private String sintomas;
    private String diagnostico;
    private String medicamentos;
    private String examenes;
    private String recomendaciones;

    //Constructores
    public consulta() {
    }
   
    public consulta(paciente Paciente, String fechaConsulta, String sintomas, String diagnostico, String medicamentos, String examenes, String recomendaciones){
        this.Paciente = Paciente;
        this.fechaConsulta = fechaConsulta;
        this.sintomas = sintomas;
        this. diagnostico = diagnostico;
        this.medicamentos = medicamentos;
        this.examenes = examenes;
        this.recomendaciones = recomendaciones;
    }
    
    //Métodos Getter y Setter
    public paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(paciente Paciente) {
        this.Paciente = Paciente;
    }
    
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}
