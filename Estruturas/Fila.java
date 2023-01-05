package Estruturas;

// Fila de tipo genérico 
public class Fila<T> {
    
    private List<T> fila; // lista para representar uma Fila 
    
    private No<T> primeiro; // Primeiro da fila
    private No<T> ultimo; // Ultimo da fila

    // Inicia a fila
    public Fila(){
        this.fila = new List<>();
        this.primeiro = null;
        this.ultimo = null;
    }

    // Pega o tamanho da fila
    public int getTam(){
        return fila.getTam();
    }

    // Adiciona elementos na fila
    public void enfileirar(T info){
        No<T> x = new No<T>(info);
        
        fila.inserirFinal(x);
        this.primeiro = fila.getInicio();
        this.ultimo = fila.getFim();
    }

    // Remove elementos da fila
    public void desenfileirar(){
        fila.removerInicio();
        this.primeiro = fila.getInicio();
        this.ultimo = fila.getFim();

    }

    // Imprime a fila inteira
    public String imprimeFila(){
        return fila.imprimeList();
    }

    // Retorna o primeiro da fila
    public No<T> getPrimeiro(){
        return this.primeiro;
    }

    // Retorna o ultimo da fila
    public No<T> getUltimo(){
        return this.ultimo;
    }   

    // Mostra o inicio, o final e o tamanho da fila
    @Override
    public String toString() {
        String str = "Fila: \n" + fila.toString();

        return str;
    }


}