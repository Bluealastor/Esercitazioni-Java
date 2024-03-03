package EserciziCodeGrind.classi.polimorfismo;

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