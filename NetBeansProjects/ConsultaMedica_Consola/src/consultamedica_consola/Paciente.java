/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultamedica_consola;

import java.util.ArrayList;

/**
 *
 * @author sergioadonis
 */
public final class Paciente {

    //Campos compartidos por todos los "Pacientes"
    static int id_expediente_max;
    static String formatoData = "[nombre],[apellido],[edad],[sexo],[ocupacion],[talla],[peso]";
    private int id_expediente;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String ocupacion;
    private double talla;
    private double peso;
    private ArrayList<Consulta> consultas;

    public int getId_expediente() {
        return id_expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        } else {
            this.apellido = "";
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        sexo =sexo.toUpperCase();
        if (sexo.startsWith("M")) {
            this.sexo = "M";
        } else if (sexo.startsWith("F")) {
            this.sexo = "F";
        }
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        if (ocupacion != null) {
            this.ocupacion = ocupacion;
        } else {
            this.ocupacion = "ocupacion sin definir";
        }
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        if (talla >= 0) {
            this.talla = talla;
        } else {
            this.talla = 0;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
        }
    }

    public double getMc() {
        if (getTalla() > 0) {
            return getPeso() / Math.pow(getTalla(), 2);
        } else {
            return 0;
        }
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        if (consultas != null) {
            this.consultas = consultas;
        } else {
            this.consultas = new ArrayList<>();
        }
    }

    public Paciente(String nombre, String apellido, int edad, String sexo, String ocupacion, double talla, double peso) {
        this.id_expediente = id_expediente_max++;
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSexo(sexo);
        setOcupacion(ocupacion);
        setTalla(talla);
        setPeso(peso);
        this.consultas = new ArrayList<>();
    }

    public Paciente(String data) throws Exception {
        String[] split = data.split(",");
        
        if (split.length == 7) { //Tiene 7 datos
            this.id_expediente = ++id_expediente_max;
            setNombre(split[0].trim());
            setApellido(split[1].trim());
            setEdad(Integer.valueOf(split[2].trim()));
            setSexo(split[3].trim());
            setOcupacion(split[4].trim());
            setTalla(Double.valueOf(split[5].trim()));
            setPeso(Double.valueOf(split[6].trim()));
            this.consultas = new ArrayList<>();
        } else {
            throw new Exception("La data no tiene el formato correcto, el formato debe ser: " + formatoData);
        }
    }

    public void setDataPaciente(String data) throws Exception {
        String[] split = data.split(",");
        if (split.length == 7) { //Tiene 7 datos
            setNombre(split[0].trim());
            setApellido(split[1].trim());
            setEdad(Integer.valueOf(split[2].trim()));
            setSexo(split[3].trim());
            setOcupacion(split[4].trim());
            setTalla(Double.valueOf(split[5].trim()));
            setPeso(Double.valueOf(split[6].trim()));
        } else {
            throw new Exception("La data no tiene el formato correcto, el formato debe ser: " + formatoData);
        }
    }
}
