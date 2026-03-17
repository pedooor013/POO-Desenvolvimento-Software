import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

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
}