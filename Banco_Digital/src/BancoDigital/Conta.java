package BancoDigital;

public abstract class Conta implements ITConta {
  private static final int AGENCY_DEFAULT = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected Cliente cliente;
  protected double saldo;

  // Criando o construtor 
  public Conta(Cliente cliente) {
    this.agencia = agencia;
    this.numero = numero;
    this.cliente = cliente;
    this.saldo = saldo;
  }

  // Get(s)
  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void saque(double valor){
    saldo -= valor;
  }

  public void deposito(double valor){
    saldo += valor;
  }

  public void trasferir(double valor, ITConta contaDestino){
    this.saque(valor);
    contaDestino.deposito(valor);
  }

  public void imprimirInformações(){
    System.out.println(String.format("Titular", this.cliente.getName()));
    
    System.out.println(String.format("Numero", this.numero));
    
    System.out.println(String.format("Agencia", this.agencia));
    
    System.out.println(String.format("Saldo: %.2f", this.saldo));

  }

}
