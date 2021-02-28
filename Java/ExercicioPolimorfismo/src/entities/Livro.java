package entities;

public class Livro extends Publicacao{
	// Attributes
	public int codigo;
	
	// Constructors
	public Livro() {
		
	}
	public Livro(int anoPublic, int codigo) {
		super(anoPublic);
		this.codigo = codigo;
	}
	
	// Getters
	public int getCodigo() { return codigo; }
	
	// Setters
	public void setCodigo(int codigo) { this.codigo = codigo; }
	
	// Methods
	@Override
	public void criarSumario() {
		super.criarSumario();
	}
	public void elaborarCapa() {
		System.out.println("Capa elaborada!");
	}
}
