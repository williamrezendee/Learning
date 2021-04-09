package Controller;

import java.time.LocalDate;

import Model.Services.CalendarioService;

public class CalendarioControl {
	
	public static boolean VerificarData(LocalDate dataAtual) {
		return true;
	}
	
	public static boolean ValidarData(String data) {
		return CalendarioService.ValidarData(data);
	}
}
