/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultamedica_consola;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergioadonis
 */
public class ConsultaMedica_Consola {

    static Motor motor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        motor = new Motor();
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int x;

        x = getEntero(getMenuPrincipal(), 1, 6);

        switch (x) {
            case 1:
                AgregarNuevoRegistro();
                break;
            case 2:
                ModificarRegistro();
                break;
            case 3:
                EliminarRegistro();
                break;
            case 4:
                ConsultaMedica();
                break;
            case 5:
                ExpedienteClinico();
                break;
            case 6:
                System.exit(0);

        }

        menuPrincipal();
    }

    public static int getEntero(String mensaje, int min, int max) {
        int x = getEntero(mensaje);
        if (x > max || x < min) {
            System.out.println("Su numero debe estar en el rango de " + min + " a " + max);
            getEntero(mensaje, min, max);
        }
        return x;
    }

    public static int getEntero(String mensaje) {
        try {
            System.out.print(mensaje);
            Scanner entrada = new Scanner(System.in);
            return entrada.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return getEntero(mensaje);
        }
    }

    public static String getTexto(String mensaje) {
        try {
            System.out.print(mensaje);
            Scanner entrada = new Scanner(System.in);
            return entrada.nextLine();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return getTexto(mensaje);
        }
    }
    
    public static Date getFecha(String mensaje) {
        try {
            System.out.print(mensaje);
            Scanner entrada = new Scanner(System.in);
            return Date.valueOf(entrada.next());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return getFecha(mensaje);
        }
    }

    public static String getMenuPrincipal() {
        return "****** Registro de Pacientes ******\n1.- Agregar un nuevo registro.-\n2.- Modificar un registro.-\n3.- Eliminar un registro.-\n4.- Consulta medica.-\n5.- Ver expediente clinico completo.-\n6.- Salir.-\n\nIngrese una opcion: ";
    }

    public static void AgregarNuevoRegistro() {
        try {
            Paciente miPaciente = new Paciente(getTexto("Introduzca los datos del Nuevo Paciente en el siguiente formato:\n" + Paciente.formatoData + "\n"));
            motor.agregarPaciente(miPaciente);
            System.out.println("Agregado exitosamente.\n");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            AgregarNuevoRegistro();
        }
    }

    public static String getMenuBuscarRegistro() {
        return "****** Buscar Paciente ******\n1.- Seleccionar Por Id.-\n2.- Buscar Por nombre o apellido.-\n3.- Mostrar todos.\n\nIngrese una opcion: ";
    }

    public static void ModificarRegistro() {
        int x;

        x = getEntero("Para modificar un paciente debe seleccionarlo por Id\n" + getMenuBuscarRegistro(), 1, 3);

        switch (x) {
            case 1:
                Paciente miPaciente = motor.buscarPacientePorId(getEntero("Introduzca el Id del Paciente: "));
                if (miPaciente != null) {
                    System.out.println(motor.imprimirPaciente(miPaciente));
                    try {
                        miPaciente.setDataPaciente(getTexto("Introduzca los datos del Nuevo Paciente en el siguiente formato:\n" + Paciente.formatoData + "\n"));
                        motor.modificarPaciente(miPaciente);
                        System.out.println("Guardado exitosamente.\n");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        ModificarRegistro();
                    }
                } else {
                    System.out.println("Paciente no encontrado.\n");
                }
                break;
            case 2:
                ArrayList<Paciente> listaPaciente = motor.buscarPacientePorNombreApellido(getTexto("Introduzca el Nombre o Apellido del Paciente: "));
                System.out.println(motor.imprimirPacientes(listaPaciente));
                ModificarRegistro();
                break;
            case 3:
                System.out.println(motor.imprimirPacientes(motor.getPacientes()));
                ModificarRegistro();
                break;
            default:
                ModificarRegistro();
        }

    }

    public static void EliminarRegistro() {
        int x;

        x = getEntero("Para eliminar un paciente debe seleccionarlo por Id\n" + getMenuBuscarRegistro(), 1, 3);

        switch (x) {
            case 1:
                Paciente miPaciente = motor.buscarPacientePorId(getEntero("Introduzca el Id del Paciente: "));
                if (miPaciente != null) {
                    System.out.println(motor.imprimirPaciente(miPaciente));
                    try {
                        if (getTexto("\n\n¿Realmente desea eliminar este Paciente (S/N)? ").equalsIgnoreCase("S")) {
                            motor.eliminarPaciente(miPaciente);
                            System.out.println("Eliminado exitosamente.\n");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        EliminarRegistro();
                    }
                } else {
                    System.out.println("Paciente no encontrado.\n");
                }
                break;
            case 2:
                ArrayList<Paciente> listaPaciente = motor.buscarPacientePorNombreApellido(getTexto("Introduzca el Nombre o Apellido del Paciente: "));
                System.out.println(motor.imprimirPacientes(listaPaciente));
                EliminarRegistro();
                break;
            case 3:
                System.out.println(motor.imprimirPacientes(motor.getPacientes()));
                EliminarRegistro();
                break;
            default:
                EliminarRegistro();
        }

    }
    
    public static void ConsultaMedica() {
        int x;

        x = getEntero("Para agregar una consulta debe seleccionar un paciente por Id\n" + getMenuBuscarRegistro(), 1, 3);

        switch (x) {
            case 1:
                Paciente miPaciente = motor.buscarPacientePorId(getEntero("Introduzca el Id del Paciente: "));
                if (miPaciente != null) {
                    System.out.println(motor.imprimirPaciente(miPaciente));
                    try {
                        System.out.println("Agregue los datos de la consulta");
                        Consulta miConsulta = new Consulta(getFecha("Fecha YYYY-MM-DD: "), getTexto("Sintomas: "), getTexto("Diagnostico: "), getTexto("Medicamentos: "), getTexto("Examenes: "), getTexto("Recomendaciones: "));
                        motor.agregarConsulta(miPaciente, miConsulta);
                        System.out.println("Consulta agregada exitosamente.\n");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        ConsultaMedica();
                    }
                } else {
                    System.out.println("Paciente no encontrado.\n");
                }
                break;
            case 2:
                ArrayList<Paciente> listaPaciente = motor.buscarPacientePorNombreApellido(getTexto("Introduzca el Nombre o Apellido del Paciente: "));
                System.out.println(motor.imprimirPacientes(listaPaciente));
                ConsultaMedica();
                break;
            case 3:
                System.out.println(motor.imprimirPacientes(motor.getPacientes()));
                ConsultaMedica();
                break;
            default:
                ConsultaMedica();
        }

    }

    public static void ExpedienteClinico() {
        int x;

        x = getEntero("Para ver el expediente clinico completo debe seleccionar un paciente por Id\n" + getMenuBuscarRegistro(), 1, 3);

        switch (x) {
            case 1:
                Paciente miPaciente = motor.buscarPacientePorId(getEntero("Introduzca el Id del Paciente: "));
                if (miPaciente != null) {
                    System.out.println(motor.imprimirPaciente(miPaciente, true));
                } else {
                    System.out.println("Paciente no encontrado.\n");
                }
                break;
            case 2:
                ArrayList<Paciente> listaPaciente = motor.buscarPacientePorNombreApellido(getTexto("Introduzca el Nombre o Apellido del Paciente: "));
                System.out.println(motor.imprimirPacientes(listaPaciente));
                ExpedienteClinico();
                break;
            case 3:
                System.out.println(motor.imprimirPacientes(motor.getPacientes()));
                ExpedienteClinico();
                break;
            default:
                ExpedienteClinico();
        }

    }

    
}
