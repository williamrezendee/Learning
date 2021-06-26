package br.edu.ifs.ccomp.ed.lista.teste;

import br.edu.ifs.ccomp.ed.lista.*;

public class TestePegaNaPosicao {

	public static void main(String[] args) {
		Lista list = new Lista();
		list.Adiciona(new Aluno("Roberto", "roberto@email.com"));
		list.Adiciona(new Aluno("José", "jose@email.com"));
		
		System.out.println(list);
		
		Aluno aluno1 = list.pega(0);
		System.out.println(aluno1);

		Aluno aluno2 = list.pega(1);
		System.out.println(aluno2);

		System.out.println(list.pega(3));
		System.out.println(list.pega(101));
	}

}
