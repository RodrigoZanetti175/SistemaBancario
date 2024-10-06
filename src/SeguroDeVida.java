public class SeguroDeVida implements Tributavel{
    private double valor;
    private String titular;
    private int numeroApolice;

    public SeguroDeVida(double valor, String titular, int numeroApolice) {
        this.valor = valor;
        this.titular = titular;
        this.numeroApolice = numeroApolice;
    }

    @Override
    public double getValorImposto() {
        return 42;
    }
}
