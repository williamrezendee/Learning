package Model.Entities;

import Model.Store.DataStorage;

public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf, String endereco, String celular, String email, String loginUsuario,
			String loginSenha) {
		super(nome, cpf, endereco, celular, email, loginUsuario, loginSenha);
	}
	public void IncluirAluno(Aluno aluno) {
		DataStorage.SalvarAluno(aluno);
	}
}
