package ToolsLocadora.Decorator;

import ToolsLocadora.Ferramenta;
import ToolsLocadora.Memento.AluguelMemento;

/*
 * Classe Componente para implementar o padrão Decorator
 * E também classe Originador do padrão Memento
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
        return "Aluguel de: " + ferramenta.getNome() + " por " + dias + " dias";
    }
    
    public AluguelMemento salvarEstado() {
        return new AluguelMemento(ferramenta.getNome(), dias, getCusto());
    }
    
    public void restaurarEstado(AluguelMemento memento) {
        this.dias = memento.getDias();
    }
}
