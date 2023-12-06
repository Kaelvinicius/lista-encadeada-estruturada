public class ListaEncadeada<t> {

    private No<t> inicio;
    private No<t> ultimo;
    private int tamanho;

    public int getTamanho() {
        return this.tamanho;
    }

    public void adiciona(t elemento) {
        No<t> celula = new No<t>(elemento);
        if (this.tamanho == 0){
            this.inicio = celula;
        }
        else {
            this.ultimo.setNext(celula);
        }
        this.tamanho++;
        this.ultimo = celula;
    }

    public void limpar() {
        for(No<t> atual = this.inicio; atual != null;){
            No<t> proximo = atual.getNext();
            atual.setElemento(null);
            atual.setNext(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        No<t> atual = this.inicio;
        for (int  i = 0; i < tamanho - 1; i++) {
            sb.append(atual.getElemento()).append(",");
            atual = atual.getNext();
        }
        sb.append(atual.getElemento());
        return sb.toString();
    }
}
