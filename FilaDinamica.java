public class FilaDinamica {
    private No top;
    private No bottom;
    private int cont;

    public FilaDinamica() {
        top = null;
        bottom = null;
        cont = 0;
    }

    public void enqueue(Object element) {
        No novo = new No(element);

        if (top == null) {
            top = novo;
            bottom = novo;
        } else {
            bottom.next = novo;
            bottom = novo;
        }
    }

    public Object dequeue() {
        if (top != null) {
            No element = top;

            top = top.next;
            element.next = null;

            return element.element;
        }

        return null;
    }

    public boolean empty(){
        if(top == null){
            return true;
        } else {
            return false;
        }
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
