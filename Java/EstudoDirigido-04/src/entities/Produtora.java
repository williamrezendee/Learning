package entities;

import java.util.Scanner;

public class Produtora {
	// Attributes
	private String nome;
	private String endereco;
	private String celular;
	private Proprietario proprietario;
	// Constructors
	public Produtora() {	
	}
	public Produtora(String nome, String endereco, String celular, Proprietario proprietario) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.proprietario = proprietario;
	}
	// Getters
	public String getNome() { return nome; }
	public String getEndereco() { return endereco; }
	public String getCelular() { return celular; }
	public Proprietario getProprietario() { return proprietario; }
	// Setters
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setCelular(String celular) { this.celular = celular; }
	public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }
	
	public static Pessoa AdicionarNovoAtor(Scanner sc) {
		System.out.print("Nome: ");
		String nome = sc.nextLine().toUpperCase().trim();
		System.out.print("Endereço: ");
		String endereco = sc.nextLine().toUpperCase().trim();
		System.out.print("Celular(XX-XXXXX-XXXX): ");
		String celular = sc.nextLine().toUpperCase().trim();
		System.out.print("E-mail: ");
		String email = sc.nextLine().toUpperCase().trim();
		System.out.print("Link curriculo: ");
		String link = sc.nextLine().toUpperCase().trim();
		return new Ministrante(nome, endereco, celular, email, link);
	}
	public static void AlterarAtor(Scanner sc, Pessoa[] pessoas) {
		System.out.print("Informe o nome do ator: ");
		String nomeAtor = sc.nextLine().toUpperCase().trim();
		boolean existeUmAtor = false;
		for (Pessoa p : pessoas) {
			if(p != null && nomeAtor.equals(p.getNome())) {
				Ministrante m = (Ministrante) p;
				System.out.println("O que deseja alterar? ");
				System.out.println("1-Nome; 2-Endereço; 3-Celular; 4-Email; 5-Link do curriculo;");
				int alt = Integer.parseInt(sc.nextLine().trim());
				String novoDado;
				switch(alt) {
				case 1:
					System.out.print("Novo nome: ");
					novoDado = sc.nextLine().toUpperCase().trim();
					m.setNome(novoDado);
					break;
				case 2:
					System.out.print("Novo Endereço: ");
					novoDado = sc.nextLine().toUpperCase().trim();
					m.setEndereco(novoDado);
					break;
				case 3:
					System.out.print("Novo Celular: ");
					novoDado = sc.nextLine().toUpperCase().trim();
					m.setCelular(novoDado);
					break;
				case 4:
					System.out.print("Novo e-mail: ");
					novoDado = sc.nextLine().toUpperCase().trim();
					m.setEndereco(novoDado);
					break;
				case 5:
					System.out.print("Novo link: ");
					novoDado = sc.nextLine();
					m.setCurriculoLink(novoDado);
					break;
				default:
					System.out.println("Insira uma opção válida!");	
				}
				existeUmAtor = true;
			}
		}
		if (existeUmAtor == false) {
			if (existeUmAtor == false) {
				System.out.println();
				System.out.println("Nenhum ator encontrado! Por favor, tente novamente.");
				System.out.println();
			}
		}
	}
	public static void ExcluirAtor(Scanner sc, Pessoa[] pessoas) {
		System.out.print("Informe o nome do ator: ");
		String nome = sc.nextLine().toUpperCase().trim();
		boolean existeUmAtor = false;
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i] != null && nome.equals(pessoas[i].getNome())) {
				pessoas[i] = null;
				pessoas = OrganizarArray(pessoas);
				existeUmAtor = true;
				System.out.println();
				System.out.println("Ator excluído com sucesso!");
				System.out.println();
			}
		}
		if (existeUmAtor == false) {
			System.out.println();
			System.out.println("Nenhum ator encontrado! Por favor, tente novamente.");
			System.out.println();
		}
	}
	public static Pessoa AdicionarNovoDiretor(Scanner sc) {
		System.out.print("Nome: ");
		String nome = sc.nextLine().toUpperCase().trim();
		System.out.print("Endereço: ");
		String endereco = sc.nextLine().toUpperCase().trim();
		System.out.print("Celular(XX-XXXXX-XXXX): ");
		String celular = sc.nextLine().toUpperCase().trim();
		System.out.print("E-mail: ");
		String email = sc.nextLine().toUpperCase().trim();
		return new Diretor(nome, endereco, celular, email);
	}
	
	public static void ListarCadastrados(Pessoa[] pessoas) {
		for (Pessoa p : pessoas) {
			if (p instanceof Ministrante) {
				Ministrante m = (Ministrante) p;
				System.out.println(m);
			}
			else if (p instanceof Diretor) {
				Diretor d = (Diretor) p;
				System.out.println(d);
			}
		}
		System.out.println();
		System.out.println();
	}
	
	static Pessoa[] OrganizarArray(Pessoa[] pessoas) {
		int indiceNovoArray = 0;
		Pessoa[] novoArray = new Pessoa[pessoas.length];
		for (Pessoa p : pessoas) {
			if (p != null) {
				novoArray[indiceNovoArray] = p;
				indiceNovoArray++;
			}
		}
		return novoArray;
	}
}
