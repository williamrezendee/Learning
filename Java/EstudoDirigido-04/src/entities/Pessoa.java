package entities;

public abstract class Pessoa {
	// Attributes
	private String nome;
	private String endereco;
	private String celular;
	private String email;
	// Constructors
	public Pessoa(String nome, String endereco, String celular, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
	}
	// Getters
	public String getNome() { return nome; }
	public String getEndereco() { return endereco; }
	public String getCelular() { return celular; }
	public String getEmail() { return email; }
	// Setters
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setCelular(String celular) { this.celular = celular; }
	public void setEmail(String email) { this.email = email; }
	
	public abstract String toString();
}
