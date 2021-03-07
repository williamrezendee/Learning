package entities;

public class Pessoa {
	// Attributes
	private String nome;
	private int rg;
	private int cpf;
	private String endereco;
	private int telefone;
	private int celular;
	private String email;
	// Constructors
	public Pessoa(String nome, int rg, int cpf, String endereco, int telefone, int celular, String email) {
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
	public int getRg() { return rg; }
	public int getCpf() { return cpf; }
	public String getEndereco() { return endereco; }
	public int getTelefone() { return telefone; }
	public int getCelular() { return celular; }
	public String getEmail() { return email; }
	// Setters
	public void setNome(String nome) { this.nome = nome; }
	public void setRg(int rg) { this.rg = rg; }
	public void setCpf(int cpf) { this.cpf = cpf; }
	public void setEndereco(String endereco) {this.endereco = endereco; }
	public void setTelefone(int telefone) { this.telefone = telefone; }
	public void setCelular(int celular) { this.celular = celular; }
	public void setEmail(String email) { this.email = email; }
		
}
