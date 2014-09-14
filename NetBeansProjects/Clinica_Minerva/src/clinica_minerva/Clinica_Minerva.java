/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_minerva;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Clinica_Minerva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Motor a=new Motor();
      boolean  bandera=true;
        System.out.println("***Bienvenido a CLinica Minerva***");
    while(bandera==true){
        System.out.print("Seleccione una opcion:"+
                        "\n1.Agregar Datos Personales"+
                          "\n y de consulta"+
                          "\n2.Modificar datos"+
                          "\n3.Eleminar datos"+
                         "\n4.Mostrar Expediente Completo"+
                         "\n 5.SALIR"+
                         "\n Ingresa la opcion: ");
          
        int opcion=scan.nextInt();
        System.out.println("*************************************");
        switch(opcion){
            case 1:
            a.ingresarDatos();
            a.ConsultaMedica();
                break;
            case 2:
            a.modificarDatosPaciente();
            a.ModificarDatosDoctor();
                break;
            case 3:a.eliminarDatos();
                break;
            case 4:
              a.mostrarDatos();
              break;
            case 5:
                System.out.println("Gracias por Preferir Nuestra CLinica :)");
                System.exit(0); 
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                System.out.println("********************************+");
        }
        }
    }
}
    

