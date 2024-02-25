package data_structure.tools;

public class PrintMatriz {

    public static void execute(int[][] matriz) {
        for (int i =  0; i < matriz.length; i++) {
            for (int j =  0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = { {  3,  2,  1,  7 },
                {  9,  11,  5,  4 },
                {  6,  0,  13,  17 },
                {  7,  21,  14,  15 } };
        execute(matriz);
    }
}
