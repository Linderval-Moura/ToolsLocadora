package ToolsLocadora;

public class SeguroDecorator extends AluguelDecorator{
    public SeguroDecorator(Aluguel aluguel) {
        super(aluguel);
    }

    @Override
    public double getCusto() {
        return aluguel.getCusto() + 15.0;  // Custo fixo do seguro
    }

    @Override
    public String getDescricao() {
        return aluguel.getDescricao() + " + Seguro";
    }
}
