
package tarea2;

import java.util.ArrayList;


public class DepositoVuelto {
     private ArrayList<Moneda100> al;
    public DepositoVuelto(){
        al = new ArrayList<Moneda>();
    }
    public void addMoneda(){
        al.add(new Moneda100());
    }
    public Moneda100 getMoneda(){
        if(al.size()==0){
            return null;
        }
        return al.remove(0);
    }
    public int getSize(){
        return al.size();
    }
}
