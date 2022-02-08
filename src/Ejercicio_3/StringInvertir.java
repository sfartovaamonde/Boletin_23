package Ejercicio_3;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;

public class StringInvertir {
    public void amosarTextoInvertido() {

        String texto = " Java desde 0";
        JOptionPane.showMessageDialog(null, texto);
        /*String textoInvertido="";


        for (int i = texto.length() - 1; i >= 0; i--)
            textoInvertido = texto + texto.charAt(i);
        JOptionPane.showMessageDialog(null, " El texto invertido es : " + textoInvertido);*/
        StringBuilder textoInvertido = new StringBuilder(texto);
        texto = textoInvertido.reverse().toString();
        JOptionPane.showMessageDialog(null, " O texto invertido sería --> " + texto );



    }









}
