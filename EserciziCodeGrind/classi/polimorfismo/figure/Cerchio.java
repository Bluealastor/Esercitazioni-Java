package EserciziCodeGrind.classi.polimorfismo;

import java.util.PrimitiveIterator;

public class Cerchio extends Figura{

    private final float PI_GRECO= 3.14f;
    private int raggio;

    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    @Override
    public int calcolaArea(){
        return (int) PI_GRECO * (raggio * raggio);
    }

    public static void main(String[] args) {
        Cerchio cerchio1 = new Cerchio(6);
        System.out.println(cerchio1.calcolaArea());
    }





}
