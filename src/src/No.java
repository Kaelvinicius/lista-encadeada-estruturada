public class No<t> {

    private t elemento;
    private No<t> next;

    public No(t elemento) {
        this.elemento = elemento;
    }

    public No(t elemento, No<t> next) {
        this.elemento = elemento;
        this.next = next;
    }

    public t getElemento() {
        return elemento;
    }

    public void setElemento(t elemento) {
        this.elemento = elemento;
    }

    public No<t> getNext() {
        return next;
    }

    public void setNext(No<t> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", next=" + next +
                '}';
    }
}
