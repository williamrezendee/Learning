package Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Model.Store.DataStorage;

public class Turma {
	private String nomeTurma;
	private LocalDate dataInicioAula;
	private LocalDate dataTerminoAula;
	
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
	
	public void setNomeTurma(String nomeTurma) {this.nomeTurma = nomeTurma;}
	public void setDataInicioAula(LocalDate dataInicio) {this.dataInicioAula = dataInicio;}
	public void setDataTerminoAula(LocalDate dataTermino) {this.dataTerminoAula = dataTermino;}
	
	public static boolean Inserir(Turma turma) {
		if(DataStorage.SalvarTurma(turma)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String[] ListarDados() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Turma turma = DataStorage.MostrarTurma();
		String[] dados = new String[3];
		dados[0] = turma.getNomeTurma();
		LocalDate dataInicio = turma.getDataInicioAula();
		LocalDate dataTermino = turma.getDataTerminoAula();
		dados[1] = formato.format(dataInicio);
		dados[2] = formato.format(dataTermino);
		return dados;
	}
	
	public static String[] ListarProfessor() {
		Professor professor = DataStorage.MostrarProfessor();
		String[] dados = new String[2];
		if (professor != null) {
			dados[0] = professor.getCodigo();
			dados[1] = professor.getNome();
		}
		else {
			dados[0] = null;
			dados[1] = null;
		}
		
		return dados;
	}
	
	public static ArrayList<String[]> ListarAlunos() {
		Aluno[] alunos = DataStorage.MostrarVetorAluno();
		ArrayList<String[]> listaDeAlunos = new ArrayList<>();
		
		String[] dados = new String[2];
		
		for (int i=0;i < alunos.length;i++) {
			if (alunos[i] != null) {
				dados[0] = alunos[i].getCodigo();
				dados[1] = alunos[i].getNome();
				listaDeAlunos.add(i, dados); // O PROBLEMA DE LISTAR OS ALUNOS ESTÁ AQUI
				// A LISTA SOBREPOE OS DADOS INSERIDOS NA POSICAO 1
			}
		}
		return listaDeAlunos;
	}
}