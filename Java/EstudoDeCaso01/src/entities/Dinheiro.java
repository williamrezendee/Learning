package entities;

import interfaces.TipoPagamento;

public class Dinheiro implements TipoPagamento {

	@Override
	public void Pagar(double valor) {
		// Codigo que valida o pagamento a dinheiro
		if(valor > 100) {
			System.out.println("Pagamento realizado com sucesso!");
		}
		else {
			System.out.println("Pagamento recusado!");
		}
	}	
}