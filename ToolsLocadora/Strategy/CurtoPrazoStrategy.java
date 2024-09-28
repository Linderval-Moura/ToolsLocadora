package ToolsLocadora.Strategy;

import ToolsLocadora.Ferramenta;

/*
 * Classe para implementar o padrão Strategy
 */
public class CurtoPrazoStrategy implements PrecoStrategy {

    @Override
    public double calculaPreco(Ferramenta ferramenta, int dias) {
        return ferramenta.getPrecoPorDia() * dias;
    }

}
