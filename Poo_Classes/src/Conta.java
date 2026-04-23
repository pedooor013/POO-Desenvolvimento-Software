public class Conta {

    private static int id;
    private double saldo;
    private double limite;
    private Cliente cliente;

    //Get & Set

    //Id
    public int getId() {
        return this.id;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(){
        this.id = id++;
    }

    public Conta(double limite, Cliente cliente) {
        this.id = id++;
        this.saldo = 0;
        this.limite = limite;
        this.cliente = cliente;
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
        return "Id: " + this.id + cliente.toStringConta() + " | Saldo: " + this.saldo + " | Limite: " + this.limite;
    }
}
