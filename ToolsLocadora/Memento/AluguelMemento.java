package ToolsLocadora.Memento;

/*
 * Classe para implementar o padrão Memento
 * Salva o estado da classe organizador
 */
public class AluguelMemento {
	
	private String nomeFerramenta;
    private int dias;
    private double custo;

    public AluguelMemento(String nomeFerramenta, int dias, double custo) {
    	this.nomeFerramenta = nomeFerramenta;
        this.dias = dias;
        this.custo = custo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public int getDias() {
        return dias;
    }

    public double getCusto() {
        return custo;
    }
}
