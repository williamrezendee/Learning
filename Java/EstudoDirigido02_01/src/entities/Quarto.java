package entities;

import enums.TipoQuarto;

public class Quarto {
	// Attributes
	private int numQuarto;
	private TipoQuarto tipoQuarto;
	private int numCamas;
	private Cama camas[] = new Cama[numCamas];
	private boolean ocupado;
	private Hospede hospede;
	// Constructors
	public Quarto() {
	}
	public Quarto(TipoQuarto tipoQuarto, int numCamas, int num) {
		this.tipoQuarto = tipoQuarto;
		this.numCamas = numCamas;
		this.ocupado = false;
		this.hospede = null;
		this.numQuarto = num;
	}
	// Getters
	public int getNumQuarto() { return numQuarto; }
	public TipoQuarto getTipoQuarto() { return tipoQuarto; }
	public int getNumCamas() { return numCamas; }
	public boolean getOcupado() { return ocupado; }
	public Hospede getHospede() { return hospede; }
	public Cama getCamas(int value) { 
		return camas[value];
	}
	
	// Setters
	public void setNumQuarto(int num) { this.numQuarto = num; }
	public void setTipoQuarto(TipoQuarto tipoQuarto) { this.tipoQuarto = tipoQuarto; }
	public void setNumCamas(int numCamas) { this.numCamas = numCamas; }
	public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
	public void setHospede(Hospede hospede) { this.hospede = hospede; }
	public void setCamas(Cama cama, int position) {
		camas[position] = cama;
	}
}