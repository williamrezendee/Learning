package entities;

public class Hospede extends Pessoa {
	// Attributes
	private int ocupacoesRealizadas;
	// Constructors
	public Hospede(String nome, String rg, String cpf, String endereco, String telefone, String celular, String email) {
		super(nome, rg, cpf, endereco, telefone, celular, email);
		this.ocupacoesRealizadas = 0;
	}
	// Getters
	public int getOcupacoesRealizadas() { return ocupacoesRealizadas; }
	// Setters
	public void setOcupacoesRealizadas(int ocupacoes) { this.ocupacoesRealizadas = ocupacoes; }
}