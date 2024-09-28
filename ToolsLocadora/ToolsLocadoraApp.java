package ToolsLocadora;

import ToolsLocadora.Decorator.AluguelComponente;
import ToolsLocadora.Facade.AluguelFacade;
import ToolsLocadora.Strategy.TipoPrazo;

public class ToolsLocadoraApp {

    public static void main(String[] args) {
        /* Ferramenta para aluguel */
        System.out.println("# Aluguel Furadeira #");
        
        // Usando a fachada com estratégia de curto prazo
        AluguelFacade aluguelFacade = new AluguelFacade(TipoPrazo.CURTO_PRAZO);
        
        // Criando ferramenta através da fachada
        Ferramenta furadeira = aluguelFacade.criarFerramenta("Furadeira", 20.0);
        // Aluguel básico
        AluguelComponente aluguelFuradeira = aluguelFacade.criarAluguel(furadeira, 5);
        
        // Adicionando seguro e acessórios
        aluguelFuradeira = aluguelFacade.adicionarSeguro(aluguelFuradeira);
        aluguelFuradeira = aluguelFacade.adicionarAcessorio(aluguelFuradeira);

        // Salvando estado
        aluguelFacade.salvarEstado(aluguelFuradeira);
        
        // Modificando aluguel       
        System.out.println("Modificando Aluguel:");
        aluguelFuradeira = aluguelFacade.criarAluguel(furadeira, 10);        
        
        // Restaurando estado
        aluguelFacade.restaurarEstado(aluguelFuradeira);

        // Calculando o preço com a estratégia de curto prazo
        double custoTotal = aluguelFacade.calcularPreco(furadeira, 10);
        System.out.println("Custo total (Curto prazo) por 8 dias, sem desconto: R$" + custoTotal);
        
        // Usando estratégia de preços para longo prazo
        AluguelFacade aluguelFacadeLongoPrazo = new AluguelFacade(TipoPrazo.LONGO_PRAZO);
        double custoTotalLongoPrazo = aluguelFacadeLongoPrazo.calcularPreco(furadeira, 10);
        System.out.println("Custo total (Longo prazo) por 8 dias com 10% de desconto: R$" + custoTotalLongoPrazo);
    }
}
