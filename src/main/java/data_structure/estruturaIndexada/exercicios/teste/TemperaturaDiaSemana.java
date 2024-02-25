package data_structure.estruturaIndexada.exercicios.teste;

public class TemperaturaDiaSemana {
    private String dia;
    private Double temperatura;

    public TemperaturaDiaSemana(String dia, Double temperatura) {
        this.dia = dia;
        this.temperatura = temperatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "TemperaturaDiaSemana {" +
                "dia='" + dia + '\'' +
                ", temperatura=" + temperatura +
                "}\n";
    }

}
