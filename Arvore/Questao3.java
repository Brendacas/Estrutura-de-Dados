package Arvore;
import Estruturas.No;

public class Questao3 {
    public static void main(String[] args) {
        
        Tree<Integer> tree = new Tree<>();
    
        tree.insere(0);
        tree.insere(12);
        tree.insere(5);
        tree.insere(24);
        tree.insere(15);
        tree.insere(30);
        tree.insere(9);
        tree.insere(10);
        tree.insere(8);
        tree.insere(6);
        tree.insere(1);

        tree.emOrdem(tree.getRaiz());
        System.out.println();
        System.out.println("Altura da Arvore: " + alturaTree(tree.getRaiz()));


    }
    
    public static int alturaTree(No<Integer> node){
        if(node == null)
            return 0;
        else{
            int esquerda = alturaTree(node.getAnterior());
            int direita = alturaTree(node.getProximo());
            
            if(esquerda > direita)
                return esquerda + 1;
            else
                return direita + 1;

        }
            

    }
}