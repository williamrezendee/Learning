package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Pessoa;
import entities.Aluno;
import entities.Professor;
import entities.enums.Curso;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			Pessoa[] pessoas = new Pessoa[5];
			int opcao = 0;
			int contador = 0;			
			while(opcao != 9) {
				Menu();
				opcao = in.nextInt();
				if (opcao == 1) {
					System.out.print("Nº matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					System.out.print("Nome: ");
					String nome = in.nextLine();
					System.out.print("CPF: ");
					String cpf = in.nextLine();
					System.out.print("E-mail: ");
					String email = in.nextLine();
					System.out.print("Telefone: ");
					String telefone = in.nextLine();
					System.out.print("Curso (1-Ciencia da Computacao/2-Logistica): ");
					int escolha = in.nextInt();
					Curso curso = null;
					if (escolha == 1) {
						curso = Curso.CIENCIA_DA_COMPUTACAO;
						System.out.print("");
					}
					else if (escolha == 2) {
						curso = Curso.LOGISTICA;
					}
					if (pessoas.length <= contador) {
						pessoas = ExpandirArray(pessoas);
					}
					pessoas[contador] = new Aluno(matricula, nome, cpf, email, telefone, curso);
					contador++;
				}
				else if (opcao == 2) {
					System.out.print("Informe a matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					for (Pessoa p : pessoas) {
						if (p != null && matricula.equals(p.getMatricula())) {
							System.out.println("O que deseja alterar?");
							System.out.println("1 - Nome; 2 - CPF; 3 - e-mail; 4 - Telefone;");
							int alt = in.nextInt();
							String novo;
							switch (alt) {
							case 1:
								System.out.print("Novo nome: ");
								in.nextLine();
								novo = in.nextLine();
								p.setNome(novo);
								break;
							case 2:
								System.out.print("Novo CPF: ");
								in.nextLine();
								novo = in.nextLine();
								p.setCpf(novo);
								break;
							case 3:
								System.out.print("Novo e-mail: ");
								in.nextLine();
								novo = in.nextLine();
								p.setEmail(novo);
								break;
							case 4:
								System.out.print("Novo telefone: ");
								in.nextLine();
								novo = in.nextLine();
								p.setTelefone(novo);
								break;
							default:
								System.out.println("Insira uma opção válida!");	
							}
						}
					}
				}
				else if (opcao == 3) {
					System.out.print("Informe a matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					for (int i = 0; i < pessoas.length; i++) {
						if (pessoas[i] != null && matricula.equals(pessoas[i].getMatricula())) {
							pessoas[i] = null;
						}
					}
				}
				else if (opcao == 4) {
					System.out.print("Nº matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					System.out.print("Nome: ");
					String nome = in.nextLine();
					System.out.print("CPF: ");
					String cpf = in.nextLine();
					System.out.print("E-mail: ");
					String email = in.nextLine();
					System.out.print("Telefone: ");
					String telefone = in.nextLine();
					System.out.print("Carga Horária(Semanal): ");
					int cargaHoraria = in.nextInt();
					System.out.print("Área de formação: ");
					in.nextLine();
					String areaFormacao = in.nextLine();
					if (pessoas.length <= contador) {
						pessoas = ExpandirArray(pessoas);
					}
					pessoas[contador] = new Professor(
							matricula, 
							nome, 
							cpf, 
							email, 
							telefone, 
							cargaHoraria,
							areaFormacao);
					contador++;
				}
				else if (opcao == 5) {
					for (int i = 0; i < pessoas.length; i++) {
						if (pessoas[i] != null) {
							System.out.println(pessoas[i]);
						}
					}
				}
				else {
					System.out.println("Opção inválida!");
				}
			}	
			
		}
		catch (InputMismatchException e) {
			System.out.println("Erro! O valor digitado não é válido! Por favor, tente novamente.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do vetor inválida!");
		}
		in.close();
	}
	
	public static void Menu() {
		System.out.println("===============================");
		System.out.println("    U N I V E R S I D A D E    ");
		System.out.println("===============================");
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um aluno");
		System.out.println("2 - Alterar um aluno");
		System.out.println("3 - Excluir um aluno");
		System.out.println("4 - Incluir um professor");
		System.out.println("5 - Listar pessoas cadastradas");
		System.out.println("9 - Sair");
	}
	
	public static Pessoa[] ExpandirArray(Pessoa[] pessoas) {
		Pessoa[] novoArray = new Pessoa[pessoas.length * 2];
		for (int i = 0; i < pessoas.length; i++) {
			novoArray[i] = pessoas[i];
		}
		return novoArray;
	}
}