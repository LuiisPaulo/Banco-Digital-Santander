//package Banco-Digital-Santander.Banco_Digital.src;

public class Conta {
  private static final int AGENCY_DEFAULT = 1;
  private static int SEQUENTIAL = 1;

  protected int agency;
  protected int number;
  protected double balance;
  protected Cliente client;

  public Conta(Cliente cliente){
    this.agency = Conta.AGENCY_DEFAULT;
    this.number = SEQUENTIAL++;
    this.client = client;
  }

  public void sacar(double value){
    balance -= value;
  }

  public void depositar(double value){
    balance += value;
  }

  public void transferir(double value, ITConta contdestiny){
    this.sacar(value);
    contdestiny.depositar(value);
  }

  public int getAgency() {
    return agency;
  }

  public int getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  protected void imprimir(){
    System.out.println(String.format("Titular: ", this.client.getName()));
    
    System.out.println(String.format("Agencia ", this.agency));
    
    System.out.println(String.format("Numero: ", this.number));
    
    System.out.println(String.format("Saldo: %2.f ", this.balance));
  }


}
