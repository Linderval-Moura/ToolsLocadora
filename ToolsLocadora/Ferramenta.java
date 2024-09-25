package ToolsLocadora;

public class Ferramenta {
	private String nome;
    private double precoPorDia;

    public Ferramenta(String nome, double precoPorDia) {
        this.nome = nome;
        this.precoPorDia = precoPorDia;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }
}
