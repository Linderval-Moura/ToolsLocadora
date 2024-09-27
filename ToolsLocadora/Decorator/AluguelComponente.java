package ToolsLocadora.Decorator;

import ToolsLocadora.Ferramenta;

/*
 * Classe Componente para implementar o padrão Decorator
 */
public class AluguelComponente {
	
	protected Ferramenta ferramenta;
    protected int dias;

    public AluguelComponente(Ferramenta ferramenta, int dias) {
        this.ferramenta = ferramenta;
        this.dias = dias;
    }

    public double getCusto() {
        return ferramenta.getPrecoPorDia() * dias;
    }

    public String getDescricao() {
        return "Aluguel de: " + ferramenta.getNome() + " de " + dias + " dias";
    }
}
