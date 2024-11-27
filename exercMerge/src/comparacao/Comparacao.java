package comparacao;

import java.util.Arrays;
import java.util.Random;

public class Comparacao {
    public static void main(String[] args) {
        int[] tamanhos = { 10000, 100000, 1000000 };
        int repeticoes = 10;

        for (int tamanhoAtual : tamanhos) {
            long somaBubbleSort = 0;
            long somaInsertionSort = 0;
            long somaSelectionSort = 0;
            long somaMergeSort = 0;

            int[] vetor;
            int[] vetorBubbleSort;
            int[] vetorInsertionSort;
            int[] vetorMergeSort;
            int[] vetorSelectionSort;

            long inicioBubbleSort, fimBubbleSort, inicioInsertionSort, fimInsertionSort, inicioSelectionSort,
                    fimSelectionSort, inicioMergeSort, fimMergeSort;
            System.out.println("Tamanho do vetor: " + tamanhoAtual);
            for (int i = 0; i < repeticoes; i++) {
                vetor = new int[tamanhoAtual];
                preencherVetorAleatorio(vetor);

                vetorBubbleSort = Arrays.copyOf(vetor, vetor.length);
                vetorInsertionSort = Arrays.copyOf(vetor, vetor.length);
                vetorMergeSort = Arrays.copyOf(vetor, vetor.length);
                vetorSelectionSort = Arrays.copyOf(vetor, vetor.length);

                inicioBubbleSort = System.currentTimeMillis();
                Bolha.executarBubbleSort(vetorBubbleSort);
                fimBubbleSort = System.currentTimeMillis();
                somaBubbleSort += (fimBubbleSort - inicioBubbleSort);
                System.out.println("Tempo de execução do Bubble Sort execução " + i + " : " +
                        (fimBubbleSort - inicioBubbleSort) / 1000.0 + " s");

                inicioInsertionSort = System.currentTimeMillis();
                Insercao.executarInsertionSort(vetorInsertionSort);
                fimInsertionSort = System.currentTimeMillis();
                somaInsertionSort += (fimInsertionSort - inicioInsertionSort);
                System.out.println("Tempo de execução do Insertion Sort execução " + i + " : " +
                        (fimInsertionSort - inicioInsertionSort) / 1000.0 + " s");

                inicioSelectionSort = System.currentTimeMillis();
                Selecao.executarSelectionSort(vetorSelectionSort);
                fimSelectionSort = System.currentTimeMillis();
                somaSelectionSort += (fimSelectionSort - inicioSelectionSort);
                System.out.println("Tempo de execução do Selection Sort execução " + i + " : " +
                        (fimSelectionSort - inicioSelectionSort) / 1000.0 + " s");

                inicioMergeSort = System.currentTimeMillis();
                Merge.executarMergeSort(vetorMergeSort);
                fimMergeSort = System.currentTimeMillis();
                somaMergeSort += (fimMergeSort - inicioMergeSort);
                System.out.println("Tempo de execução do Merge Sort execução " + i + " : " +
                        (fimMergeSort - inicioMergeSort) / 1000.0 + " s");
            }

            System.out.println("Tamanho do vetor: " + tamanhoAtual);
            System.out.println("Média do tempo de execução do Bubble Sort: " +
                    String.format("%.4f", (somaBubbleSort / (double) repeticoes) / 1000.0) + " s");
            System.out.println("Média do tempo de execução do Insertion Sort: " +
                    String.format("%.4f", (somaInsertionSort / (double) repeticoes) / 1000.0) + " s");
            System.out.println("Média do tempo de execução do Selection Sort: " +
                    String.format("%.4f", (somaSelectionSort / (double) repeticoes) / 1000.0) + " s");
            System.out.println("Média do tempo de execução do Merge Sort: " +
                    String.format("%.7f", (somaMergeSort / (double) repeticoes) / 1000.0) + " s");
        }
    }

    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length);
        }
    }

}
