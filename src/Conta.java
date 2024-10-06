public abstract class Conta {
    private int numeroAgencia;
    private int numeroConta;
    private String tipoConta;
    protected double saldo;
    private String nomeTitular;
    private static int quantidadeContas;

    public Conta(int agencia, int conta, String tipo, double saldo, String titular) {
        this.numeroAgencia = agencia;
        this.numeroConta = conta;
        this.tipoConta = tipo;
        this.saldo = saldo;
        this.nomeTitular = titular;
        Conta.quantidadeContas++;
    }

    public abstract void depositar(double valor);

    public  boolean sacar(double valor){
        if(this.saldo>=valor && valor>0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }


    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public static int getQuantidadeContas() {
        return quantidadeContas;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
