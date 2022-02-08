package Ejercicio_8;

import javax.swing.*;

public class CompararTexto {

    public void amosarComparacion(){
        String texto1="Java";
        JOptionPane.showMessageDialog(null ," Texto 1 ==> " + texto1);
        String texto2="JavaScript";
        JOptionPane.showMessageDialog(null ," Texto 2 ==> " + texto2);

        JOptionPane.showMessageDialog(null, " ¿Son el primer texto y el segundo iguales? ");
        if ( texto1.equals(texto2)){
            JOptionPane.showMessageDialog(null, "Sí! " + "\n" + texto1 + " y " + texto2 + " son iguales ");
        }
        else JOptionPane.showMessageDialog(null, "No! " + "\n" + texto1 + " y " + texto2 + " son diferentes ");
    }
}
