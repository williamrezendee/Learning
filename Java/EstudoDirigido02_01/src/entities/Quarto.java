package entities;

import java.util.Random;

import enums.TipoCama;
import enums.TipoQuarto;

public class Quarto {
	// Attributes
	private int numQuarto;
	private TipoQuarto tipoQuarto;
	private int numCamas;
	private Cama camas[];
	private boolean ocupado;
	private Hospede hospede;
	// Constructors
	public Quarto(int numCamas) {
		this.ocupado = false;
		this.hospede = null;
		this.camas = new Cama[numCamas];
		this.numCamas = numCamas;
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
	public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
	public void setHospede(Hospede hospede) { this.hospede = hospede; }
	public void setCamas( int posicao, Cama cama) {
		camas[posicao] = cama;
	}
	
	public Random random = new Random();
	
	public Quarto[][] GerarMatriz() {
		Quarto quartos[][] = new Quarto[4][6];
		int numQuarto = 0;
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				numQuarto++;
				int numCamas = random.nextInt(4);
				numCamas++;
				quartos[i][j] = new Quarto(numCamas);
				quartos[i][j].setNumQuarto(numQuarto);
				// Configura o tipo de Quarto com base em um número aleatório
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