package entities;

public class Estagiario extends Pessoa {
	
	private int idade;
	private int tempoContrato;
	private String setor;
	private boolean sabeFazerCafe;
	
	public Estagiario(String nome,
			String endereco,
			int cpf,
			String email,
			int idade,
			int tempoContrato,
			String setor,
			boolean cafe) {
		super(nome, endereco, cpf, email);
		this.idade = idade;
		this.tempoContrato = tempoContrato;
		this.setor = setor;
		this.sabeFazerCafe = cafe;
	}
	
	public int getIdade() { return idade; }
	public int getTempoContrato() { return tempoContrato; }
	public String getSetor() { return setor; }
	public boolean getSabeFazerCafe() { return sabeFazerCafe; }
	
	public void setIdade(int idade) { this.idade = idade; }
	public void setTempoContrato(int tempoContrato) { this.tempoContrato = tempoContrato; }
	public void setSetor(String setor) { this.setor = setor; }
	public void setSabeFazercafe(boolean cafe) { this.sabeFazerCafe = cafe; }
}
