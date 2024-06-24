public abstract class Conta implements ITConta {
    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance; // saldo
    protected Cliente client;

    public Conta(Cliente client){
        this.agency = Conta.AGENCY_DEFAULT;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    public void sacar(double value){
        balance -= value;
    }

    public void depositar(double value){
        balance += value;
    }

    public void transferir(double value, ITConta contDestiny){
        this.sacar(value);
        contDestiny.depositar(value);
    }

    public int getAgency(){
        return agency;
    }

    public int getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    protected void imprimirInfos(){
        System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Numero: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
	}
}
