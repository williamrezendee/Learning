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
	
	public static boolean CadastrarTurma(Scanner scan) {
		System.out.println();
		System.out.println("       C A D A S T R A R  T U R M A  N O  S I S T E M A        ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.print(" DIGITE O NOME DA TURMA: ");
		String titulo = scan.nextLine().trim().toUpperCase();
		try {
			System.out.print(" DATA DE INÍCIO DAS AULAS (dd/MM/yyy): ");
			String dataInicial = scan.nextLine().trim().toUpperCase();
			while(!(CalendarioControl.ValidarData(dataInicial))) {
				System.out.println("################################################################");
				System.out.println("                 DATA INVÁLIDA! TENTE NOVAMENTE.                ");
				System.out.println("            A DATA INFORMADA NÃO EXISTE NO CALENDÁRIO           ");
				System.out.println("################################################################");
				System.out.print(" DATA DE INÍCIO DAS AULAS (dd/MM/yyy): ");
				dataInicial = scan.nextLine().trim().toUpperCase();
			}
			LocalDate dataInicioTurma = LocalDate.parse(dataInicial, formato);
			System.out.print(" DATA DE TÉRMINO DAS AULAS (dd/MM/yyyy): ");
			String dataFinal = scan.nextLine().trim().toUpperCase();
			while(!(CalendarioControl.ValidarData(dataFinal))) {
				System.out.println("################################################################");
				System.out.println("                 DATA INVÁLIDA! TENTE NOVAMENTE.                ");
				System.out.println("            A DATA INFORMADA NÃO EXISTE NO CALENDÁRIO           ");
				System.out.println("################################################################");
				System.out.print(" DATA DE TÉRMINO DAS AULAS (dd/MM/yyyy): ");
				dataFinal = scan.nextLine().trim().toUpperCase();
			}	
			LocalDate dataFimTurma = LocalDate.parse(dataFinal, formato);
			// Validar a entrada da data término
			while(dataFimTurma.isEqual(dataInicioTurma)||dataFimTurma.isBefore(dataInicioTurma)) {
				System.out.println("################################################################");
				System.out.println("                 DATA INVÁLIDA! TENTE NOVAMENTE.                ");
				System.out.println("  DATA DE TÉRMINO NÃO PODE SER MENOR OU IGUAL A DATA DE INÍCIO! ");
				System.out.println("################################################################");
				System.out.print(" DATA DE TÉRMINO DAS AULAS (dd/MM/yyyy): ");
				dataFinal = scan.nextLine().trim().toUpperCase();
				dataFimTurma = LocalDate.parse(dataFinal, formato);
			}
			System.out.println();
			System.out.println("################################################################");
			if (TurmaControl.CadastrarTurma(titulo, dataInicioTurma, dataFimTurma)) {
				System.out.println("                  TURMA CADASTRADA COM SUCESSO!                 ");
				System.out.println("################################################################");
				System.out.println("        PRESSIONE \"ENTER\" PARA ADICIONAR UM PROFESSOR         ");
				scan.nextLine();
				return true;
			}
			else {
				System.out.println("################################################################");
				System.out.println("              FALHA AO CADASTRAR TURMA NO SISTEMA!              ");
				System.out.println("################################################################");
				System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
				scan.nextLine();
			}
			return false;
		}
		catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public static void MostrarDados(Scanner scan) {
		String[] dados = TurmaControl.MostrarDadosTurma();
		System.out.println();
		System.out.println("                    D A D O S  D A  T U R M A                   ");
		System.out.println();
		System.out.println("################################################################");
		System.out.println();
		System.out.println(" NOME DA TURMA: " + dados[0]);
		System.out.println(" DATA DE INÍCIO DAS AULAS: " + dados[1]);
		System.out.println(" DATA DE TÉRMINO DAS AULAS: " + dados[2]);
		System.out.println(" QUANTIDADE DE ALUNOS: *falta implementar*");
		System.out.println(" QUANTIDADE DE PROFESSROES: *falta implementar*");
		System.out.println();
		System.out.println("################################################################");
		System.out.println("        PRESSIONE \"ENTER\" PARA VOLTAR AO MENU PRINCIPAL       ");
		scan.nextLine();
	}
}
