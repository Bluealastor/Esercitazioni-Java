package EserciziCodeGrind.classi.ereditarieta.veicolo;

public class Veicolo {

    private String marca;

    public Veicolo(){};

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }


    public void infoVeicolo(){
        System.out.println("La marca del veicolo è: " + marca);
    }



}
