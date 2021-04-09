package Model.Services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import Model.Entities.Turma;
import Model.Store.DataStorage;

public class CalendarioService {
	
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
		Turma turma = DataStorage.MostrarTurma();
		LocalDate dataTerminoTurma = turma.getDataTerminoAula();
		LocalDate dataAtual = LocalDate.now();
		if (dataTerminoTurma == dataAtual) {
			return true;
		}
		return false;
	}
}
