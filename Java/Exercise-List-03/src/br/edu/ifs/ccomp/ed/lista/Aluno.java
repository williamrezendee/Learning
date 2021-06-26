package br.edu.ifs.ccomp.ed.lista;

public class Aluno {
	private String nome;
	private String email;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String GetNome() {
		return nome;
	}
	
	public String GetEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
