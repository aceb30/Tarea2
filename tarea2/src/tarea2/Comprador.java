
package tarea2;


public class Comprador {   
    
    private int bebida;    
    private String sabor;
    private int vuelto=0;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp)throws NoHayBebidaException{
        
        vuelto = 0;
        
        if(exp.getSize()!=0){
            
            while(exp.getVuelto() != null){
                
                vuelto = vuelto + exp.getVuelto().getValor();                
            }
        }        
    }
    
    public int getVuelto(){
            return vuelto;
    }
    
    public String getSabor(){
        return sabor;
    }
}
