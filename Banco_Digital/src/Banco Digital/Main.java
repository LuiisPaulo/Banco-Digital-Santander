public void Main {
    public static void main(String[] args){
        Cliente luis = new Cliente();
        luis.setNome("Luis Paulo");

        Conta cc = new ContaCorrente(luis);
        Conta poupanca = new ContaPoupanca(luis);

        cc.deposit(3000);
        cc.transfer(100, poupanca);

        cc.imprimiExtract();
        poupanca.imprimiExtract();
    }
}