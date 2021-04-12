package Controller;

import Model.Entities.Professor;
import Model.Services.CriptografiaService;

public class ProfessorControl {
	
	public static boolean CadastrarProfessor(String[] dadosProfessor) {
		Professor professor = new Professor(
				dadosProfessor[0], 
				dadosProfessor[1], 
				dadosProfessor[2], 
				dadosProfessor[3], 
				dadosProfessor[4],
				dadosProfessor[5],
				dadosProfessor[6],
				dadosProfessor[7] = CriptografiaService.CriptografarSenha(dadosProfessor[7])
				);
		if(Professor.Inserir(professor))
			return true;
		else
			return false;
	}
	
	public static String PegarSenhaProfessor(String codigoProfessor) {
		return Professor.PegarSenha(codigoProfessor);
	}
	
	public static boolean ValidarCodigo(String codigo) {
		return Professor.ValidarCodigo(codigo);
	}

	public static String[] MostrarDadosProfessor() {
		return Professor.ListarDados();
	}
}
