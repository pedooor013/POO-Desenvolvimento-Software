public class Conta {

    private static int proximoId = 1;
    int id;
    String nome;
    double saldo;
    double limite;

    public boolean sacarVerifica(double valor) {
        if (valor > (this.saldo + this.limite) || valor <= 0) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean depositarVerifica(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido! Digite novamente!");
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public String toString() {
        return "Id: " + this.id + " | Nome: " + this.nome + " | Saldo: " + this.saldo + " | Limite: " + this.limite;
    }

    Conta(String nomeUser, double limiteUser) {
        id = proximoId++;
        nome = nomeUser;
        saldo = 0;
        limite = limiteUser;
    }

}
