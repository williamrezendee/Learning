package entities;

public class Pessoa {
	// Attributes
	private String matricula;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	// Constructors
	public Pessoa(String matricula, String nome, String cpf, String email, String telefone) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	// Getters
	public String getMatricula() { return matricula; }
	public String getNome() { return nome; }
	public String getCpf() { return cpf; }
	public String getEmail() {return email; }
	public String getTelefone() { return telefone; }
	// Setters
	public void setMatricula(String matricula) { this.matricula = matricula; }
	public void setNome(String nome) { this.nome = nome; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setEmail(String email) { this.email = email; }
	public void setTelefone(String telefone) { this.telefone = telefone; }
	
	@Override
	public String toString() {
		return "Matrícula: " + this.matricula
				+ " | Nome: " + this.nome
				+ " | CPF: " + this.cpf
				+ " | e-mail: " + this.email
				+ " | Telefone: " + this.telefone;
	}
}