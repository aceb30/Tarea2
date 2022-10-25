package tarea2;

public class Expendedor {

    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto depvuel;
    private int precio;

    public Expendedor(int cant, int pre) {
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        for (int i = 0; i < cant; ++i) {
            sprite.addBebida(new Sprite(i + 200));
            coca.addBebida(new CocaCola(i + 100));
            fanta.addBebida(new Fanta(i + 100));
        }
    }

    public Bebida comprarBebida(Moneda m, int tipo) throws NoHayBebidaException {
        Bebida b = null;
        switch(tipo) {
            case 1:
                b = coca.getBebida();
                break;
            case 2:
                b = sprite.getBebida();
                break;
            case 3:
                b = fanta.getBebida();
                break;
        }
        if(b != null) return b;
        throw new NoHayBebidaException("No hay bebida");
    }
}
