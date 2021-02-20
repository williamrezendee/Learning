package entities;


public class Bebe extends Pessoa {
	// Attributes
	private Medico medico;
	private Mae mae;
	// Constructors
	public Bebe(String nome, String dataNasc) {
		super(nome, dataNasc);
		
	}
	// Getters
	public Medico getMedico() { return medico; }
	public Mae getMae() { return mae; }
	// Setters
	//public void setMedico(Medico medico) { this.medico = medico; }
	//public void setMae(Mae mae) { this.mae = mae; }
}
