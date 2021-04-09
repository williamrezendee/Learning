package View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.util.Scanner;

import Controller.CalendarioControl;
import Controller.TurmaControl;

public class TurmaView {
	
	static DateTimeFormatter formato = new DateTimeFormatterBuilder()
			.appendPattern("dd/MM/uuuu")
			.parseDefaulting(ChronoField.ERA, 1)
			.toFormatter()
			.withResolverStyle(ResolverStyle.SMART);
	
	public static void CadastrarTurma(Scanner scan) {
		System.out.println("================================");
		System.out.println("        CADASTRAR TURMA         ");
		System.out.println("Insira as informações a seguir: ");
		System.out.println("================================");
		System.out.print("Título: ");
		String titulo = scan.nextLine().trim().toUpperCase();
		try {
			System.out.print("Data de início das aulas(dd/MM/aaaa): ");
			String dataInicial = scan.nextLine().trim().toUpperCase();
			while(!(CalendarioControl.ValidarData(dataInicial))) {
				System.out.println("Data inválida! Repita novamente:");
				dataInicial = scan.nextLine().trim().toUpperCase();
			}
			LocalDate dataInicioTurma = LocalDate.parse(dataInicial, formato);
			System.out.print("Data de termino das aulas(dd/MM/aaaa): ");
			String dataFinal = scan.nextLine().trim().toUpperCase();
			while(!(CalendarioControl.ValidarData(dataFinal))) {
				System.out.println("Data inválida! Repita novamente:");
				dataFinal = scan.nextLine().trim().toUpperCase();
			}	
			LocalDate dataFimTurma = LocalDate.parse(dataFinal, formato);
			System.out.println("================================");
			if (TurmaControl.CadastrarTurma(titulo, dataInicioTurma, dataFimTurma)) {
				System.out.println(" Turma cadastrada com sucesso!  ");
				System.out.println("================================");
			}
			else {
				System.out.println("================================");
				System.out.println("   Falha ao cadastrar Turma!    ");
				System.out.println("================================");
			}
		System.out.println();
		}
		catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = TurmaControl.MostrarDadosTurma();
		System.out.println("================================");
		System.out.println("TURMA CADASTRADA:");
		System.out.println();
		System.out.println("Título: " + dados[0]);
		System.out.println("Data de Início das aulas: " + dados[1]);
		System.out.println("Data de Termino das aulas: " + dados[2]);
		scan.nextLine();
	}
}
