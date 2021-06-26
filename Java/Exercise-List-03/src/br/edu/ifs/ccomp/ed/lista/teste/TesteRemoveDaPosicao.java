package br.edu.ifs.ccomp.ed.lista.teste;

import br.edu.ifs.ccomp.ed.lista.*;

public class TesteRemoveDaPosicao {

	public static void main(String[] args) {
		Lista list = new Lista();
		list.Adiciona(new Aluno("Anne", "anne@email.com"));
		list.Adiciona(new Aluno("Larissa", "larissa@email.com"));
		list.Adiciona(new Aluno("Bruna", "bruna@email.com"));
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

	}

}
