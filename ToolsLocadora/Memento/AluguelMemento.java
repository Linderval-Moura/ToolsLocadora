package ToolsLocadora.Memento;

import ToolsLocadora.Decorator.AluguelComponente;

public class AluguelMemento {
	private AluguelComponente aluguelComponente;

    public AluguelMemento(AluguelComponente aluguelComponente) {
        this.aluguelComponente = aluguelComponente;
    }

    public AluguelComponente getSavedRental() {
        return aluguelComponente;
    }
}
