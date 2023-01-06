
import java.util.Scanner;
public class questao6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String ES;
        int[] placa = new int[10];
        int p;
        Pilha<Inteiro> p1 = new Pilha<Inteiro>();
        Pilha<Inteiro> p2 = new Pilha<Inteiro>();

        for(int i = 0; i < 10;){
            System.out.printf("Entrada ou Saida[E/S]: ");
            ES = entrada.nextLine();
            
            if(ES.equals("E")){
                System.out.printf("Digite a placa do carro: ");
                placa[i] = entrada.nextInt();
                entrada.nextLine();
                ++i;
            }else{
                System.out.printf("Digite a placa do carro que vai sair: ");
                p = entrada.nextInt();
                entrada.nextLine();

                for(int j = 0; j < i; j++){
                    Inteiro v;

                    if(placa[j] != p){
                        v = placa[j];
                        p1.push(v);
                    }else{
                        placa[j] = -1;
                        v = placa[j];
                        p1.push(v);
                    }
                }

                for(int j = 0; j < i; j++){
                    p1.push(p.pop());
                }

                for(int j = 0; j < i; j++){
                    placa[j] = p1.pop();
                }

                for(int j = 0; j < i; j++){
                    System.out.println(placa[j]);
                }
            }
        }
    }
}