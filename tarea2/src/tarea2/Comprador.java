
package tarea2;


public class Comprador {
    private Moneda mon;
    private int bebida;
    private Expendedor expen;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        mon = m;
        bebida = cualBebida;
        expen = exp;
    }
}
