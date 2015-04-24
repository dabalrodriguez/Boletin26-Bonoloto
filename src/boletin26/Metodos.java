

package boletin26;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Metodos {
    
    private static int [] sorteo=new int[6];
    private static int [] elegidos = new int [6];
    
    
   public static void aleatorio(JTextField[]casillas){
      
       Random obx = new Random();
       
       for (int i = 0; i < sorteo.length; i++) {
           boolean repetido;
           do {
               sorteo[i]= obx.nextInt(49)+1;
               repetido=false;
               for (int j = 0; j < i; j++) {
                   if (sorteo[j]==sorteo[i]) {
                       repetido=true;
                       break;
                   }
               }
           } while (repetido);
           casillas[i].setText(Integer.toString(sorteo[i]));
       }
      
       
     int aciertos=0;
       for (int i = 0; i < sorteo.length; i++) {
           for (int j = 0; j < elegidos.length; j++) {
               if (sorteo[i]==elegidos[j]) {
                   aciertos++;
                   break;
               }
           }
       }
        JOptionPane.showMessageDialog(null, "Has acertado " + aciertos);
   }
  
       
   }
           
       
  

