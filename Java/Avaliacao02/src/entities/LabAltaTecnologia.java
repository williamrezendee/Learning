package entities;

public class LabAltaTecnologia extends Laboratorio{
	private int quantPesquisadores;
	private int quantCadeiras;
	
	public LabAltaTecnologia(int quantMesas,
			int quantPortas,
			int quantComputadores,
			boolean ocupado,
			int capacidadePessoas,
			int quantPesquisadores,
			int quantCadeiras) {
		super(quantMesas, quantPortas, quantComputadores, ocupado, capacidadePessoas);
		this.quantPesquisadores = quantPesquisadores;
		this.quantPesquisadores = quantPesquisadores;
	}
	
	public int getQuantPesquisadores() { return quantPesquisadores; }
	public int getQuantCadeiras() { return quantCadeiras; }
	
	public void setQuantPesquisadores(int quantPesquisadores) { this.quantPesquisadores = quantPesquisadores; }
	public void setQuantCadeiras(int cadeiras) { this.quantCadeiras = cadeiras; }
}
