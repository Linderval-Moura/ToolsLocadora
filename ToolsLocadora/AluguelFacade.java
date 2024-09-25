package ToolsLocadora;

public class AluguelFacade {
	private PrecoStrategy strategy;

    public AluguelFacade(PrecoStrategy strategy) {
        this.strategy = strategy;
    }

    public double rentTool(Ferramenta ferramenta, int dias) {
        return strategy.calculatePrice(ferramenta, dias);
    }
}
