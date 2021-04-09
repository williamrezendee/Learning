package Controller;

import Model.Entities.IES;

public class IesControl {

	public static void Cadastrar() {
		IES ies = new IES(
				"10.728.444/0001-00",
				"IFS",
				"INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE SERGIPE",
				"Avenida Jorge Amado, S/N",
				"7937113100",
				"reitoria@ifs.edu.br");
		IES.InserirIES(ies);
	}
	
	public static String[] MostrarDadosIES() {
		return IES.ListarDadosIES();
	}
}
