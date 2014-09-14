/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotas;

/**
 *
 * @author eduardo
 */
public class Notas {
    private Estudiante alumno;
    private String materia;
    private String docente;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    
public Notas(Estudiante alumno,String materia,String docente,
        double nota1,double nota2,double nota3,double promedio){
this.alumno=alumno;
this.docente=docente;
this.materia=materia;
this.nota1=nota1;
this.nota2=nota2;
this.nota3=nota3;
this.promedio=promedio;

}

    Notas() {
        
    }

    /**
     * @return the alumno
     */
    public Estudiante getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Estudiante alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the docente
     */
    public String getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(String docente) {
        this.docente = docente;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return ((getNota1()+getNota2()+getNota3())/3);
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}