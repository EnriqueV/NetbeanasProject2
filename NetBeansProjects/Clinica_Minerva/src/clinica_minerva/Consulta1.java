/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_minerva;

/**
 *
 * @author eduardo
 */
public class Consulta1 {
   private String FechaConsulta;
   private String sintomas;
   private String diagnostico;
   private String Medicamentos;
   private String examenes;
   private String recomendaciones;
   public Consulta1(){
   
   }
   public Consulta1(String FechaConsulta, String sintomas, String diagnostico,String
           Medicamentos, String examenes, String recomendaciones){
   this.FechaConsulta= FechaConsulta;
   this.sintomas= sintomas;
   this.diagnostico= diagnostico;
   this.Medicamentos= Medicamentos;
   this.examenes= examenes;
   this.recomendaciones=recomendaciones;
   
   
   
   }

    /**
     * @param FechaConsulta the FechaConsulta to set
     */
    public void setFechaConsulta(String FechaConsulta) {
        this.FechaConsulta = FechaConsulta;
    }

    /**
     * @param sintomas the sintomas to set
     */
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @param Medicamentos the Medicamentos to set
     */
    public void setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

    /**
     * @param examenes the examenes to set
     */
    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    /**
     * @param recomendaciones the recomendaciones to set
     */
    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    /**
     * @return the FechaConsulta
     */
    public String getFechaConsulta() {
        return FechaConsulta;
    }

    /**
     * @return the sintomas
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @return the Medicamentos
     */
    public String getMedicamentos() {
        return Medicamentos;
    }

    /**
     * @return the examenes
     */
    public String getExamenes() {
        return examenes;
    }

    /**
     * @return the recomendaciones
     */
    public String getRecomendaciones() {
        return recomendaciones;
    }
    
}
