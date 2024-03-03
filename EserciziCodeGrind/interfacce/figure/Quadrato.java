package EserciziCodeGrind.interfacce.figure;

import EserciziCodeGrind.interfacce.automobile.Movable;

public class Quadrato implements Drawable, Movable {

    @Override
    public void disegrare() {
        System.out.println("Sto disegnando un quadrato");
    }
    @Override
    public void move() {
        System.out.println("il Quadrato si sta muovendo");
    }

}
