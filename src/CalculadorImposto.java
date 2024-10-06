public class CalculadorImposto implements Tributavel{
    private double totalImposto;

    public void registraImposto(Tributavel t){
        this.totalImposto += t.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    @Override
    public double getValorImposto() {
        return this.totalImposto;
    }
}
