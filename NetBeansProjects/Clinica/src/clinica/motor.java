
package clinica;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class motor{
    ArrayList <paciente> lista = new ArrayList <paciente>();
    ArrayList <consulta> listC = new ArrayList <consulta>();
    
    int opcion;
    Scanner leer = new Scanner(System.in);
    //private String inputkey;

    //Metodo que muestra el menu principal
    void MenuPrincipal() {
        this.menu1();
        opcion = leer.nextInt();
        do {
            switch (opcion) {
            case 1:
                this.nuevoPaciente();
                break;
            case 2:
                this.busquedaPaciente();
                break;
            case 3:
                  this.eliminarPaciente();
                break;
            case 4:
                this.consultas();
                break;
            case 5:
                this.Expediente();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("\nIngrese una opcion valida de el menu");
                break;
            }
        this.menu1();
        opcion = leer.nextInt();
        } while (opcion>0 && opcion<7);                
    }    
    
    //Metodo para agregar un paciente
    public void nuevoPaciente(){
        paciente nuevo= new paciente();        
        System.out.println("\nIngrese los datos del Paciente en el siguiente formato:"
                + "nombre,apellido,edad,sexo,ocupacion,talla(m),peso(kg)");
        Scanner teclado= new Scanner(System.in);
        String parametros = teclado.nextLine();
        String datos[]= parametros.split(",");
        
        //Asigna los datos al objeto Paciente
        nuevo.setNombre(datos[0]);        
        nuevo.setApellidos(datos[1]);        
        nuevo.setEdad(datos[2]);        
        nuevo.setSexo(datos[3]);        
        nuevo.setOcupacion(datos[4]);        
        nuevo.setTalla(datos[5]);
        nuevo.setPeso(datos[6]);
        lista.add(nuevo); //Agrega los datos al ArrayList
        System.out.println("Paciente registrado....");
       }
    
    //Metodo para buscar un paciente
    public void busquedaPaciente(){  
        DecimalFormat formato = new DecimalFormat("0.00");
        paciente busqueda= new paciente();
        System.out.println("\nIngrese el nombre y apellido del paciente: nombre-apellido");
        Scanner teclado= new Scanner(System.in);
        String parametros = teclado.nextLine();
        String datos[]= parametros.split("-");
        
        //Envia los parametros para realizar la busqueda
        busqueda.setNombre(datos[0]);
        busqueda.setApellidos(datos[1]);
            
            
        for (int i = 0; i < lista.size(); i++) {            
           if (lista.get(i).getNombre().equals(busqueda.getNombre())  &&   lista.get(i).getApellidos().equals(busqueda.getApellidos())) {
               
               //Llena el objeto Paciente con los datos de la busqueda
               busqueda.setNombre(lista.get(i).getNombre());
               busqueda.setApellidos(lista.get(i).getApellidos());
               busqueda.setEdad(lista.get(i).getEdad());
               busqueda.setSexo(lista.get(i).getSexo());
               busqueda.setOcupacion(lista.get(i).getOcupacion());
               busqueda.setTalla(lista.get(i).getTalla());
               busqueda.setPeso(lista.get(i).getPeso());
               
               //Calculo del IMC
               double imc= Double.parseDouble(lista.get(i).getPeso()) / Math.pow(Double.parseDouble(lista.get(i).getTalla()), 2);
               
                 //Muestra los datos Obtenidos
               System.out.println("\nNombre: "+busqueda.getNombre()
               + "\nApellido: "+busqueda.getApellidos()
               + "\nEdad: "+ busqueda.getEdad()
               + "\nSexo: "+ busqueda.getSexo()
               + "\nOcupacion :"+ busqueda.getOcupacion()
               + "\nTalla: "+ busqueda.getTalla()
               + "\nPeso: "+ busqueda.getPeso()
               + "\nIMC: "+ formato.format(imc));            
           }
        }
    }
    
    //Metodo que devuelve un object con los datos del paciente que se le consultara
    public paciente consultado(){    
        paciente busqueda= new paciente();
        System.out.println("\nIngrese el nombre y apellido del paciente: nombre-apellido");
        Scanner teclado= new Scanner(System.in);
        String parametros = teclado.nextLine();
        String datos[]= parametros.split("-");
        
        //Envia los parametros para realizar la busqueda
        busqueda.setNombre(datos[0]);
        busqueda.setApellidos(datos[1]);
        
        for (int i = 0; i < lista.size(); i++) {            
           if (lista.get(i).getNombre().equals(busqueda.getNombre())  
                   &&   lista.get(i).getApellidos().equals(busqueda.getApellidos())) {
               
               //Llena el objeto Paciente con los datos de la busqueda
               busqueda.setNombre(lista.get(i).getNombre());
               busqueda.setApellidos(lista.get(i).getApellidos());
               busqueda.setEdad(lista.get(i).getEdad());
               busqueda.setSexo(lista.get(i).getSexo());
               busqueda.setOcupacion(lista.get(i).getOcupacion());
               busqueda.setTalla(lista.get(i).getTalla());
               busqueda.setPeso(lista.get(i).getPeso());                         
           }
        }            
            return busqueda;
      }

    //Metodo para eliminar un paciente
    public void eliminarPaciente(){    
        paciente eliminar= new paciente();
        System.out.println("\nIngrese el nombre y apellido del paciente que desea eliminar: nombre-apellido");
        Scanner teclado= new Scanner(System.in);
        String parametro = teclado.nextLine();
        String datos[]= parametro.split("-");
        
        //Envia los parametros para realizar la busqueda
        eliminar.setNombre(datos[0]);
        eliminar.setApellidos(datos[1]);
        
        //Pregunta si esta seguro de eliminar el registro
        System.out.println("¿Desea eliminar al paciente "+ datos[0] + " " + datos[1] +"? S/N");
        String seguro = teclado.next();
        char seguroChar = seguro.charAt(0);
        if ((seguroChar == 's') || (seguroChar == 'S')) {
            //Busca los registros con los parametros introducidos y los elimina
            for (int i = 0; i < lista.size(); i++) {
                if ((lista.get(i).getNombre().equals(eliminar.getNombre()) &&  lista.get(i).getApellidos().equals(eliminar.getApellidos()))) {
                    lista.remove(i);
                    System.out.println("\nPaciente eliminado...\n");
                }
            }
        }            
    }
    
    //Metodo para guardar las consultas de los pacientes
    public void consultas(){
        Scanner teclado= new Scanner(System.in);
        consulta consult = new consulta();
        paciente alguien = new paciente();
        alguien = consultado();
        
        //Asigna los datos al objeto Consulta        
        System.out.println("Fecha de Consulta:");
        consult.setFechaConsulta(teclado.nextLine());
        System.out.println("Sintomas percibidos:");
        consult.setSintomas(teclado.nextLine());
        System.out.println("Diagnostico:");
        consult.setDiagnostico(teclado.nextLine());
        System.out.println("Medicamentos Recetados:");
        consult.setMedicamentos(teclado.nextLine());
        System.out.println("Examenes Clinicos:");
        consult.setExamenes(teclado.nextLine());
        System.out.println("Recomendaciones:");
        consult.setRecomendaciones(teclado.nextLine());
        consult.setPaciente(alguien);
        listC.add(consult);     //Agrega los datos al ArrayList          
    }
    
    public void Expediente(){    
        consulta consult = new consulta();
        paciente alguien = new paciente();
        alguien = consultado();
                    
        for (int i = 0; i < listC.size(); i++) {            
           if (listC.get(i).getPaciente().getNombre().equals(alguien.getNombre())  
                   &&   listC.get(i).getPaciente().getApellidos().equals(alguien.getApellidos())) {
               
               //Llena el objeto Consulta con los datos de la busqueda
               consult.setFechaConsulta(listC.get(i).getFechaConsulta());        
               consult.setSintomas(listC.get(i).getSintomas());        
               consult.setDiagnostico(listC.get(i).getDiagnostico());        
               consult.setMedicamentos(listC.get(i).getMedicamentos());        
               consult.setExamenes(listC.get(i).getExamenes());        
               consult.setRecomendaciones(listC.get(i).getRecomendaciones());
               
               
                 //Muestra los datos Obtenidos
               System.out.println("\n\nNombre: "+alguien.getNombre()
               + "\nApellido: "+alguien.getApellidos()
               + "\nFecha de Consulta: "+ consult.getFechaConsulta()
               + "\nSintomas Percibidos: "+ consult.getSintomas()
               + "\nDiagnostico: "+ consult.getDiagnostico()
               + "\nMedicamentos Recetados: "+ consult.getMedicamentos()
               + "\nExamenes Clinicos: "+ consult.getExamenes()
               + "\nRecomendaciones: "+consult.getRecomendaciones());            
           }
        }
    }
    
    //Diseño del Menu Principal
    private void menu1(){
            System.out.print("\n//// Registro de pacientes \\\\"
                + "\n1.*** Crear un nuevo registro***"
                + "\n2.*** Buscar un registro ***"
                + "\n3.*** Eliminar un registro ***"
                + "\n4.*** Consulta medica ***"
                + "\n5.*** Ver expediente clinico ***"
                + "\n6.*** Salir ***"
                + "\nIngrese una opcion: ");
    }
    
   
}
