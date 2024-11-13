package comparacao;

import java.util.Arrays;
import java.util.Random;

public class Comparacao {
    public static void main(String[] args) {
        int tamanho = 10000;
        int[] vetor = new int[tamanho];

        preencherVetorAleatorio(vetor);

        int[] vetorBubbleSort = Arrays.copyOf(vetor, vetor.length);
        int[] vetorInsertionSort = Arrays.copyOf(vetor, vetor.length);
        int[] vetorMergeSort = Arrays.copyOf(vetor, vetor.length);
        int[] vetorSelectionSort = Arrays.copyOf(vetor, vetor.length);

         long inicioBubbleSort = System.currentTimeMillis();
         Bolha.executarBubbleSort(vetorBubbleSort);
         long fimBubbleSort = System.currentTimeMillis();

        long inicioInsertionSort = System.currentTimeMillis();
        Insercao.executarInsertionSort(vetorInsertionSort);
        long fimInsertionSort = System.currentTimeMillis();

         long inicioSelectionSort = System.currentTimeMillis();
         Selecao.executarSelectionSort(vetorSelectionSort);
         long fimSelectionSort = System.currentTimeMillis();

        long inicioMergeSort = System.currentTimeMillis();
        Merge.executarMergeSort(vetorMergeSort);
        long fimMergeSort = System.currentTimeMillis();

        System.out.println("Tempo de execução do Bubble Sort: " + 
                String.format("%.4f", (fimBubbleSort - inicioBubbleSort) / 1000.0) + " s");
        System.out.println("Tempo de execução do Insertion Sort: " + 
                String.format("%.4f", (fimInsertionSort - inicioInsertionSort) / 1000.0) + " s");
        System.out.println("Tempo de execução do Selection Sort: " + 
                String.format("%.4f", (fimSelectionSort - inicioSelectionSort) / 1000.0) + " s");
        System.out.println("Tempo de execução do Merge Sort: " + 
                String.format("%.7f", (fimMergeSort - inicioMergeSort) / 1000.0) + " s");
    }

    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length);
        }
    }

}
