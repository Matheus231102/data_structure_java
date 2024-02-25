package data_structure.tools;

import java.util.Arrays;

public class MediaVetor<E extends Number> {

    public double calcularMediaVetor(E[] vetor) {
        int quantidadeElementosVetor = vetor.length;

        double somaTotalVetor = Arrays.stream(vetor)
                .mapToDouble(Number::doubleValue)
                .sum();

        return somaTotalVetor / quantidadeElementosVetor;
    }

}
