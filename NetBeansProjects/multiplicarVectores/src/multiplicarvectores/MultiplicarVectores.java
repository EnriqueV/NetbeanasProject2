/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicarvectores;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class MultiplicarVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner key;
        int [] a1, a2, a3;
        int tamanio;
        key= new Scanner (System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        tamanio= key.nextInt();
        a1 = new int [tamanio];
        a2 = new int [tamanio];
        a3 = new int [tamanio];
        for(int i=0; i<tamanio; i++){
            System.out.println("a1 "+ i +":");
            a1[i]= key.nextInt();
            System.out.println("a2 "+ i +":");
            a2[i] = key.nextInt();
            
            a3[i]= a1[i]*a2[i];
        }
        
        for(int i=0; i<tamanio; i++){
            System.out.println("contenido de a3 :");
            System.out.println("posicion: " +i +":" +a3 [i]);
        
        }

    }
}
