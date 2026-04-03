import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto[] carrinho = new Produto[5];
        System.out.println("=== Locadora ===");

        System.out.println("Adicionar produtos: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha o produto: \n01) Livro;\n02) CD; \n03) DVD;");
            int escolhaUser = input.nextInt();

            System.out.println("Nome do produto: ");
            String nome = input.next();
            input.nextLine();

            System.out.println("Preço do produto:");
            double preco = input.nextDouble();
            input.nextLine();

            switch (escolhaUser) {
                case 1:
                    System.out.println("Digite o nome do autor do livro: ");
                    String autor = input.nextLine();
                    carrinho[i] = new Livro(nome, preco, autor);
                    break;
                case 2:
                    System.out.println("Digite o numero de faixas do CD: ");
                    int faixas = input.nextInt();
                    carrinho[i] = new CD(nome, preco, faixas);
                    break;
                case 3:
                    System.out.println("Digite a duração em minutos do DVD: ");
                    int duracaoMin = input.nextInt();

                    carrinho[i] = new DVD(nome, preco, duracaoMin);
            }
        }
        System.out.println("Carrinho de Produtos: ");
        for (int i = 0; i < carrinho.length; i++) {
            System.out.println(carrinho[i].toString());
            System.out.println("=========================");
        }
    }
}
