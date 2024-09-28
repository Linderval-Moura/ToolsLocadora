package ToolsLocadora.Memento;

import java.util.Stack;

/*
 * Classe Caretaker (Zelador) para implementar o padrão Memento
 * controla quando salvar e restaurar o estado.
 */
public class SalvaAluguel {
	
    private Stack<AluguelMemento> mementos = new Stack<>();

    public void salvarEstado(AluguelMemento memento) {
        mementos.push(memento);
    }

    public AluguelMemento restaurarEstado() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        } else {
            System.out.println("Nenhum estado salvo.");
            return null;
        }
    }
}
