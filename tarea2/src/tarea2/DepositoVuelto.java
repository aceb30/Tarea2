
package tarea2;

import java.util.ArrayList;


public class DepositoVuelto {
     private ArrayList<Moneda> al;
    public DepositoVuelto(){
        al = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda b){
        al.add(b);
    }
    public Moneda getMoneda(){
        if(al.size()==0){
            return null;
        }
        return al.remove(0);
    }
}
