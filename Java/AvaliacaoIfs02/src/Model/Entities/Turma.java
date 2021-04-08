package Model.Entities;

import java.util.Calendar;

public class Turma {
	private String nomeTurma;
	private Calendar dataInicioAula;
	private Calendar dataTerminoAula;
	private Professor[] professoresTurma = new Professor[5];
	private Aluno[] alunosTurma = new Aluno[5];
	
	public Turma() {
	}
	public Turma(String nomeTurma, Calendar dataInicio, Calendar dataTermino) {
		this.nomeTurma = nomeTurma;
		this.dataInicioAula = dataInicio;
		this.dataTerminoAula = dataTermino;
	}
	
	public String getNomeTurma() {return nomeTurma;}
	public Calendar getDataInicioAula() {return dataInicioAula;}
	public Calendar getDataTerminoAula() {return dataTerminoAula;}
	public Professor[] getProfessoresTurma() {return professoresTurma;}
	public Aluno[] getAlunosTurma() {return alunosTurma;}
	
	public void setNomeTurma(String nomeTurma) {this.nomeTurma = nomeTurma;}
	public void setDataInicioAula(Calendar dataInicio) {this.dataInicioAula = dataInicio;}
	public void setDataTerminoAula(Calendar dataTermino) {this.dataTerminoAula = dataTermino;}
	
}
