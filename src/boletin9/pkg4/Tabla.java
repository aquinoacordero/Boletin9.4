package boletin9.pkg4;

import javax.swing.JOptionPane;

public class Tabla {

    public Tabla() {

    }
     //Aitor mariquitilla
    public int pedirDato() {
        String d = JOptionPane.showInputDialog("Introduzca un numero por favor: ");
        int dato = Integer.parseInt(d);
        return dato;
    }

    public void tablaMult(int dato) {
        int i;
        String tabla="";
        for (i = 1; i <= 10; i++) {
            tabla =tabla + dato + " x " + i + " = " + (dato*i )+ "\n" ;
            //JOptionPane.showMessageDialog(null, "Resultado:\n" + tabla);
        }
       JOptionPane.showMessageDialog(null, "Resultado:\n" + tabla);
    }
}

