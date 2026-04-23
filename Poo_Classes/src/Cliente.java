public class Cliente {
    private static int id;
    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente() {
        this.id = id++;
    }

    public Cliente(String nome, String sobrenome, String cpf) {
        this.id = id++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Id: " + id + "Nome: " + nome + " " + sobrenome + "| CPF: " + cpf;
    }
    public String toStringConta(){
        return "Nome: " + nome + " " + sobrenome + "| CPF: " + cpf;
    }
}
