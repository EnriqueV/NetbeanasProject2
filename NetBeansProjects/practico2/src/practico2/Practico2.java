/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practico2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Practico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList lst;
       lst= new ArrayList();
       Scanner tx= new Scanner(System.in);
       String datos;
        System.out.println("Ingrese sus datos separados por una (,) ejemplo: Eduardo,Valencia,campeon");
       datos=tx.nextLine();
        String[] recorrer= datos.split(",");
       String nombre= (recorrer[0].trim());
       String apellido= (recorrer[1].trim());
       String estado=(recorrer[2].trim());
       lst.add(nombre);
       lst.add(apellido);
       lst.add(estado);
       for(int i=0; i<lst.size();i++){
           System.out.println("los valores son:"+lst.get(i));
    
    }
    }
}
