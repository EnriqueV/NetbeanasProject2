/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarvectores;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class SumarVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int array1, array2;
      Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese la longitud del array");
      array1= teclado.nextInt();
        System.out.println("ingrese el tamaño arreglo 2");
        array2= teclado.nextInt();
        int[] arreglo1,arreglo2,sumaArreglos;
        arreglo1= new int [array1];
        arreglo2= new int [array2];
        sumaArreglos= new int [2];
        System.out.println("ingrese valores al array1");
        for(int cont=0; cont<arreglo1.length; cont++){
            System.out.println("ingrese valor"+cont+":");
            arreglo1[cont]= teclado.nextInt();
            sumaArreglos[0]+=arreglo1[cont]; }
        System.out.println("ingrese valores al arreglo2");
        for(int cont=0; cont<arreglo2.length; cont++){
            System.out.println("ingrese valor"+cont+ ":"); 
            arreglo2[cont]= teclado.nextInt();
            sumaArreglos[1]+=arreglo2[cont];
        }
        for(int cont=0; cont<sumaArreglos.length; cont++){
            
            System.out.println("la suma es:"+ cont+sumaArreglos[cont]);
        
        }
        
    }
}
