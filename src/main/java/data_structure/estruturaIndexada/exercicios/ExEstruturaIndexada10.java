package data_structure.estruturaIndexada.exercicios;

import data_structure.tools.PrintMatriz;
import data_structure.tools.gerarValoresAleatorios.GerarAleatoriosVetor;
import data_structure.tools.gerarValoresAleatorios.ParametroInvalidoException;

public class ExEstruturaIndexada10 {

    public static void main(String[] args) throws ParametroInvalidoException {
        int tamanhoPadrao = 5;
        int[] vetor1 = new int[tamanhoPadrao];
        int[] vetor2 = new int[tamanhoPadrao];
        int[] vetor3 = new int[tamanhoPadrao];
        int[] vetor4 = new int[tamanhoPadrao];
        int[] vetor5 = new int[tamanhoPadrao];

        int[][] matriz = new int[][]{vetor1, vetor2, vetor3, vetor4, vetor5};

        GerarAleatoriosVetor.preencherMatrizUnica(matriz, 20);
        PrintMatriz.execute(matriz);
    }
}
