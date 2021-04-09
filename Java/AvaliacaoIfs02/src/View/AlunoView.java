package View;

import java.util.Scanner;

import Controller.AlunoControl;
import Model.Services.ValidarCPFService;

public class AlunoView {
	
	public static void IncluirAluno(Scanner scan) {
		String[] dadosAluno = new String[8];
		System.out.println();
		System.out.println("================================");
		System.out.println("Insira as informações a seguir: ");
		System.out.println("================================");
		System.out.print("Código do Aluno: ");
		dadosAluno[0] = scan.nextLine().trim().toUpperCase();
		System.out.print("Nome: ");
		dadosAluno[1] = scan.nextLine().trim().toUpperCase();
		System.out.print("CPF: ");
		dadosAluno[2] = scan.nextLine().trim().toUpperCase();
		while (!(ValidarCPFService.isCPF(dadosAluno[2]))) {
			System.out.println("CPF inválido! Tente novamente: ");
			dadosAluno[2] = scan.nextLine().trim().toUpperCase();
		}
		System.out.print("Endereço: ");
		dadosAluno[3] = scan.nextLine().trim().toUpperCase();
		System.out.print("Celular: ");
		dadosAluno[4] = scan.nextLine().trim().toUpperCase();
		System.out.print("e-mail: ");
		dadosAluno[5] = scan.nextLine().trim();
		System.out.print("Usuário: ");
		dadosAluno[6] = scan.nextLine().trim();
		System.out.print("Senha: ");
		dadosAluno[7] =scan.nextLine().trim();
		System.out.println("================================");
		if (AlunoControl.Inserir(dadosAluno)) {
			System.out.println("Aluno cadastrado com sucesso!   ");
			System.out.println("================================");
		}
		else {
			System.out.println("================================");
			System.out.println("    Falha ao cadastrar Aluno!   ");
			System.out.println("================================");
		}
		System.out.println();
	}
	
	public static void AlterarAluno(Scanner scan) {
		System.out.println();
		System.out.println("================================");
		System.out.println("Insira as informações a seguir: ");
		System.out.println("================================");
		System.out.print("Código do Aluno: ");
		String codigo = scan.nextLine();
		if(AlunoControl.ValidarCodigo(codigo)) {
			MostrarOpcoes();
			int opcao = Integer.parseInt(scan.nextLine());
			if (AlunoControl.AlterarDados(AlterarDado(opcao, scan), codigo, opcao)) {
				System.out.println("================================");
				System.out.println("   Dado alterado com sucesso!   ");
				System.out.println("================================");
			}
		}
		else {
			System.out.println("================================");
			System.out.println("     Código não encontrado!     ");
			System.out.println("================================");
		}
		System.out.println();
	}
	
	public static void ExcluirAluno(Scanner scan) {
		System.out.println("================================");
		System.out.print("Informe o código do aluno:");
		String codigo = scan.nextLine().trim();
		if (AlunoControl.Excluir(codigo)) {
			System.out.println("Aluno excluído com sucesso!");
		}
		else {
			System.out.println("Aluno não encontrado! Por favor, tente novamente.");
		}
	}
	
	private static void MostrarOpcoes() {
		System.out.println("================================");
		System.out.println("O que deseja alterar? ");
		System.out.println("1-Nome");
		System.out.println("2-CPF");
		System.out.println("3-Endereço");
		System.out.println("4-Celular");
		System.out.println("5-Email");
		System.out.println("6-Usuário");
		System.out.println("7-Senha");
	}
	
	private static String AlterarDado(int opcao, Scanner scan) {
		String novoDado = null;
		switch(opcao) {
		case 1:
			System.out.print("Novo nome: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 2:
			System.out.print("Novo CPF: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 3:
			System.out.print("Novo Endereço: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 4:
			System.out.print("Novo Celular: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 5:
			System.out.print("Novo e-mail: ");
			novoDado = scan.nextLine().trim();
			break;
		case 6:
			System.out.print("Novo usuário: ");
			novoDado = scan.nextLine().trim();
			break;
		case 7:
			System.out.print("Nova senha: ");
			novoDado = scan.nextLine().trim();
			break;
		default:
			System.out.println("Opção inválida!");
				
		}
		return novoDado;
	}
}
