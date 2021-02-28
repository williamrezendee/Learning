package application;

import entities.Publicacao;
import entities.Artigo;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Publicacao abnt1 = new Publicacao();
		Publicacao abnt2 = new Publicacao(2021);
		System.out.println(abnt1.getAnoPublicacao());
		abnt1.setAnoPublicacao(2018);
		System.out.println(abnt1.getAnoPublicacao());
		abnt2.criarSumario();
		Artigo artigo1 = new Artigo();
		Livro livro1 = new Livro();
		artigo1.setConclusao(2015);
		livro1.setCodigo(1122334455);
		System.out.println(artigo1.getConclusao());
		System.out.println(livro1.getCodigo());

	}

}
