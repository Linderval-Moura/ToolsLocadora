package ToolsLocadora;

public class AccessorioDecorator extends AluguelDecorator{
	public AccessorioDecorator(Aluguel aluguel) {
        super(aluguel);
    }

    @Override
    public double getCusto() {
        return aluguel.getCusto() + 10.0;  // Custo fixo por acessório
    }

    @Override
    public String getDescricao() {
        return aluguel.getDescricao() + " + Accessorio";
    }
}
