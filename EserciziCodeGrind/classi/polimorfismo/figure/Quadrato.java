package EserciziCodeGrind.classi.polimorfismo.figure;

public class Quadrato extends Figura {

    private int lato;

    public Quadrato(){}

    public int getLato(){
        return lato;
    }

    public void setLato(int lato){
        this.lato = lato;
    }

    @Override
    public int calcolaArea() {
        return lato * lato;
    }

    public static void main(String[] args) {
        Quadrato quadrato1 = new Quadrato();
        quadrato1.setLato(3);
        System.out.println("L'Area del quadrato è di: " + quadrato1.calcolaArea());

    }
}
