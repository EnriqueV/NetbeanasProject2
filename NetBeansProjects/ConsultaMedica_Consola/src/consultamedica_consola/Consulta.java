/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultamedica_consola;

import java.util.Date;

/**
 *
 * @author sergioadonis
 */
public final class Consulta {

    private Date fechaConsulta;
    private String sintomas;
    private String diagnostico;
    private String medicamentos;
    private String examenes;
    private String recomendaciones;

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        if (sintomas != null) {
            this.sintomas = sintomas;
        } else {
            this.sintomas = "";
        }
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico != null) {
            this.diagnostico = diagnostico;
        } else {
            this.diagnostico = "";
        }
    }
    
    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        if (medicamentos != null) {
            this.medicamentos = medicamentos;
        } else {
            this.medicamentos = "";
        }
    }
    
    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        if (examenes != null) {
            this.examenes = examenes;
        } else {
            this.examenes = "";
        }
    }
    
    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        if (recomendaciones != null) {
            this.recomendaciones = recomendaciones;
        } else {
            this.recomendaciones = "";
        }
    }

    public Consulta(Date fechaConsulta, String sintomas, String diagnostico, String medicamentos, String examenes, String recomendaciones) {
        setFechaConsulta(fechaConsulta);
        setSintomas(sintomas);
        setDiagnostico(diagnostico);
        setMedicamentos(medicamentos);
        setExamenes(examenes);
        setRecomendaciones(recomendaciones);
    }
    
    
}
