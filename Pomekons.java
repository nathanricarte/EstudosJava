import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static class No{
        public String element;
        public No next;

        public No(String element){
            this.element = element;
            next = null;
        }
    }

    public static class ListaDinamica{
        No first = null;
        No last = null;
        private int counter = 0;

        public void add(String element){
            No novo = new No(element);
            if(first == null) {
                first = novo;
                last = novo;
            }else {
                last.next = novo;
                last = novo;
            }
            counter++;
        }

        public int search(String valor){
            No aux = first;
            int position = 0;

            while(aux.next != null){
                aux = aux.next;
                position++;
                if(aux.element.equals(valor)){
                    return position;
                }
            }
            if(first.element.equals(valor)){
                return 0;
            }else {
                return-1;
            }
        }

        public int size(){
            return counter;
        }

        public void show(){
            No aux = first;
            while(aux != null){
                System.out.print(aux.element + " ");
                aux = aux.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        ListaDinamica lista = new ListaDinamica();
        Scanner scann = new Scanner(System.in);

        int n = scann.nextInt(); // quantidade de pomekons capturados
        int x = 151; // quantidade de pomekons nao capturadas

        for(int i = 0; i < n; i++){
            String S = scann.next();
            if(lista.size() == 0) {
                lista.add(S);
            }
            if(lista.search(S) == -1){
                lista.add(S);
            }
        }
        System.out.println("Falta(m) " + (x - lista.size()) + " pomekon(s).");
    }
}
