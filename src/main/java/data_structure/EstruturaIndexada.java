package data_structure;

import java.lang.reflect.Array;

public class EstruturaIndexada {

    public static void main(String[] args) {
//        inicialização por instanciação
         int[] inteiros = new int[12];
         String[] meses = new String[12];

         inteiros[0] = 1;
         inteiros[1] = 2;
         inteiros[2] = 3;

//         inteiros[12] = 2; // ArrayIndexOutOfBoundsException

         meses[0] = "JANEIRO";
         meses[1] = "FEVEREIRO";
         meses[2] = "MARÇO";

         // inicialização direta
        int[] mesesDoAno = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        mesesDoAno[1] = 0;

        for (int i : mesesDoAno) {
            System.out.println(i);
        }

    }
}
