package EserciziCodeGrind.classi;

public class Libro {
    private String titolo;
    private String autore;
    private int annoDiPublicazione;

    public Libro(){}
    public Libro(String titolo,String autore, int annoDiPublicazione){
        this.titolo = titolo;
        this.autore = autore;
        this.annoDiPublicazione = annoDiPublicazione;
    }

    public Libro(String titolo , int annoDiPublicazione){
        this.titolo = titolo;
        this.annoDiPublicazione = annoDiPublicazione;
    }

    public Libro(String autore){
        this.autore = autore;
    }

    public String getTitolo(){
        return this.titolo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public  String getAutore(){
        return this.autore;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public int getAnnoDiPublicazione(){
        return this.annoDiPublicazione;
    }

    public void setAnnoDiPublicazione(int annoDiPublicazione){
        this.annoDiPublicazione = annoDiPublicazione;
    }


    public void infoLibro(){
        System.out.println("Il nome del libro è: " + getTitolo());
        System.out.println("L'autore del libro è: " + getAutore());
        System.out.println("L'anno di publicazione:  " + getAnnoDiPublicazione());

    }

    public static void main(String[] args){
        Libro libro1 = new Libro("Harry Potter e la pietra filosofale", "J.K. Rowling", 1997);
        libro1.infoLibro();

        System.out.println("-----------------------------");
        Libro libro2 = new Libro();
        libro2.setAutore("J.K. Rowling");
        libro2.setTitolo("Harry Potter e la pietra filosofale");
        libro2.setAnnoDiPublicazione(1998);
        libro2.infoLibro();


    }


}
