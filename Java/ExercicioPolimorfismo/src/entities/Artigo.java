package entities;

public class Artigo extends Publicacao {
	// Attributes
	public int conclusao;
	
	// Constructors
	public Artigo() {
	}
	public Artigo(int anoPublic, int conclusao) {
		super(anoPublic);
		this.conclusao = conclusao;
	}
	
	// Getters
	public int getConclusao() { return conclusao; }
	
	// Setters
	public void setConclusao(int conclusao) { this.conclusao = conclusao; }
	
	// Methods
	@Override
	public void criarSumario() {
		super.criarSumario();
		System.out.println("Artigo não possui Sumario, segundo as normas da ABNT!");
	}
	public void criarResumo() {
		System.out.println("Resumo criado!");
	}
}
