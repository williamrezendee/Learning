package Aplicacao;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Data/Hora atual: " + calendario.getTime());
		System.out.println("Ano: " + calendario.get(Calendar.YEAR));
		System.out.println("M�s: " + calendario.get(Calendar.MONTH));
		System.out.println("Dia do M�s: " + calendario.get(Calendar.DAY_OF_MONTH));
		
		int mes = calendario.get(Calendar.MONTH);
	}

}
