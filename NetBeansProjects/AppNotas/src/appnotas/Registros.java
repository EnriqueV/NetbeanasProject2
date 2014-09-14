/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Registros {
   Persona datos= new Persona();
    ArrayList<Persona> lista;
    Estudiante dato2= new Estudiante();
    ArrayList<Estudiante>lista2;
   Notas n= new Notas();
   ArrayList<Notas>lista3;
    public Registros(){
    lista= new ArrayList<Persona>();
    lista2=new ArrayList<Estudiante>();
    lista3=new ArrayList<Notas>();
    }
public void llenarRegistros(){
Scanner b= new Scanner(System.in);
    System.out.println("EXPEDIENTE DEL ALUMNO:");
    System.out.print("Nombre:");
    datos.setNombre(b.nextLine());
    System.out.print("Apellido: ");
    datos.setApellido(b.nextLine());
    System.out.print("SEXO:");
    datos.setGenero(b.nextLine());
    System.out.print("Edad:");
    datos.setEdad(b.nextInt());
    lista.add(datos);
    System.out.println("");
    Scanner c= new Scanner(System.in);
    System.out.print("Carnet: ");
    dato2.setCarnet(c.nextLine());
    System.out.print("EMAIL: ");
    dato2.setEmail(c.nextLine());
    System.out.print("TELEFONO: ");
    dato2.setTelefono(c.nextLine());
          lista2.add(dato2);
}
  public void AgregarNotas(){
      System.out.print("Para ingresar notas debe ser un docente o instructor"+
              "\n Identifiquese con un passwoord");
    int passwoord;
    int identi= 123;
    Scanner pass= new Scanner(System.in);
      System.out.println("******************************************");
      System.out.println("Porfavor ingrese su contraceña(Valores enteros):");
      passwoord=pass.nextInt();
      if(identi==passwoord){
          System.out.print("Ingrese el carnet del estudiante para registrar sus notas:");
          String carnet= pass.nextLine();
          System.out.print("Docente:");
          n.setDocente(pass.nextLine());
          System.out.print("materia");
          n.setMateria(pass.nextLine());
          System.out.print("NOTA 1: ");
          n.setNota1(pass.nextDouble());
          System.out.print("NOTA 2: ");
          n.setNota2(pass.nextDouble());
          System.out.print("NOTA 3: ");
          n.setNota3(pass.nextDouble());
          lista3.add(n);
          
          
      
      
      }
  }
    
    
    



}
