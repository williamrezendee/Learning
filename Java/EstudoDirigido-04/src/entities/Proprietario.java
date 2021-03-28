package entities;

public class Proprietario extends Pessoa {

	public Proprietario(String nome, String endereco, String celular, String email) {
		super(nome, endereco, celular, email);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(this.getNome()
				+ ", " + this.getEndereco()
				+ ", " + this.getCelular()
				+ ", " + this.getEmail());
	}
}
