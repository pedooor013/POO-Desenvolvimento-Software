import java.util.Scanner;

public class Loja {
    static Scanner input = new Scanner(System.in);
    static Produto[] produtosCadastrados = new Produto[100];
    static Produto[] carrinhoProdutoCliente = new Produto[100];
    static int totalProdutosCadastrados = 0;
    static int totalProdutosCarrinho = 0;


    public static void main(String[] args) {
        System.out.println("=== Locadora ===");

        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n=== Menu ===\n01) Cadastrar Produtos;\n02) Adicionar Produtos ao Carrinho;\n03) Buscar Produtos;\n04) Mostrar Carrinho;\n05) Listar Produtos;\n06) Sair;");
        int escolhaUser = input.nextInt();
        input.nextLine();

        escolhaUserMenuPrincipal(escolhaUser);
    }

    public static void escolhaUserMenuPrincipal(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                mostrarMenuCadastroProdutos();
                mostrarMenuPrincipal();
                break;
            case 2:
                adicaoProdutosCarrinho();
                mostrarMenuPrincipal();
                break;
            case 3:
                buscarProdutos();
                mostrarMenuPrincipal();
                break;
            case 4:
                listarProdutosCarrinho();
                mostrarMenuPrincipal();
                break;
            case 5:
                listarProdutosCadastrados();
                mostrarMenuPrincipal();
                break;
            case 6:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Valor Inválido! Digite novamente!");
                mostrarMenuPrincipal();
                break;
        }
    }

    public static void mostrarMenuCadastroProdutos() {
        System.out.println("\n=== Cadastro de Produtos ===");
        System.out.println("Qual produto você deseja cadastras: \n\t01) DVD;\n\t02) CD;\n\t03) Livro;");
        int escolhaUser = input.nextInt();
        input.nextLine();

        escolhaUserCadastroProdutos(escolhaUser);
    }

    public static void escolhaUserCadastroProdutos(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                cadastroDvd();
                mostrarMenuPrincipal();
                break;
            case 2:
                cadastroCd();
                mostrarMenuPrincipal();
                break;
            case 3:
                cadastroLivro();
                mostrarMenuPrincipal();
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                mostrarMenuCadastroProdutos();
                break;
        }
    }

    public static void cadastroDvd() {
        System.out.println("=== Cadastro de DVD ===");

        System.out.println("Digite o nome do DVD:");
        String nomeDvd = input.nextLine();

        System.out.println("Digite o valor do DVD:");
        double valorDvd = Double.parseDouble(input.nextLine());

        System.out.println("Digite a duração do DVD: ");
        int duracaoDvd = input.nextInt();
        input.nextLine();

        System.out.println("Digite o codigo de barras do DVD: ");
        String codigoBarrasDvd = input.nextLine();

        produtosCadastrados[totalProdutosCadastrados] = new DVD(nomeDvd, valorDvd, duracaoDvd, codigoBarrasDvd);
        totalProdutosCadastrados++;
        System.out.println("DVD cadastrado com sucesso!");
    }

    public static void cadastroCd() {
        System.out.println("=== Cadastro de CD ===");

        System.out.println("Digite o nome do CD:");
        String nomeCd = input.nextLine();

        System.out.println("Digite o valor do CD:");
        double valorCd = Double.parseDouble(input.nextLine());

        System.out.println("Digite o numero de faixas do CD: ");
        int numFaixasCd = input.nextInt();
        input.nextLine();

        System.out.println("Digite o codigo de barras do CD: ");
        String codigoBarrasCd = input.nextLine();

        produtosCadastrados[totalProdutosCadastrados] = new CD(nomeCd, valorCd, numFaixasCd, codigoBarrasCd);
        totalProdutosCadastrados++;
        System.out.println("CD cadastrado com sucesso!");
    }

    public static void cadastroLivro() {
        System.out.println("=== Cadastro de Livro ===");

        System.out.println("Digite o nome do livro:");
        String nomeLivro = input.nextLine();

        System.out.println("Digite o valor do livro:");
        double valorLivro = Double.parseDouble(input.nextLine());

        System.out.println("Digite o autor do livro: ");
        String autorLivro = input.nextLine();

        System.out.println("Digite o codigo de barras do livro: ");
        String codigoBarrasLivro = input.nextLine();

        produtosCadastrados[totalProdutosCadastrados] = new Livro(nomeLivro, valorLivro, autorLivro, codigoBarrasLivro);
        totalProdutosCadastrados++;
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void listarProdutosCadastrados() {
        System.out.println("=== Lista de Produtos Cadastrados ===");
        if (totalProdutosCadastrados == 0) {
            System.out.println("Não contem produtos cadastrados!");
            return;
        }
        for (int i = 0; i < totalProdutosCadastrados; i++) {
            System.out.println((i + 1) + ") " + produtosCadastrados[i].toString());
        }
    }

    public static void adicaoProdutosCarrinho() {
        System.out.println("=== Adicionar Produtos ===");
        String continuar = null;

        if (totalProdutosCadastrados == 0) {
            System.out.println("Não contem produtos cadastrados!");
            return;
        }
        do {
            listarProdutosCadastrados();
            System.out.println("Digite o numero do produto desejado: ");
            int idProdutoDesejado = input.nextInt();

            if (idProdutoDesejado > totalProdutosCadastrados || idProdutoDesejado <= 0) {
                System.out.println("Valor inválido! Digite novamente!");
                adicaoProdutosCarrinho();
            }

            carrinhoProdutoCliente[totalProdutosCarrinho] = produtosCadastrados[idProdutoDesejado - 1];
            totalProdutosCarrinho++;
            System.out.println("Deseja adicionar outros produtos (Sim / Nao):");
            continuar = input.next().toUpperCase();
        } while (continuar.equals("SIM"));

        System.out.println("Produtos adicionados com sucesso!");
    }

    public static void buscarProdutos() {
        System.out.println("=== Buscar Produtos ===");
        System.out.println("Digite o codigo de barras do produto: ");
        String codigoBarras = input.nextLine();

        if (posicaoProduto(codigoBarras) >= 0) {
            System.out.println("Produto está contido na nossa base de dados! E está na posição " + posicaoProduto(codigoBarras));
        } else {
            System.out.println("Produto não está contido na nossa base de dados!");
        }
    }

    public static int posicaoProduto(String codigoBarrasProduto) {
        if (totalProdutosCadastrados == 0) {
            return -1;
        }
        for (int i = 0; i < totalProdutosCadastrados; i++) {
            if (produtosCadastrados[i].getCodigoBarras().equals(codigoBarrasProduto)) {
                return i;
            }
        }
        return -1;
    }

    public static void listarProdutosCarrinho() {
        System.out.println("=== Lista de Produtos no Carrinho ===");
        if (totalProdutosCarrinho == 0) {
            System.out.println("Carrinho Vazio!");
            return;
        }
        for (int i = 0; i < totalProdutosCarrinho; i++) {
            System.out.println((i + 1) + ") " + carrinhoProdutoCliente[i].toString());
        }
    }
    /*
        No método Loja.main(), após a impressão do vetor (feita na questão
        anterior), escolha um dos 5 produtos e crie duas novas instâncias
        idênticas a ele: uma com o mesmo código de barras e outra com o
        código diferente. Efetue a busca deste produto no vetor utilizando as
        duas instâncias e verifique o resultado.
     * */


}
