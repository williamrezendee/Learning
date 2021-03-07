package entities;

import enums.TipoCama;

public class Cama {
	// Attributes
	private TipoCama tipoCama;
	// Constructors
	public Cama(TipoCama tipoCama) {
		this.tipoCama = tipoCama;
	}
	// Getters
	public TipoCama getTipoCama() { return tipoCama; }
	// Setters
	public void setTipoCama(TipoCama tipoCama) { this.tipoCama = tipoCama; }
}
