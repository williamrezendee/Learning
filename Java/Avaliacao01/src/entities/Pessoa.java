package entities;


public class Pessoa {
	// Attributes
	private String nome;
	private String dataNasc;
	// Constructors
	public Pessoa(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	// Getters
	public String getNome() { return nome; }
	public String getDataNasc() { return dataNasc; }
	// Setters
	public void setNome(String nome) { this.nome = nome; }
	public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }
}