package data_structure.estruturaIndexada.exercicios;

import javax.swing.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ExEstruturaIndexada2 {

    public static void main(String[] args) {
        Double[] temperaturaSemanal = new Double[7];
        boolean controlador = true;
        int contador = 0;

        while(controlador) {

            try {
                String inputTemperatura = JOptionPane.showInputDialog("Digite a temperatura do " + (contador + 1) + "º dia: ");
                double temperatura = Double.parseDouble(inputTemperatura);
                temperaturaSemanal[contador] = temperatura;

                if (contador == temperaturaSemanal.length - 1) { controlador = false; }
                contador++;

            } catch (Exception e) {
                throw e;
            }

        }

        MediaVetor<Double> mediaDouble = new MediaVetor<Double>();
        double mediaTemperaturaSemanal = mediaDouble.calcularMediaVetor(temperaturaSemanal);

        int diasAcimaDaMediaSemanal = 0;
        diasAcimaDaMediaSemanal = (int) Arrays.stream(temperaturaSemanal)
                .filter(valor -> {
                    return valor > mediaTemperaturaSemanal ? true : false;
                })
                .count();

        System.out.println("Média semanal: " + mediaTemperaturaSemanal);
        System.out.println("Quantidade de dias acima da média: " + diasAcimaDaMediaSemanal);
        System.out.println("Temperaturas da semana: " + Arrays.toString(temperaturaSemanal));

    }

}
