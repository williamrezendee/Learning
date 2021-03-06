package entities;

import interfaces.TipoPagamento;

public class CartaoCredito implements TipoPagamento {
	
	@Override
	public void Pagar(double valor) {
		// Codigo que valida o pagamento de cartão de crédito
		if(valor > 100) {
			System.out.println("Pagamento realizado com sucesso!");
		}
		else {
			System.out.println("Pagamento recusado!");
		}
	}
}