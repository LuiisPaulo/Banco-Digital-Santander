public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente clients){
        super(clients);
    }

    public void imprimeExtract(){
        System.out.println(" ---- Extract ---- ");
        super.imprimeExtract();
    }
}