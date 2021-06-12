package algoritmoestruturadedados;

public class TadPilha {
	int capacidade;
	int topo;
	char dados[];
	String nome;

//  ----------------------------------------------------------------
	public TadPilha(int n) {
//  ----------------------------------------------------------------
		capacidade = n;
		topo = -1;
		dados = new char[capacidade];
		nome = "";
	}

//  ----------------------------------------------------------------
	public TadPilha(int n, String nome) {
//  ----------------------------------------------------------------
		capacidade = n;
		topo = -1;
		dados = new char[capacidade];
		this.nome = nome;
	}

//  ----------------------------------------------------------------
	public boolean cheia() {
//  ----------------------------------------------------------------
		return (topo == capacidade - 1);
	}

//  ----------------------------------------------------------------
	public boolean vazia() {
//  ----------------------------------------------------------------
		return (topo == -1);
	}

//  ----------------------------------------------------------------
	public boolean empilha(char valor) {
//  ----------------------------------------------------------------
		if (cheia()) {
			return false;
		} else {
			topo++;
			dados[topo] = valor;
			return true;
		}
	}

//  ----------------------------------------------------------------
	public void imprime() {
//  ----------------------------------------------------------------
		if (vazia()) {
			System.out.println("      * * * Pilha " + this.nome + " vazia * * *");
		} else {
			int i;
			for (i = 0; i <= topo; i++)
				System.out.println("Elemento [" + i + "]= " + this.dados[i]);
		}
	}

//  ----------------------------------------------------------------
	public void imprimeInvertido() {
//  ----------------------------------------------------------------
		if (vazia()) {
			System.out.println("      * * * Pilha " + this.nome + " vazia * * *");
		} else {
			int i;
			for (i = topo; i >= 0; i--)
				System.out.println("Elemento " + i + "=" + this.dados[i]);
		}
	}

//  ----------------------------------------------------------------
	public void esvazia() {
//  ----------------------------------------------------------------
		topo = -1;
	}

//  ----------------------------------------------------------------
	public int getTopo() {
//  ----------------------------------------------------------------
		return (topo);
	}

//  ----------------------------------------------------------------
	public int desempilha() {
//  ----------------------------------------------------------------
		int retorno = -1;

		if (!this.vazia()) {
			retorno = dados[this.topo];
			this.topo--;
		}
		return retorno;
	}

}