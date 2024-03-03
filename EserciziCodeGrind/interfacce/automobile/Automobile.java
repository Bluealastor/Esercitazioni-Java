package EserciziCodeGrind.interfacce.automobile;

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
