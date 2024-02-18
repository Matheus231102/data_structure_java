package data_structure.tools;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanho = 10;
        int[] vetor = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Vetor Original:   " + Arrays.toString(vetor));

        int[] bubbleSortedVector = BubbleSortImplementation(vetor);

        System.out.println("Vetor BubbleSort: " + Arrays.toString(bubbleSortedVector));
    }

    public static int[] BubbleSortImplementation(int[] insertedVetor) {
        int[] vetor = Arrays.copyOf(insertedVetor, insertedVetor.length);
            for (int i = 0; i < vetor.length; i++) {
                for (int j = 0; j < vetor.length - 1; j++) {
                    if (j == vetor.length - 1)

                        if (vetor[j] > vetor[j + 1]) {
                        int temp = vetor[j];

                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                    }

                }
            }
        return vetor;
    }
}

