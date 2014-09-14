/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usosplit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class UsoSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String formato;
       ArrayList lst= new ArrayList();
       Scanner d= new Scanner(System.in);
        System.out.println("Ingrese los datos en el siguiente formato: (nombre,apellido,sexo");
        formato= d.nextLine();
        String [] split= formato.split(",");
        if(split.length==3){// recibe 3 valores(NOMBRE,APELLIDO,SEXO)
        String nombre=(split[0].trim());
        String apellido=(split[1].trim());
        String sexo=(split[2].trim());
        lst.add(nombre);
        lst.add(apellido);
        lst.add(sexo);
        //    System.out.println("datos en el arraylist:"+nombre+apellido+sexo);
        }else{
            System.out.println("no a ingresado datos.");
      
        }
        for(int i=0;i<lst.size();i++){
        
          System.out.println("datos="+lst.get(i));
        
        }
        System.out.println("ingrse el nombre del siudadano");
        String dato= d.nextLine();
        if(lst.contains(dato)){
        
            System.out.println("el ciudadano ya esta registrado");
        
        } else{
        
            System.out.println("el nombre no esta en los registros");
        
        }
    }}