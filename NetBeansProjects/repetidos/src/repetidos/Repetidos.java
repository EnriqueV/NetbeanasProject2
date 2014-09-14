/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repetidos;

/**
 *
 * @author eduardo
 */
public class Repetidos {

public static void main(String[] args) {
     int n=10; // n  ES EL MAXIMO DE NUMEROS EN NUESTRO VECTOR
    int vector[]=new int[n], vecNew[]=new int[n], total=0; // TENEMOS LOS 2 VECTORES

        //LLENAMOS EL VECTOR CON NUMEROS ALEATORIOS
           for(int con=0;con<n;con++)  {
            vector[con] = (int) (Math.random()*10);
            System.out.println(vector[con]);
        }   
        
int aux = 0; /*Lo necesitamos para resetear lo contado y empezar de 0 nuevamente */
for(int i=0;i<vector.length;i++){
for(int j=0;j<vector.length;j++){
if(i!=j && vector[i] == vector[j]){ /*La primera condicion es para q no cuente el mismo*/
vector[j] = -99999;/*Este echo es para que no cuente dos veces o mas el mismo #*/
aux++;/*Aumentamos en uno cada ves que se repita*/
}
}
if(vector[i] != -99999){/*para que solo nos muestre los valores que necesitamos*/
System.out.println("El número: "+vector[i]+" se repite: "+aux+" veces");

        vecNew[i]=vector[i]; 
        total++;
}
aux = 0;/*Reseteamos lo contado para la siguiente iteracción*/
}
        for(int c=0;c<total;c++)  {
          System.out.println("- SIN REPETIR ["+vecNew[c]+"]");
        }
    }

}