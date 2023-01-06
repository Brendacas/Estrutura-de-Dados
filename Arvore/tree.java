import java.io.Serializable;
import Estruturas.No;

public class tree<T extends Comparable<T>> implements Serializable {
    private No<T> raiz;
    private int tamanho = 0;

    public tree(){
        this.raiz = null;
    }
    public No<T> getRaiz(){
        return raiz;
    }
    public int getTamanho(){
        return tamanho;
    }
    
    //funcao que insere os elementos na arvore
    public void insere(T info){
        No<T> aux = new No<>(info);

        if(raiz == null){
            this.raiz = aux;
            tamanho++;
        }
        else{
            No<T> atual = this.raiz;
            
            while(true){
                //se for menor, adiciona a esquerda
                if(aux.getInfo().compareTo(atual.getInfo()== -1)){
                    if(atual.getAnterior() != null){
                        atual = atual.getAnterior();
                    }
                    else{
                        atual.setAnterior(aux);
                        tamanho++;
                        break;
                    }
                }
                //se for maior ou igual, adiciona a direita
                else{
                    atual.setProximo();
                    tamanho++;
                    break;
                }
            }
        }
    }
    //funcao que remove os elementos da arvore
    public void remove(T info){
        No<T> atual = this.raiz;
        No<T> pai = null;

        //procura o elemento para remover
        while(atual != null){
            //se o elemento for a raiz
            if(atual.getInfo().equals(info)){
                break;
            }
            else{
                //se o elemento for menor que o atual
                if(info.compareTo(atual.getInfo)== -1){
                    pai = atual;
                    atual = atual.getAnterior(); // vai pegar o filho a esquerda
                }
                else{
                    pai = atual;
                    atual = atual.getProximo(); // vai pegar o filho a direita
                }
            }

        }
        //verifica o elemento
        if(atual != null){
            //elemento tem 2 filhos 
            if(atual.getProximo() != null){
                No<T> aux = atual.getProximo();
                No<T> auxPai = atual;
            }

            while(aux.getAnterior() != null){
                auxPai = aux;
                aux = aux.getAnterior();
            }
            aux.setAnterior(atual.getAnterior()); //guarda o filho a esquerda
            aux.setProximo(atual.getProximo()); // guarda o filho a direita

            this.substitui(atual, pai, aux);
            this.removeElemento(aux, auxPai);
        }
        //apenas elemento esquerdo
        else if(atual.getAnterior()!=null){
            No<T> aux = atual.getAnterior();
            No<T> auxPai = atual;

            while(aux.getProximo() != null){
                auxPai = aux;
                aux = aux.getProximo;
            }
            
            this.substitui(atual, pai, aux);
            this.removeElemento(aux, auxPai);
        }

        //nao tem nenhum filho
        else{
            this.removeElemento(atual,pai);
        }
        
       /*  else{
            System.out.println("Erro!! elemento nao encontrado");
            System.exit(0);
        }*/
    }

    //Remove 
    private void removeElemento(No<T> atual, No<T> pai){
        if(pai != null){
            if(atual.getInfo().compareTo(pai.getInfo())== -1){
                pai.setAnterior(aux);
            }
            else {
                pai.setProximo(aux);
            }
        }
        else{
            this.raiz = null;
        }
    }

    //substitui
    private void substitui(No<T> atual, No<T> pai, No<T> aux){
        if(pai != null){
            if(atual.getInfo().compareTo(pai.getInfo())== -1){
                pai.setAnterior(aux);
            }
            else{
                pai.setProximo(aux);
            }
        }
        else{
            this.raiz = aux;
        }
    }
    
    //em-Ordem
    private void emOrdem(No<T> atual){
        if(atual != null){
            emOrdem(atual.getAnterior); // entra no filho a esquerda
            System.out.println(atual.getInfo);
            emOrdem(atual.getProximo); // entra no filho a direita
        }
    }

    //pre-ordem 
    private void preOrdem(No<T> atual){
        if(atual != null){
            System.out.println(atual.getInfo());

            preOrdem(atual.getAnterior()); 
            preOrdem(atual.getProximo()); 

        }
    }
    //pos-ordem
    public void posOrdem(No<T> atual){    
        if(atual != null){
            posOrdem(atual.getAnterior()); 
            posOrdem(atual.getProximo()); 
            System.out.println(atual.getInfo()); 
        }
    }
    private boolean ehCompleta(No<T> raiz, int index, int nNodes){
        if (raiz == null){
            return true;
        }
 
        if (index >= nNodes){
            return false;
        }
 
        return ehCompleta(raiz.esquerda, 2 * index + 1, nNodes) && isComplete(raiz.direita, 2 * index + 2, nNodes);
    }

    //Verifica se é um MaxHeap
    private boolean ehMaxHeap(No<T> raiz){
        if (raiz.esquerda == null && raiz.direita == null){
            return true;
        }
 
        if (raiz.direita == null) {
            return raiz.dados.compareTo(raiz.esquerda.dados) == 1;
        }else{
            if (raiz.dados.compareTo(raiz.esquerda.dados) == 1 && raiz.dados.compareTo(raiz.direita.dados) == 1){
                return ehMaxHeap(raiz.esquerda) && ehMaxHeap(raiz.direita);
            }else{
                return false;
            }
        }
    }

    //Verifica se é um MinHeap
    private boolean ehMinHeap(NodeTree<T> root){
        if (raiz.esquerda == null && raiz.direita == null){
            return true;
        }
 
        if (raiz.direita == null) {
            return raiz.dados.compareTo(raiz.esquerda.dados) == 1;
        }else{
            if (raiz.dados.compareTo(raiz.esquerda.dados) == -1 && raiz.dados.compareTo(raiz.direita.dados) == -1){
                return ehMinHeap(raiz.esquerda) && ehMinHeap(raiz.direita);
            }else{
                return false;
            }
        }
    }

    //Verifica se é um heap
    public int ehHeap(No<T> root){
        if (raiz == null){
            return 1;
        }
 
        int nodeCounter = this.tam;
 
        if (ehCompleta(raiz, 0, nodeCounter) == true && ehMaxHeap(raiz) == true){
            return 1;
        }else if(ehCompleta(raiz, 0, nodeCounter) == true && ehMinHeap(raiz) == true){
            return -1;
        }

        return 0;
    }

    public int ehHeap(){
        return this.ehHeap(this.raiz);
    }


     
     @Override
     public String toString() {
         String str = "Raiz: " + getRaiz();
         str += "\nTam: " + getTam();
 
         return str;
     }
 
    }


    



