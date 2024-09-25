package ToolsLocadora;

public class Main {

	public static void main(String[] args) {
		// Ferramenta para aluguel
		Ferramenta furadeira = new Ferramenta("Furadeira", 20.0);

        // Aluguel básico
        Aluguel aluguelBasico = new Aluguel(furadeira, 5);
        System.out.println(aluguelBasico.getDescricao() + " - Custo: $" + aluguelBasico.getCusto());

        // Adicionando seguro
        Aluguel aluguelComSeguro = new SeguroDecorator(aluguelBasico);
        System.out.println(aluguelComSeguro.getDescricao() + " - Custo: $" + aluguelComSeguro.getCusto());

        // Adicionando acessório
        Aluguel aluguelComAccessorio = new AccessorioDecorator(aluguelComSeguro);
        System.out.println(aluguelComAccessorio.getDescricao() + " - Custo: $" + aluguelComAccessorio.getCusto());

        // Usando estratégia de preços (curto prazo)
        AluguelFacade AluguelFacade = new AluguelFacade(new CurtoPrazoStrategy());
        double custoTotal = AluguelFacade.rentTool(furadeira, 5);
        System.out.println("Custo total com estratégia (Curto prazo): R$" + custoTotal);

        // Salvando estado do aluguel (Memento)
        AluguelCaretaker caretaker = new AluguelCaretaker();
        caretaker.salvarEstado(aluguelBasico);
        System.out.println("Estado Economizado!");

        // Restaurando estado do aluguel
        Aluguel restauraAluguel = caretaker.restaurarEstado();
        System.out.println("Restalrado: " + restauraAluguel.getDescricao() + " - Custo: $" + restauraAluguel.getCusto());
    }
}
