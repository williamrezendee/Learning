package View;

import java.util.Scanner;

import Controller.IesControl;

public class IesView {
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = IesControl.MostrarDadosIES();
		System.out.println();
		System.out.println("    I N S T I T U I Ç Ã O  D E  E N S I N O  S U P E R I O R    ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.println(" NOME FANTASIA: " + dados[0]);
		System.out.println(" RAZÃO SOCIAL: " + dados[1]);
		System.out.println(" C.N.P.J.: " + dados[2]);
		System.out.println(" ENDEREÇO: " + dados[3]);
		System.out.println(" E-MAIL: " + dados[4]);
		System.out.println(" TELEFONE: " + dados[5]);
		System.out.println();
		System.out.println("################################################################");
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
	
	public static void CriarIES() {
		IesControl.Cadastrar();
	}
}
