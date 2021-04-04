package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.ProfessorControl;

public class ProfessorView {
	
	public static void MenuProfessor(Scanner scan) {
		System.out.println("================================");
		System.out.println("Escolha uma das opções a seguir:");
		System.out.println("================================");
		System.out.println("1-Cadastrar Professor");
		System.out.println("2-Mostrar lista de Professor");
		int escolha = Integer.parseInt(scan.nextLine());
		switch (escolha) {
		case 1:
			IncluirProfessor(scan);
			break;
		case 2:
			ArrayList<String[]> lista = ProfessorControl.Listar();
			for (String[] vetor : lista) {
				System.out.println("Matricula: "+vetor[0]+", Nome: "+vetor[1]);
			}
			break;
		default:
			System.out.println("Opção Inválida!");
		}
	}

	private static void IncluirProfessor(Scanner scan) {
		String[] dadosProfessor = new String[8];
		System.out.println();
		System.out.println("================================");
		System.out.println("Insira as informações a seguir: ");
		System.out.println("================================");
		System.out.print("Código do Professor: ");
		dadosProfessor[0] = scan.nextLine().trim().toUpperCase();
		System.out.print("Nome: ");
		dadosProfessor[1] = scan.nextLine().trim().toUpperCase();
		System.out.print("CPF: ");
		dadosProfessor[2] = scan.nextLine().trim().toUpperCase();
		System.out.print("Endereço: ");
		dadosProfessor[3] = scan.nextLine().trim().toUpperCase();
		System.out.print("Celular: ");
		dadosProfessor[4] = scan.nextLine().trim().toUpperCase();
		System.out.print("e-mail: ");
		dadosProfessor[5] = scan.nextLine().trim();
		System.out.print("Usuário: ");
		dadosProfessor[6] = scan.nextLine().trim();
		System.out.print("Senha: ");
		dadosProfessor[7] =scan.nextLine().trim();
		System.out.println("================================");
		if (ProfessorControl.Inserir(dadosProfessor)) {
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
}
