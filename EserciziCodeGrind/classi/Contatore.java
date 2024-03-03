package EserciziCodeGrind.classi;

public class Contatore {

    private int numero;

    public Contatore(){}
    public Contatore(int numero){
        this.numero = numero;
    }


    public int incrementoNumero(){
        return ++numero;
    }

    public int decrementoNumero(){
     return --numero;
    }

    public int getNumero(){
        return this.numero;
    }



    public static void main(String[] args){
        Contatore contatore1 = new Contatore();

        System.out.println(contatore1.incrementoNumero());
        contatore1.incrementoNumero();
        contatore1.incrementoNumero();
        contatore1.incrementoNumero();
        contatore1.incrementoNumero();

        System.out.println("---------------------");

        System.out.println(contatore1.decrementoNumero());
        contatore1.decrementoNumero();

        System.out.println("---------------------");
        int valoreFinale = contatore1.getNumero();

        System.out.println(valoreFinale);

    }


}
