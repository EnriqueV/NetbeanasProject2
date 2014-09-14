/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor_numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Mayor_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2,n3;
        String a,b,c;
        
        JOptionPane.showMessageDialog(null,"Bienvenido");
        a= JOptionPane.showInputDialog(null,"ingrese el primer numero");
        n1= Double.parseDouble(a);
        b= JOptionPane.showInputDialog(null,"ingrese el primer numero");
        n2= Double.parseDouble(b);
        c= JOptionPane.showInputDialog(null,"ingrese el primer numero");
        n3= Double.parseDouble(c);
        if (n1>n2)
            if(n1>n3)
                JOptionPane.showMessageDialog(null,"El mayor es:"+n1);
        else
              JOptionPane.showMessageDialog(null,"El mayor es:"+n3);
        else if(n2>n3)

                JOptionPane.showMessageDialog(null,"El mayor es:"+n2);
                  else
               JOptionPane.showMessageDialog(null,"El mayor es:"+n3);

             
             
    }
}
