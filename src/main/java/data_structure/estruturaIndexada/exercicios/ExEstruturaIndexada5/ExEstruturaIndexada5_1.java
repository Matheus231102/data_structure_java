package data_structure.estruturaIndexada.exercicios.ExEstruturaIndexada5;

import data_structure.estruturaIndexada.exercicios.teste.TemperaturaDiaSemana;

import java.util.ArrayList;

public class ExEstruturaIndexada5_1 {
    // fazer a listagem dos dias com as maiores temperaturas, caso essas temperaturas sejam iguais

    public static void main(String[] args) {
        TemperaturaDiaSemana[] temperaturas = new TemperaturaDiaSemana[7];

        temperaturas[0] = new TemperaturaDiaSemana("domingo", 21.5);
        temperaturas[1] = new TemperaturaDiaSemana("segunda feira", 21.5);
        temperaturas[2] = new TemperaturaDiaSemana("terça feira", 29.5);
        temperaturas[3] = new TemperaturaDiaSemana("quarta feira", 24.0);
        temperaturas[4] = new TemperaturaDiaSemana("quinta feira", 21.5);
        temperaturas[5] = new TemperaturaDiaSemana("sexta feira", 30.5);
        temperaturas[6] = new TemperaturaDiaSemana("sábado", 30.5);

        ArrayList<TemperaturaDiaSemana> maioresTemp = pegarMaioresTemperaturas(temperaturas);
        System.out.println(maioresTemp.toString());

        ArrayList<TemperaturaDiaSemana> menoresTemp = pegarMenoresTemperaturas(temperaturas);
        System.out.println(menoresTemp.toString());

    }

    public static ArrayList<TemperaturaDiaSemana> pegarMaioresTemperaturas(TemperaturaDiaSemana[] periodoTemperatura) {
        ArrayList<TemperaturaDiaSemana> maioresTemperaturas = new ArrayList<>();
        double maiorTemperatura = Double.NEGATIVE_INFINITY;

        for (TemperaturaDiaSemana temperatura : periodoTemperatura) {
            if (temperatura.getTemperatura() > maiorTemperatura) {
                maiorTemperatura = temperatura.getTemperatura();
                maioresTemperaturas.clear();
                maioresTemperaturas.add(temperatura);
            } else if (temperatura.getTemperatura() == maiorTemperatura) {
                maioresTemperaturas.add(temperatura);
            }
        }

        return maioresTemperaturas;
    }


    public static ArrayList<TemperaturaDiaSemana> pegarMenoresTemperaturas(TemperaturaDiaSemana[] periodoTemperatura) {
        ArrayList<TemperaturaDiaSemana> menoresTemperaturas = new ArrayList<>();
        double menorTemperatura = Double.POSITIVE_INFINITY;

        for (TemperaturaDiaSemana temperatura : periodoTemperatura) {
            if (temperatura.getTemperatura() < menorTemperatura) {
                menorTemperatura = temperatura.getTemperatura();
                menoresTemperaturas.clear();
                menoresTemperaturas.add(temperatura);
            } else if (temperatura.getTemperatura() == menorTemperatura) {
                menoresTemperaturas.add(temperatura);
            }
        }
        return menoresTemperaturas;
    }





}
