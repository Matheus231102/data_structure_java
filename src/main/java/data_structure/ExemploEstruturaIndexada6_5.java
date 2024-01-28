package data_structure;


import data_structure.tools.Tools;

public class ExemploEstruturaIndexada6_5 {
    public static void main(String[] args) {
        final int diasDaSemana = 7;
        float[] temperaturas = new float[diasDaSemana];

        try {
            temperaturas[0] = 23.0f;
            temperaturas[1] = 19.0f;
            temperaturas[2] = 21.0f;
            temperaturas[3] = 25.0f;
            temperaturas[4] = 22.0f;
            temperaturas[5] = 20.0f;
            temperaturas[6] = 24.0f;

            System.out.println("vetor: " + Tools.vetorConvertido(temperaturas));

            boolean swapped = true;
            int contador = 0;

            while (swapped) {
                swapped = false;
                float valorAnterior = temperaturas[contador];
                float valorPosterior = temperaturas[contador + 1];

                if (valorAnterior > valorPosterior) {

                    float temp = temperaturas[contador];
                    temperaturas[contador] = temperaturas[contador + 1];
                    temperaturas[contador + 1] = temp;

                    contador++;
                    swapped = true;
                }
            }

            System.out.println("vetor: " + Tools.vetorConvertido(temperaturas));

        } catch (Exception e) {
            System.out.println("Ocorreu um problema ao ordenar o vetor");
        }

    }
}
