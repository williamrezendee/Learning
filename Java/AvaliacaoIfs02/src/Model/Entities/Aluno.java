package Model.Entities;

import Model.Store.DataStorage;

public class Aluno extends Pessoa {
	// Attributes
	private String codigoAluno;
	private static int contador = 0;
	// Constructors
	public Aluno(String codigoAluno, String nome, String cpf, String endereco, String celular,
			String email, String loginUsuario,String loginSenha) {
		super(nome, cpf, endereco, celular, email, loginUsuario, loginSenha);
		this.codigoAluno = codigoAluno;
	}
	// Getters
	public String getCodigoAluno() {return codigoAluno;}
	// Setters
	public void setCodigoAluno(String codigoAluno) {this.codigoAluno = codigoAluno;}
	
	public static boolean InserirAluno(Aluno aluno) {
		Aluno[] vetorAluno = DataStorage.MostrarVetorAluno();
		if(contador >= vetorAluno.length) {
			vetorAluno = ExpandirArrayAluno(vetorAluno);
		}
		vetorAluno[contador] = aluno;
		DataStorage.SalvarVetorAluno(vetorAluno);
		contador++;
		return true;
	}
	
	private static Aluno[] ExpandirArrayAluno(Aluno[] vetorAluno) {
		Aluno[] novoVetor = new Aluno[vetorAluno.length + 2];
		return novoVetor;
	}
	
	public static boolean ValidarCodigoAluno(String codigo) {
		Aluno[] vetorAluno = DataStorage.MostrarVetorAluno();
		for (int i = 0; i < vetorAluno.length; i++) {
			if (vetorAluno[i] != null) {
				if (vetorAluno[i].getCodigoAluno().equals(codigo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean AlterarDadosAluno(String novoDado, String codigo, int opcao) {
		Aluno[] vetorAluno = DataStorage.MostrarVetorAluno();
		for (int i = 0; i < vetorAluno.length; i++) {
			if (vetorAluno[i] != null) {
				if (vetorAluno[i].getCodigoAluno().equals(codigo)) {
					switch(opcao) {
					case 1:
						vetorAluno[i].setNome(novoDado);
						break;
					case 2:
						vetorAluno[i].setCpf(novoDado);
						break;
					case 3:
						vetorAluno[i].setEndereco(novoDado);
						break;
					case 4:
						vetorAluno[i].setCelular(novoDado);
						break;
					case 5:
						vetorAluno[i].setEmail(novoDado);
						break;
					case 6:
						vetorAluno[i].setLoginUsuario(novoDado);
						break;
					case 7:
						vetorAluno[i].setLoginSenha(novoDado);
						break;
					}
					DataStorage.SalvarVetorAluno(vetorAluno);
				}
			}
		}
		return true;
	}
	
	public static void ExcluirAluno(String codigo) {
		Aluno[] vetorAluno = DataStorage.MostrarVetorAluno();
		for (int i = 0; i < vetorAluno.length; i++) {
			if (vetorAluno[i] != null) {
				if (vetorAluno[i].getCodigoAluno().equals(codigo)) {
					vetorAluno[i] = null;
				}
			}
		}
		DataStorage.SalvarVetorAluno(OrganizarVetor(vetorAluno));
	}
	
	public static String PegarSenha(String codigoAluno) {
		Aluno[] vetorAluno = DataStorage.MostrarVetorAluno();
		String senhaAluno = null;
		for (int i = 0; i < vetorAluno.length; i++) {
			if (vetorAluno[i].getCodigoAluno().equals(codigoAluno)) {
				senhaAluno = vetorAluno[i].getLoginSenha();
			}
		}
		return senhaAluno;
	}
	
	public static Aluno[] OrganizarVetor(Aluno[] vetor) {
		Aluno[] vetorOrganizado = new Aluno[vetor.length];
		int indiceControle = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				vetorOrganizado[indiceControle] = vetor[i];
				indiceControle++;
			}
		}
		return vetorOrganizado;
	}
}
