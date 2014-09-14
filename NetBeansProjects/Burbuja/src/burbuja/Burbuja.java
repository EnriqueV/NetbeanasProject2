/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int aux;
       boolean cambio= false;
       int array[];
       int tamaño;4
       Scanner yenar = new Scanner(System.in);
        System.out.println("Bienvenido, Ingrese el tamaño del arreglo");
        tamaño= yenar.nextInt();
        array= new int [tamaño];
        for (int i =0; i<tamaño;i++){
            System.out.println("array" + i +":");
            array[i]= yenar.nextInt();
            
        }
        
        while(true){
        for(int i=1; i<array.length; i++){
            if(array[i]<array[i-1]){
            aux= array[i];
            array[i]= array[i-1];
            array[i-1]= aux;
            cambio= true;
            
            }
        }
        
        if (cambio==true){
        break;
        }
        }
       
       for(int i=0; i<array.length;i++){
           System.out.println("arreglo ordenado asendentemente:" +array[i]); 
       
       }
    }
}
