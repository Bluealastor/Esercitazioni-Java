package EserciziCodeGrind.interfacce;

import java.security.AuthProvider;

public class Automobile implements Movable {

    @Override
    public void move() {
        System.out.println("L'automobile si sta muovendo");
    }

    public static void main(String[] args){

        Automobile automobile1 = new Automobile();
        automobile1.move();

    }
}
