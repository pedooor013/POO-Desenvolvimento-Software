import java.util.Scanner;

class Main {
    public static Scanner input = new Scanner(System.in);
    public static Conta contaNova;
    public static Cliente cliente;

    public static void main(String[] args) {

        System.out.println("=== Serviço Bancario ===");

        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("O que deseja fazer: " +
                "\n01) wCadastrar usuário;" +
                "\n02) Selecionar um usuário;" +
                "\n03) Listar usuários cadastrados; " + //Fazer
                "\n04) Cadastrar conta;" +
                "\n05) Selecionar uma conta; " +
                "\n06) Listar contas; " + //Fazer
                "\n07) Cadastrar funcionario;" +
                "\n08) Selecionar funcionario;" +
                "\n09) Listar funcionarios;" +
                "\n10) Sair;");
        int escolhaUser = input.nextInt();
        funcaoMenuPrincipal(escolhaUser);
    }

    public static void funcaoMenuPrincipal(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                cadastrarUsuario();
                mostrarMenuPrincipal();
                break;
            case 2:
                selecionarUsuario();
                mostrarMenuPrincipal();
                break;
            case 3:
                listarUsuariosCadastrados();
                mostrarMenuPrincipal();
                break;
            case 4:
                cadastrarConta();
                mostrarMenuPrincipal();
                break;
            case 5:
                selecionarConta();
                mostrarMenuPrincipal();
                break;
            case 6:
                listarContas();
                mostrarMenuPrincipal();
                break;
            case 7:
                cadastroFuncionario();
                mostrarMenuPrincipal();
                break;
            case 8:
                selecionarConta();
                mostrarMenuPrincipal();
                break;
            case 9:
                listarFuncionarios();
                mostrarMenuPrincipal();
                break;
            case 10:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Esse valor não é valido! Digite novamente!");
                mostrarMenuPrincipal();
                break;
        }
    }

    //Usuarios
    public static void cadastrarUsuario() {

        System.out.println("=== Cadastrar usuário ===");

        System.out.println("Digite o seu nome: ");
        String nomeUser = input.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeUser = input.nextLine();

        System.out.println("Digite o seu CPF: ");
        String cpfUser = input.next();

        cliente = new Cliente(nomeUser, sobrenomeUser, cpfUser);

        System.out.println("Cadastrado realizado com sucesso!");
    }

    public static void selecionarUsuario() {
        System.out.println();
    }

    //Contas
    public static void selecionarConta() {
        //Necessário fazer o codigo para mais de um cliente, codigo base somente!

        mostrarMenuConta();
    }

    public static void mostrarMenuConta() {
        System.out.println("=== Funções Cliente ===");

        System.out.println("01) Realizar o saque;" +
                "\n02) Realizar um deposito;" +
                "\n03) Ver dados do cliente;" +
                "\n04) Voltar;");

        int escolhaUser = input.nextInt();

        escolhaFuncaoMenuConta(escolhaUser);
    }

    public static void escolhaFuncaoMenuConta(int escolhaUser) {
        switch (escolhaUser) {
            case 1:
                realizarSaque();
                mostrarMenuPrincipal();
                break;
            case 2:
                realizarDeposito();
                mostrarMenuPrincipal();
                break;
            case 3:
                System.out.println("=== Dados Usuário ===");
                System.out.println(contaNova.toString());
                break;
            case 4:
                System.out.println("Voltando...");
                mostrarMenuPrincipal();
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                mostrarMenuConta();
                break;
        }
    }

    public static void realizarSaque() {
        System.out.println("=== Realizar o Saque ===");

        System.out.println("Digite o valor do saque: ");
        double valorSaque = input.nextDouble();

        if (contaNova.sacarVerifica(valorSaque)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$" + contaNova.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque! Tente novamente!");
        }
    }

    public static void realizarDeposito() {
        System.out.println("=== Realizar o Deposito ===");

        System.out.println("Digite o valor do deposito: ");
        double valorDeposito = input.nextDouble();

        if (contaNova.depositarVerifica(valorDeposito)) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$" + contaNova.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o deposito! Tente novamente!");
        }
    }

    //Funcionario
    public static void cadastroFuncionario() {
        System.out.println("=== Cadastro Funcionario ===");

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o seu nome: ");
        funcionario.setNome(input.next());
    }
}