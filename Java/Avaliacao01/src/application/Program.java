package application;

import entities.Pessoa;
import entities.Mae;
import entities.Medico;
import entities.Bebe;
import entities.Medicamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
		
		int opcao = 0;
		while (opcao != 9) {
			opcao = Menu();
			if (opcao == 1) {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Data de nascimento (dd/MM/yyyy): ");
				String dataNasc = sc.next();
				System.out.print("CRM: ");
				sc.nextLine();
				String crm = sc.nextLine();
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				sc.nextLine();
				System.out.print("Celular (Apenas números): ");
				int celular = sc.nextInt();
				pessoas.add(new Medico(nome, dataNasc, crm, endereco, celular));
			}
			if (opcao == 2) {
				System.out.print("Nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Data de nascimento:");
				sc.nextLine();
				String dataNasc = sc.nextLine();
				System.out.print("Sobrenome:");
				sc.nextLine();
				String sobrenome = sc.nextLine();
				System.out.print("Endereço:");
				sc.nextLine();
				String endereco = sc.nextLine();
				System.out.print("Telefone:");
				sc.nextLine();
				int telefone = sc.nextInt();
				pessoas.add(new Mae(nome, dataNasc, sobrenome, endereco, telefone));	
			}
			if (opcao == 3) {
				System.out.print("Nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Data de nascimento:");
				sc.nextLine();
				String dataDeNascimento = sc.nextLine();
			}
			if (opcao == 4) {
				System.out.print("Nome: ");
				sc.nextLine();
				String descricao = sc.nextLine();
				System.out.print("Quantidade: ");
				int quantidadeEmEstoque = sc.nextInt();
				System.out.print("Unidade Medida: ");
				sc.nextLine();
				String unidadeMedida = sc.nextLine();
				medicamentos.add(new Medicamento(descricao, quantidadeEmEstoque, unidadeMedida));
			}
			if (opcao == 5) {
				for (Pessoa p : pessoas) {
					System.out.print("Nome: "
							+ p.getNome()
							+ ", Data de Nascimento: "
							+ p.getDataNasc());
					if (p instanceof Medico) {
						Medico m = (Medico)p;
						System.out.print(", CRM: "
								+ m.getCrm()
								+ ", Endereço: "
								+ m.getEndereco()
								+ ", Celular: "
								+ m.getCelular());
					}
					if (p instanceof Mae) {
						Mae m = (Mae)p;
						System.out.print(", Sobrenome: "
								+ m.getSobrenome()
								+ ", Endereço: "
								+ m.getEndereco()
								+ ", Telefone: "
								+ m.getTelefone());
					}
					if (p instanceof Bebe) {
						Bebe b = (Bebe)p;
						System.out.print(", Noma da Mãe: "
								+ b.getMae().getNome()
								+ ", Nome do Médico: "
								+ b.getMedico().getNome());
					}
				}
			}
			if (opcao == 6) {
				for (Medicamento m : medicamentos) {
					System.out.println("Descrição: "
							+ m.getDescricao()
							+ ", Quantidade: "
							+ m.getQuantidadeEstoque()
							+ ", Unidade de Medida: "
							+ m.getUnidadeMedida());
				}
			}
		}
		sc.close();
	}
	
	private static int Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um Médico");
		System.out.println("2 - Incluir uma Mãe");
		System.out.println("3 - Incluir um Bebê");
		System.out.println("4 - Incluir um Medicamento");
		System.out.println("5 - Listar pessoas caadastradas");
		System.out.println("5 - Listar medicamentos caadastrados");
		System.out.println("9 - Sair");
		System.out.println("Opção: ");
		int opcao = sc.nextInt();
		return opcao;
	}
}
