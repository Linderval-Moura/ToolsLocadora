package ToolsLocadora.Strategy;

import ToolsLocadora.Ferramenta;

/*
 * Interface para implementar o padrão Strategy
 */
public interface PrecoStrategy {
	double calculaPreco(Ferramenta ferramenta, int dias);
}
