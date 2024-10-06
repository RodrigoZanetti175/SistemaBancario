public class CalculadorImposto implements Tributavel{
    private double totalImposto;

    public void registraImposto(Tributavel t){
        this.totalImposto += t.getValorImposto();
    }

    @Override
    public double getValorImposto() {
        return this.totalImposto;
    }
}
