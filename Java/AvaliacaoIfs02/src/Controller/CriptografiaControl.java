package Controller;

import Model.Services.CriptografiaService;

public class CriptografiaControl {
	
	public static boolean Criptografar(String textoDigitado, String codigoAluno, String codigoProfessor) {
		String senhaAluno = AlunoControl.PegarSenhaAluno(codigoAluno);
		String senhaProfessor = ProfessorControl.PegarSenhaProfessor(codigoProfessor);
		String texto = CriptografiaService.CriptografarTexto(textoDigitado, senhaAluno, senhaProfessor);
		if (ArquivoControl.CriarArquivo(texto, codigoAluno)) {
			return true;
		}
		return false;
	}
	
	public static boolean Descriptografar(String codigoAluno, String codigoProfessor) {
		String senhaAluno = AlunoControl.PegarSenhaAluno(codigoAluno);
		String senhaProfessor = ProfessorControl.PegarSenhaProfessor(codigoProfessor);
		String texto = ArquivoControl.ExtrairTexto(codigoAluno);
		if (texto != null) {
			texto = CriptografiaService.DescriptografarTexto(texto, senhaAluno, senhaProfessor);
			ArquivoControl.CriarArquivo(texto, codigoAluno);
			return true;
		}
		return false;
	}
	
	public static boolean ValidarSenha(String senhaInformada, String codigoAluno) {
		return CriptografiaService.ValidarSenha(senhaInformada, AlunoControl.PegarSenhaAluno(codigoAluno));
	}
}
