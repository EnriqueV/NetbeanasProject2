/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionparcial2;

import javax.swing.JOptionPane;

/**
 *
 * @author carloscarcamo
 */
public class SolucionParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para ejecutar un ejercicio hay que descomentarlo y comentar el otro
        //ejercicio1();
        ejercicio2();
        
    }
    
    //Solucion al ejercicio 1
    public static void ejercicio1(){
        //aca el vector se ha definido con un valor dado
        int numeros[] = new int[10];
        int numeroX = 0;
        
        /* asignamos a la variable mayor el numero maximo 
         * que soporta los enteros, con esto nos aseguramos
         * que cualquier valor instruducido sera siempre 
         * menor o igual a este pero nunca mayor 
         */
        int mayor = Integer.MAX_VALUE;
        
        //pedimos que se llene el vector
        for(int i=0; i<numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1)));
        }
        
        //capturamos el numero con el que vamos a comparar
        numeroX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero comprendido entre el rago de numeros que ha introducido"));      
        
        
        System.out.println("Numeros: "); //mostrando info (no era requerido en el parcial)
        
        for(int i=0; i<numeros.length; i++){
            //evaluamos si el numero actual es mayor al que capturamos
            if(numeros[i]>numeroX){
                //de ser mayor entonces preguntamos si es menor al numero mayor anterior
                if(numeros[i]<mayor){
                    //de ser menor ahora el mayor mas cercano es el numero en la posicion i
                    mayor = numeros[i];                    
                }
            }
            System.out.print(numeros[i] + ","); //mostrando info (no era requerido en el parcial)
        }
        
        //mostrando resultados        
        System.out.println("");
        //Si no encontro ningun numero mayor al que hemos introducido entonces 
        //Por defecto mostrara el numero maximo que soporta un int
        System.out.println("El numero mayor más cercano al numero introducido " + numeroX + " es: " + mayor );
    }
    
    //Solucion al ejercicio 2
    public static void ejercicio2(){
        //aca el vector se ha definido con un valor dado
        int numeros[] = new int[10];
        int numero1= 0, numero2 = 0;
        
       
        //pedimos que se llene el vector
        for(int i=0; i<numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1)));
        }
        
        //capturamos dos numeros entre el numero de posiciones del vector
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero dentro del rango de posiciones del vector."));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero dentro del rango de posiciones del vector."));
        
        //Nos aseguramos que los numeros obtenidos sean mayores a cero
        //En un ventor no existen posiciones negativas
        if(numero1>0 && numero2>0){
            /*
             * Este if a cotinuación no se pidió en el parical
             * pero se asegura que las posiciones en el vector 
             * sean coherentes:
             * el numero1: es el numero menor
             * el numero2: es el numero mayor
             * caso contrario se cambian los valores para que concuerden con lo anterior
             */
            int aux = 0;            
            if(numero1>numero2){
                aux = numero1;
                numero1 = numero2; 
                numero2 = aux;                
            }
            
            
            System.out.println("Los numeros comprendidos entre las pisiciones " 
                    + numero1 + " y " + numero2 + " del vector son:");
            //recorremos el vector
            for(int i=0; i<numeros.length; i++){
                //imprimimos los numeros comprendidos entre las pocisiones dadas
                if(i>numero1 && i<numero2){
                    System.out.println(numeros[i]);
                }
            }
        }else{
            System.out.println("El rango de posiciones no es valido."
                    + "\n Las posiciones deben ser mayores a cero.");
        }
        
       
        
    }
}
