/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_minerva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Motor {
 ///String prueba;
    private String datos1;
 
Paciente datos=new Paciente();
        ArrayList<Paciente> lista;
 Consulta1 dato2=new Consulta1();
ArrayList<Consulta1> lista2;
    
public Motor(){
           lista=new ArrayList<Paciente>();
           lista2= new ArrayList<Consulta1>();
}
    public void ingresarDatos(){
        
        Scanner d=new Scanner(System.in);
        System.out.println("++++FICHA DEL PACIENTE+++++");
           System.out.println("Nombre: ");
        datos.setNombre(d.nextLine());
        System.out.println();
            System.out.print("Apellido: ");
        datos.setApellido(d.nextLine());
        System.out.println("Sexo:");
        datos.setSexo(d.nextLine());
        System.out.print("Ocupacion :");
        datos.setOcupacion(d.nextLine());
         System.out.println("Motivo de su Consulta:  ");
        datos.setTipoConsulta(d.nextLine());
        System.out.print("Edad :");
        datos.setEdad(d.nextInt());
        System.out.print("ingrese su talla: ");
        datos.setTalla(d.nextInt());
        System.out.print("Ingrese su peso: ");
        datos.setPeso(d.nextDouble());
         lista.add(datos);
    }
    public void mostrarDatos(){
       if(lista.size()==0){
           System.out.println("NO SE PUEDEN MOSTRAR DATOS"
                   +"\n PORQUE AUN NO LOS A INGRESEADO ");
           System.out.println("*************************************");
       } else
    for(int i=0;i<lista.size();i++){
    datos=(Paciente)lista.get(i);
    
   
        System.out.println("[++++++++++DATOS DEL PACIENTE++++++++++]");
        System.out.println("Id_Paciente numero: "+i);
        System.out.println("Nombre: "+datos.getNombre());
        System.out.println("APellido:"+datos.getApellido());
        System.out.println("Edad: "+datos.getEdad());
        System.out.println("sexo:"+ datos.getSexo());
        System.out.println("Tipo de Consulta: " +datos.getTipoConsulta());
        System.out.println("Ocupacion: "+datos.getOcupacion());
        System.out.println("Talla: "+ datos.getTalla());
        System.out.println("Peso en kg:"+ datos.getPeso());
        System.out.println("Masa corporal:"+ datos.getImc());
        System.out.println("*******************************************");
        System.out.println("***DATOS INGRESADOS POR EL MEDICO***");
        if(lista2.size()==0){
            System.out.println("Estos Datos estan pendientes de Ingresar por el Medico");
        }else{
        System.out.println("fecha de la cita: "+dato2.getFechaConsulta());
        System.out.println("Diagnostico: "+dato2.getDiagnostico());
        System.out.println("Examenes: "+dato2.getExamenes());
        System.out.println("Medicamento: "+dato2.getMedicamentos());
        System.out.println("Recomendaciones"+dato2.getRecomendaciones());
        System.out.println("********************************************************");
        }
    }
    }
    public void modificarDatosPaciente(){
 
    Scanner d=new Scanner(System.in);
        System.out.println("¿Que Paciente desea modificar?"+
                "\n(RECUERDE HACER LA MODIFICACION EN "
                + "BASE AL NUMERO DE PACIENTE)");
        int dat=d.nextInt();
        if(lista.size()==0){
            System.out.println("Lo Sentimos,No Hay datos Guardados"+
                    "\n Primero debe hacer una consulta para generar su expediente");
            System.out.println("*****************************************");
        }
        else
             for(int i=dat;i<lista.size();i++){
        lista.remove(dat);
            System.out.println("++++INSERTE LOS NUEVOS DATOS DEL PACIENTE+++++");
            
            System.out.print("Nombre: ");
        datos.setNombre(d.nextLine());          
            System.out.print(" Apellido: ");
        datos.setApellido(d.nextLine());
            System.out.print("Ocupacion: ");
        datos.setOcupacion(d.nextLine());
        System.out.println("Tipo de consulta: ");
            datos.setTipoConsulta(d.nextLine());
              System.out.print("Edad: ");
        datos.setEdad(d.nextInt());
            System.out.print("Talla: ");
        datos.setTalla(d.nextDouble());
            System.out.println("Peso: ");
        datos.setPeso(d.nextDouble());
        lista.add(datos);
        
}  
    }  
     public void ModificarDatosDoctor(){
         int password;
        int doc= 1304;
        Scanner pass= new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("Ingrese Password de Medico (valor entero):");
       password= pass.nextInt();
       if(doc==password){
     Scanner d=new Scanner(System.in);
        System.out.print("Datos correspondientes al medico:"+
                "\n ¿Que Paciente desea modificar?"+
                "\n(RECUERDE HACER LA MODIFICACION EN "
                + "BASE AL NUMERO DE PACIENTE)");
        int dat=d.nextInt();
        if(lista2.size()==0){
            System.out.println("*************************************");
            System.out.println("Lo Sentimos,No Hay datos Guardados,"
                    + "\n El paciente aun no a consultado "
                    + " \nO Faltan datos en el Primer Formulario");
            System.out.println("*************************************");
        }
        else
             for(int i=dat;i<lista2.size();i++){
        lista2.remove(dat);
            System.out.println("++++INSERTE LOS NUEVOS DATOS DEL PACIENTE+++++");
            
            System.out.print("Fecha Cita: ");
            dato2.setFechaConsulta(d.nextLine());          
            System.out.print("Diagnostico: ");
            dato2.setDiagnostico(d.nextLine());
           System.out.print("Examenes:");
            dato2.setExamenes(d.nextLine());
              System.out.print("Medicamento:");
           dato2.setMedicamentos(d.nextLine());
            System.out.print("Recomendaciones: ");
        dato2.setRecomendaciones(d.nextLine());
            System.out.println("Sintomas: ");
        dato2.setSintomas(d.nextLine());
        lista2.add(dato2);
        
}
  } else{
    System.out.println("No puede ingresar mas datos, se a identificado como paciente"+
          " Los datos de su ficha han sido Guardados");
       }
    }
    public void eliminarDatos(){
        System.out.println("sus datos an sido eliminados");
        System.out.println("*********************************************");
        lista.clear();
    
    
    }
    public void ConsultaMedica(){
        System.out.println("Los datos que acontinuacion se presentan"
                + "\n seran  llenados exclusivamente por el medico"+ " \n si Usted es un paciente "
                + "Preseione 2");
        int password;
        int doc= 1304;
        Scanner pass= new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("Ingrese Password de Medico (valor entero):");
       password= pass.nextInt();
       if(doc==password){
           System.out.println("**DATOS Ingresados por el Medico**");
    Scanner e=new Scanner(System.in);
     System.out.print("\n Fecha de Consulta: ");
        dato2.setFechaConsulta(e.nextLine());
            System.out.print("\n Sintomas: ");
        dato2.setSintomas(e.nextLine());
            System.out.print("Diagnostico: ");
        dato2.setDiagnostico(e.nextLine());
            System.out.print(" Medicamento:");
        dato2.setMedicamentos(e.nextLine());
        System.out.print("Examenes: ");
        dato2.setExamenes(e.nextLine());
        System.out.print(" Recomendaciones: ");
        dato2.setRecomendaciones(e.nextLine());
    lista2.add(dato2);
           System.out.println("***********************************");
    } else
            System.out.println("No puede ingresar mas datos, se a identificado como paciente"+
                    " Los datos de su ficha han sido Guardados");
    
}
}