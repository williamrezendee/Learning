package entities;

public class Publicacao extends Abnt{
	//Attributes
	public int anoPublicacao;
	
	// Constructors
	public Publicacao() {
	}
	public Publicacao(int anoPublic) {
		this.anoPublicacao = anoPublic;
	}
	
	// Getters
	public int getAnoPublicacao() { return anoPublicacao; }
	
	// Setters
	public void setAnoPublicacao(int anoPublic) { this.anoPublicacao = anoPublic; }
	
	// Methods
	@Override
	public void criarSumario() {
		System.out.println("Sumário criado!");	
	}
	
}
