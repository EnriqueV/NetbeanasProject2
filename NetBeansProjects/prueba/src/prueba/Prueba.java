/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList b= new ArrayList();
       Scanner data = new Scanner(System.in);
        System.out.println("Registro (Ingrse el nombre y apellido, edad,sexo(todo separados por una (,))" );
         String datos=data.toString();
         b.add(datos);
        System.out.println("los datos son");
          for(int i=0; i<b.size(); i++)  {
              System.out.println("los datos son"+b.get(i));
    }  
       
       }
        
    }
    
    
    
    

