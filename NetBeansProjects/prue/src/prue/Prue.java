/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prue;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Prue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList b= new ArrayList();
       Scanner data = new Scanner(System.in);
        System.out.println("Ingrse nombre y apellido separados por ," );
         String datos=data.nextLine();
        String dia[]= datos.split(",");
       for(String dato: dia){
           System.out.println("los datos son: "+dato);
       }
       
       }
        
    }  
    

