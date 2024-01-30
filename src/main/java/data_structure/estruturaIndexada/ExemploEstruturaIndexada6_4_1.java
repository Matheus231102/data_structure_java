package data_structure.estruturaIndexada;

import javax.swing.*;
public class ExemploEstruturaIndexada6_4_1 {
    public static void main(String[] args) {
        final int diasDaSemana = 7;
        float[] temperaturas = new float[diasDaSemana];

        float temperaturaMediaSemana = 0;
        float somaTemperaturas = 0;

        try {
            temperaturas[0] = 19.0f;
            temperaturas[1] = 23.0f;
            temperaturas[2] = 21.0f;
            temperaturas[3] = 25.0f;
            temperaturas[4] = 22.0f;
            temperaturas[5] = 20.0f;
            temperaturas[6] = 24.0f;

            for (int i = 0; i < diasDaSemana ; i++) {
                somaTemperaturas = somaTemperaturas + temperaturas[i];
            }
            temperaturaMediaSemana = somaTemperaturas / diasDaSemana;
            JOptionPane.showMessageDialog(null, "A temperatura média é igual a " + temperaturaMediaSemana);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a leitura dos dados");
            System.out.println(e);
        }

    }
}
