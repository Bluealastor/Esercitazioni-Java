package EserciziCodeGrind.classi;

public class Calcolatrice {

    public Calcolatrice(){};

    public int somma(int a, int b){
        return a+b;
    }


    public int sottrazione(int a, int b){
        return a-b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int divisione(int a, int b){
        return a/b;
    }


    public static void main(String[] args){
        Calcolatrice calcolatrice = new Calcolatrice();

        int somma = calcolatrice.somma(5, 3);
        int sottrazione = calcolatrice.sottrazione(5, 3);
        int moltiplicazione = calcolatrice.moltiplicazione(5, 3);
        int divisione = calcolatrice.divisione(5, 3);

        System.out.println("Somma: " + somma);
        System.out.println("Sottrazione: " + sottrazione);
        System.out.println("Moltiplicazione: " + moltiplicazione);
        System.out.println("Divisione: " + divisione);
    }



}
