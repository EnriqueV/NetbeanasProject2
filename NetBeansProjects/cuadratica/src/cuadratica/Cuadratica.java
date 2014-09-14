/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Cuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("[Bienvenido]");
        Scanner Cuadratica;
        Cuadratica= new Scanner(System.in);
        System.out.println("Ingrese el valor el primer numero");
        double a= Cuadratica.nextDouble();
        System.out.println("Ingrese el valor el segundo numero");
       Scanner variable;
       variable= new Scanner(System.in);
        double b= variable.nextDouble();
        System.out.println("Ingrese el valor el tercer numero");
        double c= variable.nextDouble();
        double x1= (-b+Math.sqrt(b*b-4.0*a*c))/2.0/a;
        double x2= (-b-Math.sqrt(b*b-4.0*a*c))/2.0/a;

        System.out.println("el valor de X1 es:"+x1);
        System.out.println("el valor de X2 es:"+x2);
        
        
    }
}
