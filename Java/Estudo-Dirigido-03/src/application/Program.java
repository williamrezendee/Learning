package application;

import java.util.Scanner;

import entities.Pessoa;
import entities.Aluno;
import entities.Aluno.CienciaComputacao;
import entities.Aluno.Logistica;
import entities.Professor;

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
					pessoas[contador] = new Aluno(matricula, nome, cpf, email, telefone);
					contador++;
				}
				else if (opcao == 2) {
					System.out.print("Informe a matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					for (Pessoa p : pessoas) {
						if (matricula.equals(p.getMatricula())) {
							System.out.println("O que deseja alterar?");
							System.out.println("1 - Nome; 2 - CPF; 3 - e-mail; 4 - Telefone;");
							int alt = in.nextInt();
							switch (alt) {
							case 1:
								System.out.print("Novo nome: ");
								p.setNome(in.nextLine());
								break;
							case 2:
								System.out.print("Novo CPF: ");
								p.setCpf(in.nextLine());
								break;
							case 3:
								System.out.print("Novo e-mail: ");
								p.setEmail(in.nextLine());
								break;
							case 4:
								System.out.print("Novo telefone: ");
								p.setTelefone(in.nextLine());
								break;
							}
						}
					}
				}
				else if (opcao == 3) {
					System.out.print("Informe a matrícula: ");
					in.nextLine();
					String matricula = in.nextLine();
					for (int i = 0; i < pessoas.length; i++) {
						if (matricula.equals(pessoas[i].getMatricula())) {
							pessoas[i] = null;
						}
					}
				}
				else if (opcao == 4) {
					
				}
				else if (opcao == 5) {
					
				}
			}	
			
		}
		catch (Exception e) {
			
		}
		in.close();
	}
	
	public static void Menu() {
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um aluno");
		System.out.println("2 - Alterar um aluno");
		System.out.println("3 - Excluir um aluno");
		System.out.println("4 - Incluir um professor");
		System.out.println("5 - Listar pessoas cadastradas");
		System.out.println("9 - Sair");
	}

}