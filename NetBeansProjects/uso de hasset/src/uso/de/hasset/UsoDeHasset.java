/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uso.de.hasset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author eduardo
 */
public class UsoDeHasset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    UsoDeHasset erase = new UsoDeHasset();
    
    }
private ArrayList<Datos> datos;
	private ArrayList<String> cadenas;
	
	public UsoDeHasset(){
		
		cadenas = new ArrayList<String>();
		cadenas.add("hola");
		cadenas.add("hola");
		cadenas.add("hola");
		cadenas.add("eduardo");
		cadenas.add("jose");
		cadenas.add("jose");
		
		HashSet<String> hashSet = new HashSet<String>(cadenas);
		cadenas.clear();
		cadenas.addAll(hashSet);
		
		for(int i=0; i<cadenas.size();i++) {
			System.out.println(cadenas.get(i));
		}
		
		
        }
}
