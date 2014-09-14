/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buble;

import java.util.Arrays;
import java.util.Collections;



/**
 *
 * @author eduardo
 */
public class Buble {
    
    public static void main(String[] args) {
      double numeros []={6,7,9,0,2,3,4,57};
System.out.println("Antes de la ordenación: ");
System.out.println("=======================");
for(int i=0;i<numeros.length;i++)
System.out.println("numero(sub indice): "+i+ "posicion "+numeros[i]);
Arrays.sort(numeros);//la funcion sort muestra los elementos de un array de menor a mayor
System.out.println(" ");
System.out.println("Después de la ordenación: ");
System.out.println("=========================");
for(int i=0;i<numeros.length;i++)
System.out.println("numero: "+i+" posicion "+numeros[i]);
}
}
    

