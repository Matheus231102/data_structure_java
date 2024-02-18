package data_structure.estruturaIndexada.exercicios;

import java.util.Arrays;

public class MediaVetor<E extends Number> {

    public double calcularMediaVetor(E[] vetor) {
        int quantidadeElementosVetor = vetor.length;

        // o vetor pode ser de inteiros e doubles, preciso transformar cada numero no double
        double somaTotalVetor = Arrays.stream(vetor)
                .mapToDouble(Number::doubleValue)
                .sum();

        return somaTotalVetor / quantidadeElementosVetor;
    };

}
