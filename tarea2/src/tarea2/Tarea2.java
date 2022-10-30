package tarea2;


public class Tarea2 {

    public static void main(String[] args) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {        
        
        Moneda m1 = new Moneda100();        
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;
        
        Expendedor expendedor = new Expendedor(5, 800);        
        
        Comprador furry = new Comprador(m3, 1 , expendedor);
        
        System.out.println(furry.getVuelto());
        System.out.println(furry.getVuelto());
        System.out.println(furry.getVuelto());
        System.out.println(furry.getVuelto());
        
        
        //Comprador bastian = new Comprador(m2, 2 , expendedor);        
        //Comprador alex = new Comprador(m3, 3 , expendedor);
        
             

        
        
        

 
        
        //System.out.println(expendedor.comprarBebida(m2, 1));
        //System.out.println(bastian.getVuelto());
    }

}
