package data_structure.estruturaIndexada.exercicios.ExEstruturaIndexada5;

import data_structure.estruturaIndexada.exercicios.teste.TemperaturaDiaSemana;
import data_structure.estruturaIndexada.exercicios.teste.TemperaturaDiaSemanaComparator;

import java.util.Arrays;

public class ExEstruturaIndexada5 {

    public static void main(String[] args) {
        TemperaturaDiaSemana[] temperaturas = new TemperaturaDiaSemana[7];
        temperaturas[0] = new TemperaturaDiaSemana("domingo", 23.5);
        temperaturas[1] = new TemperaturaDiaSemana("segunda feira", 26.5);
        temperaturas[2] = new TemperaturaDiaSemana("terça feira", 29.5);
        temperaturas[3] = new TemperaturaDiaSemana("quarta feira", 24.0);
        temperaturas[4] = new TemperaturaDiaSemana("quinta feira", 21.5);
        temperaturas[5] = new TemperaturaDiaSemana("sexta feira", 19.0);
        temperaturas[6] = new TemperaturaDiaSemana("sábado", 30.5);

        TemperaturaDiaSemana maiorTemperatura = pegarMaiorTemperatura(temperaturas);
        TemperaturaDiaSemana menorTemperatura = pegarMenorTemperatura(temperaturas);

        System.out.println(maiorTemperatura.toString());
        System.out.println(menorTemperatura.toString());

        Arrays.sort(temperaturas, new TemperaturaDiaSemanaComparator());
        System.out.println(Arrays.toString(temperaturas));
    }

    private static TemperaturaDiaSemana pegarMaiorTemperatura(TemperaturaDiaSemana[] vetor) {
        TemperaturaDiaSemana maiorTemperatura = null;

        for (int i = 0; i < vetor.length; i++) {

            if (i == 0) {
                maiorTemperatura = vetor[0];
            } else {
                if (vetor[i].getTemperatura() >= vetor[i - 1].getTemperatura()) {
                    maiorTemperatura = vetor[i];
                }
            }

        }

        return maiorTemperatura;
    }

    private static TemperaturaDiaSemana pegarMenorTemperatura(TemperaturaDiaSemana[] vetor) {
        TemperaturaDiaSemana menorTemperatura = null;

        for (int i = 0; i < vetor.length; i++) {

            if (i == 0) {
                menorTemperatura = vetor[0];
            } else {
                if (vetor[i].getTemperatura() <= vetor[i - 1].getTemperatura()) {
                    menorTemperatura = vetor[i];
                }
            }

        }

        return menorTemperatura;
    }


}
