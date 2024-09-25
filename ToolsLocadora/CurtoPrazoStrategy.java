package ToolsLocadora;

public class CurtoPrazoStrategy implements PrecoStrategy {

    @Override
    public double calculatePrice(Ferramenta ferramenta, int dias) {
        return ferramenta.getPrecoPorDia() * dias;
    }

}
