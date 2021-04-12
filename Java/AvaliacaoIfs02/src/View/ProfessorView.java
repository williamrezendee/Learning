package View;

import java.util.Scanner;

import Controller.ProfessorControl;
import Model.Services.ValidarCPFService;

public class ProfessorView {

	public static void Cadastrar(Scanner scan) {
		String[] dadosProfessor = new String[8];
		System.out.println();
		System.out.println("        I N C L U I R  P R O F E S S O R  N A  T U R M A        ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.print(" CÓDIGO DO PROFESSOR(XXXXXXXX): ");
		dadosProfessor[0] = scan.nextLine().trim().toUpperCase();
		System.out.print(" NOME COMPLETO: ");
		dadosProfessor[1] = scan.nextLine().trim().toUpperCase();
		System.out.print(" CPF: ");
		dadosProfessor[2] = scan.nextLine().trim().toUpperCase();
		while (!(ValidarCPFService.isCPF(dadosProfessor[2]))) {
			System.out.println("################################################################");
			System.out.println("                 CPF INVÁLIDO! TENTE NOVAMENTE.                 ");
			System.out.println("################################################################");
			System.out.print(" CPF: ");
			dadosProfessor[2] = scan.nextLine().trim().toUpperCase();
		}
		System.out.print(" ENDEREÇO: ");
		dadosProfessor[3] = scan.nextLine().trim().toUpperCase();
		System.out.print(" CELULAR (DDD987654321): ");
		dadosProfessor[4] = scan.nextLine().trim().toUpperCase();
		System.out.print(" E-MAIL: ");
		dadosProfessor[5] = scan.nextLine().trim();
		System.out.print(" USUÁRIO: ");
		dadosProfessor[6] = scan.nextLine().trim();
		System.out.print(" SENHA: ");
		dadosProfessor[7] =scan.nextLine().trim();
		System.out.println();
		System.out.println("################################################################");
		if (ProfessorControl.CadastrarProfessor(dadosProfessor)) {
			System.out.println("              PROFESSOR CADASTRADO COM SUCESSO!             ");
			System.out.println("################################################################");
		}
		else {
			System.out.println("################################################################");
			System.out.println("                  FALHA AO CADASTRAR PROFESSOR!                 ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA ENTRAR NO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = ProfessorControl.MostrarDadosProfessor();
		System.out.println();
		System.out.println("               D A D O S  D O  P R O F E S S O R                ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.println(" CÓDIGO DO PROFESSOR: " + dados[0]);
		System.out.println(" NOME: " + dados[1]);
		System.out.println(" CPF: " + dados[2]);
		System.out.println(" ENDEREÇO: " + dados[3]);
		System.out.println(" CELULAR: " + dados[4]);
		System.out.println(" E-MAIL: " + dados[5]);
		System.out.println();
		System.out.println("################################################################");
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
}
