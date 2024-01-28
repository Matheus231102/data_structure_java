package data_structure.tools;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
        }

        Arrays.sort(vetor);

        System.out.println("vetor: " + Arrays.toString(vetor));
    }


}
