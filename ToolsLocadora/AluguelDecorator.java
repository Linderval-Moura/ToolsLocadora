package ToolsLocadora;

abstract class AluguelDecorator extends Aluguel{
	protected Aluguel aluguel;

    public AluguelDecorator(Aluguel aluguel) {
        super(aluguel.ferramenta, aluguel.dias);
        this.aluguel = aluguel;
    }

    @Override
    public abstract String getDescricao();
}
