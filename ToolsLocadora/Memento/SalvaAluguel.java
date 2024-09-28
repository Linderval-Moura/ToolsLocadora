package ToolsLocadora.Memento;

import java.util.Stack;

/*
 * Classe Componente para implementar o padrão Decorator
 * E também classe Originador do padrão Memento
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
