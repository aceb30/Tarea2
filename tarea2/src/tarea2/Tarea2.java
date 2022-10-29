package tarea2;


public class Tarea2 {

    public static void main(String[] args) {        
        
        Moneda m1 = new Moneda500();        
        Moneda m2 = new Moneda1000();
        Moneda m3 = new Moneda1500();
        Moneda n = null;
        
        Expendedor expendedor = new Expendedor(5, 1000);
        
        Comprador pedro = new Comprador(m1, 1 , expendedor);
        Comprador bastian = new Comprador(m2, 2 , expendedor);
        Comprador alex = new Comprador(m3, 3 , expendedor);
                       
        
        
    }

}
