package Model.Entities;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	private String celular;
	private String email;
	private String loginUsuario;
	private String loginSenha;
	
	public Pessoa(
			String nome,
			String cpf, 
			String endereco,
			String celular,
			String email,
			String loginUsuario,
			String loginSenha
			) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
		this.loginUsuario = loginUsuario;
		this.loginSenha = loginSenha;
	}
	
	public String getNome() {return nome;}
	public String getCpf() {
		return(this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." +
				this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11));
	}
	public String getEndereco() {return endereco;}
	public String getCelular() { 
		return("("+ this.celular.substring(0, 2) + ") " + this.celular.substring(2, 7) + "-" +
			this.celular.substring(7, 11));}
	public String getEmail() {return email;}
	public String getLoginUsuario() {return loginUsuario;}
	public String getLoginSenha() {return loginSenha;}
	
	public void setNome(String nome) {this.nome = nome;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public void setCelular(String celular) {this.celular = celular;}
	public void setEmail(String email) {this.email = email;}
	public void setLoginUsuario(String loginUsuario) {this.loginUsuario = loginUsuario;}
	public void setLoginSenha(String loginSenha) {this.loginSenha = loginSenha;}
}
