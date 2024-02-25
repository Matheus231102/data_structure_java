package data_structure.tools.gerarValoresAleatorios;

import java.util.Arrays;
import java.util.Random;

public class GerarAleatoriosVetor {

    public static void main(String[] args) throws ParametroInvalidoException {
        int[] vetorTeste = new int[10];
        gerarAleatorios(vetorTeste, 50);
        System.out.println(Arrays.toString(vetorTeste));

        gerarAleatorios(vetorTeste, 0);
        System.out.println(Arrays.toString(vetorTeste));

        gerarAleatorios(vetorTeste, 10);
        System.out.println(Arrays.toString(vetorTeste));
    }

    public static int[] gerarAleatorios(int[] vetor, int valorMaximoGerado) throws ParametroInvalidoException {
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

}
