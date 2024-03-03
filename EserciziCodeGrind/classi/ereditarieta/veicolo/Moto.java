package EserciziCodeGrind.classi.ereditarieta.veicolo;

public class Moto extends Veicolo{

    private int cilindrata;

    public Moto(){}
    public int getCilindrata(){
        return this.cilindrata;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public void mostraCilindrata(){
        System.out.println("La cilindrata della moto è: " + this.cilindrata);
    }

    public static void main(String[] args){

        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setCilindrata(650);

        moto1.infoVeicolo();
        moto1.mostraCilindrata();


    }

}
