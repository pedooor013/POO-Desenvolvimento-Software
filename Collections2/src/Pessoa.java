import java.util.Date;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(){}
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int compareTo(Pessoa outraPessoa){
        return this.nome.compareToIgnoreCase(outraPessoa.getNome());
    }

    @Override
    public String toString() {
        return this.nome + "," + this.cpf + "," + this.dataNascimento;
    }
}
