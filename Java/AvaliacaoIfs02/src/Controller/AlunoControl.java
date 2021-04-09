package Controller;

import Model.Entities.Aluno;
import Model.Services.CriptografiaService;

public class AlunoControl {
	
	public static boolean Inserir(String[] novoAluno) {
		
		Aluno aluno = new Aluno(
				novoAluno[0], 
				novoAluno[1], 
				novoAluno[2], 
				novoAluno[3], 
				novoAluno[4],
				novoAluno[5],
				novoAluno[6],
				novoAluno[7] = CriptografiaService.CriptografarSenha(novoAluno[7])
				);
		if(Aluno.InserirAluno(aluno))
			return true;
		else
			return false;
	}
	
	public static boolean AlterarDados(String novoDado, String codigoAluno, int opcao) {
		if(Aluno.AlterarDadosAluno(novoDado, codigoAluno, opcao))
			return true;
		else
			return false;
		
	}
	
	public static String PegarSenhaAluno(String codigoAluno) {
		return Aluno.PegarSenha(codigoAluno);
	}
	
	public static boolean ValidarCodigo(String codigo) {
		return Aluno.ValidarCodigoAluno(codigo);
	}
	
	public static boolean Excluir(String codigo) {
		return Aluno.ExcluirAluno(codigo);
	}
}
