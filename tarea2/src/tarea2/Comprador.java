
package tarea2;


public class Comprador {
    private Moneda mon;
    private int bebida;
    private Expendedor expen;
    private String sabor;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp)throws NoHayBebidaException{
        mon = m;
        bebida = cualBebida;
        sabor = exp.comprarBebida(m, cualBebida).beber();
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
