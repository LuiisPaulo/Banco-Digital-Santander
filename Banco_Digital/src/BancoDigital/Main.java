package BancoDigital;

public class Main {
  public static void main(String[] args) {
    Cliente luisPaulo = new Cliente();
    Conta cc = new ContaCorrente(luisPaulo);
    Conta poupanca = new ContaPoupanca(luisPaulo);

    luisPaulo.setName("Luis Paulo");

    cc.deposito(1000);
    cc.trasferir(500, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
