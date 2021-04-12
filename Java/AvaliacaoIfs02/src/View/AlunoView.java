package View;

import java.util.Scanner;

import Controller.AlunoControl;
import Model.Services.ValidarCPFService;

public class AlunoView {
	
	public static void IncluirAluno(Scanner scan) {
		String[] dadosAluno = new String[8];
		System.out.println();
		System.out.println("        I N C L U I R  N O V O  A L U N O  N A  T U R M A       ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.print(" CÓDIGO DO ALUNO (XXXXXXXX): ");
		dadosAluno[0] = scan.nextLine().trim().toUpperCase();
		System.out.print(" NOME COMPLETO: ");
		dadosAluno[1] = scan.nextLine().trim().toUpperCase();
		System.out.print(" CPF: ");
		dadosAluno[2] = scan.nextLine().trim().toUpperCase();
		while (!(ValidarCPFService.isCPF(dadosAluno[2]))) {
			System.out.println("################################################################");
			System.out.println("                 CPF INVÁLIDO! TENTE NOVAMENTE.                 ");
			System.out.println("################################################################");
			System.out.print(" CPF: ");
			dadosAluno[2] = scan.nextLine().trim().toUpperCase();
		}
		System.out.print(" ENDEREÇO: ");
		dadosAluno[3] = scan.nextLine().trim().toUpperCase();
		System.out.print(" CELULAR (DDD987654321): ");
		dadosAluno[4] = scan.nextLine().trim().toUpperCase();
		System.out.print(" E-MAIL: ");
		dadosAluno[5] = scan.nextLine().trim();
		System.out.print(" USUÁRIO: ");
		dadosAluno[6] = scan.nextLine().trim();
		System.out.print(" SENHA: ");
		dadosAluno[7] =scan.nextLine().trim();
		System.out.println();
		if (AlunoControl.Inserir(dadosAluno)) {
			System.out.println("################################################################");
			System.out.println("                  ALUNO CADASTRADO COM SUCESSO!                 ");
			System.out.println("################################################################");
		}
		else {
			System.out.println("################################################################");
			System.out.println("                    FALHA AO CADASTRAR ALUNO!                   ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	public static void AlterarAluno(Scanner scan) {
		MenuAlterarAluno();
		System.out.print(" DIGITE O CÓDIGO DO ALUNO (XXXXXXXX): ");
		String codigo = scan.nextLine();
		System.out.println();
		if(AlunoControl.ValidarCodigo(codigo)) {
			MostrarOpcoes();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			int opcao = Integer.parseInt(scan.nextLine());
			if (AlunoControl.AlterarDados(AlterarDados(opcao, scan), codigo, opcao)) {
				System.out.println();
				System.out.println("################################################################");
				System.out.println("                    DADO ALTERADO COM SUCESSO!                  ");
				System.out.println("################################################################");
			}
		}
		else {
			System.out.println("################################################################");
			System.out.println("             CÓDIGO NÃO ENCONTRADO! TENTE NOVAMENTE.            ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	public static void ExcluirAluno(Scanner scan) {
		System.out.println();
		System.out.println("         E X C L U I R  U M  A L U N O  D A  T U R M A          ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.print("DIGITE O CÓDIGO DO ALUNO (XXXXXXXX): ");
		String codigo = scan.nextLine().trim();
		System.out.println();
		if (AlunoControl.Excluir(codigo)) {
			System.out.println("################################################################");
			System.out.println("                   ALUNO EXCLUÍDO COM SUCESSO!                  ");
			System.out.println("################################################################");
		}
		else {
			System.out.println("################################################################");
			System.out.println("        ALUNO NÃO ENCONTRADO! POR FAVOR, TENTE NOVAMENTE.       ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	private static void MostrarOpcoes() {
		MenuView.MenuTopo();
		MenuAlterarAluno();
		System.out.println("        SELECIONE UMA DAS OPÇÕES A SEGUIR PARA CONTINUAR!       ");
		System.out.println("################################################################");
		System.out.println("  1-NOME|2-CPF|3-ENDEREÇO|4-CELULAR|5-EMAIL|6-USUÁRIO|7-SENHA   ");
		System.out.println();
	}
	
	private static String AlterarDados(int opcao, Scanner scan) {
		System.out.println();
		String novoDado = null;
		switch(opcao) {
		case 1:
			System.out.print(" INSIRA NOVO NOME: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 2:
			System.out.print(" INSIRA NOVO CPF: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 3:
			System.out.print(" INSIRA NOVO ENDEREÇO: ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 4:
			System.out.print(" INSIRA NOVO CELULAR (DDD987654321): ");
			novoDado = scan.nextLine().trim().toUpperCase();
			break;
		case 5:
			System.out.print(" INSIRA NOVO E-MAIL: ");
			novoDado = scan.nextLine().trim();
			break;
		case 6:
			System.out.print(" INSIRA NOVO USUÁRIO: ");
			novoDado = scan.nextLine().trim();
			break;
		case 7:
			System.out.print(" INSIRA NOVA SENHA: ");
			novoDado = scan.nextLine().trim();
			break;
		default:
			System.out.println("################################################################");
			System.out.println("                         OPÇÃO INVÁLIDA!                        ");
			System.out.println("################################################################");
			System.out.println("           PRESSIONE \"ENTER\" PARA TENTAR NOVAMENTE            ");
			scan.nextLine();
			
			MostrarOpcoes();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			opcao = Integer.parseInt(scan.nextLine());
			AlterarDados(opcao, scan);
			break;
				
		}
		return novoDado;
	}
	
	public static void MenuAlterarAluno() {
		System.out.println();
		System.out.println("          A L T E R A R  D A D O S  D E  U M  A L U N O         ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
	}
}
