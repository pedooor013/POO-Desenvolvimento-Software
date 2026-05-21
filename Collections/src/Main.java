import java.sql.SQLOutput;
import java.util.*;

class Main
{
    public static void main(String[] args) {
        System.out.println("=== INTEIROS ===");
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);
        System.out.println("Inteiros antes de ordenar: " + inteiros);

        Collections.sort(inteiros);
        System.out.println("Inteiros depois de ordenar: " + inteiros);

        System.out.println("Busca binária de 10: " + Collections.binarySearch(inteiros, 10));
        System.out.println("Busca binária de 20: " + Collections.binarySearch(inteiros, 20));

        //30, 52, 20, -10, 100
        ArrayList<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);

        System.out.println("Os conjuntos não possuem valores em comum? " + Collections.disjoint(inteiros2, inteiros));

        inteiros2.add(100);
        System.out.println("Exibindo a frequencia do valor 100: "
        + Collections.frequency(inteiros2, 100));

        System.out.println("O maior valor encontrado em inteiros2 eh: " + Collections.max(inteiros2));

        System.out.println("Maior número: " + Collections.max(inteiros2) + "\nMenor número: " +  Collections.min(inteiros2));

        System.out.println("=== TEXTO ===");

        ArrayList<String> texto = new ArrayList<>();
        texto.add("Mariana");
        texto.add("André");
        texto.add("Pedro");
        texto.add("Carla");
        texto.add("Matheus");

        System.out.println("Texto antes de ordenar: " + texto);
        Collections.sort(texto);
        System.out.println("Texto depois de ordenar: " + texto);

        System.out.println("Collections.binarySearch() Vitoria: " +
                Collections.binarySearch(texto, "Vitoria"));
        System.out.println("Collections.binarySearch() Pedro: " +
                Collections.binarySearch(texto, "Pedro"));

        ArrayList<String> texto2 = new ArrayList<>();

        texto2.add("Regiscrei");
        texto2.add("Vitoria");
        texto2.add("Bruno");
        texto2.add("Clodoaldo");
        texto2.add("Jordisnei");

        Collections.sort(texto2);

        System.out.println("Os conjuntos de nomes não possuem valores em comum? " +
                Collections.disjoint(texto2, texto));

        texto2.add("Vitoria");

        System.out.println("Quantas 'Vitoria' tem no texto2: " + Collections.frequency(texto2, "Vitoria"));

        System.out.println("O maior valor encontrado em texto2 é: " + Collections.min(texto2));
        System.out.println("O maior valor encontrado em texto é: " + Collections.min(texto));

        Collections.reverse(texto2);
        System.out.println("ArrayList texto2 ()" + texto2);
    }
}