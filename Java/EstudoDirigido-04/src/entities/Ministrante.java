package entities;

public class Ministrante extends Pessoa {

	private String curriculoLink;
	private Curso[] cursos;
	
	public Ministrante(String nome, String endereco, String celular, String email, String link) {
		super(nome, endereco, celular, email);
		this.curriculoLink = link;
	}
	// Getters
	public String getCurriculoLink() { return curriculoLink; }
	public Curso[] getCursos() { return cursos; }
	// Setters
	public void setCurriculoLink(String link) { this.curriculoLink = link; }
	public void setCursos(Curso curso) {
		for (Curso c : cursos) {
			if (c == null) {
				c = curso;
				break;
			}
		}
	}
	@Override
	public String toString() {
		return String.format("Ministrante: " + this.getNome()
				+ ", endereço: " + this.getEndereco()
				+ ", celular: " + this.getCelular()
				+ ", e-mail: " + this.getEmail()
				+ ", Link Curriculo: " + this.getCurriculoLink());
	}
}
