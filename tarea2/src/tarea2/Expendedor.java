package tarea2;

public class Expendedor {

    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto depvuel;
    private int precio;
    private int vuelto;

    public Expendedor(int cant, int pre) {
        vuelto = 0;
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        depvuel = new DepositoVuelto();
        for (int i = 0; i < cant; ++i) {
            sprite.addBebida(new Sprite(i + 200));
            coca.addBebida(new CocaCola(i + 100));
            fanta.addBebida(new Fanta(i + 100));
        }
    }

    public Moneda getVuelto() {
        return depvuel.getMoneda();
    }

    public int getSize() {
        return depvuel.getSize();
    }

    public void AddVuelto() {
        depvuel.addMoneda();
    }

    public Bebida comprarBebida(Moneda m, int tipo) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        Bebida b = null;
        if(m == null) {
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        int dinero = m.getValor();
        if (dinero >= precio) {
            vuelto = dinero - precio;
        } else {
            throw new PagoInsuficienteException("Pago insuficiente");
        }
        switch (tipo) {

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
        }

        if (b != null) {
            if (vuelto > 0) {
                for (int i = 0; i < (vuelto / 100); ++i) {
                    AddVuelto();
                }
            }
            return b;
        }
        
        else{
                   
            throw new NoHayBebidaException("No hay bebida");
        }
            
            

}
