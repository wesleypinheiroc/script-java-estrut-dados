package estruturaDeDados;

import java.util.Arrays;

public class Vetor {
		
	Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
//	public void adicionar(Aluno aluno) {
//		// implementacao. Adiciona no final da lista
//		
//		// this.alunos.length = todo o tamanho do array
//		for(int i = 0; i < this.alunos.length; i++) {
//			if (this.alunos[i] == null) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
//	}
	
	private boolean posicaoOcupada(int posicao) {
		
//		if (posicao >= 0 && posicao <= this.totalDeAlunos) {
//			return true;
//		}
		
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	
	// Dessa forma o tempo de processamento de constante
	public void adicionar(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adicionar(int posicao, Aluno aluno) {
		// implementacao
		
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
			this.alunos[i + 1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	public Aluno pegar(int posicao) {
		// implementacao
		
//		return this.alunos[posicao];
		
		if(!this.posicaoOcupada(posicao)) {
//			System.out.println("Deu erro");
			throw new IllegalArgumentException("Posição inválida");
		}
		
		return this.alunos[posicao];
		
	}
	
	public void remove(int posicao) {
		// implementacao
		
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		
		this.totalDeAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
		// implementacao
		
		for(int i = 0; i < this.alunos.length; i++) {
			if (aluno == this.alunos[i]) {
				System.out.println("O aluno está na lista");
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		// implementacao
		
		return this.totalDeAlunos;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}

}