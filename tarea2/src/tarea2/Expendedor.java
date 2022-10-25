
package tarea2;


public class Expendedor {
     private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto depvuel;
    private int precio;
    public Expendedor(int cant, int pre){
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        for(int i=0; i<cant; ++i){
            sprite.addBebida(new Sprite(i+200));
            coca.addBebida(new CocaCola(i+100));
            fanta.addBebida(new Fanta (i+100));
        }
    }
    public Bebida comprarBebida(Moneda m, int tipo){
        
        if(tipo == 1){
            return coca.getBebida();
        }
        if(tipo == 2){
            return sprite.getBebida();
        }
        if(tipo == 3){
            return fanta.getBebida();
        }
        if(tipo != 1 & tipo != 2 & tipo != 3){
            return null;
        }     
        return null;
    }
}
