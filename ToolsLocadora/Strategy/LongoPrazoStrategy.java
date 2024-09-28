package ToolsLocadora.Strategy;

import ToolsLocadora.Ferramenta;

/*
 * Classe para implementar o padrão Strategy
 */
public class LongoPrazoStrategy implements PrecoStrategy {

    @Override
    public double calculaPreco(Ferramenta ferramenta, int dias) {
        if (dias > 7) {
            return ferramenta.getPrecoPorDia() * dias * 0.9;  // 10% de desconto para alugueis longos
        }
        return ferramenta.getPrecoPorDia() * dias;
    }
}
