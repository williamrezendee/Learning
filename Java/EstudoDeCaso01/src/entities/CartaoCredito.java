package entities;

import interfaces.TipoPagamento;

public class CartaoCredito implements TipoPagamento {
	
	@Override
	public void Pagar(double valor) {
		// Codigo que valida o pagamento de cart�o de cr�dito
		if(valor > 100) {
			System.out.println("Pagamento realizado com sucesso!");
		}
		else {
			System.out.println("Pagamento recusado!");
		}
	}
}