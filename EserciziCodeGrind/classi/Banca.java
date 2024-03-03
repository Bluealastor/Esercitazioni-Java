package EserciziCodeGrind.classi;

public class Banca {

    private int saldo;

    public Banca(){};

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }


    public void infoConto(){
        System.out.println("nel conto hai: " + saldo);
    }

    public void depositare(int deposito){
        this.saldo += deposito;
    }

    public void prelevare(int prelievo){
        if(this.saldo >= prelievo){
            this.saldo -= prelievo;
            System.out.println("Adesoo hai nel conto: " + this.saldo);
        }else {
            System.out.println("Non hai abbastanza saldo nel conto");
        }
    }


    public static void main(String[] args){
        Banca utente1 = new Banca();

        utente1.infoConto();

        utente1.depositare(20);
        utente1.infoConto();
        utente1.prelevare(5);
        utente1.prelevare(15);
        utente1.infoConto();


    }

}
