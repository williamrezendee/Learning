package application;

import entities.Boleto;
import entities.CartaoCredito;
import entities.Dinheiro;
                    
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boleto b1 = new Boleto();
		CartaoCredito cc1 = new CartaoCredito();
		Dinheiro d1 = new Dinheiro();
		
		b1.Pagar(100);
		cc1.Pagar(50);
		d1.Pagar(0);

	}

}
