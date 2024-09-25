package ToolsLocadora;

public class AluguelMemento {
	private Aluguel aluguel;

    public AluguelMemento(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public Aluguel getSavedRental() {
        return aluguel;
    }
}
