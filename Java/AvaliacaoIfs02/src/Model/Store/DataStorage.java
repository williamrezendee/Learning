package Model.Store;

import Model.Entities.Aluno;
import Model.Entities.Professor;


public class DataStorage {
	
	private static Aluno[] vetorAluno = new Aluno[1];
	private static Professor[] vetorProfessor = new Professor[1];
	
	public static boolean SalvarVetorAluno(Aluno[] vetor) {
		vetorAluno = vetor;
		return true;
	}
	public static boolean SalvarVetorProfessor(Professor[] vetor) {
		vetorProfessor = vetor;
		return true;
	}
	
	public static Aluno[] MostrarVetorAluno() {
		return vetorAluno;
	}
	public static Professor[] MostrarVetorProfessor() {
		return vetorProfessor;
	}
}
