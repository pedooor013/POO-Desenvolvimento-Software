import java.util.Scanner;

class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Pseudocalculadora ===");
        mostrarMenu();
    }

    public static void mostrarMenu() {
        System.out.println("=== Menu Principal ===");
        System.out.println("01) Soma;" +
                "\n02) Subtração;" +
                "\n03) Divisão;" +
                "\n04) Multiplicação;" +
                "\n05) Sair;" +
                "\nDigite o que deseja fazer: ");
        int escolhaUser = input.nextInt();
        escolhaMenuPrincipal(escolhaUser);
    }

    public static void escolhaMenuPrincipal(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                soma();
                mostrarMenu();
                break;
            case 2:
                subtracao();
                mostrarMenu();
                break;
            case 3:
                divisao();
                mostrarMenu();
                break;
            case 4:
                multiplicacao();
                mostrarMenu();
                break;
            case 5:
                System.out.println("Saindo...");
                System.exit(0);
                break;
        }
    }
    public static void soma() {
        System.out.println("Primeiro número:");
        double  primeiroNum = input.nextDouble();
        System.out.println("Segundo número:");
        double segundoNum = input.nextDouble();

        Calculadora cal = new Calculadora(primeiroNum, segundoNum);
        cal.soma();
    }
    public static void subtracao() {
        System.out.println("Primeiro número:");
        double  primeiroNum = input.nextDouble();
        System.out.println("Segundo número:");
        double segundoNum = input.nextDouble();

        Calculadora cal = new Calculadora(primeiroNum, segundoNum);
        cal.subtracao();
    }

    public static void divisao() {
        System.out.println("Primeiro número:");
        double  primeiroNum = input.nextDouble();
        System.out.println("Segundo número:");
        double segundoNum = input.nextDouble();

        Calculadora cal = new Calculadora(primeiroNum, segundoNum);
        cal.divisao();
    }

    public static void multiplicacao() {
        System.out.println("Primeiro número:");
        double  primeiroNum = input.nextDouble();
        System.out.println("Segundo número:");
        double segundoNum = input.nextDouble();

        Calculadora cal = new Calculadora(primeiroNum, segundoNum);
        cal.multiplicacao();
    }
}