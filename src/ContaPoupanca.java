public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int conta, String tipo, double saldo, String titular) {
        super(agencia, conta, tipo, saldo, titular);
    }

    public void depositar(double valor){
        if(valor > 0)
            this.saldo += valor;
        else
            System.out.println("Valor inválido");
    }
}
