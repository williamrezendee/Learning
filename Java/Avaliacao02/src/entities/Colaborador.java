package entities;

public class Colaborador extends Pessoa{
	private int telefone;
	private int tempoDeServico;
	private String especialidade;
	private String setor;
	
	public Colaborador(String nome,
			String endereco,
			int cpf,
			String email,
			int telefone,
			int tempoDeServico,
			String especialidade,
			String setor) {
		super(nome, endereco, cpf, email);
		this.telefone = telefone;
		this.tempoDeServico = tempoDeServico;
		this.especialidade = especialidade;
		this.setor = setor;
	}
	
	public int getTelefone() { return telefone; }
	public int getTempoDeServico() { return tempoDeServico; }
	public String getEspecialidade() { return especialidade; }
	public String getSetor() { return setor; }
	
	public void setTelefone(int telefone) { this.telefone = telefone; }
	public void setTempoDeServico(int tempoDeServico) { this.tempoDeServico = tempoDeServico; }
	public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
	public void setSetor(String setor) { this.setor = setor; }
}