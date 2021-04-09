package Model.Store;

import Model.Entities.Aluno;
import Model.Entities.IES;
import Model.Entities.Professor;
import Model.Entities.Turma;


public class DataStorage {
	
	private static Aluno[] vetorAluno = new Aluno[1];
	private static Professor professor;
	private static Turma turma;
	private static IES ies;
	
	public static boolean SalvarVetorAluno(Aluno[] vetor) {
		vetorAluno = vetor;
		return true;
	}
	public static boolean SalvarProfessor(Professor objProfessor) {
		professor = objProfessor;
		return true;
	}
	
	public static boolean SalvarTurma(Turma objTurma) {
		turma = objTurma;
		return true;
	}
	
	public static boolean SalvarIES(IES objIES) {
		ies = objIES;
		return true;
	}
	
	public static Aluno[] MostrarVetorAluno() {
		return vetorAluno;
	}
	public static Professor MostrarProfessor() {
		return professor;
	}
	
	public static Turma MostrarTurma() {
		return turma;
	}
	
	public static IES MostrarIES() {
		return ies;
	}
}
