/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int numeros []={1,22,2,2,4,4,5,5};
System.out.println("Antes de la ordenación: ");
System.out.println("=======================");
for(int i=0;i<numeros.length;i++)
System.out.println("numero(sub indice): "+i+" "+numeros[i]);
Arrays.sort(numeros);//la funcion sort muestra los elementos de un array de menor a mayor
System.out.println(" ");
System.out.println("Después de la ordenación: ");
System.out.println("=========================");
for(int i=0;i<numeros.length;i++)
System.out.println("numero: "+i+" "+numeros[i]);
        
    
        
        
    }
}
