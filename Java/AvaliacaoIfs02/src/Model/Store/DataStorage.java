package Model.Store;

import Model.Entities.Aluno;
import Model.Entities.Professor;


public class DataStorage {
	
	private static Aluno[] vetorAluno = new Aluno[1];
	private static Professor[] vetorProfessor = new Professor[1];
	
	public static void SalvarVetorAluno(Aluno[] vetor) {
		vetorAluno = vetor;
	}
	public static void SalvarVetorProfessor(Professor[] vetor) {
		vetorProfessor = vetor;
	}
	
	public static Aluno[] MostrarVetorAluno() {
		return vetorAluno;
	}
	public static Professor[] MostrarVetorPrfessor() {
		return vetorProfessor;
	}
}
