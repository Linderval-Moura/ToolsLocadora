package ToolsLocadora.Decorator;

public class AccessorioDecorator extends AluguelDecorator{
	
	public AccessorioDecorator(AluguelComponente aluguelComponente) {
        super(aluguelComponente);
    }

    @Override
    public double getCusto() {
        return aluguelComponente.getCusto() + 10.0;  // Custo fixo por acessório
    }

    @Override
    public String getDescricao() {
        return aluguelComponente.getDescricao() + " + Accessórios";
    }
}
