package View;

import java.util.Scanner;

public class AlunoView {
	public static String[] IncluirAluno(Scanner scan) {
		String[] dadosAluno = new String[7];
		System.out.println("Nome: ");
		dadosAluno[0] = scan.nextLine().trim().toUpperCase();
		System.out.println("CPF: ");
		dadosAluno[1] = scan.nextLine().trim().toUpperCase();
		System.out.println("Endereço: ");
		dadosAluno[2] = scan.nextLine().trim().toUpperCase();
		System.out.println("Celular: ");
		dadosAluno[3] = scan.nextLine().trim().toUpperCase();
		System.out.println("e-mail: ");
		dadosAluno[4] = scan.nextLine().trim();
		System.out.println("Usuário: ");
		dadosAluno[5] = scan.nextLine().trim();
		System.out.println("Senha: ");
		dadosAluno[6] =scan.nextLine().trim();
		return dadosAluno;
	}
}
