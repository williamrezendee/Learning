package entities;

public class Pessoa {
	// Attributes
	private String nome;
	private String rg;
	private String cpf;
	private String endereco;
	private String telefone;
	private String celular;
	private String email;
	// Constructors
	public Pessoa(String nome, String rg, String cpf, String endereco, String telefone, String celular, String email) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	// Getters
	public String getNome() { return nome; }
	public String getRg() { return rg; }
	public String getCpf() { return cpf; }
	public String getEndereco() { return endereco; }
	public String getTelefone() { return telefone; }
	public String getCelular() { return celular; }
	public String getEmail() { return email; }
	// Setters
	public void setNome(String nome) { this.nome = nome; }
	public void setRg(String rg) { this.rg = rg; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setEndereco(String endereco) {this.endereco = endereco; }
	public void setTelefone(String telefone) { this.telefone = telefone; }
	public void setCelular(String celular) { this.celular = celular; }
	public void setEmail(String email) { this.email = email; }
		
}
