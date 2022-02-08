package Ejercicio_10;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class Ascii {
    public void amosarCodigoAscii(){

        String texto = " ABCD ";
        byte[] bytes = texto.getBytes(StandardCharsets.US_ASCII);
        JOptionPane.showMessageDialog(null , " EL VALOR ASCII DE " + texto + " ES :" + "\n" + bytes[0]);

    }
}
