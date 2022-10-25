
package tarea2;


abstract class Moneda{
    
    //int valor;
    //private String serie;
    
    public Moneda(){
        
    }
    
    public String getSerie(){
        return this.toString();
    }
    
    public abstract int getValor();
}
