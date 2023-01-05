package Estruturas;

import java.io.Serializable;

// Pilha de tipo genérico
public class Pilha<T> implements Serializable{
    
    private List<T> pilha; //  lista para representar uma pilha
    private No<T> topo; // topo da pilha

    // Inicializando a pilha
    public Pilha(){
        this.pilha = new List<>();
        this.topo = null;
    }

    // Inserindo os elementos
    public void empilhar(T info){
        No<T> a = new No<>(info);

        pilha.inserirInicio(a);
        this.topo = pilha.getInicio();
    }

    // Removendo elementos da pilha
    public T desempilhar(){
        No<T> node = new No<>();
        node = pilha.removerInicio();
        this.topo = topo.getProximo();

        return node.getInfo();
    }

    // Imprimindo a pilha interia
    public String imprimePilha(){
        return pilha.imprimeList();
    }
    

    public No<T> getTopo() {
        return topo;
    }

    public int getTam(){
        return pilha.getTam();
    }

    // Mostra o topo e o tamanho da pilha
    @Override
    public String toString() {
        String str = "Pilha: " + getTopo();
        str += "Tamanho: " + pilha.getTam();

        return str;
    }

}
