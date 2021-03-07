package entities;

import enums.TipoCama;

public class Cama {
	// Attributes
	private TipoCama tipoCama;
	// Constructors
	public Cama(TipoCama tipo) {
		this.tipoCama = tipo;
	}
	// Getters
	public TipoCama getTipoCama() { return tipoCama; }
	// Setters
	public void setTipoCama(TipoCama tipoCama) { this.tipoCama = tipoCama; }
}
