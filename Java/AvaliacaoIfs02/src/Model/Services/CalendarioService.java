package Model.Services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;

import Model.Entities.Turma;
import Model.Store.DataStorage;

public class CalendarioService {
	
	static DateTimeFormatter formatoParaLocalDate = new DateTimeFormatterBuilder()
			.appendPattern("dd/MM/uuuu")
			.parseDefaulting(ChronoField.ERA, 1)
			.toFormatter()
			.withResolverStyle(ResolverStyle.SMART);
	
	
	public static boolean ValidarData(String data) {
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		formato.setLenient(false);
		try {
			formato.parse(data);
			return true;
		}
		catch (ParseException e) {
			return false;
		}
		
	}
	
	public static boolean VerificarDataAtual() {
		DateTimeFormatter formatoParaString = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Turma turma = DataStorage.MostrarTurma();
		LocalDate dataTerminoTurma = turma.getDataTerminoAula();
		// Pega a data atual e converte em string usando uma formatação
		LocalDate dataAtual = LocalDate.now();
		String dataAtualString= dataAtual.format(formatoParaString);
		// Pega a data atual formatada e converte em LocalDate com outra formatação
		dataAtual = LocalDate.parse(dataAtualString, formatoParaLocalDate);

		if (dataAtual.isEqual(dataTerminoTurma)) {
			return true;
		}
		return false;
	}
}
