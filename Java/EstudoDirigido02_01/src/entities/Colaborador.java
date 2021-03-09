package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Colaborador extends Pessoa{

	public Colaborador() {
	}
	public Colaborador(String nome, String rg, String cpf, String endereco, String telefone, String celular, String email) {
		super(nome, rg, cpf, endereco, telefone, celular, email);
		
	}
	public Hospede CadastrarHospede(Scanner sc) {
		System.out.print("Nome do hospede: ");
		sc.nextLine();
		String nomeH = sc.nextLine();
		System.out.print("RG: ");
		String rgH = sc.nextLine();
		System.out.print("CPF: ");
		String cpfH = sc.nextLine();
		System.out.print("Endereço: ");
		String enderecoH = sc.nextLine();
		System.out.print("Telefone(apenas números): ");
		String telefoneH = sc.nextLine();
		System.out.print("Celular(apenas números): ");
		String celularH = sc.nextLine();
		System.out.print("E-mail: ");
		String emailH = sc.nextLine();
		return new Hospede(nomeH, rgH, cpfH, enderecoH, telefoneH, celularH, emailH);
	}
	
	
	public Quarto[][] FazerReserva(Quarto[][] quartos, ArrayList<Hospede> hospedes, int i, int j, String cpf) {
		for (Hospede h: hospedes) {
			if (cpf.equals(h.getCpf())) {
				quartos[i][j].setHospede(h);
				quartos[i][j].setOcupado(true);
			}
		}
		return quartos;
	}
	public boolean VerificarHospede(ArrayList<Hospede> hospedes, String cpf) {
		for (Hospede h : hospedes) {
			if (cpf.equals(h.getCpf())) {
				return true;
			}
		}
		return false;
	}
}
	