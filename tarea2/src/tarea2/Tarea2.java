
package tarea2;

import java.util.*;

abstract class Bebida{
    
    private int serie;
    
    public Bebida(int s){
        serie = s;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
}

class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "sprite";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
}
class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "fanta";
    }
}

class Deposito{
    private ArrayList<Bebida> al;
    public Deposito(){
        al = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        al.add(b);
    }
    public Bebida getBebida(){
        if(al.size()==0){
            return null;
        }
        return al.remove(0);
    }
}

abstract class Moneda{
    public Moneda(){
        
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        
    }
}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        
    }
}


class DepositoVuelto{
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

class NoHayBebidaException extends Exception{
    public NoHayBebidaException(String message){
        super(message);
    }
}

class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String message){
        super(message);
    }
}

class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String message){
        super(message);
    }
}

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private int precio;
    public Expendedor(int cant, int pre){
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        for(int i=0; i<cant; ++i){
            sprite.addBebida(new Sprite(i+200));
            coca.addBebida(new CocaCola(i+100));
            fanta.addBebida(new Fanta (i+100));
        }
    }
    public Bebida comprarBebida(Moneda m, int tipo){
        
        if(tipo == 1){
            return coca.getBebida();
        }
        if(tipo == 2){
            return sprite.getBebida();
        }
        if(tipo == 3){
            return fanta.getBebida();
        }
        if(tipo != 1 & tipo != 2 & tipo != 3){
            return null;
        }     
        return null;
    }
}

class Comprador{
    private Moneda mon;
    private int bebida;
    private Expendedor expen;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        mon = m;
        bebida = cualBebida;
        expen = exp;
    }
}



public class Tarea2 {

   
    public static void main(String[] args) {
       
    }
    
}
