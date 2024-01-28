package data_structure.tools;

import data_structure.tools.objects.Pessoa;

import java.util.*;

public class SortedByAge {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Matheus Badia", 21);
        Pessoa pessoa2 = new Pessoa("Jose de Souza", 84);
        Pessoa pessoa3 = new Pessoa("Badia", 47);
        Pessoa pessoa4 = new Pessoa("Vithoria Badia", 19);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        System.out.println("pessoas: " + toStringPessoas(pessoas));

        ordenarPessoas(pessoas);

        System.out.println("pessoas: " + toStringPessoas(pessoas));
    }

    private static String toStringPessoas(List<Pessoa> lista) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < lista.size(); i++) {
            if (i == lista.size() - 1) {
                stringBuilder.append(lista.get(i).getNome());
            } else {
                stringBuilder.append(lista.get(i).getNome() + ", ");
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static void ordenarPessoas(List<Pessoa> lista) {
        Collections.sort(lista, new ObjectComparator());
    }
    static class ObjectComparator implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }

}
