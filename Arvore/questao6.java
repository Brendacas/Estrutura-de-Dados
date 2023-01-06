package Arvore;
import Estruturas.*;

public class questao6 {
    public static void main(String[] args){
        Tree<Integer> t = new Tree<Integer>();
        Integer i;

        i = 3;
        t.insere(i);

        i = 10;
        t.insere(i);

        i = 12;
        t.insere(i);

        System.out.println(t.ehHeap());
    }
}
