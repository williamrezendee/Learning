package Controller;

import Model.Services.CalendarioService;

public class CalendarioControl {
	
	public static boolean VerificarDataAtual() {
		return CalendarioService.VerificarDataAtual();
	}
	
	public static boolean ValidarData(String data) {
		return CalendarioService.ValidarData(data);
	}
}
