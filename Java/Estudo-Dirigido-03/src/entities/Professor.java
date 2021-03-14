package entities;

public class Professor extends Pessoa{
	// Attributes
	private int cargaHoraria;
	private String areaFormacao;
	// Constructor
	public Professor(
			String matricula, 
			String nome, 
			String cpf, 
			String email, 
			String telefone, 
			int cargaHoraria, 
			String areaFormacao
			) {
		super(matricula, nome, cpf, email, telefone);
		this.cargaHoraria = cargaHoraria;
		this.areaFormacao = areaFormacao;
	}
	// Getters
	public int getCargaHoraria() { return cargaHoraria; }
	public String getAreaFormacao() {return areaFormacao; }
	// Setters
	public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
	public void setAreaFormacao(String areaFormacao) { this.areaFormacao = areaFormacao; }
	// Methods
	public void Ensinar() {
		System.out.println("Ensinando...");
	}
	public void Pesquisar() {
		System.out.println("Pesquisando...");
	}
	public String toString() {
		return super.toString() + " | Carga Horária: " + this.cargaHoraria + 
				" | Formação: " + this.areaFormacao;
	}
	
}