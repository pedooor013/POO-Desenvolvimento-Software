import java.util.Scanner;

class Main {
    public static Scanner input = new Scanner(System.in);
    public static Conta contaNova;

    public static void main(String[] args) {

        System.out.println("=== Serviço Bancario ===");

        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("O que deseja fazer: " +
                "\n01) Cadastrar usuário;" +
                "\n02) *Indisponível* Listar usuários cadastrados; " +
                "\n03) Selecionar um cliente;" +
                "\n04) Cadastrar funcionario;" +
                "\n05) Selecionar funcionario;" +
                "\n06) Sair;");
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
                //listarUsuariosCadastrados();
                mostrarMenuPrincipal();
                break;
            case 3:
                selecionarCliente();
                mostrarMenuPrincipal();
                break;
            case 4:
                cadastrarFuncionario();
                mostrarMenuPrincipal();
                break;
            case 5:
                selecionarFuncionario();
                mostrarMenuPrincipal();
                break;
            case 6:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Esse valor não é valido! Digite novamente!");
                mostrarMenuPrincipal();
                break;
        }
    }

    public static void cadastrarUsuario() {

        if (contaNova == null) {

            System.out.println("=== Cadastrar usuário ===");

            System.out.println("Digite o seu nome: ");
            String nomeUser = input.next();

            System.out.println("Digite o seu limite: ");
            double limite = input.nextDouble();

            contaNova = new Conta(nomeUser, limite);
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Usuário já cadastrado!");
        }
    }

    public static void selecionarCliente() {
        //Necessário fazer o codigo para mais de um cliente, codigo base somente!

        mostrarMenuCliente();
    }

    public static void mostrarMenuCliente() {
        System.out.println("=== Funções Cliente ===");

        System.out.println("01) Realizar o saque;" +
                "\n02) Realizar um deposito;" +
                "\n03) Ver dados do cliente;" +
                "\n04) Voltar;");

        int escolhaUser = input.nextInt();

        escolhaFuncaoMenuCliente(escolhaUser);
    }

    public static void escolhaFuncaoMenuCliente(int escolhaUser) {
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
                mostrarMenuCliente();
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

    public static void cadastroFuncionario() {
        System.out.println("=== Cadastro Funcionario ===");

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o seu nome: ");
        funcionario.setNome(input.next());
    }
}