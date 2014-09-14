/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultamedica_consola;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author sergioadonis
 */
public class Motor {

    private ArrayList<Paciente> pacientes;

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Motor() {
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente miPaciente) {
        if (miPaciente != null) {
            getPacientes().add(miPaciente);
        }
    }

    public void modificarPaciente(Paciente miPaciente) {
        if (miPaciente != null && pacientes.contains(miPaciente)) {
            pacientes.set(pacientes.indexOf(miPaciente), miPaciente);
        }
    }

    public void eliminarPaciente(Paciente miPaciente) {
        if (miPaciente != null && pacientes.contains(miPaciente)) {
            pacientes.remove(miPaciente);
        }
    }

    public String imprimirPacientes(ArrayList<Paciente> pacientes) {
        String texto = "---Listado de Pacientes---";
        if (pacientes.isEmpty()) {
            texto += "\n(vacio)\n--------------------------";
        } else {
            ListIterator<Paciente> bucle = pacientes.listIterator();
            while (bucle.hasNext()) {
                Paciente miPaciente = bucle.next();
                texto += "\nId: " + miPaciente.getId_expediente();
                texto += "\nNombre: " + miPaciente.getNombre() + " Apellido: " + miPaciente.getApellido();
                texto += "\nEdad: " + miPaciente.getEdad() + " Sexo: " + miPaciente.getSexo() + " Ocupacion: " + miPaciente.getOcupacion();
                texto += "\nTalla: " + miPaciente.getTalla() + " Peso: " + miPaciente.getPeso() + " Masa corporal: " + miPaciente.getMc();
                texto += "\n---------------------------------";
            }
        }
        return texto + "\n";
    }

    public String imprimirPaciente(Paciente miPaciente) {
        String texto = "---Datos de Paciente---";
        if (miPaciente == null) {
            texto += "\n(vacio)\n--------------------------";
        } else {
            texto += "\nId: " + miPaciente.getId_expediente();
            texto += "\nNombre: " + miPaciente.getNombre() + " Apellido: " + miPaciente.getApellido();
            texto += "\nEdad: " + miPaciente.getEdad() + " Sexo: " + miPaciente.getSexo() + " Ocupacion: " + miPaciente.getOcupacion();
            texto += "\nTalla: " + miPaciente.getTalla() + " Peso: " + miPaciente.getPeso() + " Masa corporal: " + miPaciente.getMc();
        }
        return texto + "\n";
    }

    public String imprimirPaciente(Paciente miPaciente, boolean incluirConsultas) {
        String texto = imprimirPaciente(miPaciente);
        if (incluirConsultas) {
            texto +=  imprimirConsultasPorPaciente(miPaciente);
        }
        return texto;
    }

    public ArrayList<Paciente> buscarPacientePorNombreApellido(String nombreApellido) {
        ArrayList<Paciente> lista = new ArrayList<>();
        ListIterator<Paciente> bucle = getPacientes().listIterator();
        while (bucle.hasNext()) {
            Paciente miPaciente = bucle.next();
            if (miPaciente.getNombre().toUpperCase().concat(" ").concat(miPaciente.getApellido().toUpperCase()).contains(nombreApellido.toUpperCase())) {
                lista.add(miPaciente);
            }
        }
        return lista;
    }

    public Paciente buscarPacientePorId(int id) {
        ListIterator<Paciente> bucle = getPacientes().listIterator();
        while (bucle.hasNext()) {
            Paciente miPaciente = bucle.next();
            if (miPaciente.getId_expediente() == id) {
                return miPaciente;
            }
        }
        return null;
    }

    public void agregarConsulta(Paciente miPaciente, Consulta miConsulta) {
        if (miPaciente != null && pacientes.contains(miPaciente)) {
            if (miConsulta != null) {
                miPaciente.getConsultas().add(miConsulta);
            }
        }
    }

    public void modificarConsulta(Paciente miPaciente, Consulta miConsulta) {
        if (miPaciente != null && pacientes.contains(miPaciente)) {
            if (miConsulta != null && miPaciente.getConsultas().contains(miConsulta)) {
                miPaciente.getConsultas().set(miPaciente.getConsultas().indexOf(miConsulta), miConsulta);
            }
        }
    }

    public void eliminarConsulta(Paciente miPaciente, Consulta miConsulta) {
        if (miPaciente != null && pacientes.contains(miPaciente)) {
            if (miConsulta != null && miPaciente.getConsultas().contains(miConsulta)) {
                miPaciente.getConsultas().remove(miConsulta);
            }
        }
    }

    public String imprimirConsultasPorPaciente(Paciente miPaciente) {
        String texto = "---Listado de Consultas---";
        if (miPaciente.getConsultas().isEmpty()) {
            texto += "\n(vacio)\n--------------------------";
        } else {
            ListIterator<Consulta> bucle = miPaciente.getConsultas().listIterator();
            while (bucle.hasNext()) {
                Consulta miConsulta = bucle.next();
                texto += "\nFecha: " + miConsulta.getFechaConsulta().toString();
                texto += "\nSintomas: " + miConsulta.getSintomas();
                texto += "\nDiagnostico: " + miConsulta.getDiagnostico();
                texto += "\nMedicamnetos: " + miConsulta.getMedicamentos();
                texto += "\nExamenes: " + miConsulta.getExamenes();
                texto += "\nRecomendaciones: " + miConsulta.getRecomendaciones();
                texto += "\n---------------------------------";
            }
        }
        return texto + "\n";
    }
}
