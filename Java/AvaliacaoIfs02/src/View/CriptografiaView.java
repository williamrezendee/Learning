package View;

import java.util.Scanner;

import Controller.AlunoControl;
import Controller.CalendarioControl;
import Controller.CriptografiaControl;
import Controller.ProfessorControl;

public class CriptografiaView {
	
	public static void CriptografarTexto(Scanner scan) {
		System.out.println();
		System.out.println("        C R I A R  E  C R I P T O G R A F A R  T E X T O        ");
		System.out.println();
		System.out.println("  Escreva um texto que expresse suas expectativas e objetivos   ");
		System.out.println("  durante as aulas. O que você espera ter alcançado ao final    ");
		System.out.println("  do semestre letivo.");
		System.out.println("################################################################");
		System.out.println();
		System.out.print(" CÓDIGO DO PROFESSOR: ");
		String codigoProfessor = scan.nextLine().trim();
		if (ProfessorControl.ValidarCodigo(codigoProfessor)) {
			System.out.print(" CÓDIGO DO ALUNO: ");
			String codigoAluno = scan.nextLine();
			if (AlunoControl.ValidarCodigo(codigoAluno)) {
				System.out.println(" DIGITE SEU TEXTO ABAIXO:");
				System.out.print(" ");
				String textoDigitado = scan.nextLine();
				System.out.println();
				if (CriptografiaControl.Criptografar(textoDigitado, codigoAluno, codigoProfessor)) {
					System.out.println("################################################################");
					System.out.println("                TEXTO CRIPTOGRAFADO COM SUCESSO!                ");
					System.out.println(" INSTRUÇÕES:");
					System.out.println(" * Foi gerado um arquivo "+codigoAluno+".txt;");
					System.out.println(" * O arquivo está salvo na pasta C:\\temp\\; ");
					System.out.println("################################################################");
				}
				else {
					System.out.println("################################################################");
					System.out.println("         FALHA AO CRIPTOGRAFAR O TEXTO! TENTE NOVAMENTE.        ");
					System.out.println("################################################################");
				}
			}
			else {
				System.out.println("################################################################");
				System.out.println("                 O CÓDIGO INSERIDO NÃO EXISTE!                  ");
				System.out.println("################################################################");
			}
		}
		else {
			System.out.println("################################################################");
			System.out.println("                 O CÓDIGO INSERIDO NÃO EXISTE!                  ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	public static void DescriptografarTexto(Scanner scan) {
		System.out.println();
		System.out.println("            D E S C R I P T O G R A F A R  T E X T O            ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.print(" CÓDIGO DO PROFESSOR: ");
		String codigoProfessor = scan.nextLine().trim();
		if (ProfessorControl.ValidarCodigo(codigoProfessor)) {
			System.out.print(" CÓDIGO DO ALUNO: ");
			String codigoAluno = scan.nextLine();
			if (AlunoControl.ValidarCodigo(codigoAluno)) {
				if (CalendarioControl.VerificarDataAtual()) {
					if (CriptografiaControl.Descriptografar(codigoAluno, codigoProfessor)) {
						System.out.println("################################################################");
						System.out.println("           T E X T O  D E S C R I P T O G R A F A D O!          ");
						System.out.println(" INSTRUÇÕES:");
						System.out.println(" * Foi gerado um arquivo "+codigoAluno+".txt;");
						System.out.println(" * O arquivo está salvo na pasta C:\\temp\\; ");
						System.out.println("################################################################");
					}
					else {
						System.out.println("################################################################");
						System.out.println("         F A L H A  A O  D E S C R I P T O G R A F A R !        ");
						System.out.println("################################################################");
					}
				}
				else {
					System.out.println("################################################################");
					System.out.println("         F A L H A  A O  D E S C R I P T O G R A F A R !        ");
					System.out.println();
					System.out.println(" O ARQUIVO NÃO PODE SER DESCRIPTOGRAFADO PORQUE A DATA ATUAL NÃO");
					System.out.println(" COINCIDE COM A DATA DE TÉRMINO DAS AULAS! ");
					System.out.println("################################################################");
				}
			}
			else {
				System.out.println("################################################################");
				System.out.println("                 O CÓDIGO INSERIDO NÃO EXISTE!                  ");
				System.out.println("################################################################");
			}
		}
		else {
			System.out.println("################################################################");
			System.out.println("                 O CÓDIGO INSERIDO NÃO EXISTE!                  ");
			System.out.println("################################################################");
		}
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
}
