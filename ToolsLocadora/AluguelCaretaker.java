package ToolsLocadora;

public class AluguelCaretaker {
	private AluguelMemento memento;

    public void salvarEstado(Aluguel aluguel) {
        this.memento = new AluguelMemento(aluguel);
    }

    public Aluguel restaurarEstado() {
        return memento.getSavedRental();
    }
}
