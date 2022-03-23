public class ListaEstatica {
	private int vetor[];
	private int cont;
	
	public ListaEstatica(int n) {
		vetor = new int[n];
		cont = 0;
	}
	
	public void add(int elemento) {
		if(cont < vetor.length) {
			vetor[cont] = elemento;
			cont++;
		} else 
			System.out.println("Lista cheia!");
	}
	
	public void add(int posicao, int elemento) {  
		if(posicao < vetor.length) {
			for (int i = cont; i > posicao; i--)
				vetor[i] = vetor[i - 1];
		} else 
			System.out.println("Posicao informada nao existe!");
	}
	
	public void remove(int elemento) {
		
	}
	
	public int search(int posicao) {
		return vetor[posicao];
	}
	
	public boolean contain(int elemento) {
		return false;
	}
	
	public int size() {
		return cont;
	}
	
	public void clear() {
		
	}
	
	public void show() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
			
	}
}
