package ToolsLocadora.Facade;

import ToolsLocadora.Ferramenta;
import ToolsLocadora.Strategy.PrecoStrategy;

public class AluguelFacade {
	private PrecoStrategy strategy;

    public AluguelFacade(PrecoStrategy strategy) {
        this.strategy = strategy;
    }

    public double rentTool(Ferramenta ferramenta, int dias) {
        return strategy.calculatePrice(ferramenta, dias);
    }
}
