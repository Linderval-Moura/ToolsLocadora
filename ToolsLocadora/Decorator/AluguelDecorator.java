package ToolsLocadora.Decorator;

/*
 * Classe para implementar o padrão Decorator
 */
abstract class AluguelDecorator extends AluguelComponente{
	
	protected AluguelComponente aluguelComponente;

    public AluguelDecorator(AluguelComponente aluguelComponente) {
        super(aluguelComponente.ferramenta, aluguelComponente.dias);
        this.aluguelComponente = aluguelComponente;
    }

    @Override
    public abstract String getDescricao();
}
