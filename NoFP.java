public class NoFP {
    public int element;
    public int prioridade;
    public NoFP next;
    public NoFP before;

    public NoFP(int element, int prioridade) {
        this.element = element;
        this.prioridade = prioridade;
        this.next = null;
        this.before = null;
    }
}
