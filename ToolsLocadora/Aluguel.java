package ToolsLocadora;

public class Aluguel {
	protected Ferramenta ferramenta;
    protected int dias;

    public Aluguel(Ferramenta ferramenta, int dias) {
        this.ferramenta = ferramenta;
        this.dias = dias;
    }

    public double getCusto() {
        return ferramenta.getPrecoPorDia() * dias;
    }

    public String getDescricao() {
        return "Aluguel de: " + ferramenta.getNome() + " de " + dias + " dias";
    }
}
