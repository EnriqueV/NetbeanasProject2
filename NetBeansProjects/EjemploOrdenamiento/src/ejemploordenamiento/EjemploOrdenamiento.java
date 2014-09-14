/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploordenamiento;

/**
 *
 * @author fredy
 */

import java.util.Scanner;

public class EjemploOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo [];
        int n,auxiliar;
        
        System.out.println("Introduzca el tamaño del arreglo");
        n = entrada.nextInt();
        
        arreglo= new int[n];
                
        for (int x=0 ; x<n;x++){
           System.out.println("Introduzca un número ");
           arreglo[x]= entrada.nextInt();        
        
        }
                
        for (int i=1; i<arreglo.length; i++){
        
           for (int j=0;j<arreglo.length-i; j++){
               
               if (arreglo[j]>arreglo[j+1]){
                   auxiliar=arreglo[j];
                   arreglo[j]= arreglo[j+1];
                   arreglo[j+1]= auxiliar;
               }
               
           
           }        
        
        }
       // System.out.println("\n Vector Ordenado Ascendentemente ");
        //System.out.println("El mayor es "+arreglo[n-1]);
     
        
          // System.out.println("El segundo mayor es "+arreglo[n-2]);
        
       
         System.out.println("\n Vector Ordenado Ascendentemente ");
        for (int y=0; y<arreglo.length;y++){
        
           System.out.println(arreglo[y]);
           
        
        
        }        
        
        
        
        
        
        
    }
}
