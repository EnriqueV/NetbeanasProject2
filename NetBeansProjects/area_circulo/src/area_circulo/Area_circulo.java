/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package area_circulo;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Area_circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("BIENVENIDO");
            
            Scanner area;
            area= new Scanner(System.in);
            System.out.println("Ingrese el Radio del circulo:");
            double radio= area.nextDouble();
            double pi= 3.1416;
            double resultado;
            resultado= pi*Math.pow (radio, 2);
            System.out.printf("el area de el circulo es:"+"%.2f %n",resultado);
            System.out.println("calculo efectuado...");
            
            
            
            
            
            
            
            
        
    }
}
