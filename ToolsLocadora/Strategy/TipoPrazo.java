package ToolsLocadora.Strategy;

/*
 * Classe para ajudar a implementar o padrão Strategy
 */
public enum TipoPrazo {
	CURTO_PRAZO(new CurtoPrazoStrategy()),
    LONGO_PRAZO(new LongoPrazoStrategy());

    private PrecoStrategy strategy;

    TipoPrazo(PrecoStrategy strategy) {
        this.strategy = strategy;
    }

    public PrecoStrategy getStrategy() {
        return strategy;
    }
}
