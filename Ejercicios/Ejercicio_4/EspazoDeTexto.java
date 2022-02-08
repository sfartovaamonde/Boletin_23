package Ejercicio_4;

import javax.swing.*;

public class EspazoDeTexto {
    public void nonAmosarEspazos() {
        String texto = " James Gosling Created Xava ";
        JOptionPane.showMessageDialog(null, " Texto normal sen modificacións --> " + texto);

        String result = texto.replaceAll("\\s+","");
        JOptionPane.showMessageDialog(null, " Texto sin espazos --> " + result);
    }

}
