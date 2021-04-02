package Model.Entities;

public class IES {
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;
	private String endereco;
	private String telefone;
	private String email;
	
	public IES() {
	}
	public IES(
			String cnpj, 
			String nomeFantasia, 
			String razaoSocial,
			String endereco,
			String telefone,
			String email
			) {
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getCnpj() {return cnpj;}
	public String getNomeFantasia() {return nomeFantasia;}
	public String getRazaoSocial() {return razaoSocial;}
	public String getEndereco() {return endereco;}
	public String getTelefone() {return telefone;}
	public String getEmail() {return email;}
	
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public void setNomeFantasia(String nomeFantasia) {this.nomeFantasia = nomeFantasia;}
	public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public void setEmail(String email) {this.email = email;}
}
