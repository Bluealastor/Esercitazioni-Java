package EserciziCodeGrind.classi.ereditarieta.veicolo;

public class Auto  extends Veicolo{

    private String modello;

    public Auto(){};

    public String getModello(){
        return this.modello;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void infoModello(){
        System.out.println("Il modello dell'auto è: " + modello);
    }

    public static void main(String[] args){

        Auto auto1 = new Auto();
        auto1.setModello("Classe A");
        auto1.setMarca("Mercedes");

        auto1.infoVeicolo();
        auto1.infoModello();


    }

}
