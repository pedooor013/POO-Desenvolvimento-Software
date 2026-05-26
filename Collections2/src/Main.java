import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Pedro Lopes", "121.075.839-35", "09/10/2006"));
        pessoas.add(new Pessoa("Vitoria Lima", "123.456.789-98", "02/04/2006"));
        pessoas.add(new Pessoa("Anderson Camargo", "022.979.079-82", "01/01/1978"));

        System.out.println("Array sem ordenação : \n" + pessoas);

        Collections.sort(pessoas);
        System.out.println("\n\n====================================\n\nArray com ordenação : \n" + pessoas);

        Pessoa p1 = new Pessoa("Cristovaldo", "121.078.839-35", "09/10/2026");

        System.out.println("Buscar nome Pedro Lopes: " + Collections.binarySearch(pessoas, p1));

        ArrayList<Pessoa> pessoas2 = new ArrayList<Pessoa>();
        pessoas2.add(new Pessoa("Lilian Regina", "987.654.321-78", "07/12/1978"));
        pessoas2.add(new Pessoa("Laura Lopes", "456.845.989-78", "16/04/2009"));
        pessoas2.add(new Pessoa("Teste Dois", "845.265.875-98", "01/08/2002"));
        pessoas2.add(new Pessoa("Pedro Lopes", "121.075.839-35", "09/10/2006"));

        Collections.sort(pessoas2);

        System.out.println("Conjuntos disjuntos? " + Collections.disjoint(pessoas, pessoas2));
        System.out.println("Conjuntos disjuntos? " + Collections.disjoint(pessoas, pessoas2));

    }
}