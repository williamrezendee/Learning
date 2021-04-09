package Model.Entities;

import Model.Store.DataStorage;

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
	
	public String getCnpj() {
		return (this.cnpj.substring(0, 2)+"."+this.cnpj.substring(2, 5)+"."+this.cnpj.substring(5, 8)
		+"/"+this.cnpj.substring(8, 12)+"-"+this.cnpj.substring(12, 14));
	}
	public String getNomeFantasia() {return nomeFantasia;}
	public String getRazaoSocial() {return razaoSocial;}
	public String getEndereco() {return endereco;}
	public String getTelefone() {
		return ("("+this.telefone.substring(0, 2)+")"+this.telefone.substring(2, 6)
		+"-"+this.telefone.substring(6, 10));}
	public String getEmail() {return email;}
	
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public void setNomeFantasia(String nomeFantasia) {this.nomeFantasia = nomeFantasia;}
	public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public void setEmail(String email) {this.email = email;}
	
	public static String[] ListarDadosIES() {
		IES ies = DataStorage.MostrarIES();
		String[] dados = new String[6];
		dados[0] = ies.getNomeFantasia();
		dados[1] = ies.getRazaoSocial();
		dados[2] = ies.getCnpj();
		dados[3] = ies.getEndereco();
		dados[4] = ies.getEmail();
		dados[5] = ies.getTelefone();
		return dados;
	}
	
	public static void InserirIES(IES ies) {
		DataStorage.SalvarIES(ies);
	}
}
