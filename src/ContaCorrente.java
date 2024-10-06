public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int conta, String tipo, double saldo, String titular) {
        super(agencia, conta, tipo, saldo, titular);
    }

    public void depositar(double valor){
        if(valor > 0)
            this.saldo += valor;
        else
            System.out.println("Valor inválido");
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.20;
        if(super.sacar(valor+taxa))
            return true;
        return false;
    }
}
