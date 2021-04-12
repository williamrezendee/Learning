package View;

import java.io.IOException;
import java.util.Scanner;

public class MenuView {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isItTrue = true;
		String option;
		
		MenuTopo();
		IesView.CriarIES();
		if (TurmaView.CadastrarTurma(scan)) {
			MenuTopo();
			ProfessorView.Cadastrar(scan);
		}
		while (isItTrue) {
			MenuTopo();
			MenuOpcoes();
			option = scan.nextLine().toUpperCase().trim();
			switch(option) {
			case "1":
				MenuTopo();
				IesView.MostrarDados(scan);
				break;
			case "2":
				MenuTopo();
				TurmaView.MostrarDados(scan);
				break;
			case "3":
				MenuTopo();
				ProfessorView.MostrarDados(scan);
				break;
			case "4":
				MenuTopo();
				AlunoView.IncluirAluno(scan);
				break;
			case "5":
				MenuTopo();
				AlunoView.AlterarAluno(scan);
				break;
			case "6":
				MenuTopo();
				AlunoView.ExcluirAluno(scan);
				break;
			case "7":
				MenuTopo();
				ListarPessoasView.ListarPessoas(scan);
				break;
			case "8":
				MenuTopo();
				CriptografiaView.CriptografarTexto(scan);
				break;
			case "9":
				MenuTopo();
				CriptografiaView.DescriptografarTexto(scan);
				break;
			case "X":
				MenuTopo();
				System.out.println();
				System.out.println("                       O B R I G A D O !                        ");
				isItTrue = false;
				break;
			default:
				MenuTopo();
				System.out.println();
				System.out.println("                OPÇÃO INVÁLIDA! TENTE NOVAMENTE.                ");
				scan.nextLine();
			}
		}
		scan.close();
	}
	
	public static void MenuOpcoes() {
		System.out.println();
		System.out.println(" 1 - DADOS DA INSTITUIÇÃO DE ENSINO");
		System.out.println(" 2 - VISUALIZAR DADOS DA TURMA");
		System.out.println(" 3 - VISUALIZAR DADOS DO PROFESSOR");
		System.out.println(" 4 - INCLUIR UM ALUNO NO SISTEMA");
		System.out.println(" 5 - ALTERAR DADOS DE UM ALUNO");
		System.out.println(" 6 - EXCLUIR UM ALUNO DO SISTEMA");
		System.out.println(" 7 - LISTAR PESSOAS CADASTRADAS");
		System.out.println(" 8 - CRIFRAR TEXTO");
		System.out.println(" 9 - DECIFRAR TEXTO");
		System.out.println(" X - SAIR DO SISTEMA");
		System.out.println();
		System.out.println("################################################################");
		System.out.print(" DIGITE UMA OPÇÃO: ");
	}
	
	public static void MenuTopo() {
		LimparTela();
		System.out.println("################################################################");
		System.out.println("#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#");
		System.out.println("#+    I N S T I T U T O  F E D E R A L  D E  S E R G I P E    +#");
		System.out.println("#+               C A M P U S  I T A B A I A N A               +#");
		System.out.println("#+                                                            +#");
		System.out.println("#+        C A P S U L A  D O  T E M P O  D I G I T A L        +#");
		System.out.println("#+                                                            +#");
		System.out.println("#+                                                            +#");
		System.out.println("#+  DISCIPLINA: LINGUAGEM DE PROGRAMAÇÃO 2                    +#");
		System.out.println("#+  PROFESSOR : SIDNEY CASSEMIRO DO NASCIMENTO                +#");
		System.out.println("#+                                                            +#");
		System.out.println("#+  DESENVOLVIDO POR: WILLIAM REZENDE SANTOS                  +#");
		System.out.println("#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#");
		System.out.println("################################################################");
	}
	
	private static void LimparTela() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		}
		catch (InterruptedException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
