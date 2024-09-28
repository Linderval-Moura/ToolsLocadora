package ToolsLocadora.Strategy;

import ToolsLocadora.Ferramenta;

public interface PrecoStrategy {
	double calculaPreco(Ferramenta ferramenta, int dias);
}
