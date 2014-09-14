/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bublesort;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Bublesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner key;
       int [] a1,a2 ,a3 = null;
       int tamaño;
       key= new Scanner (System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        tamaño= key.nextInt();
        a1= new int [tamaño];
        a2= new int [tamaño];
        for(int i=0; i<tamaño; i++){
            System.out.println("a1"+i+":");
            System.out.println("a2"+ i +":");
            a2[i]= key.nextInt();
            a3[-i]= a1[i]*a2[i];
        }
        for(int i=0; i<tamaño; i++){
            System.out.println("contenido de a3 :");
            System.out.println("posicion: " +i +":" +a3 [i]);
        
        }
            
            
        
        }
       }
    

