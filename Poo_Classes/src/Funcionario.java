import java.time.LocalDate;

public class Funcionario {
    private static int contadorId = 1;
    private int id;
    private String nome;
    private String departamento;
    private LocalDate dataContratacao;
    private String rg;
    private double salario;
    private boolean ehContratado;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public String getRg() {
        return rg;
    }

    public boolean getEhContratado() {
        return ehContratado;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEhContratado(boolean ehContratado) {
        this.ehContratado = ehContratado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean bonifica(double porcentagemAumento) {
        if (porcentagemAumento <= 0) {
            return false;
        } else {
            porcentagemAumento = this.salario * porcentagemAumento;
            this.salario += porcentagemAumento;
            return true;
        }
    }

    public boolean demitir() {
        this.ehContratado = false;
        return true;
    }
}
