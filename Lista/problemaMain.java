import java.util.Scanner;

public class problemaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int resultado= josephus(n,k);
        System.out.println(resultado);
      }
}
