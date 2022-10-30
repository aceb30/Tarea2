package tarea2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea2 {

    // TODO: Handle these
    public static void main(String[] args){

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;

        Expendedor expendedor = new Expendedor(5, 800);

        Comprador furry;
        try {
            furry = new Comprador(m3, 1, expendedor);

            System.out.println(furry.getVuelto());
            System.out.println(furry.getVuelto());
            System.out.println(furry.getVuelto());
            System.out.println(furry.getVuelto());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
