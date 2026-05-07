import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Forma2D> formas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Cadastro de formas ===");

        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Qual dessas você deseja fazer: \n 01) Triangulo; \n 02) Circulo; \n 03) Retangulo; \n 04) Sair;");
        int escolhaUser = sc.nextInt();

        cadastroFormas(escolhaUser);
    }

    public static void cadastroFormas(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                System.out.println("Cadastro Triangulo");
                cadastroTriangulo();
                mostrarMenuPrincipal();
                break;
            case 2:
                System.out.println("Cadastro Circulo");
                cadastroCirculo();
                mostrarMenuPrincipal();
                break;
            case 3:
                System.out.println("Cadastro Retangulo");
                cadastroRetangulo();
                mostrarMenuPrincipal();
                break;
            case 4:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Digite novamente...");
                mostrarMenuPrincipal();
                break;
        }
    }

    public static void cadastroTriangulo() {
        System.out.println("Digite o tipo do triangulo: ");
        String style = sc.nextLine();

        System.out.println("Digite a altura do triangulo: ");
        double h = sc.nextDouble();

        System.out.println("Digite a largura do triangulo: ");
        double w = sc.nextDouble();

        Triangulo triangulo = new Triangulo(style, h, w);

        System.out.println("Triangulo cadastrado com sucesso!");

        formas.add(triangulo);
    }

    public static void cadastroCirculo() {
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Triangulo cadastrado com sucesso!");

        formas.add(circulo);
    }

    public static void cadastroRetangulo() {
        int escolhaUser;
        do {
            System.out.println("Os lados são iguais? (1 - Sim / 2 - Não)");
            escolhaUser = sc.nextInt();
        } while (escolhaUser != 1 || escolhaUser != 2);

        if (escolhaUser == 1) {
            System.out.println("Digite o lado do retangulo: ");
            double lado = sc.nextDouble();

            Retangulo retangulo = new Retangulo(lado);

            System.out.println("Retangulo cadastrado com sucesso!");

            formas.add(retangulo);
        } else {
            System.out.println("Digite a largura do retangulo: ");
            double largura = sc.nextDouble();
            System.out.println("Digite a altura do retangulo: ");
            double altura = sc.nextDouble();

            Retangulo retangulo = new Retangulo(largura, altura);

            System.out.println("Retangulo cadastrado com sucesso!");

            formas.add(retangulo);

        }
    }
}