package data_structure;

import javax.swing.JOptionPane;

public class ExemploEstruturaIndexada6_3 {
    // realizar a leitura de 5 elementos e somalos no final
    public static void main(String[] args) {
        int tamanhoVetor = 5;
        float[] vetor = new float[tamanhoVetor];

        try {
            for (int i = 0; i < tamanhoVetor; i++) {
                String num = JOptionPane.showInputDialog("digite o número " + i + " do vetor: ");
                vetor[i] = Float.parseFloat(num);
            }
            float somaImparesVetor = somarElementosImpares(vetor);
            JOptionPane.showMessageDialog(null, "A soma dos elementos ímpares dentro do vetor \n" + somaImparesVetor);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao definir elementos no vetor!");
            System.out.println(e);
        }

        float somaElementos = somarVetor(vetor);
        System.out.println(somaElementos);
    }

    private static float somarVetor(float[] vetor) {
        float soma = 0;
        for (float number : vetor) {
            soma += number;
        }
        return soma;
    }

    private static float somarElementosImpares(float[] vetor) {
        float soma = 0;
        for (float number : vetor) {
            if (number % 2 != 0) {
                soma += number;
            }
        }
        return soma;
    }



}
