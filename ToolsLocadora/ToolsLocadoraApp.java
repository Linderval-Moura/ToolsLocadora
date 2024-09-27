package ToolsLocadora;

import ToolsLocadora.Facade.AluguelFacade;
import ToolsLocadora.Strategy.CurtoPrazoStrategy;
import ToolsLocadora.Strategy.LongoPrazoStrategy;

public class ToolsLocadoraApp {

    public static void main(String[] args) {
        /* Ferramenta para aluguel */
        System.out.println("# Aluguel Furadeira #");
        Ferramenta furadeira = new Ferramenta("Furadeira", 20.0);
        
        // Usando a fachada para o processo completo de aluguel
        AluguelFacade aluguelFacade = new AluguelFacade(new CurtoPrazoStrategy());
        var aluguelFuradeira = aluguelFacade.criarAluguel(furadeira, 5);
        
        // Adicionando seguro e acessórios
        aluguelFuradeira = aluguelFacade.adicionarSeguro(aluguelFuradeira);
        aluguelFuradeira = aluguelFacade.adicionarAcessorio(aluguelFuradeira);

        // Salvando o estado
        aluguelFacade.salvarEstado(aluguelFuradeira);
        
        // Restaurando o estado
        aluguelFuradeira = aluguelFacade.restaurarEstado();

        // Calculando o preço com a estratégia de curto prazo
        double custoTotal = aluguelFacade.calcularPreco(furadeira, 5);
        System.out.println("Custo total (Curto prazo) por 5 dias: R$" + custoTotal);
        
        // Usando estratégia de preços para longo prazo
        AluguelFacade aluguelFacadeLongoPrazo = new AluguelFacade(new LongoPrazoStrategy());
        double custoTotalLongoPrazo = aluguelFacadeLongoPrazo.calcularPreco(furadeira, 10);
        System.out.println("Custo total (Longo prazo) por 10 dias com 10% de desconto: R$" + custoTotalLongoPrazo);
    }
}
