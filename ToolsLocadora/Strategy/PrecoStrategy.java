package ToolsLocadora.Strategy;

import ToolsLocadora.Ferramenta;

public interface PrecoStrategy {
	double calculatePrice(Ferramenta ferramenta, int dias);
}
