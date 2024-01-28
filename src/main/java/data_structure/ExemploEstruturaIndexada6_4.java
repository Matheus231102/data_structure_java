package data_structure;

import javax.swing.*;

import java.util.Optional;

import static data_structure.tools.Tools.vetorConvertido;

public class ExemploEstruturaIndexada6_4 {

    public static void main(String[] args) {
        int diasDaSemana = 7;
        float temperaturaMediaSemana = 0;
        float somaTemperaturas = 0;
        float[] temperaturas = new float[diasDaSemana];

        try {
            for (int i = 0; i < diasDaSemana; i++) {
                String num = JOptionPane.showInputDialog("digite a temperatura do " + (i + 1) + "º dia: ");
                temperaturas[i] = Float.parseFloat(num);
            }

            for (float temperatura : temperaturas) {
                somaTemperaturas += temperatura;
            }

            temperaturaMediaSemana = somaTemperaturas / diasDaSemana;
            System.out.println("Temperatura Média: " + temperaturaMediaSemana);

            JOptionPane.showMessageDialog(null, "A temperatura média é igual a " + temperaturaMediaSemana);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao definir a temperatura!");
            System.out.println(e);
        }

    }
}
