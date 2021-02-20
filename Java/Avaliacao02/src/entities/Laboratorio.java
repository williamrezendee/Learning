package entities;

public class Laboratorio {
	private int quantMesas;
	private int quantPortas;
	private int quantComputadores;
	private boolean ocupado;
	private int capacidadePessoas;
	
	public Laboratorio(int quantMesas, int quantPortas, int quantComputadores, boolean ocupado, int capacidadePessoas) {
		this.quantMesas = quantMesas;
		this.quantPortas = quantPortas;
		this.quantComputadores = quantComputadores;
		this.ocupado = ocupado;
		this.capacidadePessoas = capacidadePessoas;
	}
	
	public int getQuantMesas() { return quantMesas; }
	public int getQuantPortas() { return quantPortas; }
	public int getQuantComputadores() { return quantComputadores; }
	public boolean getOcupado() { return ocupado; }
	public int getCapacidadePessoas() { return capacidadePessoas; }
	
	public void setQuantMesas(int quantMesas) { this.quantMesas = quantMesas; }
	public void setQuantPortas(int quantPortas) { this.quantPortas = quantPortas; }
	public void setQuantComputadores(int quantComputadores) { this.quantComputadores = quantComputadores; }
	public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
	public void setCapacidadePessoa(int capacidadePessoas) { this.capacidadePessoas = capacidadePessoas; }
}
