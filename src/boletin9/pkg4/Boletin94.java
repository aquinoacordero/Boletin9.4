
package boletin9.pkg4;


public class Boletin94 {

    public static void main(String[] args) {
        Tabla obj=new Tabla();
        int x;
        do{
        x=obj.pedirDato();
        if (x != 0)
        obj.tablaMult(x);
        }while(x != 0);
    }
 }

