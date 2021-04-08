package Controller;

import java.util.ArrayList;

import Model.Entities.Professor;
import Model.Services.CriptografiaService;

public class ProfessorControl {
	
	public static boolean Inserir(String[] novoProfessor) {
		Professor professor = new Professor(
				novoProfessor[0], 
				novoProfessor[1], 
				novoProfessor[2], 
				novoProfessor[3], 
				novoProfessor[4],
				novoProfessor[5],
				novoProfessor[6],
				novoProfessor[7] = CriptografiaService.CriptografarSenha(novoProfessor[7])
				);
		if(Professor.InserirProfessor(professor))
			return true;
		else
			return false;
	}
	
	public static String PegarSenhaProfessor(String codigoProfessor) {
		return Professor.PegarSenha(codigoProfessor);
	}
	
	public static boolean ValidarCodigo(String codigo) {
		return Professor.ValidarCodigoProfessor(codigo);
	}

	public static ArrayList<String[]> Listar() {
		return Professor.ListarProfessores();
	}
}
