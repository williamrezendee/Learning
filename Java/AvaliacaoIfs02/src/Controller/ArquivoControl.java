package Controller;

import Model.Services.ArquivoService;

public class ArquivoControl {

	public static void GerarArquivo(String textoCriptografado, String codigoAluno) {
		ArquivoService.GerarArquivoTexto(textoCriptografado, codigoAluno);
	}
}
