package data_structure.tools.gerarValoresAleatorios;

import java.util.Arrays;
import java.util.Random;

public class GerarAleatoriosVetor {

    public static int[] preencherVetorUnico(int[] vetor, int valorMaximoGerado) throws ParametroInvalidoException {
        if (valorMaximoGerado == 0) {
            Arrays.fill(vetor, 0);
            return vetor;
        } else if (valorMaximoGerado < 0) {
          throw new ParametroInvalidoException("O valor enviado como parâmetro não pode ser negativo.");
        } else {
            Random random = new Random();
            int tamanhoVetor = vetor.length;

            for (int i = 0; i < tamanhoVetor; i++) {
                vetor[i] = random.nextInt(valorMaximoGerado);
            }

            return vetor;
        }
    }

    public static int[][] preencherMatrizUnica(int[][] matrizMultipla, int valorMaximoGeradoPorMatriz) throws ParametroInvalidoException {
        for (int[] matriz : matrizMultipla) {
            preencherVetorUnico(matriz, valorMaximoGeradoPorMatriz);
        }
        return matrizMultipla;
    }

}
