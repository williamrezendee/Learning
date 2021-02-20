package entities;

public class LabAnalisePesquisa extends Laboratorio {
	
	private int quantPesquisadores;
	private int quantCadeiras;
	private int quantBalancas;
	private int quantMicroscopios;
	
	public LabAnalisePesquisa(int quantMesas,
			int quantPortas,
			int quantComputadores,
			boolean ocupado,
			int capacidadePessoas,
			int pesquisadores,
			int cadeiras,
			int balancas,
			int microscopios) {
		super(quantMesas, quantPortas, quantComputadores, ocupado, capacidadePessoas);
		this.quantPesquisadores = pesquisadores;
		this.quantCadeiras = cadeiras;
		this.quantBalancas = balancas;
		this.quantMicroscopios = microscopios;
	}
	
	public int getQuantPesquisadores() { return quantPesquisadores; }
	public int getQuantCadeiras() { return quantCadeiras; }
	public int getQuantBalancas() { return quantBalancas; }
	public int getQuantMicroscopios() { return quantMicroscopios; }
	
	public void setQuantPesquisadores(int quantPesquisadores) { this.quantPesquisadores = quantPesquisadores; }
	public void setQuantCadeiras(int cadeiras) { this.quantCadeiras = cadeiras; }
	public void setQuantBalancas(int balancas) { this.quantBalancas = balancas; }
	public void setQuantMicroscopios(int microscopios) { this.quantMicroscopios = microscopios; }
}
