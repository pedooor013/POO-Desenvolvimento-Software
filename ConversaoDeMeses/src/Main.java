import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String meses[] = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        int numUser;

        do {
            System.out.println("Digite um número de 1 a 12: ");
            numUser = input.nextInt();
            if (numUser > 12 || numUser < 1) {
                System.out.println("Valor inválido...");
            }
        } while (numUser > 12 || numUser < 1);

        System.out.println("O mês compativel é " + meses[numUser - 1]);
    }
}