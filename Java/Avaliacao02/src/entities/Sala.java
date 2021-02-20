package entities;

public class Sala {
	private int numeroSala;
	private int quantMesas;
	private int quantPortas;
	private int capacidadePessoas;
	
	public Sala(int numeroSala, int quantMesas, int quantPortas, int capacidadePessoas) {
		this.numeroSala = numeroSala;
		this.quantMesas = quantMesas;
		this.quantPortas = quantPortas;
		this.capacidadePessoas = capacidadePessoas;
	}
	
	public int getNumeroSala() { return numeroSala; }
	public int getQuantMesas() { return quantMesas; }
	public int getQuantPortas() { return quantPortas; }
	public int getCapacidadePessoa() { return capacidadePessoas; }
	
	public void setNumeroSala(int numeroSala) { this.numeroSala = numeroSala; }
	public void setQuantMesas(int quantMesas) { this.quantMesas = quantMesas; }
	public void setQuantPortas(int quantPortas) { this.quantPortas = quantPortas; }
	public void setCapacidadePessoa(int capacidadePessoas) { this.capacidadePessoas = capacidadePessoas; }
}
