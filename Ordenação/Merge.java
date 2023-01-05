
import java.util.Arrays;

public class Merge{
   public static void main(String[] args) {
      int[] vetor = {3,2,1,4};
      int[] aux = new int[vetor.length];
      
      System.out.println(Arrays.toString(vetor));

      mergeSort(vetor, aux, 0, vetor.length -1);

      System.out.println(Arrays.toString(vetor));
   
     }
   
   public static void mergeSort(int[] vetor, int[] aux, int ini, int fim){
      if(ini < fim){
         int meio = (ini + fim) / 2;
         mergeSort(vetor, aux, ini, meio);
         mergeSort(vetor, aux, meio + 1, fim);
         intercalar(vetor, aux, ini, meio, fim);
      }
   }
   public static void intercalar(int[] vetor, int[] aux, int ini, int meio, int fim){
      for(int i = ini; i <= fim; i++){
         aux[i] = vetor[i];

         int esq = ini;
         int dir = meio + 1;
         
         for(i = ini; i <= fim; i++){
            if(esq > meio){
               vetor[i] = aux[dir++];
            }
            else if(dir > fim){
               vetor[i] = aux[esq++];
            }
            else if(aux[esq] < aux[dir]){
               vetor[i] = aux[esq++];
            }
            else {
               vetor[i] = aux[dir ++];
            }
         }

      }
   }
}
 
    
