package br.edu.ifs.ccomp.ed.lista.teste;

import br.edu.ifs.ccomp.ed.lista.*;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args) {
		Lista list = new Lista();
		list.Adiciona(new Aluno("Bruno", "bruno@email.com"));
		list.Adiciona(new Aluno("Carlos", "carlos@email.com"));

		list.Adiciona(0, new Aluno("Ana", "ana@email.com"));
		list.Adiciona(2, new Aluno("Eloa", "eloa@email.com"));

		System.out.println(list);

	}

}
