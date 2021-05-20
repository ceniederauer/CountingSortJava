public class CountingSort {

    public static void CountingSort(int vetor[], int vet[]) {
        int[] vetAux = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            vetAux[i] = 0;
            vet[i] = 0;
        }

        for (int i = vetor.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (vetor[i] > vetor[j]) {
                    vetAux[i]++;
                } else {
                    vetAux[j]++;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            vet[vetAux[i]] = vetor[i];
        }
    }

    public static void main(String args[]) {
        int[] vet = new int[9];
        int vetor[] = {8, 3, 2, 6, 4, 6, 7, 1, 9};

        System.out.println("\nO vetor antes da ordenacao:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }

        CountingSort(vetor, vet);

        System.out.println("\nO vetor depois da ordenacao:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);

        }
    }
}
