/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vivienda;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Vivienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             System.out.println("***Bienvenido**** ");
             Scanner id= new  Scanner (System.in);
             System.out.println("Ingrese el gasto mensual de vivienda:");
             double vivienda= id.nextDouble();
             System.out.println("ingrese su gasto en vestuario:");
             double vestuario= id.nextDouble();
             System.out.println("ingrese su gasto en alimentacion");
             double alimento= id.nextDouble();
             System.out.println("ingrese gasto de energia");
             double energia = id.nextDouble();
             System.out.println("ingrese su gasto en transporte");
             double transporte= id.nextDouble();
             // realizar operaciones. :)
             
          // gasto de cada trimestre:
           
             double Operacion1;
             Operacion1= (vivienda+vestuario+alimento+energia+transporte)*3;
             System.out.println("su gasto trimestral es de: $ "+ Operacion1);
             
             // Gasto anual:
             double Operacion2;
             double TotalVivienda= vivienda*12;
             double TotalVestuario= vestuario*12;
             double TotalAlimento= alimento*12;
             double TotalEnergia= energia*12;
             double TotalTransporte= transporte*12;
             Operacion2= TotalVivienda+TotalVestuario+TotalAlimento+TotalEnergia+TotalTransporte;
             System.out.println("Su gasto total anual en vivienda, Vestuario,Alimentos,energia y transportes es $: " +Operacion2);
             // porcentaje anual de cada concepto
               System.out.println("Gasto total anual de Vivienda $:"+TotalVivienda);
               System.out.println("Gasto total anual de Vestuario $:"+TotalVestuario);
               System.out.println("Gasto total anual de Alimentos $:"+TotalAlimento);
               System.out.println("Gasto anual de Energia $:"+TotalEnergia);
               System.out.println("Gasto anual de Transporte $:"+ TotalTransporte);
               System.out.println("***OPERACIONES EFECTUADAS***");
                     
             
             
             
             
        
    }
}
