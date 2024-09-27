package ToolsLocadora;

import ToolsLocadora.Decorator.AccessorioDecorator;
import ToolsLocadora.Decorator.AluguelComponente;
import ToolsLocadora.Decorator.SeguroDecorator;
import ToolsLocadora.Facade.AluguelFacade;
import ToolsLocadora.Memento.SalvaAluguel;
import ToolsLocadora.Strategy.CurtoPrazoStrategy;
import ToolsLocadora.Strategy.LongoPrazoStrategy;

public class ToolsLocadoraApp {

	public static void main(String[] args) {
		// Ferramenta para aluguel
		System.out.println("# Aluguel Furadeira #");
		Ferramenta furadeira = new Ferramenta("Furadeira", 20.0);
		
		// Aluguel básico        
 		AluguelComponente aluguel1 = new AluguelComponente(furadeira, 5);
 		System.out.println(aluguel1.getDescricao() + " -> Custo: R$" + aluguel1.getCusto());

 		// Adicionando seguro        
 		aluguel1 = new SeguroDecorator(aluguel1);     
        System.out.println(aluguel1.getDescricao() + " -> Custo: R$" + aluguel1.getCusto());
        
        // Adicionando acessórios        
        aluguel1 = new AccessorioDecorator(aluguel1);     
        System.out.println(aluguel1.getDescricao() + " -> Custo: R$" + aluguel1.getCusto());
        
        // Usando Strategy de preços (curto prazo)
        AluguelFacade AluguelFacade = new AluguelFacade(new CurtoPrazoStrategy());
        double custoTotal = AluguelFacade.rentTool(furadeira, 8);
        System.out.println("Custo total com (Curto prazo) por 8 dias: R$" + custoTotal);

        // Usando Strategy de preços (longo prazo)por mais de 7 dias, 10% de desconto para alugueis longos!
        AluguelFacade AluguelFacade2 = new AluguelFacade(new LongoPrazoStrategy());
        double custoTotal3 = AluguelFacade2.rentTool(furadeira, 8);
        System.out.println("Custo total com (Longo prazo) por 8 dias, 10% de desconto: R$" + custoTotal3);
        
        // Salvando estado do aluguel (Memento)
        SalvaAluguel salvaAluguel = new SalvaAluguel();
        salvaAluguel.salvarEstado(aluguel1);
        System.out.println("Estado Salvo!");
        
        // Aluguel básico
        System.out.println("\n" + aluguel1.getDescricao() + " -> Custo: R$" + aluguel1.getCusto()+"\n");        

        // Restaurando estado do aluguel
        AluguelComponente restauraAluguel = salvaAluguel.restaurarEstado();
        System.out.println("Restalrado: " + restauraAluguel.getDescricao() + " -> Custo: R$" + restauraAluguel.getCusto());

        
    	// Ferramenta para aluguel
        System.out.println("\n# Aluguel Serra PoliCorte #");
 		Ferramenta serraPoliCorte = new Ferramenta("Serra PoliCorte", 100.0);
 		
 		// Aluguel básico
        AluguelComponente aluguelSerra = new AluguelComponente(serraPoliCorte, 5);
        System.out.println(aluguelSerra.getDescricao() + " -> Custo: R$" + aluguelSerra.getCusto());
        
        // Adicionando seguro
        aluguelSerra = new SeguroDecorator(aluguelSerra);
        System.out.println(aluguelSerra.getDescricao() + " -> Custo: R$" + aluguelSerra.getCusto());

        // Adicionando acessório
        aluguelSerra = new AccessorioDecorator(aluguelSerra);
        System.out.println(aluguelSerra.getDescricao() + " -> Custo: R$" + aluguelSerra.getCusto());

        // Usando estratégia de preços (curto prazo)
        AluguelFacade aluguelFacadeSerra = new AluguelFacade(new CurtoPrazoStrategy());
        double custoTotalSerra = aluguelFacadeSerra.rentTool(serraPoliCorte, 5);
        System.out.println("Custo total com estratégia (Curto prazo) por 5 dias: R$" + custoTotalSerra);
	
              
        // Ferramenta para aluguel
        System.out.println("\n# Aluguel Betoneira #");        
 		Ferramenta betoneira = new Ferramenta("Serra Betoneira", 170.0);
 		
 		// Aluguel básico        
 		AluguelComponente aluguelBetoneira = new AluguelComponente(betoneira,7);
        System.out.println(aluguelBetoneira.getDescricao() + " -> Custo: R$" + aluguelBetoneira.getCusto());

        // Adicionando seguro        
        aluguelBetoneira= new SeguroDecorator(aluguelBetoneira);     
        System.out.println(aluguelBetoneira.getDescricao() + " -> Custo: R$" + aluguelBetoneira.getCusto());
        
        // Adicionando acessório        
        aluguelBetoneira = new AccessorioDecorator(aluguelBetoneira);     
        System.out.println(aluguelBetoneira.getDescricao() + " -> Custo: R$" + aluguelBetoneira.getCusto());
       
        // Usando Strategy de preços (curto prazo)
        AluguelFacade aluguelBetoneiraFacade = new AluguelFacade(new CurtoPrazoStrategy());
        double custoBetoneiraTotal = aluguelBetoneiraFacade.rentTool(furadeira, 8);
        System.out.println("Custo total com (Curto prazo) por 8 dias: R$" + custoBetoneiraTotal);

        // Usando Strategy de preços (longo prazo)por mais de 7 dias, 10% de desconto para alugueis longos!
        AluguelFacade aluguelBetoneiraFacade2 = new AluguelFacade(new LongoPrazoStrategy());
        double custoBetoneiraTotal2 = aluguelBetoneiraFacade2.rentTool(furadeira, 8);
        System.out.println("Custo total com (Longo prazo) por 8 dias, 10% de desconto: R$" + custoBetoneiraTotal2);
        
        // Salvando estado do aluguel (Memento)
        SalvaAluguel salvaAluguelBetoneira = new SalvaAluguel();
        salvaAluguelBetoneira.salvarEstado(aluguelBetoneira);
        System.out.println("Estado Salvo!");
	}
}
