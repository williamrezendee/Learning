package br.edu.ifs.ccomp.ed.lista.teste;

import br.edu.ifs.ccomp.ed.lista.*;

public class TesteTamanho {

	public static void main(String[] args) {
		Lista list = new Lista();
		list.Adiciona(new Aluno("Pedro", "pedro@email.com"));
		list.Adiciona(new Aluno("Izaias", "izaias@email.com"));
		
		System.out.println(list.tamanho());

	}

}
