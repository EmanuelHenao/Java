package taller9genericclass;

import java.util.ArrayList;

public class In<t> {

    ArrayList<t> bolsa = new ArrayList<t>();

    public In() {
    }

    public void add(t a) {
        this.bolsa.add(a);
        tipoDate(a);
    }
    
    private void tipoDate(t a){
        if( a instanceof String)System.out.println(a+" Es String");
        if( a instanceof Integer)System.out.println(a+" Es Integer");
        if( a instanceof Double)System.out.println(a +" Es Double");
        if( a instanceof Float)System.out.println(a+" Es Float");
        if( a instanceof Boolean)System.out.println(a+" Es Boleean");
    }
    
}
