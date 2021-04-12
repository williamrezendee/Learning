package Controller;

import java.time.LocalDate;
import java.util.ArrayList;

import Model.Entities.Turma;

public class TurmaControl {
	
public static boolean CadastrarTurma(String titulo, LocalDate dataInicio, LocalDate dataFim) {
		Turma turma = new Turma(titulo, dataInicio, dataFim);
		if (Turma.Inserir(turma)) {
			return true;
		}
		return false;
	}
	
	public static String[] MostrarDadosTurma() {
		return Turma.ListarDados();
	}
	
	public static String[] MostrarProfessor() {
		return Turma.ListarProfessor();
	}
	
	public static ArrayList<String[]> MostrarAlunos() {
		return Turma.ListarAlunos();
	}
}
