package Controller;

import java.time.LocalDate;

import Model.Entities.Turma;

public class TurmaControl {
	public static boolean CadastrarTurma(String titulo, LocalDate dataInicio, LocalDate dataFim) {
		Turma turma = new Turma(titulo, dataInicio, dataFim);
		if (Turma.InserirTurma(turma)) {
			return true;
		}
		return false;
	}
	
	public static String[] MostrarDadosTurma() {
		return Turma.ListarDadosTurma();
	}
}
