import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String txt = "Testando";
        System.out.println(txt.length());

        System.out.println("Digite um nome: ");
        String nomeUm = input.next();

        System.out.println("Digite mais um nome: ");
        String nomeDois = input.next();

        if (nomeUm.equalsIgnoreCase(nomeDois.toUpperCase())) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes não são iguais!");
        }


        System.out.println("Digite o seu nome inteiro: ");
        String nome = input.nextLine();

        String textoQuebrado[] = nome.split(" ");

        System.out.println(textoQuebrado[0]);
    }
}