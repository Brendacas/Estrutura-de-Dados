package Fila;

import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int n = entrada.nextInt();

        Pilha<Integer> pilha = new Pilha<>();
        pilha = divisaoFatorial(n);

        System.out.println("\nFatores do numero: ");
        imprimeFatores(pilha);

        entrada.close();
    }

    // Imprime para Pilha
    public static void imprimeFatores(Pilha<Integer> pilha1){
        No<Integer> node = pilha1.getTopo();

        while(node != null){
            if(node.getProximo() != null)
                System.out.print(node.getInfo() + " * ");
            else
                System.out.print(node.getInfo());
            
            node = node.getProximo();
        }

        System.out.println();
    }

    public static Pilha<Integer> divisaoFatorial(int n){
        Pilha<Integer> pilha1 = new Pilha<>();

        // Divide sempre por 2
        while(n % 2 == 0){
            pilha1.empilhar(2);
            n /= 2;
        }

        // Divide por outros primos
        int div = 3;
        while((div * div) <= n){
            if(n % div == 0){
                pilha1.empilhar(div);
                n /= div;
            }
            else
                div += 2;

        }

        // Quando o n for primo
        if(n > 1)
            pilha1.empilhar(n);

        return pilha1;
    }
}