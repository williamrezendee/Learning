package Controller;

import Model.Services.CriptografiaService;

public class CriptografiaControl {
	
	public static void Criptografar(String textoDigitado, String codigoAluno, String codigoProfessor) {
		String senhaAluno = AlunoControl.PegarSenhaAluno(codigoAluno);
		String senhaProfessor = ProfessorControl.PegarSenhaProfessor(codigoProfessor);
		String textoCriptografado = CriptografiaService.CriptografarTexto(textoDigitado, senhaAluno, senhaProfessor);
		ArquivoControl.GerarArquivo(textoCriptografado, codigoAluno);
	}
	
	public static boolean ValidarSenha(String senhaInformada, String codigoAluno) {
		return CriptografiaService.ValidarSenha(senhaInformada, AlunoControl.PegarSenhaAluno(codigoAluno));
	}
}
