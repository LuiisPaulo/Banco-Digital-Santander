package BancoDigital;

public interface ITConta {
  void saque(double valor);

  void deposito(double valor);

  void trasferir(double valor, ITConta contaDestino);

  void imprimirExtrato();
}
