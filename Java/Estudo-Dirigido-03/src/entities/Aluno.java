package entities;

import java.util.Scanner;

public class Aluno extends Pessoa {

	public Aluno(
			String matricula,
			String nome,
			String cpf,
			String email,
			String telefone
			) {
		super(matricula, nome, cpf, email, telefone);
	}
	
	public void Estudar() {
		// Do something...
	}
	public void Cursar() {
		// Do something...
	}
	public boolean Formar() {
		return true; // Need to implement code
	}
	
	public class CienciaComputacao {
		// Attributes
		private int horaComplementar; // Numero de horas complementares
		private int horaEstagio; // Numero de horas estagiando
		// Getters
		public int getHoraComplemetar() { return horaComplementar; }
		public int getHoraEstagio() { return horaEstagio; }
		// Setters
		public void setHoraComplementar(int horaComplementar) { 
			this.horaComplementar = horaComplementar; 
		}
		public void setHoraEstagio(int horaEstagio) {
			this.horaEstagio = horaEstagio;
		}
	}
	
	public class Logistica {
		// Attributes
		private boolean projetoConclusao;
		// Getters
		public boolean getProjetoConclusao() { return projetoConclusao; }
		// Setters
		public void setProjetoConclusao(boolean projetoConclusao) {
			this.projetoConclusao = projetoConclusao;
		}
	}
}