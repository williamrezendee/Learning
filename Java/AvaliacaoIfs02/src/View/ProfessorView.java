package View;

import java.util.Scanner;

import Controller.ProfessorControl;
import Model.Services.ValidarCPFService;

public class ProfessorView {

	public static void Cadastrar(Scanner scan) {
		String[] dadosProfessor = new String[8];
		System.out.println("================================");
		System.out.println("      CADASTRAR PROFESSOR       ");
		System.out.println("Insira as informa��es a seguir: ");
		System.out.println("================================");
		System.out.print("C�digo(XXXXXX): ");
		dadosProfessor[0] = scan.nextLine().trim().toUpperCase();
		System.out.print("Nome: ");
		dadosProfessor[1] = scan.nextLine().trim().toUpperCase();
		System.out.print("CPF: ");
		dadosProfessor[2] = scan.nextLine().trim().toUpperCase();
		while (!(ValidarCPFService.isCPF(dadosProfessor[2]))) {
			System.out.println("CPF inv�lido! Tente novamente: ");
			dadosProfessor[2] = scan.nextLine().trim().toUpperCase();
		}
		System.out.print("Endere�o: ");
		dadosProfessor[3] = scan.nextLine().trim().toUpperCase();
		System.out.print("Celular: ");
		dadosProfessor[4] = scan.nextLine().trim().toUpperCase();
		System.out.print("e-mail: ");
		dadosProfessor[5] = scan.nextLine().trim();
		System.out.print("Usu�rio: ");
		dadosProfessor[6] = scan.nextLine().trim();
		System.out.print("Senha: ");
		dadosProfessor[7] =scan.nextLine().trim();
		System.out.println("================================");
		if (ProfessorControl.CadastrarProfessor(dadosProfessor)) {
			System.out.println("Professor cadastrado com sucesso!   ");
			System.out.println("================================");
		}
		else {
			System.out.println("================================");
			System.out.println(" Falha ao cadastrar Professor!  ");
			System.out.println("================================");
		}
		System.out.println();
	}
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = ProfessorControl.MostrarDadosProfessor();
		System.out.println("================================");
		System.out.println("PROFESSOR CADASTRADO:");
		System.out.println("C�digo: " + dados[0]);
		System.out.println("Nome: " + dados[1]);
		System.out.println("CPF: " + dados[2]);
		System.out.println("Endere�o: " + dados[3]);
		System.out.println("Celular: " + dados[4]);
		System.out.println("E-mail: " + dados[5]);
		scan.nextLine();
	}
}
