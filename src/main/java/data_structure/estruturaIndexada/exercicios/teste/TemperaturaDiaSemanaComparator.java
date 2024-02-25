package data_structure.estruturaIndexada.exercicios.teste;

import java.util.Comparator;
import java.util.Objects;

public class TemperaturaDiaSemanaComparator implements Comparator<TemperaturaDiaSemana> {

    @Override
    public int compare(TemperaturaDiaSemana o1, TemperaturaDiaSemana o2) {
        if (o1.getTemperatura() > o2.getTemperatura()) {
            return 1;
        } else if (Objects.equals(o1.getTemperatura(), o2.getTemperatura())) {
            return 0;
        } else {
            return -1;
        }
    }
}
