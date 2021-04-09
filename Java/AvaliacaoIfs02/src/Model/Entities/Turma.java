package Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Model.Store.DataStorage;

public class Turma {
	private String nomeTurma;
	private LocalDate dataInicioAula;
	private LocalDate dataTerminoAula;
	private Professor[] professoresTurma = new Professor[5];
	private Aluno[] alunosTurma = new Aluno[5];
	private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Turma() {
	}
	public Turma(String nomeTurma, LocalDate dataInicio, LocalDate dataTermino) {
		this.nomeTurma = nomeTurma;
		this.dataInicioAula = dataInicio;
		this.dataTerminoAula = dataTermino;
	}
	
	public String getNomeTurma() {return nomeTurma;}
	public LocalDate getDataInicioAula() {return dataInicioAula;}
	public LocalDate getDataTerminoAula() {return dataTerminoAula;}
	public Professor[] getProfessoresTurma() {return professoresTurma;}
	public Aluno[] getAlunosTurma() {return alunosTurma;}
	
	public void setNomeTurma(String nomeTurma) {this.nomeTurma = nomeTurma;}
	public void setDataInicioAula(LocalDate dataInicio) {this.dataInicioAula = dataInicio;}
	public void setDataTerminoAula(LocalDate dataTermino) {this.dataTerminoAula = dataTermino;}
	
	public static boolean InserirTurma(Turma turma) {
		if(DataStorage.SalvarTurma(turma)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String[] ListarDadosTurma() {
		Turma turma = DataStorage.MostrarTurma();
		String[] dados = new String[3];
		dados[0] = turma.getNomeTurma();
		LocalDate dataInicio = turma.getDataInicioAula();
		LocalDate dataTermino = turma.getDataTerminoAula();
		dados[1] = formato.format(dataInicio);
		dados[2] = formato.format(dataTermino);
		return dados;
	}
	
}
