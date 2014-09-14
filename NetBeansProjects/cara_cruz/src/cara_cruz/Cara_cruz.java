/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cara_cruz;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author eduardo
 */
public class Cara_cruz {

    private int cara;
    private int cruz;
    Scanner i= new Scanner(System.in);
    public void juego(){
    String opcion; // variable q utilizaremos para elejir la decicion a la ora de jugar
        System.out.println("Bienvenido al juego Cara o cruz");
        System.out.println("***Escribe L para lanzar la modena o S para salir de l juego***");
    opcion= i.nextLine();
    if("s".equals(opcion)) // si el usuario no qiere jugar
    {
        System.out.println("has decidio abandonar el juego");
    System.out.println("-------- saliendo del juego------");
        if("l".equals(opcion));// si el usuario eleige tirar
        // hacemos una llamada el metodo lanzar
    
        boolean resul= lanzar();
        if (resul== true){
            cara++;
        }  else
            cruz++;
    }
   segundoTiro();
    
    }
    

  public boolean lanzar(){
      Random generador= new Random();
      int moneda= 1+generador.nextInt(2);
      if (moneda==1)
          return true;
      else
        return false;
  }
  public void sengundoTiro(){
  
   String opc2;
        boolean resultado;
 
        do {
        // y preguntamos al usuario si quiere lanzarla nuevamente
 
        System.out.println("Desea Lanzar la moneda otra vez");
        System.out.println("'Y' para si y 'N' para no");
        opc2 = i.nextLine();
 
        if("Y".equals(opc2))
        {
            // Hacemos lo mismo, llamar al metodo tirar y aumentar si es cara o cruz
            resultado = lanzar();
            if(resultado == true)
            cara++;
        }
        else
        {
            cruz++;
        }
        } while("Y".equals(opc2)); // Se repite el lanzamiento mientras la opcion elegida sea //'Si, Lanzar'
 
        // Si despues del 1er tiro el usuario no quiere seguir jugando, imprimimos un //mensaje de salida
        // e imprimimos los resultados del juego
 
        if("N".equals(opc2))
        {
            System.out.println("Ha decido salir");
            System.out.println("Usted saco "+cara+ "caras y "+cruz+" cruces");
}
    } // Esta llave debería indicar el fin del método segundoTiro

     
     
} // Y esta el fin de la clas
  
  

  


