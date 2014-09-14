
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocharat;

/**
 *
 *
 */
import java.util.Scanner;

public class EjemploCharAt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada= new Scanner (System.in);
        String palabra="";
        
        System.out.println("Por favor introduzca una palabra");
        palabra= entrada.nextLine();
        
        for (int x= palabra.length()-1; x>=0; x--){
        System.out.print(palabra.charAt(x));
        }
        System.out.println("");
    }
}
