package entities;

public class SalaExecutiva extends Sala {
	
	private int executivos;
	private int secretarios;
	private int computadores;
	private int arCondicionado;

	public SalaExecutiva(int numeroSala,
			int quantMesas,
			int quantPortas,
			int capacidadePessoas,
			int executivos,
			int secretarios,
			int computadores,
			int arCondicionado) {
		super(numeroSala, quantMesas, quantPortas, capacidadePessoas);
		
		this.executivos = executivos;
		this.secretarios = secretarios;
		this.computadores = computadores;
		this.arCondicionado = arCondicionado;
	}

	public int getExecutivos() {
		return executivos;
	}

	public void setExecutivos(int executivos) {
		this.executivos = executivos;
	}

	public int getComputadores() {
		return computadores;
	}

	public void setComputadores(int computadores) {
		this.computadores = computadores;
	}

	public int getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(int arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getSecretarios() {
		return secretarios;
	}

	public void setSecretarios(int secretarios) {
		this.secretarios = secretarios;
	}
	

}
