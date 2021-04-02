package Controller;

import Model.Entities.Aluno;

public class AlunoControl {
	public static void IncluirAluno(String[] novoAluno) {
		Aluno aluno = new Aluno(
				novoAluno[0], 
				novoAluno[1], 
				novoAluno[2], 
				novoAluno[3], 
				novoAluno[4],
				novoAluno[5],
				novoAluno[6]
				);
		aluno.IncluirAluno(aluno);
	}
}
