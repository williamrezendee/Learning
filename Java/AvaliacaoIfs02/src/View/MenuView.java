package View;

import java.util.Scanner;

public class MenuView {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isItTrue = true;
		String option;
		while (isItTrue) {
			Menu();
			option = scan.nextLine().toUpperCase().trim();
			switch(option) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				ProfessorView.MenuProfessor(scan);
				break;
			case "4":
				AlunoView.IncluirAluno(scan);
				break;
			case "5":
				AlunoView.AlterarAluno(scan);
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				break;
			case "X":
				isItTrue = false;
				break;
			default:
				System.out.println("opção inválida!");
			}
		}
		scan.close();
	}
	
	public static void Menu() {
		System.out.println("================================");
		System.out.println("    CAPSULA DO TEMPO DIGITAL    ");
		System.out.println("================================");
		System.out.println("1 - Dados da IES");
		System.out.println("2 - Dados da Turma");
		System.out.println("3 - Dados do Professor");
		System.out.println("4 - Incluir um aluno");
		System.out.println("5 - Alterar um aluno");
		System.out.println("6 - Excluir um aluno");
		System.out.println("7 - Listar pessoas cadastradas");
		System.out.println("8 - Cifrar texto");
		System.out.println("9 - Decifrar texto");
		System.out.println("X - Sair");
		System.out.println("================================");
		System.out.print("Digite a sua opção: ");
	}

}
