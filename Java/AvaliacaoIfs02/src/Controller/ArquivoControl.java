package Controller;

import java.io.File;

import Model.Services.ArquivoService;

public class ArquivoControl {

	public static boolean CriarArquivo(String texto, String codigoAluno) {
		if (ArquivoService.VerificarDiretorio()) {
			File pathFile = ArquivoService.CriarCaminhoDoArquivo(codigoAluno);
			ArquivoService.CriarArquivo(texto, pathFile);
			return true;
		}
		else {
			ArquivoService.CriarDiretorio();
			CriarArquivo(texto, codigoAluno);
		}
		return false;
	}
	
	public static String ExtrairTexto (String codigoAluno) {
		if (ArquivoService.VerificarArquivo(codigoAluno) != null) {
			return ArquivoService.LerArquivo(codigoAluno);
		}
		return null;
	}
}