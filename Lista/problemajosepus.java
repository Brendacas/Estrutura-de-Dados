import java.util.Scanner;

class Node {
  int dados;
  Node prox;
}

public class problemajosepus {
  // Function to solve the Josephus problem
  public static int josephus(int n, int k) {
    // cria a lista circular
    Node head = new Node();
    head.dados = 1;
    Node c = head;
    for (int i = 2; i <= n; i++) {
      c.prox = new Node();
      c = c.prox;
      c.dados= i;
    }
    c.prox = head;

    // encontra posição da ultima pessoa
    Node prev = c;
    c = head;
    while (c.prox != c) {
      // Move c k-1 posicoes
      for (int i = 1; i < k; i++) {
        prev = c;
        c = c.prox;
      }

      // remove c da lista
      prev.prox = c.prox;
      c = prev.prox;
    }

    // retorna a posição da ultima pessoa
    return c.dados;
  }

}