package Model.Entities;

import Model.Store.DataStorage;

public class Professor extends Pessoa {
	// Attributes
	private String codigoProfessor;
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
		if(DataStorage.SalvarProfessor(professor)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String[] ListarDadosProfessor() {
		Professor professor = DataStorage.MostrarProfessor();
		String[] dados = new String[6];
		dados[0] = professor.getCodigoProfessor();
		dados[1] = professor.getNome();
		dados[2] = professor.getCpf();
		dados[3] = professor.getEndereco();
		dados[4] = professor.getCelular();
		dados[5] = professor.getEmail();
		return dados;
	}
	public static boolean ValidarCodigoProfessor(String codigo) {
		Professor professor = DataStorage.MostrarProfessor();
			if(professor != null) {
				if (professor.getCodigoProfessor().equals(codigo)) {
					return true;
				}
			}
		return false;
	}
	
	public static String PegarSenha(String codigoProfessor) {
		Professor professor = DataStorage.MostrarProfessor();
		String senhaProfessor = null;
		if (professor != null) {
			if (professor.getCodigoProfessor().equals(codigoProfessor)) {
				senhaProfessor = professor.getLoginSenha();
			}
		}
		return senhaProfessor;
	}
}
