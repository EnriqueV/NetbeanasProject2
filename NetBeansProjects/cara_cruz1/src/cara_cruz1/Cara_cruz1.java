/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cara_cruz1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Cara_cruz1 {
private int cara;
    private int cruz;
    Scanner t = new Scanner(System.in);
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    public void jugar()
    {
        // creamos la variable que represente la primera decision(opc)
        String opc;
 
        bienvenida(); // llamamos al metodo bienvenida para que de la bienvenida al usuario
 
        // pedimos que se elija una opcion
        System.out.println("Eliga una opcion");
        System.out.println("Escriba 'L' para lanzar la moneda o");
        System.out.println("Escriba 'S' para salir");
        opc = t.nextLine();
 
        // si la opcion elegida es 'Salir' imprimimos un mensaje de salida
        if("S".equals(opc))
        {
            System.out.println("Ha decido salir");
            System.out.println("No se inicio el juego");
 
            // si la opcion elegida es 'Lanzar' tiramos la moneda
            if("L".equals(opc))
            {
                // llamamos al metodo tirar que devuelve true si cae cara o false si cae cruz
                // almacenamos el resultado en la variable boolean resultado, si el valor devuelto
                // es true, aumentamos cara en 1, y si es false aumentamos cruz en 1
 
                boolean resultado = tirar();
                if(resultado == true)
                cara++;
                else
                cruz++;
 
            }
            segundoTiro();
        }
    }
 
    // metodo que da la bienvenida al juego
 
    public void bienvenida()
    {
        System.out.println("Bienvenido al juego 'Lanza la moneda'");
    }
 
    // metodo tirar, tira una moneda, si cae cara devuelve true, si cae cruz devuelve false
 
    public boolean tirar()
    {
        Random generadorAleatorio = new Random();
        int moneda = 1 + generadorAleatorio.nextInt(2);
 
        if(moneda == 1)
        return true;
        else
        return false;
    }
 
    public void segundoTiro()
    {
        String opc2;
        boolean resultado;
 
        do {
        // y preguntamos al usuario si quiere lanzarla nuevamente
 
        System.out.println("Desea Lanzar la moneda otra vez");
        System.out.println("'Y' para si y 'N' para no");
        opc2 = t.nextLine();
 
        if("Y".equals(opc2))
        {
            // Hacemos lo mismo, llamar al metodo tirar y aumentar si es cara o cruz
            resultado = tirar();
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
} // Y esta el fin de la clase
    

