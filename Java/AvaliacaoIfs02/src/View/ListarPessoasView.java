package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.TurmaControl;

public class ListarPessoasView {
	
	public static void ListarPessoas(Scanner scan) {
		String[] dadosProfessor = TurmaControl.MostrarProfessor();
		ArrayList<String[]> dadosAlunos = TurmaControl.MostrarAlunos();
		
		System.out.println();
		System.out.println("      P E S S O A S  C A D A S T R A D A S  N A  T U R M A      ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.println(" P R O F E S S O R E S  D A  T U R M A:                         ");
		if (dadosProfessor[0] != null && dadosProfessor[1] != null) {
			System.out.println("CÓDIGO: "+dadosProfessor[0]+", NOME: "+dadosProfessor[1]);
		}
		else {
			System.out.println("");
		}
		System.out.println();
		System.out.println(" A L U N O S  D A  T U R M A:                                   ");
		try {
			for (String[] dados : dadosAlunos) {
				if (dados[0] != null && dados[1] != null) {
					System.out.println("CÓDIGO: "+dados[0]+", NOME: "+dados[1]);
				}
				else {
					System.out.println("");
				}
			}
			System.out.println();
			System.out.println("################################################################");
			System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
			scan.nextLine();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
