/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TareaJava {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int opcion;
        Scanner op= new Scanner (System.in);
        System.out.println("bienvenido");
        System.out.println("digite 1 para saber cual es par o impar"+
                "\ndigite 2 para saber q nuemro es mayor de tres numeros "+
                " \n o presione 3 para salir del programa :");
        opcion= op.nextInt();
        
        switch(opcion) {
            case 1 :
                
        Scanner scan = new Scanner(System.in);
       int n, x, c = 0, d = 0;
       System.out.print("Ingrese la cantidad de numeros a revisar: ");
       n = scan.nextInt();
       for (int i = 1; i <= n; i++)
       {
            System.out.print(i + ") Ingrese un numero: ");
            x = scan.nextInt();
            if (x % 2 == 0)            
                c++;            
            else            
                d++;            
        }
        System.out.println("La cantidad de pares son: " + c);
        System.out.println("La cantidad de impares son: " + d);
        break;
            case 2:
                Scanner numero = new Scanner(System.in);
      int n1, n2, n3;
                System.out.println("Bienvenido");
                System.out.println("====================================");
      System.out.print("Introduzca primer dato: ");
      n1 = numero.nextInt();
    System.out.print("Introduzca segundo dato: ");
      n2 = numero.nextInt();
      System.out.print("Introduzca tercer dato: ");
        n3 = numero.nextInt();
        if(n1 > n2)
           if(n1>n3)
              System.out.println("El mayor es: " + n1);
           else
              System.out.println("el mayor es: " + n3);
        else if(n2>n3)
              System.out.println("el mayor es: " + n2);
                else
              System.out.println("el mayor es: " + n3); 
            case 3:
                System.exit(0);
        }}
}
