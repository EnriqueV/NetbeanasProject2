/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotas;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class AppNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registros a= new Registros();
        Scanner menu= new Scanner(System.in);
        boolean bandera= true;
        System.out.println("!!!BIENVENIDO AL SISTEMA DE NOTAS UES-OC!!!");
        System.out.println("*******************************************");
        while(bandera==true) {
                System.out.print("Por favor, Seleccione una opcion:"+
                        "\n1.Registrar un nuevo estudiante"+
                         "\n2.Actualizar datos de Estudiante"+
                          "\n3.Eliminar un registro"+
                          "\n4.Ingresar notas"+
                        "\n5. Obtener un registro"
                        + "\n6.Consultar registros"+""
                        + "\n7.Borrar registro"
                        + "\n8.SALIR"+
                        "\n Ingrese la opcion: ");
               int opcion=menu.nextInt();
        System.out.println("*************************************");
        switch(opcion){
            case 1:
           a.llenarRegistros();
                break;
            case 2:
           
                break;
            case 3:
                break;
            case 4:
              
              break;
            case 5:
                
                break;
            case 6:
                break;
            case 7: 
                break;
            case 8: 
                System.out.println("Sesion terminada :)"+"DONT PANIC ITS NOT WINDOWS");
                System.exit(0); 
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                System.out.println("********************************");
        }
        }
    }
        
        
        
        }
        
        
    

