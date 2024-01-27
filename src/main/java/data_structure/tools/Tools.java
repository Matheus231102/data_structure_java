package data_structure.tools;

public class Tools {
    public static String vetorConvertido(float[] vetor) {
        StringBuilder string = new StringBuilder();
        for (Number number : vetor) {
            string = string.append(number).append(", ");
        }
        return string.toString();
    }

    public static boolean isPar(Float number) {
        if (number % 2 == 0) {
            return true;
        } else { return false; }
    }
}
