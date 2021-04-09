package View;

import java.util.Scanner;

import Controller.IesControl;

public class IesView {
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = IesControl.MostrarDadosIES();
		System.out.println("================================");
		System.out.println("INSTITUI��O DE ENSINO SUPERIOR:");
		System.out.println("Nome Fantasia: " + dados[0]);
		System.out.println("Raz�o Social: " + dados[1]);
		System.out.println("CNPJ: " + dados[2]);
		System.out.println("Endere�o: " + dados[3]);
		System.out.println("E-mail: " + dados[4]);
		System.out.println("Telefone: " + dados[5]);
		scan.nextLine();
	}
	
	public static void CriarIES() {
		IesControl.Cadastrar();
	}
}
