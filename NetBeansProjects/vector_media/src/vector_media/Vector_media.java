/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_media;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
import java.util.*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int par = 0, impar = 0; //contadores de los nuemeros pares e imapares...
        int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
        double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de pares e impares..
        
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
                sumaPos += numeros[i];
                par++;
            } else if (numeros[i]%2!=0){ //sumar impares
                sumaNeg += numeros[i];
                neg++;
            }
        }

        //Calcular y mostrar las medias 
        if (pos != 0) {
            System.out.println("Media de los valores pares: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros pares");
        }
        if (neg != 0) {
            System.out.println("Media de los valores impares: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros impares");
        }
    }