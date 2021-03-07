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
				int numCamas = random.nextInt(4);
				numCamas++;
				quartos[i][j] = new Quarto(numCamas);
				quartos[i][j].setNumQuarto(numQuarto);
				// Configura o tipo de Quarto com base em um número aleatório
				int tipoQuarto =  random.nextInt(2);
				if(tipoQuarto == 0) {
					quartos[i][j].setTipoQuarto(TipoQuarto.SIMPLES);
				}
				else {
					quartos[i][j].setTipoQuarto(TipoQuarto.LUXO);
				}
				// Define o tipo de cada cama
				int tipoCama;
				for(int q = 0; q < numCamas; q++) { // Lembrar que numCamas foi incrementado na linha 31
					tipoCama = random.nextInt(2);
					if(tipoCama == 0) {
						quartos[i][j].setCamas(q, new Cama(TipoCama.SOLTEIRO));
					}
					else {
						quartos[i][j].setCamas(q, new Cama(TipoCama.CASAL));
					}
				}
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
					String rgC = sc.next();
					System.out.print("CPF: ");
					String cpfC = sc.next();
					System.out.print("Endereço: ");
					String enderecoC = sc.nextLine();
					System.out.print("Telefone(apenas números): ");
					String telefoneC = sc.next();
					System.out.print("Celular(apenas números): ");
					String celularC = sc.next();
					System.out.print("E-mail: ");
					String emailC = sc.next();
					Colaborador colab = new Colaborador(nomeC, rgC, cpfC, enderecoC, telefoneC, celularC, emailC);
					colabs.add(colab);
					System.out.println();
					break;
				case 2:
					System.out.print("Nome do hospede: ");
					String nomeH = sc.nextLine();
					System.out.print("RG: ");
					String rgH = sc.next();
					System.out.print("CPF: ");
					String cpfH = sc.next();
					System.out.print("Endereço: ");
					String enderecoH = sc.nextLine();
					System.out.print("Telefone(apenas números): ");
					String telefoneH = sc.next();
					System.out.print("Celular(apenas números): ");
					String celularH = sc.next();
					System.out.print("E-mail: ");
					String emailH = sc.next();
					Hospede hospede = new Hospede(nomeH, rgH, cpfH, enderecoH, telefoneH, celularH, emailH);
					hospedes.add(hospede);
					System.out.println();
					break;
				case 3:
					MostrarQuartos(quartos);
					System.out.print("Escolha um quarto: ");
					int numEscolha = Integer.parseInt(sc.next());
					for (int i = 0; i < 4; i++) {
						for(int j = 0; j < 4; j++) {
							if (quartos[i][j].getNumQuarto() == numEscolha) {
								System.out.println("Informações do quarto:");
								System.out.println("Número: " + quartos[i][j].getNumQuarto());
								System.out.println("Tipo: " + quartos[i][j].getTipoQuarto());
								System.out.println("Quantidade de camas: " + quartos[i][j].getNumCamas());
								System.out.println("Tipos de cama: ");
								int numCamasSolteiro = 0;
								int numCamasCasal = 0;
								for(int q = 0; q < quartos[i][j].getNumCamas(); q++) {
									if (quartos[i][j].getCamas(q).getTipoCama() == TipoCama.SOLTEIRO) {
										numCamasSolteiro++;
									}
									else {
										numCamasCasal++;
									}
								}
								System.out.println(numCamasSolteiro + " Solteiro e " + numCamasCasal + " Casal"); // Dá para melhorar
							}
						}
					}
					break;
				default:
					break;
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
	
	public static Random random = new Random();
}