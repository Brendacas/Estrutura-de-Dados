package Estruturas;

import java.io.Serializable;

// Lista de tipo genérico
public class List<T> implements Serializable{
    
    private No<T> inicio; // Nó inicial
    private No<T> fim; // Nó final
    
    private int tamanho = 0; 

    
    public List(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserirInicio(No<T> info){
        No<T> node = info;
        
        // Se a lista estiver vazia insere o primeiro elemento
        if(isEmpty())
            this.fim = node;

        // Se a lista já tiver elementos
        else{
            node.setProximo(inicio);
            inicio.setAnterior(node);
              
        }
        
        this.inicio = node;
        this.tamanho += 1;
    }

    public void inserirFinal(No<T> info){
        No<T> node = info;
        
        // Se a lista estiver vazia insere o primeiro elemento;
        if(isEmpty())
            this.inicio = node;

        // Se a lista já tiver elementos
        else{
            fim.setProximo(node);
            node.setAnterior(fim);
        
        }

        this.fim = node;
        this.tamanho += 1;
    }

    // Remove primeiro elemento
    public No<T> removerInicio(){
        // Se a lista não estiver vazia
        if(!isEmpty()){
            No<T> node = new No<>();
            node = this.inicio;

            // Lista possui apenas um elemento
            if(this.inicio == this.fim)
                this.inicio = this.fim = null; 
            else{
                inicio = node.getProximo();
                inicio.setAnterior(null);
                
            }           
            
            this.tamanho--;
            return node;
            
        }
        // Lista está vazia
        else{
            System.out.println("Estrutura Vazia, nao da para remover!!");
            System.exit(0);
            return null;
            
        }
    }

    // Remove último elemento da lista
    public void removerFinal(){
        // Se a lista não estiver vazia
        if(!isEmpty()){
            No<T> node = new No<>();
            node = this.fim;

            // Lista possui apenas um elemento
            if(this.inicio == this.fim)
                this.inicio = this.fim = null;
                
            else{
                fim = node.getAnterior();
                fim.setProximo(null);

            }           
            
            this.tamanho--;
        }
        // Lista está vazia
        else{
            System.out.println("Estrutura Vazia, impossível remover!!");
            System.exit(0);
            
        }
    }

    // Imprime a lista inteira
    public String imprimeList(){
        No<T> node = new No<>();
        node = this.inicio;
        String str = "";

        while(node != null){
            str += node;
            node = node.getProximo();
        }

        return str;
    }

    // Retorna o tamanho
    public int getTam(){
        return this.tamanho;
    }

    // Retorna o inicio
    public No<T> getInicio(){
        return this.inicio;
    }

    // Retorna o fim
    public No<T> getFim(){
        return this.fim;
    }

    // Verifica se a lista tá vazia
    public boolean isEmpty(){
        if(getTam() == 0)
            return true;
        
        return false;
    }
    
    // Mostra o inicio, o fim e o tamanho da lista
    @Override
    public String toString() {
        String str = "Tamanho: " + this.getTam() + "\n[inicio: " + inicio.toString() + ", final: " + fim.toString() + "]";
        
        return str;
    }

}