package View;

import java.util.Scanner;

import Controller.AlunoControl;
import Controller.CriptografiaControl;
import Controller.ProfessorControl;

public class CriptografiaView {
	
	public static void CriptografarTexto(Scanner scan) {
		System.out.println("================================");
		System.out.print("C�digo do Professor: ");
		String codigoProfessor = scan.nextLine().trim();
		if (ProfessorControl.ValidarCodigo(codigoProfessor)) {
			System.out.print("C�digo do Aluno: ");
			String codigoAluno = scan.nextLine();
			if (AlunoControl.ValidarCodigo(codigoAluno)) {
				System.out.println("Digite seu texto contando quais s�o suas expectativas"
						+ " e objetivos no curso:");
				String textoDigitado = scan.nextLine();
				CriptografiaControl.Criptografar(textoDigitado, codigoAluno, codigoProfessor);
			}
			else {
				System.out.println("================================");
				System.out.println("     C�digo n�o encontrado!     ");
				System.out.println("================================");
			}
		}
		else {
			System.out.println("================================");
			System.out.println("     C�digo n�o encontrado!     ");
			System.out.println("================================");
		}
	}
}
