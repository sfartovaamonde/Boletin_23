package com.dam1;

import javax.swing.*;

public class StringLength {

    public void amosarLongitud() {
        String texto = JOptionPane.showInputDialog(" Introduce un texto ");
        JOptionPane.showMessageDialog(null," Texto --> " + texto);
        JOptionPane.showMessageDialog(null, " La longitud del texto es de " + texto.length() + " caracteres ");
    }
}
