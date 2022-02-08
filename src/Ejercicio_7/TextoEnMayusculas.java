package Ejercicio_7;

import javax.swing.*;
import java.util.Locale;

public class TextoEnMayusculas {
    public void amosarTextoEnMayusculas(){
        String texto = " javeros ";
        JOptionPane.showMessageDialog(null, "Texto en mayúsculas --> " + texto.toUpperCase(Locale.ROOT));

        JOptionPane.showMessageDialog(null," Ahora se volverá a transformar el texto en minúsculas -->" +texto.toLowerCase(Locale.ROOT));



    }
}
