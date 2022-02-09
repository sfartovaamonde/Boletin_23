package Ejercicio_11;

import javax.swing.*;
import java.util.Locale;

public class Calculo {
    public void amosarCalculo() {
        String cadena = "Ola, son alumno de DAM1, e son programador desde o 2021";
        JOptionPane.showMessageDialog(null, cadena);


        int vcount = 0, ccount = 0;
        int digitos=0;

        int calculo=0;
        int espacios=0;

        cadena = cadena.toLowerCase(Locale.ROOT);


        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
            calculo = vcount + ccount;

        }
        for ( int i=0; i < cadena.length();i++){
            char ch = cadena.charAt(i);
            if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0') {
                digitos ++;
            }



        }
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') espacios++;
        }
        JOptionPane.showMessageDialog(null, " Número de letras : " + calculo + "\n" + " Número de dígitos : " + digitos + "\n" + " Número de espacios en blanco : " + espacios);


    }


}
