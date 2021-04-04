package Model.Entities;

import java.util.ArrayList;

import Model.Store.DataStorage;

public class Professor extends Pessoa {
	// Attributes
	private String codigoProfessor;
	private static int contador = 0;
	// Constructors
	public Professor(String codigoProfessor, String nome, String cpf, String endereco, String celular, 
			String email, String loginUsuario, String loginSenha) {
		super(nome, cpf, endereco, celular, email, loginUsuario, loginSenha);
		this.codigoProfessor = codigoProfessor;
	}
	// Getters
	public String getCodigoProfessor() {return codigoProfessor;}
	// Setters
	public void setCodigoProfessor(String codigo) {this.codigoProfessor = codigo;}
	
	
	public static boolean InserirProfessor(Professor professor) {
		Professor[] vetorProfessor = DataStorage.MostrarVetorProfessor();
		if(contador >= vetorProfessor.length) {
			vetorProfessor = ExpandirArrayProfessor(vetorProfessor);
		}
		vetorProfessor[contador] = professor;
		contador++;
		if(DataStorage.SalvarVetorProfessor(vetorProfessor)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static Professor[] ExpandirArrayProfessor(Professor[] vetorProfessor) {
		Professor[] novoVetorProfessor = new Professor[vetorProfessor.length + 2];
		return novoVetorProfessor;
	}
	public static ArrayList<String[]> ListarProfessores() {
		Professor[] vetorProfessor = DataStorage.MostrarVetorProfessor();
		ArrayList<String[]> lista = new ArrayList<String[]>();
		String[] dados = new String[2];
		for (int i = 0; i < vetorProfessor.length; i++) {
			dados[0] = vetorProfessor[i].getCodigoProfessor();
			dados[1] = vetorProfessor[i].getNome();
			lista.add(dados);
		}
		return lista;
	}
}
