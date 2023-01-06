import java.util.Random;
import Estrutura.Pilha;

public class Questao4{
    public static void main(String[] args){
        Pilha<Inteiro> p1 = new Pilha<Inteiro>();
        Pilha<Inteiro> p2 = new Pilha<Inteiro>();
        Pilha<Inteiro> p3 = new Pilha<Inteiro>();
        Pilha<Inteiro> p4 = new Pilha<Inteiro>();
        Inteiro[] baralho = new Inteiro[52];
        Random sorteio = new Random();

        for(int i = 0; i < 52; i++){
            baralho[i] = i + 1;
        }

        for(int i = 0; i < 52;){
            int s;
            s = sorteio.nextInt(5) + 1;

            if(s == 1){
                p1.push(baralho[i]);
                ++i;
            }else if(s == 2){
                p2.push(baralho[i]);
                ++i;
            }else if(s == 3){
                p3.push(baralho[i]);
                ++i;
            }else if(s == 4){
                if(!p1.isEmpty()){
                    p2.push(p1.pop());
                    ++i;
                }else{
                }
            }else if(s == 5){
                if(!p2.isEmpty()){
                    p3.push(p2.pop());
                    ++i;
                }else{
                }
            }else if(s == 6){
                if(!p3.isEmpty()){
                    p1.push(p3.pop());
                    ++i;
                }else{
                }
            }
        }

        while(!p1.isEmpty()){
            p4.push(p1.pop());
        }

        while(!p2.isEmpty()){
            p4.push(p2.pop());
        }

        while(!p3.isEmpty()){
            p4.push(p3.pop());
        }

        while(!p4.isEmpty()){
            System.out.println(p4.pop() + "\n");
        }
    }
}