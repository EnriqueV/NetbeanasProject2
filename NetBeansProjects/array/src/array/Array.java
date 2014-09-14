/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author eduardo
 */
public class Array {
    public static void main(String[] args) {
       
        int areglo []= {5,3,2,4,6,8};
        int aux;
        boolean cambio;
        while(true){
            cambio=false;
        for(int i= 1; i< areglo.length;i++){
        if(areglo[i]<areglo[i-1]){
        aux= areglo[i];
        areglo[i-1]= aux;
        cambio= true;
        
        }
        
        }
        if(cambio==false)
        break;
        }
        for(int i=0; i< areglo.length; i++){
        System.out.println("areglo ordenado");
        System.out.println("================");
            System.out.println(areglo[i]);
        
        
        }
        }
    }
    
    

