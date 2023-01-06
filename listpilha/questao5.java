import java.util.Scanner;
import Estruturas.Pilha;

public class questao5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a expressão desejada: ");
        String expressao = input.nextLine();

       
        Pilha<Character> p = new Pilha<Character>();
        
        for(int i = 0; i < expressao.length(); i++){
            Character v = expressao.charAt(i);

            if(v == '{' || v == '[' || v == '('){
                p.push(v);
            }else if(v == '}' || v == ']' || v == ')'){
                if(v == '}'){
                    v = '{';
                }else if(v == ']'){
                    v = '[';
                }else if(v == ')'){
                    v = '(';
                }

                if(p.isEmpty()){
                    System.out.printf("Expressao Invalida\n\n");
                    System.exit(-1);
                }else if(v.compareTo(p.stackTop()) == 0){
                    p.pop();
                }else{
                    System.out.printf("Expressao Invalida\n\n");
                    System.exit(-1);
                }
            }
        }

        if(p.isEmpty()){
            System.out.printf("Expressao Valida\n\n");
        }else{
            System.out.printf("Expressao Invalida\n\n");
        }
    }
}

