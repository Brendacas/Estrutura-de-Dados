package Estruturas;

public class No<T> {
    
    private T info; // informação q ta no nó
    private No<T> ant; //anterior
    private No<T> prox; //proximo
    
    // Cria um nó com informação
    public No(T info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }
    
    // Cria um nó vazio
    public No() {
        this(null);
    }

    // Get e Set
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    public No<T> getAnterior() {
        return ant;
    }

    public void setAnterior(No<T> ant) {
        this.ant = ant;
    } 

    public No<T> getProximo() {
        return prox;
    }

    public void setProximo(No<T> prox) {
        this.prox = prox;
    }

    // Mostra a informação do nó
    @Override
    public String toString() {
        return info + "\n";
    }


}