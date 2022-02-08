package Ejercicio_6;

import javax.swing.*;

public class TextoEnPartes {
    public void amosarTextoEnPartes(){

        String texto = " www. java,,desde0. com ";
        JOptionPane.showMessageDialog(null, " Texto --> " + texto);
        String[] split = texto.split(",");
        for (int i=0; i<split.length; i++)
            JOptionPane.showMessageDialog(null, split[i]);


    }

}
