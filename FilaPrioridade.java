public class FilaPrioridade {
    private NoFP top;
    private NoFP bottom;
    private int cont;

    public FilaPrioridade() {
        top = null;
        bottom = null;
        cont = 0;
    }

    public void enqueue(int element, int prioridade) {
        NoFP novo = new NoFP(element, prioridade);

        if (top == null) {
            top = novo;
            bottom = novo;
        } else {
            bottom.next = novo;
            novo.before = bottom;
            bottom = novo;
        }
        cont++;
    }

    public void dequeue() {
        NoFP aux = null;
        int i = 0;

        while (aux == null) {
           aux = searchPrioridade(i);
           i++;
        }
        aux.before.next = aux.next;

        aux.before.next = aux.next;

        cont--;
    }

    public NoFP search(int element){
        NoFP aux = top;

        for(int i = 0; i < element; i++){
            aux = aux.next;
        }
        return aux;
    }

    private NoFP searchPrioridade(int prioridade){
        NoFP aux = top;

        while (aux != null && aux.prioridade != prioridade){
            aux = aux.next;
        }

        return aux;
    }

    public boolean empty(){
        if(top == null){
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        NoFP atual = top;

        while (atual != null) {
            System.out.print(atual.element + "(" + atual.prioridade + ")" + " ");
            atual = atual.next;
        }

        System.out.println();
    }
}
