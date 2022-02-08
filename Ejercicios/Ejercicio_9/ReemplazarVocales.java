package Ejercicio_9;

import javax.swing.*;

public class ReemplazarVocales {

    public void amosarReemplazo(){
        String texto = "Jeve jeve jeve";
        JOptionPane.showMessageDialog(null, texto);
        String textoReemplazado;
        textoReemplazado = texto.replace('e','a');
        JOptionPane.showMessageDialog(null, " Texto reemplazado --> " + textoReemplazado);

    }
}
