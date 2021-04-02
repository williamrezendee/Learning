package Model.Store;

import Model.Entities.Aluno;
import Model.Entities.Pessoa;
import Model.Entities.Turma;

public class DataStorage {
	private static Pessoa[] cadastros = new Pessoa[10];
	private Turma[] turmas = new Turma[10];
	static int cont = 0;
	
	public static void SalvarAluno(Aluno aluno) {
		cadastros[cont] = aluno;
		cont++;
	}
}
