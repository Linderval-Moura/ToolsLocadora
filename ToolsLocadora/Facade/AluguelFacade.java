package ToolsLocadora.Facade;

import ToolsLocadora.Ferramenta;
import ToolsLocadora.Decorator.AluguelComponente;
import ToolsLocadora.Decorator.SeguroDecorator;
import ToolsLocadora.Decorator.AccessorioDecorator;
import ToolsLocadora.Memento.SalvaAluguel;
import ToolsLocadora.Strategy.PrecoStrategy;

public class AluguelFacade {
	
    private PrecoStrategy strategy;
    private SalvaAluguel memento;

    public AluguelFacade(PrecoStrategy strategy) {
        this.strategy = strategy;
        this.memento = new SalvaAluguel();
    }

    // Método para criar um aluguel
    public AluguelComponente criarAluguel(Ferramenta ferramenta, int dias) {
        AluguelComponente aluguel = new AluguelComponente(ferramenta, dias);
        System.out.println(aluguel.getDescricao() + " -> Custo: R$" + aluguel.getCusto());
        return aluguel;
    }

    // Método para adicionar seguro
    public AluguelComponente adicionarSeguro(AluguelComponente aluguel) {
        aluguel = new SeguroDecorator(aluguel);
        System.out.println(aluguel.getDescricao() + " -> Custo: R$" + aluguel.getCusto());
        return aluguel;
    }

    // Método para adicionar acessórios
    public AluguelComponente adicionarAcessorio(AluguelComponente aluguel) {
        aluguel = new AccessorioDecorator(aluguel);
        System.out.println(aluguel.getDescricao() + " -> Custo: R$" + aluguel.getCusto());
        return aluguel;
    }

    // Método para salvar o estado do aluguel
    public void salvarEstado(AluguelComponente aluguel) {
        memento.salvarEstado(aluguel);
        System.out.println("Estado do aluguel salvo.");
    }

    // Método para restaurar o estado do aluguel
    public AluguelComponente restaurarEstado() {
        AluguelComponente estadoRestaurado = memento.restaurarEstado();
        System.out.println(
        		"Estado restaurado: " 
        		+ estadoRestaurado.getDescricao()
        		+ " -> Custo: R$" + estadoRestaurado.getCusto()
        		);
        return estadoRestaurado;
    }

    // Método para calcular o preço usando o Strategy
    public double calcularPreco(Ferramenta ferramenta, int dias) {
        return strategy.calculatePrice(ferramenta, dias);
    }
}
