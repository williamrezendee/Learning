package application;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produtora;
import entities.Proprietario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Proprietario proprietario = new Proprietario(
				"William Rezende",
				"Rua A, 25",
				"79-99999-9999",
				"william@email.com");
		Produtora produtora = new Produtora(
				"Produtora Studio",
				"Rua B, 222",
				"79-98888-8888",
				proprietario);
		try {
			Pessoa[] pessoas = new Pessoa[5];
			int opcao = 0; 
			int contador = 0;
			while(opcao != 9) {
				Menu();
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao == 1) {
					pessoas[contador] = Produtora.AdicionarNovoAtor(sc);
					contador++;
				}
				else if(opcao == 2) {
					Produtora.AlterarAtor(sc, pessoas);
				}
				else if(opcao == 3) {
					Produtora.ExcluirAtor(sc, pessoas);
				}
				else if (opcao == 4) {
					pessoas[contador] = Produtora.AdicionarNovoDiretor(sc);
					contador++;
				}
				else if (opcao == 5) {
					Produtora.ListarCadastrados(pessoas);
				}
			}
		}
		catch(Exception e) {
			
		}
		sc.close();
	}
	
	public static void Menu() {
		System.out.println("===============================");
		System.out.println("       P R O D U T O R A       ");
		System.out.println("===============================");
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um ator");
		System.out.println("2 - Alterar um ator");
		System.out.println("3 - Excluir um ator");
		System.out.println("4 - Incluir um diretor");
		System.out.println("5 - Listar pessoas cadastradas");
		System.out.println("9 - Sair");
	}

}