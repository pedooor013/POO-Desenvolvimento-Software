import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main() {

        System.out.println("Escolha o exercicio: " +
                "\n01) Produtos e Descontos;" +
                "\n02) Fibonacci;" +
                "\n03) Horário;" +
                "\n04) Datas;" +
                "\n05) Salários;" +
                "\n06) Valores Primos;" +
                "\n07) Repetições;" +
                "\n08) Merge;" +
                "\n09) Sair;");

        int escolhaUser = input.nextInt();

        switch (escolhaUser) {
            case 1:
                ProdutosDescontos();
                main();
                break;
            case 2:
                Fibonacci();
                main();
                break;
            case 3:
                Horario();
                main();
                break;
            case 4:
                //Datas();
                main();
                break;
            case 5:
                //Salario();
                main();
                break;
            case 6:
                //ValoresPrimos();
                main();
                break;
            case 7:
                //Repeticoes();
                main();
                break;
            case 8:
                //Merge();
                main();
                break;
            case 9:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                main();
                break;
        }
    }

    public static void ProdutosDescontos() {
        System.out.println("=== Desconto Sobre Produtos ===");

        System.out.println("Digite o nome do produto");
        String nomeProduto = input.next();

        float precoProduto;
        do {
            System.out.println("Digite o preço do produto: ");
            precoProduto = input.nextFloat();

            if (precoProduto <= 0) {
                System.out.println("Valor inválido! Digite novamente!");
            }
        } while (precoProduto <= 0);

        int quantProduto;

        do {
            System.out.println("Digite a quantidade de " + nomeProduto + ":");
            quantProduto = input.nextInt();

            if (quantProduto <= 0) {
                System.out.println("Quantidade inválida! Digite novamente!");
            }
        } while (quantProduto <= 0);


        if (quantProduto <= 10) {
            System.out.println("Valor final: R$" + precoProduto * quantProduto);
        } else if (quantProduto <= 20) {
            float precoFinal = (precoProduto * quantProduto);
            precoFinal = (float) (precoFinal - (precoFinal * 0.1));
            System.out.println("Valor final: R$" + precoFinal);
        } else if (quantProduto <= 50) {
            float precoFinal = (precoProduto * quantProduto);
            precoFinal = (float) (precoFinal - (precoFinal * 0.2));
            System.out.println("Valor final: R$" + precoFinal);
        } else {
            float precoFinal = (precoProduto * quantProduto);
            precoFinal = (float) (precoFinal - (precoFinal * 0.25));
            System.out.println("Valor final: R$" + precoFinal);
        }

    }

    public static void Fibonacci() {
        System.out.println("=== Verificador Fibonacci ===");

        System.out.println("Digite um número");
        int numUser = input.nextInt();

        int numFibonacci = 0;
        int numTranscicao = 0;
        int numFinal = 1;
        int countFebonacci = 0;

        do {
            countFebonacci++;
            numTranscicao = numFinal;
            numFinal = numFinal + numFibonacci;
            numFibonacci = numTranscicao;
        } while (numUser > numFinal);

        if (numUser == numFinal) {
            System.out.println("O numero " + numUser + ", está contido na " + countFebonacci + "ª posição da sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numUser + ", não está contido na sequência de Fibonacci!");
        }
    }

    public static void Horario() {
        System.out.println("=== Conversor de Horarios ===");

        System.out.println("Digite um número de segundos:");
        int segundosUser = input.nextInt();

        int minutos = 0;
        int horas = 0;

        if (segundosUser >= 60) {
            minutos = segundosUser / 60;
            segundosUser = segundosUser % 60;
            if (minutos >= 60) {
                horas = minutos / 60;
                minutos = minutos % 60;
            }
        }

        System.out.println(horas + " Horas " + minutos + " Minutos " + segundosUser + " Segundos");

    }
}