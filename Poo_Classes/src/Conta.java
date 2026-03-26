public class Conta {

    private static int proximoId = 1;
    private int id;
    private String nome;
    private double saldo;
    private double limite;

    //Get & Set

    //Id
    public int getId() {
        return this.id;
    }

    //Nome
    public void setNome(String nome) {
        if (nome != null && nome.length() > 2) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    //Saldo
    public double getSaldo() {
        return this.saldo;
    }
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Limite
    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double vlrLimite) {
        if (vlrLimite > 0) {
            this.limite = vlrLimite;
        }
    }

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
