import java.io.IOException;
import java.util.Scanner;
public class Main{

    public static class No{
        public String element;
        public No next;

        public No(String element){
            this.element = element;
            next = null;
        }
    }

    public static class ListaDinamicaOrdinada {
        private No first;
        private No last;
        private int counter;

        public ListaDinamicaOrdinada() {

            first = null;
            last = null;
            counter = 0;
        }

        public void add(String valor) {
            No novo = new No(valor);

            if (first == null) {
                first = novo;
                last = novo;
            } else {
                if (novo.element.compareTo(first.element) < 0) {
                    novo.next = first;
                    first = novo;
                } else {
                    if (novo.element.compareTo(last.element) > 0) {
                        last.next = novo;
                        last = novo;
                    } else {
                        No aux = first;
                        No aux2 = null;
                        while (aux != null && novo.element.compareTo(aux.element) > 0) {
                            aux2 = aux;
                            aux = aux.next;
                        }
                        novo.next = aux;
                        aux2.next = novo;
                    }
                }
            }
            counter++;
        }

        public boolean search(String valor) {
            for (No aux = first; aux != null; aux = aux.next) {
                if (aux.element.equals(valor)) {
                    return true;
                }
            }
            return false;
        }

        public void show() {

            for (No aux = first; aux != null; aux = aux.next) {
                if (!aux.equals(last)) {
                    System.out.print(aux.element + " ");
                } else {
                    System.out.println(aux.element);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner scann = new Scanner(System.in);

        int q; // quantidade de casos teste

        q = scann.nextInt();
        scann.nextLine(); // pular linha
        for(int i = 0; i < q; i++){
            ListaDinamicaOrdinada lista = new ListaDinamicaOrdinada();

            String itens[] = scann.nextLine().split(" ");
            for(String item : itens){
                if(!lista.search(item)){
                    lista.add(item);
                }
            }
            lista.show();
        }
    }
}
