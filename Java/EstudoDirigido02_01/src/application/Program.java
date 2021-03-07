package application;

import entities.Hospede;
import entities.Pessoa;
import entities.Colaborador;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Random;

import entities.Cama;
import entities.Quarto;
import enums.TipoCama;
import enums.TipoQuarto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Colaborador> colabs = new ArrayList<Colaborador>();
		ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
		
		Quarto quartos[][] = new Quarto[4][4];
		int numQuarto = 0;
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				numQuarto++;
				quartos[i][j] = new Quarto();
				quartos[i][j].setNumQuarto(numQuarto);
				quartos[i][j].setTipoQuarto();
			}	
		}
		
		int opcao = 0;
		while(opcao != 9) {
			Menu();
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					System.out.print("Nome do colaborador: ");
					sc.nextLine();
					String nomeC = sc.nextLine();
					System.out.print("RG: ");
					int rgC = Integer.parseInt(sc.next());
					System.out.print("CPF: ");
					int cpfC = Integer.parseInt(sc.next());
					System.out.print("Endereço: ");
					String enderecoC = sc.nextLine();
					System.out.print("Telefone(apenas números): ");
					int telefoneC = Integer.parseInt(sc.next());
					System.out.print("Celular(apenas números): ");
					int celularC = Integer.parseInt(sc.next());
					System.out.print("E-mail: ");
					String emailC = sc.next();
					Colaborador colab = new Colaborador(nomeC, rgC, cpfC, enderecoC, telefoneC, celularC, emailC);
					colabs.add(colab);
				case 2:
					System.out.print("Nome do hospede: ");
					String nomeH = sc.nextLine();
					System.out.print("RG: ");
					int rgH = Integer.parseInt(sc.next());
					System.out.print("CPF: ");
					int cpfH = Integer.parseInt(sc.next());
					System.out.print("Endereço: ");
					String enderecoH = sc.nextLine();
					System.out.print("Telefone(apenas números): ");
					int telefoneH = Integer.parseInt(sc.next());
					System.out.print("Celular(apenas números): ");
					int celularH = Integer.parseInt(sc.next());
					System.out.print("E-mail: ");
					String emailH = sc.next();
					Hospede hospede = new Hospede(nomeH, rgH, cpfH, enderecoH, telefoneH, celularH, emailH);
					hospedes.add(hospede);
				case 3:
					MostrarQuartos(quartos);
					System.out.println("Escolha um quarto: ");
					int numEscolha = Integer.parseInt(sc.next());
				default:	
			}
		}	
		sc.close();
	}
	
	public static void Menu() {
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Cadastrar colaborador");
		System.out.println("2 - Cadastrar Hospede");
		System.out.println("3 - Fazer uma reserva");
		System.out.println("4 - Alterar dados cadastrais");
		System.out.println("9 - Sair");
	}
	public static void MostrarQuartos(Quarto matriz[][]) {
		System.out.println();
		System.out.println("=========================");
		System.out.println("      Q U A R T O S      ");
		System.out.println("=========================");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(matriz[i][j].getOcupado() == false) {
					if(matriz[i][j].getNumQuarto() < 10) {
						System.out.print("|  " + matriz[i][j].getNumQuarto() + "  ");
					}
					else {
						System.out.print("|  " + matriz[i][j].getNumQuarto() + " ");
					}	
				}
				else {
					System.out.print("|  X  |  ");
				}
			}
			System.out.println("|");
		}
		System.out.println("=========================");
		System.out.println("Legenda: X = Quarto Reservado");
		System.out.println();
	}
}