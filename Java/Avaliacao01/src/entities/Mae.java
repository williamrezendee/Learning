package entities;


public class Mae extends Pessoa {
	// Attributes
	private String sobrenome;
	private String endereco;
	private int telefone;
	// Constructors
	public Mae(String nome, String dataNasc, String sobrenome, String endereco, int telefone) {
		super(nome, dataNasc);
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	// Getters
	public String getSobrenome() { return sobrenome; }
	public String getEndereco() { return endereco; }
	public int getTelefone() { return telefone; }
	// Setters
	public void setSobrenme(String sobrenome) { this.sobrenome = sobrenome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setTelefone(int telefone) { this.telefone = telefone; }
	
}
