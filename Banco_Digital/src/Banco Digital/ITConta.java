public interface ITConta {
    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, ITConta contDestiny);

    void imprimiExtract();
}