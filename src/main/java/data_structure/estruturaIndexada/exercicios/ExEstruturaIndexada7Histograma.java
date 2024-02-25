package data_structure.estruturaIndexada.exercicios;

public class ExEstruturaIndexada7Histograma {

    public static void main(String[] args) {
        TemperaturaDiaSemana[] temperaturas = new TemperaturaDiaSemana[7];
        temperaturas[0] = new TemperaturaDiaSemana("domingo", 23.5);
        temperaturas[1] = new TemperaturaDiaSemana("segunda feira", 26.5);
        temperaturas[2] = new TemperaturaDiaSemana("terça feira", 29.5);
        temperaturas[3] = new TemperaturaDiaSemana("quarta feira", 24.0);
        temperaturas[4] = new TemperaturaDiaSemana("quinta feira", 21.5);
        temperaturas[5] = new TemperaturaDiaSemana("sexta feira", 19.0);
        temperaturas[6] = new TemperaturaDiaSemana("sábado", 30.5);

        for (TemperaturaDiaSemana diaTemp : temperaturas) {
            StringBuilder marcador = new StringBuilder();

            String primeiraParte = String.valueOf(diaTemp.getDia().charAt(0)).toUpperCase();

            String segundaParte = String.valueOf(marcador.repeat(0 , diaTemp.getTemperatura().intValue()));

            System.out.println(primeiraParte + ": " + segundaParte);
        }

    }


}
