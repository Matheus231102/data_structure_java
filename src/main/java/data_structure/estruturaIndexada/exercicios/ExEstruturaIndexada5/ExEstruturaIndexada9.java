package data_structure.estruturaIndexada.exercicios.ExEstruturaIndexada5;

import data_structure.tools.BubbleSort;
import data_structure.tools.gerarValoresAleatorios.GerarAleatoriosVetor;
import data_structure.tools.gerarValoresAleatorios.ParametroInvalidoException;

import java.util.Arrays;

public class ExEstruturaIndexada9 {
    //vetor a e b somados da c e c precisa ser entregue crescente

    public static void main(String[] args) throws ParametroInvalidoException {
        int tamanhoPadrao = 10;
        int[] vetorA = new int[tamanhoPadrao];
        int[] vetorB = new int[tamanhoPadrao];
        int[] vetorC = new int[tamanhoPadrao];

        GerarAleatoriosVetor.gerarAleatorios(vetorA, 20);
        GerarAleatoriosVetor.gerarAleatorios(vetorB, 20);

        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("*-----------------------*");
        System.out.println(Arrays.toString(vetorC));

        Arrays.sort(vetorC);
        System.out.println(Arrays.toString(vetorC));
    }




}
