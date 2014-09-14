/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.util;

/**
 *
 * @author eduardo
 */
public class checkPass {
    
    public boolean verificarPass(char passArray[]){
    
    for(int i=0; i<passArray.length; i++){
    char c= passArray[i];
    // verificar que sea letra o numero
    if(!Character.isLetterOrDigit(c)){
    return false;
    
    }
    }
        return true;
    }
    
}
