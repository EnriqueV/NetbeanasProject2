/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormedia;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class VectorMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i;
        int par = 0, impar = 0; //contadores de los nuemeros pares e imapares...
        int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
        double sumaPar = 0, sumaImpar = 0; //acumuladores para las sumas de pares e impares..
        
        //lectura de datos y llenar el array
        System.out.println("Ingrese los elementos para llenar el array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //recorrer el array para sumar por separado los números pares 
         // e impares  
        for (i = 0; i < 10; i++) {
            if (numeros[i] %2== 0){ //sumar pares.
                sumaPar += numeros[i];
                        
                par++;
            } else if (numeros[i]%2!=0){ //sumar impares
                sumaImpar += numeros[i];
                impar++;
            }
        }

        //Calcular y mostrar las medias 
        if (par %2==0) {
            System.out.println("Media de los valores pares: " + sumaPar / par);
        } else {
            System.out.println("No ha introducido numeros pares");
        }
        if (impar %2!=0) {
            System.out.println("Media de los valores impares: " + sumaImpar / impar);
        } else {
            System.out.println("No ha introducido numeros impares");
        }
    }
}
    

