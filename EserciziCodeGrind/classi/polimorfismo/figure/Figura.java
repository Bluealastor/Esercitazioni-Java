package EserciziCodeGrind.classi.polimorfismo.figure;

public class Figura {
    public int calcolaArea() {
        return 0;
    }


    public static void main(String[] args) {
        Figura figura = new Figura();
        int area = figura.calcolaArea();
        System.out.println("Area: " + area);
    }
}