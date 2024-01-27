package data_structure;

import javax.swing.*;

public class ExemploEstruturaIndexada6_2 {
    // entrada de 10 elementos no vetor1, criar vetor2 baseado no vetor1
    // se valor do índice for par deverá ser multiplicado por 5
    // se valor do índice for ímpar deverá ser somado com 5

    public static void main(String[] args) {
        int tamanhoVetor = 3;
        float[] vetor1 = new float[tamanhoVetor];
        float[] vetor2 = new float[tamanhoVetor];

        try {
            for (int i = 0; i < tamanhoVetor ; i++) {
                String num = JOptionPane.showInputDialog("Digite o número " + i + " do vetor1:");
                vetor1[i] = Float.parseFloat(num);
            }

            for (int i = 0; i < tamanhoVetor; i++) {
                if (isPar((float) i)) {
                    vetor2[i] = vetor1[i] * 5;
                } else {
                    vetor2[i] = vetor1[i] + 5;
                }
            }

            JOptionPane.showMessageDialog(null, "vetor1: " + vetorConvertido(vetor1) + "\n" + "vetor2: " + vetorConvertido(vetor2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir um número");
        }
    }

    private static boolean isPar(Float number) {
        if (number % 2 == 0) {
            return true;
        } else { return false; }
    }

    private static String vetorConvertido(float[] vetor) {
        StringBuilder string = new StringBuilder();
        for (Number number : vetor) {
            string = string.append(number).append(", ");
        }
        return string.toString();
    }

}
