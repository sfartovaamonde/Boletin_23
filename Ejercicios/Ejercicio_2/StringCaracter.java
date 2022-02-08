package Ejercicio_2;

import javax.swing.*;

public class StringCaracter {

public void amosarCaracteres(){
    String palabra = "Java";
    char[]caracteres = palabra.toCharArray();
    for (int i=0; i< caracteres.length;i++){
        JOptionPane.showMessageDialog(null, " El caracter " + i + " es " + caracteres[i]);
    }



}

}
