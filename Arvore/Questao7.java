package Arvores;
import java.util.Arrays;
import java.util.Scanner;

public class Questao7{
    static void heapfy(int[] vet, int tam, int tipo){
        int i = 0;
        if(tipo == 1){
            int menor = i;
            int esquerda = 2 * i + 1; 
            int direita = 2 * i + 2;    
     
            if (esquerda < tam && vet[esquerda] < vet[menor])
                menor = esquerda;
    
            if (direita < tam && vet[direita] < vet[menor])
                menor = direita;
     
            if (menor != i) {
                int aux = vet[i];
                vet[i] = vet[menor];
                vet[menor] = aux;
            }
            System.out.println(Arrays.toString(vet));

        }else if(tipo==2){
            int esquerda = 2 * i + 1;
            int direita = 2 * i + 2;
            int maior = i;
    
            if (esquerda < tam && vet[esquerda] > vet[maior])
                maior = esquerda;
    
            if (direita < tam && vet[direita] > vet[maior])
                maior = direita;
     
            if (maior != i) {
                int aux = vet[i];
                vet[i] = vet[maior];
                vet[maior] = aux;
            }
            System.out.println(Arrays.toString(vet));
        }else{
            System.out.println("Tipo errado..."); 
            }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetToHeap  = {7, 9, 0, 4, 2};

        System.out.printf("Digite |1-MinHeap| |2-MaxHeap|: ");
        int tipo = input.nextInt();    
        input.nextLine();
        input.close();
        heapfy(vetToHeap, vetToHeap.length, tipo);
    }
}