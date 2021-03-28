package entities;

public class Diretor extends Pessoa {

	public Diretor(String nome, String endereco, String celular, String email) {
		super(nome, endereco, celular, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Diretor: " + this.getNome()
				+ ", endereco: " + this.getEndereco()
				+ ", celular: " + this.getCelular()
				+ ", e-mail: " + this.getEmail());
	}	
}
