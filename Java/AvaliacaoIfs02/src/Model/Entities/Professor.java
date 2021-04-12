package Model.Entities;

import Model.Store.DataStorage;

public class Professor extends Pessoa {
	// Attributes
	private String codigo;
	// Constructors
	public Professor(String codigo, String nome, String cpf, String endereco, String celular, 
			String email, String loginUsuario, String loginSenha) {
		super(nome, cpf, endereco, celular, email, loginUsuario, loginSenha);
		this.codigo = codigo;
	}
	// Getters
	public String getCodigo() {return codigo;}
	// Setters
	public void setCodigo(String codigo) {this.codigo = codigo;}
	
	
	public static boolean Inserir(Professor professor) {
		if(DataStorage.SalvarProfessor(professor)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String[] ListarDados() {
		Professor professor = DataStorage.MostrarProfessor();
		String[] dados = new String[6];
		dados[0] = professor.getCodigo();
		dados[1] = professor.getNome();
		dados[2] = professor.getCpf();
		dados[3] = professor.getEndereco();
		dados[4] = professor.getCelular();
		dados[5] = professor.getEmail();
		return dados;
	}
	public static boolean ValidarCodigo(String codigo) {
		Professor professor = DataStorage.MostrarProfessor();
			if(professor != null) {
				if (professor.getCodigo().equals(codigo)) {
					return true;
				}
			}
		return false;
	}
	
	public static String PegarSenha(String codigo) {
		Professor professor = DataStorage.MostrarProfessor();
		String senhaProfessor = null;
		if (professor != null) {
			if (professor.getCodigo().equals(codigo)) {
				senhaProfessor = professor.getLoginSenha();
			}
		}
		return senhaProfessor;
	}
}
