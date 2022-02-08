package Ejercicio_5;

import javax.swing.*;
import java.util.Locale;

public class VocalesYConsonantes {

    public void amosarVocalesYConsonantes(){
        String texto="java java java";
        int vcount=0, ccount=0;

        texto = texto.toLowerCase(Locale.ROOT);
        for (int i=0; i < texto.length();i++){
            char ch = texto.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vcount++;
            }
            else if ((ch >='a' && ch <='z')){
                ccount++;
            }

        }
        JOptionPane.showMessageDialog(null, " Texto ==> " + texto);
        JOptionPane.showMessageDialog(null, " Número de vocales ==> " + vcount + "\n" + " Número de consonantes ==> " +ccount);
    }
}
