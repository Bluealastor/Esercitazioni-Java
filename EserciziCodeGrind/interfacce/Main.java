package EserciziCodeGrind.interfacce;

import EserciziCodeGrind.interfacce.automobile.Automobile;
import EserciziCodeGrind.interfacce.figure.Quadrato;

public class Main {

    public static void main(String[] args){
        Automobile auto1 = new Automobile();
        Quadrato quadrato1 = new Quadrato();

        auto1.move();

        System.out.println("---------------------");

        quadrato1.disegrare();
        quadrato1.move();

    }
}
