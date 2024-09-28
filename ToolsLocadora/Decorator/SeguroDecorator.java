package ToolsLocadora.Decorator;

public class SeguroDecorator extends AluguelDecorator{
	
    public SeguroDecorator(AluguelComponente aluguelComponente) {
        super(aluguelComponente);
    }

    @Override
    public double getCusto() {
        return aluguelComponente.getCusto() + 15.0;  // Custo fixo do seguro
    }

    @Override
    public String getDescricao() {
        return aluguelComponente.getDescricao() + " + Seguro";
    }
}
