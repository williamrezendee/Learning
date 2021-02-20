package entities;

public class SalaReuniao extends Sala{
	
	private int projetores;
	private int capacidadePessoas;
	private int microfones;
	private int arCondicionado;

	public SalaReuniao(int numeroSala,
			int quantMesas,
			int quantPortas,
			int capacidadePessoas,
			int projetores,
			int pessoas,
			int microfones,
			int arCondicionado) {
		super(numeroSala, quantMesas, quantPortas, capacidadePessoas);
		this.projetores = projetores;
		this.capacidadePessoas = pessoas;
		this.microfones = microfones;
		this.arCondicionado = arCondicionado;
	}

	public int getProjetores() {
		return projetores;
	}

	public void setProjetores(int projetores) {
		this.projetores = projetores;
	}

	public int getMicrofones() {
		return microfones;
	}

	public void setMicrofones(int microfones) {
		this.microfones = microfones;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public int getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(int arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

}
