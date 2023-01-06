import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Ordenacao o = new Ordenacao();
        Pessoa[] p = new Pessoa[2];

        p[0] = new Pessoa(1, "Brenda", 3);
        p[1] = new Pessoa(2, "Billy", 2);
        

        o.selectionSort(p, 2);
        System.out.println(Arrays.toString(p));
    }
}