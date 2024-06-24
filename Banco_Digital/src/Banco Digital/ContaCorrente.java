public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente client){
        super(client);
    }

    public void imprimirExtract(){
        System.out.println(" --- Extract --- ");
        super.imprimirExtract();
    }
}