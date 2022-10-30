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
    public Moneda getVuelto(){
        return depvuel.getMoneda();
    }
    public int getSize(){
        return depvuel.getSize();
    }
    public void AddVuelto(Moneda m){
        depvuel.addMoneda(m);
    }
    
    public Bebida comprarBebida(Moneda m, int tipo) throws NoHayBebidaException {
        
        Bebida b = null;
        
        int dinero = m.getValor();
        System.out.println(dinero);
        System.out.println("-----");
        
        if(dinero>precio){
            
            vuelto = dinero - precio;
        }
        
        if (dinero>=precio) {
            
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
        }
        
        if(b != null){
            
            if(vuelto > 0){
                
                for(int i = 0; i < (vuelto / 100); ++i){                                                           
                    
                    m=null;
                    AddVuelto(m);
                    System.out.println("---");
               } 
            }
            return b;
        }
        
        else{
                   
            throw new NoHayBebidaException("No hay bebida");
        }
            
            
    }
}
