package entities;

import entities.enums.Curso;

public class Aluno extends Pessoa {
	// Attributes
	private Curso curso;
	private int horaComplementar;
	private int horaEstagio;
	private boolean projetoConclusao;
	// Constructor
	public Aluno(
			String matricula,
			String nome,
			String cpf,
			String email,
			String telefone,
			Curso curso
			) {
		super(matricula, nome, cpf, email, telefone);
		this.horaComplementar = 0;
		this.horaEstagio = 0;
		this.projetoConclusao = false;
		this.curso = curso;
	}
	
	// Getters
	public Curso getCurso() { return curso; }
	// Setters
	public void setCurso(Curso curso) { this.curso = curso; }
	
	// Methods
	public void Estudar() {
		System.out.println("Estudando...");
	}
	public void Cursar() {
		System.out.println("Cursando...");
	}
	public void Formar() {
		System.out.println("Formando...");
	}
	
	@Override
	public String toString() {
		if (this.curso == Curso.CIENCIA_DA_COMPUTACAO) {
			return super.toString() + " | Horas Complementares: "+
					this.horaComplementar+
					" | Horas de Estágio: "+
					this.horaEstagio;
		}
		else {
			String dado;
			if (this.projetoConclusao == true) {
				dado = "Sim";
			}
			else {
				dado = "Não";
			}
			return super.toString() + " | Projeto de conclusão: " + dado;
		}
	}
}