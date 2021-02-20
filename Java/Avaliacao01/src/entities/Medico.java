package entities;


public class Medico extends Pessoa {
	// Attributes
	private String crm;
	private String endereco;
	private int celular;
	// Constructors
	public Medico(String nome, String dataNasc, String crm, String endereco, int celular) {
		super(nome, dataNasc);
		this.crm = crm;
		this.endereco = endereco;
		this.celular = celular;
	}
	// Getters
	public String getCrm() { return crm; }
	public String getEndereco() { return endereco; }
	public int getCelular() { return celular; }
	// Setters
	public void setSobrenme(String crm) { this.crm = crm; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setTelefone(int celular) { this.celular = celular; }
}
