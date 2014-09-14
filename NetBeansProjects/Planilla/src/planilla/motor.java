/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class motor {
  administrador b= new administrador();
  vendedor c= new vendedor();
    ArrayList <vendedor>lst;
 Scanner cd= new Scanner(System.in);
    public void llenarPlanilla(){
        int opc;
        System.out.println("-----------BIENVENIDO -----------");
        System.out.println("Ingrese 1 si es Vendedor o 2 si es Empleado Administrarivo");
        opc= cd.nextInt();
        if(opc==1){
        System.out.println("Porfavor ingrese sus datos en el siguiente formato:"+
                "\n[nombre,apellido,tipoEmpleado, SueldoBase,comision]");
        String datos1= cd.nextLine();
        String []colec= datos1.split(",");
        c.setNombre(colec[0]);
       c.setApellido(colec[1]);
       c.setTipoEmpleado(colec[2]);
      c.setSueldoBase(Float.parseFloat(colec[3]));
       c.setComision(Float.parseFloat(colec[4]));
        lst.add(c);
          }else{
    
    System.out.println("Porfavor ingrese sus datos en el siguiente formato:"+
                "\n[nombre,apellido,tipoEmpleado, SueldoBase,horasExtras]");
              String datos2=cd.nextLine();
            String [] colec2 = datos2.split(",");
             b.setNombre(colec2[0].trim());
             b.setApellido(colec2[1].trim());
             b.setTipoEmpleado(colec2[2].trim());
             b.setSueldoBase(Float.parseFloat(colec2[3].trim()));
             b.setHorasExtras(Float.parseFloat(colec2[4].trim()));
             lst.add(b);
              
              
    }
    
    
    
    }

   
    
}
