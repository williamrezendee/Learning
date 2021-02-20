package entities;

public class Pessoa {
	private String nome;
	private String endereco;
	private int cpf;
	private String email;
	
	public Pessoa(String nome, String endereco, int cpf, String email) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCpf(cpf);
		this.setEmail(email);
	}

	public String getNome() { return nome;}
	public String getEndereco() { return endereco; }
	public int getCpf() { return cpf; }
	public String getEmail() { return email; }
	
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setCpf(int cpf) { this.cpf = cpf; }
	public void setEmail(String email) { this.email = email; }
}