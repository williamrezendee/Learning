package Model.Services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
}
