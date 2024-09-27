package ToolsLocadora.Memento;

import ToolsLocadora.Decorator.AluguelComponente;

public class SalvaAluguel {
	private AluguelMemento memento;

    public void salvarEstado(AluguelComponente aluguelComponente) {
        this.memento = new AluguelMemento(aluguelComponente);
    }

    public AluguelComponente restaurarEstado() {
        return memento.getSavedRental();
    }
}
