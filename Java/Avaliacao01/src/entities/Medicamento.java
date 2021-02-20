package entities;

public class Medicamento {
	// Attributes
	private String descricao;
	private int quantidadeEstoque;
	private String unidadeMedida;
	// Constructors
	public Medicamento(String descricao, int quantidadeEstoque, String unidadeMedida) {
		this.setDescricao(descricao);
		this.setQuantidadeEstoque(quantidadeEstoque);
		this.setUnidadeMedida(unidadeMedida);
	}
	// Getters
	public String getDescricao() { return descricao; }
	public int getQuantidadeEstoque() { return quantidadeEstoque; }
	public String getUnidadeMedida() { return unidadeMedida; }
	// Setters
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
	public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }
}
