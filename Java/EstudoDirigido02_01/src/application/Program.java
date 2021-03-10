package application;

import entities.Hospede;
import entities.Colaborador;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import entities.Cama;
import entities.Quarto;
import enums.TipoCama;
import enums.TipoQuarto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Colaborador colaborador = new Colaborador();
		ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
		
		Quarto quartos[][] = GerarMatriz();
		
		int opcao = 0;
		while (opcao != 9) {
			Menu();
			opcao = sc.nextInt();
			if (opcao == 1) {
				hospedes.add(colaborador.CadastrarHospede(sc));
			}
			else if (opcao == 2) {
				MostrarQuartos(quartos);
				String reserva = null;
				System.out.print("Escolha um quarto: ");
				int numEscolha = sc.nextInt();
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						if (quartos[i][j].getNumQuarto() == numEscolha) {
							System.out.println("=====================================");
							System.out.println("Informa��es do quarto:");
							System.out.println("=====================================");
							System.out.println("Quarto: " + quartos[i][j].getNumQuarto());
							System.out.println("Tipo: " + quartos[i][j].getTipoQuarto());
							System.out.println("Quantidade de camas: " + quartos[i][j].getNumCamas());
							System.out.println("Tipos de cama: ");
							int numCamasSolteiro = 0;
							int numCamasCasal = 0;
							for (int q = 0; q < quartos[i][j].getNumCamas(); q++) {
								if (quartos[i][j].getCamas(q).getTipoCama() == TipoCama.SOLTEIRO) {
									numCamasSolteiro++;
								} else {
									numCamasCasal++;
								}
							}
							System.out.println(numCamasSolteiro + " Solteiro e " + numCamasCasal + " Casal");																					// melhorar
							System.out.println("=====================================");
							System.out.print("Reservar esse quarto(Y/N)? ");
							reserva = sc.next();
							if (reserva.equals("Y") || reserva.equals("y")) {
								System.out.print("Informe o CPF do hospede: ");
								String cpf = sc.next();
								boolean verificar = colaborador.VerificarHospede(hospedes, cpf);
								if (verificar == true) {
									quartos = colaborador.FazerReserva(quartos, hospedes, i, j, cpf);
									System.out.println("=====================================");
									System.out.println("Reserva efetuada com sucesso!");
								}
								else {
									System.out.println("=====================================");
									System.out.println("Nenhum hospede cadastrado com esse CPF!");
									System.out.println("Cadastrar :");
									hospedes.add(colaborador.CadastrarHospede(sc));
								}
							}
						}
					}
				}
				System.out.println();
			}
			else if (opcao == 3) {
				System.out.println("=====================================");
				System.out.println("|  1 - Nome  | 4-Endere�o | 7-Email |");
				System.out.println("|  2 - RG    | 5-Telefone |         |");
				System.out.println("|  3 - CPF   | 6-Celular  |         |");
				System.out.println("=====================================");
				System.out.print("Selecione o dado que deseja alterar: ");
				int dadoAlterar = sc.nextInt();
				System.out.print("Informe o CPF do hospede: ");
				String cpf = sc.next();
				for (Hospede h : hospedes) {
					if (cpf.equals(h.getCpf())) {
						String novoDado = null;
						switch(dadoAlterar) {
						case 1:
							System.out.print("Novo nome: ");
							novoDado = sc.nextLine();
							h.setNome(novoDado);
							System.out.println("OK!");
							break;
						case 2:
							System.out.print("Novo RG: ");
							novoDado = sc.nextLine();
							h.setRg(novoDado);
							System.out.println("OK!");
							break;
						case 3:
							System.out.print("Novo CPF: ");
							novoDado = sc.nextLine();
							h.setCpf(novoDado);
							System.out.println("OK!");
							break;
						case 4:
							System.out.print("Novo endere�o: ");
							novoDado = sc.nextLine();
							h.setEndereco(novoDado);
							System.out.println("OK!");
							break;
						case 5:
							System.out.print("Novo telefone: ");
							novoDado = sc.nextLine();
							h.setTelefone(novoDado);
							System.out.println("OK!");
							break;
						case 6:
							System.out.print("Novo celular: ");
							novoDado = sc.nextLine();
							h.setCelular(novoDado);
							System.out.println("OK!");
							break;
						case 7:
							System.out.print("Novo e-mail: ");
							novoDado = sc.nextLine();
							h.setEmail(novoDado);
							System.out.println("OK!");
							break;
						}
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
	public static void Menu() {
		System.out.println("=====================================");
		System.out.println("S I S T E M A  D E  H O T E L A R I A");
		System.out.println("=====================================");
		System.out.println("1 - Cadastrar Hospede");
		System.out.println("2 - Fazer uma reserva");
		System.out.println("3 - Alterar dados do hospede");
		System.out.println("9 - Sair");
		System.out.println("=====================================");
		System.out.print("Escolha uma op��o: ");
	}
	public static void MostrarQuartos(Quarto matriz[][]) {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("            Q U A R T O S            ");
		System.out.println("=====================================");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				if(matriz[i][j].getOcupado() == false) {
					if(matriz[i][j].getNumQuarto() < 10) {
						System.out.print("|  " + matriz[i][j].getNumQuarto() + "  ");
					}
					else {
						System.out.print("|  " + matriz[i][j].getNumQuarto() + " ");
					}	
				}
				else {
					System.out.print("|  X  ");
				}
			}
			System.out.println("|");
		}
		System.out.println("=====================================");
		System.out.println("Legenda: X = Quarto Reservado");
	}
	public static Random random = new Random();
	
	public static Quarto[][] GerarMatriz() {
		Quarto quartos[][] = new Quarto[4][6];
		int numQuarto = 0;
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				numQuarto++;
				int numCamas = random.nextInt(4);
				numCamas++;
				quartos[i][j] = new Quarto(numCamas);
				quartos[i][j].setNumQuarto(numQuarto);
				// Configura o tipo de Quarto com base em um n�mero aleat�rio
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
		return quartos;
	}
}