/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[];
        int n, aux;
        System.out.print("ingrese el tamaño del vector");
        n= entrada.nextInt();
        array= new int[n];
        for(int x= 0; x<n; x++){
            System.out.println("ingrese valor:");
            array[x]= entrada.nextInt();
        }
        for (int i=1;i<array.length; i++){
        for(int j=0; j<array.length-j; j++){
            if(array[j]>array[j+1]){
            aux= array[j];
            array[j]= array[j+1];
            array[j+1]= aux;
            
            }
        }
        
        }
        for(int y=0; y<array.length; y++){
        
            System.out.println("array ordenado:"+ array[y]);
        }
    }
}
