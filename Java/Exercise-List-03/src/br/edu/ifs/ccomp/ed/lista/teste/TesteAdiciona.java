package br.edu.ifs.ccomp.ed.lista.teste;

import br.edu.ifs.ccomp.ed.lista.*;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista list = new Lista();
		list.Adiciona(new Aluno("William", "william@email.com"));
		list.Adiciona(new Aluno("Levi", "levi@email.com"));
		
		System.out.println(list);
		System.out.println("Limpando a lista:");
		list.LimparLista();
		System.out.println(list);
	}
}
