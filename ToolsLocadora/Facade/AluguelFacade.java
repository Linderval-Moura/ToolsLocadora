package ToolsLocadora.Facade;

import ToolsLocadora.Ferramenta;
import ToolsLocadora.Decorator.AluguelComponente;
import ToolsLocadora.Decorator.SeguroDecorator;
import ToolsLocadora.Decorator.AccessorioDecorator;
import ToolsLocadora.Memento.SalvaAluguel;
import ToolsLocadora.Memento.AluguelMemento;
import ToolsLocadora.Strategy.PrecoStrategy;
import ToolsLocadora.Strategy.TipoPrazo;

public class AluguelFacade {
	
	private PrecoStrategy strategy;
    private SalvaAluguel salvaAluguel;

    public AluguelFacade(TipoPrazo tipoPrazo) {
        this.strategy = tipoPrazo.getStrategy();
        this.salvaAluguel = new SalvaAluguel();
    }
    
    // Cria uma Ferramenta
    public Ferramenta criarFerramenta(String nome, double precoPorDia) {
        Ferramenta ferramenta = new Ferramenta(nome, precoPorDia);
        System.out.println("Ferramenta criada: " + nome + " -> Preço por dia: R$" + precoPorDia);
        return ferramenta;
    }

    // Cria um Aluguel
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
        AluguelMemento memento = aluguel.salvarEstado();
        salvaAluguel.salvarEstado(memento);
        System.out.println("Estado do aluguel salvo.");
    }
    
    // Método para restaurar o estado do aluguel
    public void restaurarEstado(AluguelComponente aluguel) {
        AluguelMemento memento = salvaAluguel.restaurarEstado();
        if (memento != null) {
            aluguel.restaurarEstado(memento);
            System.out.println(
            		"Estado restaurado: " 
            		+ aluguel.getDescricao() 
            		+ " -> Custo: R$" + aluguel.getCusto()
            		);
        }
    }

    // Seleciona tipo do prazo
    public void setTipoPreco(TipoPrazo tipoPrazo) {
        this.strategy = tipoPrazo.getStrategy();
    }
    
    // Calcula preço usando o Strategy
    public double calcularPreco(Ferramenta ferramenta, int dias) {
        return strategy.calculaPreco(ferramenta, dias);
    }
}
