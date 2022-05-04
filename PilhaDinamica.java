public class PilhaDinamica {
    private No top;
    private No bottom;
    private int cont;

    public PilhaDinamica() {
        top = null;
        bottom = null;
        cont = 0;
    }

    public void push(Object elemento) {
        No novo = new No(elemento);

        if(top == null){
            top = novo;
            bottom = novo;
        } else {
            bottom.next = novo;
            bottom = novo;
        }
        cont++;
    }

    public void pop() {
       No aux  = top;
       while(aux.next != bottom){
           aux = aux.next;
       }
       aux.next = null;
       bottom = aux;

       cont--;
    }

    public Object peek() {
        return top.element;
    }

    public void show() {
        No atual = top;

        while (atual != null) {
            System.out.print(atual.element.toString() + " ");
            atual = atual.next;
        }

        System.out.println();
    }
}
