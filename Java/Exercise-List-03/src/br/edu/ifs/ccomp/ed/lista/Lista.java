package br.edu.ifs.ccomp.ed.lista;

public class Lista {
	
	private Aluno[] arranjo = new Aluno[100];
	
	public void Adiciona(Aluno aluno) {
		if (tamanho() == arranjo.length) {
			ExpandirVetor();
		}
		for (int i=0; i<arranjo.length; i++) {
			if (arranjo[i] == null) {
				arranjo[i] = aluno;
				return;
			}
		}
	}
	
	public void Adiciona(int posicao, Aluno aluno) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posicao informada não é válida para adicionar: " + posicao);
		}
		if (tamanho() == arranjo.length) {
			ExpandirVetor();
		}
		int tamanho = tamanho();
		if (posicao == tamanho) {
			arranjo[posicao] = aluno;
		} else {
			for (int i = tamanho; i > posicao; --i) {
				arranjo[i] = arranjo[i - 1];
			}
			arranjo[posicao] = aluno;
		}
	}
	
	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		return arranjo[posicao];
	}
	
	public void remove (int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		int tamanho = tamanho();
		for (int i = posicao; i < tamanho; ++i) {
			arranjo[i] = arranjo[i + 1];
		}
	}
	
	public int tamanho() {
		int count = 0;
		for (int i = 0; i < arranjo.length; ++i) {
			if (arranjo[i] == null) {
				count = i;
				break;
			}
		}
		return count;
	}
	
	public void LimparLista() {
		arranjo = new Aluno[100];
	}
	
	private void ExpandirVetor() {
		Aluno[] novoVetor = new Aluno[arranjo.length*2];
		for (int i=0; i<arranjo.length; i++) {
			novoVetor[i] = arranjo[i];
		}
		arranjo = novoVetor;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder("[");
		int count = 0;
		while(arranjo[count] != null) {
			if (count>0) {
				string.append(", ");
			}
			string.append(arranjo[count]);
			count++;
		}
		string.append("]");
		return string.toString();
	}
}