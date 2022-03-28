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

    public void addPosition(int posicao, int elemento) {
        if(posicao < vetor.length) {
            for (int i = cont; i < posicao; i--) {
                vetor[i] = vetor[i - 1];

            }
            vetor[posicao] = elemento;
        } else {
            System.out.println("Posicao informada nao existe!");
        }
    }

    public void remove(int elemento) {

    }

    public void removeFinal() {
        cont--;
        vetor[cont] = 0;
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
        for(int i = 0; i < cont; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

    }
}
