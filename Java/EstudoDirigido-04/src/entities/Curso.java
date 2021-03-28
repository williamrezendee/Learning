package entities;

public class Curso {
	// Attributes
	private String titulo;
	private String categoria;
	private int duracaoCurso;
	private int anoProducao;
	private Diretor diretor;
	private Ministrante ministrante;
	// Constructors
	public Curso(
			String titulo,
			String categoria,
			int duracaoCurso,
			int anoProducao,
			Diretor diretor,
			Ministrante ministrante) {
		this.titulo = titulo;
		this.categoria = categoria;
		this.duracaoCurso = duracaoCurso;
		this.anoProducao = anoProducao;
		this.diretor = diretor;
		this.ministrante = ministrante;
	}
	// Getters
	public String getTitulo() { return titulo; }
	public String getCategoria() { return categoria; }
	public int getDuracaoCurso() { return duracaoCurso; }
	public int getAnoProducao() { return anoProducao; }
	public Diretor getDiretor() { return diretor; }
	public Ministrante getMinistrante() { return ministrante; }
	// Setters
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setCategoria(String categoria) { this.categoria = categoria; }
	public void setDuracaoCurso(int duracaoCurso) { this.duracaoCurso = duracaoCurso; }
	public void setAnoProducao(int anoProducao) { this.anoProducao = anoProducao; }
	
}
