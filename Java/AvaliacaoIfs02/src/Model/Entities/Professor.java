package Model.Entities;

import Model.Store.DataStorage;

public class Professor extends Pessoa {
	// Attributes
	private String codigoProfessor;
	private static int contador = 0;
	// Constructors
	public Professor(String nome, String cpf, String endereco, String celular, String email, String loginUsuario,
			String loginSenha) {
		super(nome, cpf, endereco, celular, email, loginUsuario, loginSenha);
		// TODO Auto-generated constructor stub
	}
	// Getters
	public String getCodigoProfessor() {return codigoProfessor;}
	// Setters
	public void setCodigoProfessor(String codigo) {this.codigoProfessor = codigo;}
	
	
	public void InserirNovoProfessor(Professor professor) {
		Professor[] vetorProfessor = DataStorage.MostrarVetorPrfessor();
		if(contador >= vetorProfessor.length) {
			vetorProfessor = ExpandirArrayProfessor(vetorProfessor);
		}
		vetorProfessor[contador] = professor;
		DataStorage.SalvarVetorProfessor(vetorProfessor);
		contador++;
	}
	
	private static Professor[] ExpandirArrayProfessor(Professor[] vetorProfessor) {
		Professor[] novoVetorProfessor = new Professor[vetorProfessor.length + 2];
		return novoVetorProfessor;
	}

}
