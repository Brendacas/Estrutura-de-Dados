public class Ordenacao{
   public void mergeSort(int ini, int fim, Pessoa[] p, int tipo){
    if(ini<fim-1){
        int meio = (ini + fim)/2;

        mergeSort(ini, fim, p, tipo);
        mergeSort(meio, fim, p, tipo);

        // switch para  o tipo passado por parametro para intercalação
        switch(tipo){
            case 1: // tipo = nome
            intercalaporNome(p, ini, meio, fim);
            break;

            case 2: // tipo = matricula
            intercalaporMat(p,ini,meio,fim);
            break;

            case 3: //tipo = nota
            intercalaporNota(p,ini,meio,fim);
            break;
        }
        
    }
}
    private static void intercalaporNome(Pessoa[] p, int ini, int meio, int fim){
        Pessoa vetor[] = new Pessoa[fim - ini];
        int i = ini;
        int m = meio;
        int pos = 0;

        while(i < m && m < fim){
            if(p[i].getNome().compareToIgnoreCase(p[m].getNome())<=0){
                vetor[pos]=p[i];
                pos = pos + 1;
                i = i + 1;
            }else{
                vetor[pos] = p[m];
                pos = pos + 1;
                m = m + 1;
            }
        }
        while(i < m){
            vetor[pos]=p[i];
            pos = pos + 1;
            i = i + 1;
        }
        while(m < fim){
            vetor[pos] = p[m];
            pos = pos + 1;
            m = m + 1;
        }
        for(pos = 0,  i = ini; i < fim; i++, pos++) {
            p[i] = vetor[pos];
        }
    }
    private static void intercalaMatricula(Pessoa[] p, int inicio, int meio, int fim) {
    Pessoa novoVetor[] = new Pessoa[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(p[i].getMatricula()!=(p[m].getMatricula())) {
        novoVetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < meio) {
      novoVetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      p[i] = novoVetor[pos];
    }
  }

  private static void intercalaNota(Pessoa[] p, int inicio, int meio, int fim) {
    Pessoa novoVetor[] = new Pessoa[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(p[i].getNota()!=(p[m].getNota())) {
        novoVetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < meio) {
      novoVetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      p[i] = novoVetor[pos];
    }
  }
  private static void intercalaporMat(Pessoa[] p, int ini, int meio, int fim) {
    Pessoa Vetor[] = new Pessoa[fim - ini];
    int i = ini;
    int m = meio;
    int pos = 0;
    
    while(i < m && m < fim) {
      if(p[i].getMatricula()!=(p[m].getMatricula())) {
        Vetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        Vetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < m) {
      Vetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      Vetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = ini; i < fim; i++, pos++) {
      p[i] = Vetor[pos];
    }
  }

  private static void intercalaporNota(Pessoa[] p, int ini, int meio, int fim) {
    Pessoa Vetor[] = new Pessoa[fim - ini];
    int i = ini;
    int m = meio;
    int pos = 0;
    
    while(i < m && m < fim) {
      if(p[i].getNota()!=(p[m].getNota())) {
        Vetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        Vetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < m) {
      Vetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      Vetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = ini; i < fim; i++, pos++) {
      p[i] = Vetor[pos];
    }
  }
//#######################fim do merge#######################################
private int particao(Pessoa[] p, int primeiro, int ultimo, int l){
    Pessoa pivor = p[ultimo];
    int i = primeiro - 1;

    for(int j = primeiro; j < ultimo; j++){
        if(l == 1){
            if(p[j].getMatricula() <= pivor.getMatricula()){
                i++;
                Pessoa temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }else if(l == 2){
            if(p[j].getNome().compareTo(pivor.getNome()) <= 0){
                i++;
                Pessoa temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }else if(l == 3){
            if(p[j].getNota() <= pivor.getNota()){
                i++;
                Pessoa temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }
    Pessoa temp = p[i + 1];
    p[i + 1] = p[ultimo];
    p[ultimo] = temp;

    return i + 1;
}

public void quickSort(Pessoa[] p, int primeiro, int ultimo, int l){
    if(primeiro < ultimo){
        int pl = particao(p, primeiro, ultimo, l);
        quickSort(p, primeiro, pl - 1, l);
        quickSort(p, pl + 1, ultimo, l);
    }
}
//########################fim do quick#####################################
public void heapSort(Pessoa[] array, int l){
    int tam = array.length;

    for(int i = tam/ 2 - 1; i >= 0; i--){
        heap(array, tam, i, l);
    }

    for(int i = tam- 1; i > 0; i--){
        Pessoa temp = array[0];
        array[0] = array[i];
        array[i] = temp;

        heap(array, i, 0, l);
    }
}


private void heap(Pessoa[] array, int tam, int i, int l){
    int maior = i;
    int a = 2 * i + 1;
    int b = 2 * i + 2;

    if(l == 1){
        if(a < tam && array[a].getMatricula() > array[maior].getMatricula()){
            maior = a;
        }

        if(b < tam && array[b].getMatricula() > array[maior].getMatricula()){
            maior = b;
        }
    }else if(l == 2){
        if(a < tam && array[a].getNome().compareTo(array[maior].getNome()) > 0){
            maior = l;
        }

        if(b < tam && array[b].getNome().compareTo(array[maior].getNome()) > 0){
            maior = b;
        }
    }else if(a == 3){
        if(a < tam && array[a].getNota() > array[maior].getNota()){
            maior = a;
        }

        if(b < tam && array[b].getNota() > array[b].getNota()){
            maior = b;
        }
    }

    if (maior != i){
        Pessoa troca = array[i];
        array[i] = array[maior];
        array[maior] = troca;

        heap(array, tam, maior, l);
    }
}
//############fim do heap#######################################
public void insertionSort(Pessoa p[], int tam, int tipo){
    if(tipo==1){
    Pessoa auxiliar[] = new Pessoa[tam];
    for(int i=0;i<tam; i++){
        auxiliar[i]=p[i];
        for(int j=i;j>0;j--){
        if((auxiliar[i].getNome().compareTo(p[j-1].getNome())<0)){
            p[j] = p[j-1];
            p[j-1] = auxiliar[i];
        }
    }
    }
    }

    if(tipo==2){
    Pessoa auxiliar[] = new Pessoa[tam];
    for(int i=0;i<tam;i++){
        auxiliar[i]=p[i];
        for(int j=i;j>0;j--){
        if((auxiliar[i].getMatricula()<p[j-1].getMatricula())){
            p[j] = p[j-1];
            p[j-1] = auxiliar[i];
        }
    }
    }
    }

    if(tipo==3){
        Pessoa auxiliar[] = new Pessoa[tam];
        for(int i=0;i<tam;i++){
            auxiliar[i]=p[i];
            for(int j=i;j>0;j--){
            if((auxiliar[i].getNota()<p[j-1].getNota())){
                p[j] = p[j-1];
                p[j-1] = auxiliar[i];
            }
        }
        }
        }
}
//#############fim do insertion###########################
void selectionSort(Pessoa[] array, int tipo){
    int tam = array.length;

    if(tipo == 1){
        for(int i = 0; i < tam - 1; i++){
            int min = i;

            for(int j = i + 1; j < tam; j++){
                if(array[j].getMatricula() < array[min].getMatricula()){
                    min = j;
                }
            }

            Pessoa temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }else if(tipo == 2){
        for(int i = 0; i < tam - 1; i++){
            int min = i;

            for(int j = i + 1; j < tam; j++){
                if(array[j].getNome().compareTo(array[min].getNome()) < 0){
                    min = j;
                }
            }

            Pessoa temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }else if(tipo == 3){
        for(int i = 0; i < tam - 1; i++){
            int min = i;

            for(int j = i + 1; j < tam; j++){
                if(array[j].getNota() < array[min].getNota()){
                    min = j;
                }
            }

            Pessoa temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
}






   

   