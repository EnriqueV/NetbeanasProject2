/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosbidimensionales;

/**
 *
 * @author fredy
 */
import java.util.Scanner;
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int f=0;
        int c=0;
        int matriz[][];
        
        System.out.println("indique el número de filas ");
        f= entrada.nextInt();
        
        System.out.println("indique el número de columnas ");
        c= entrada.nextInt();
        
        matriz= new int[f][c];
        
        //llenando nuestra matriz 
        for (int fila=0; fila<f; fila++){
        
          for (int columna=0; columna<c; columna++){
          
             System.out.println("Introduzca un número");
             matriz[fila][columna]= entrada.nextInt();
          
          }
        
        }
        
        //mostrando elementos de la matriz
        System.out.println(" Los elementos de la matriz son: ");
        
         for (int fila=0; fila<f; fila++){
        
          for (int columna=0; columna<c; columna++){
          
             System.out.print(matriz[fila][columna]+ "  ");
                      
          }
          
          System.out.println("");
        
        }
        
        
        
        
    }
}
