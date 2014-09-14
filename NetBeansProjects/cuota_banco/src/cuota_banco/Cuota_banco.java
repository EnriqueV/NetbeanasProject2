/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuota_banco;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Cuota_banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("[BIENVENIDO]");
            Scanner pago;
            pago= new Scanner(System.in);
            Scanner name;
            name= new Scanner(System.in);
            System.out.println("Ingrese su nombre y apellido");
            String nombre= name.nextLine();
            System.out.println("Cuanto dinero desea prestar\n"+"ingrese el monto $:");
            float cantidad= pago.nextFloat();
            System.out.println("Por cuanto tiempo desea adquirir su prestamo");
            int tiempo= pago.nextInt();
            // calcular cuota mensual
            double interes= 3.5; // desglosando la formula para un resultado final..
            double calculo1;
            calculo1= cantidad*interes;
            double calculo2= calculo1/1-(1/(1+interes)*tiempo);// cuota mensual
            double pagofinal;
            pagofinal= tiempo*calculo2;
            // interes anual:
            double interes_anual;
            interes_anual= interes*12; // multiplicado por 12 meses
            // imprimir datos:
            System.out.println("señor/a:"+nombre);
            System.out.println("Adquirio un prestamo por la cantidad de:"+cantidad);
            System.out.println("Para pagarse en:" + tiempo+ "años");
            System.out.printf("Cuota mensual de $:"+ "%.2f %n",calculo2);
            System.out.println("Costo anual de interes $"+ interes_anual);
            System.out.printf("pago final de $:" +"%.2f %n",pagofinal);
            System.out.println("***OPERACION EFECTUADA***");
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
