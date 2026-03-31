import java.util.Calendar;
import java.util.Scanner;

public class Pessoa {
    Calendar data = Calendar.getInstance();
    Scanner input = new Scanner(System.in);
    private String nome;
    private Calendar nascimento;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa() {
    }
    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Pessoa(String nome, Calendar nascimento, String cpf, String telefone, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        if (nascimento == null || nascimento.before(Calendar.getInstance())) {
            System.out.println("Data inválida!");
            return;
        }
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void DigitarDataNascimento(){
        
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = input.nextInt();

        int mes;
        do{
        System.out.println("Digite o dia do seu nascimento: ");
        mes = input.nextInt();

        if(mes > 12 || mes <= 0){
            System.out.println("Digite novamente! Valor inválido!");
        }
        }while(mes > 12 || mes <= 0);

        System.out.println("Digite o ano do seu aniversário: ");
        int ano = input.nextInt();

        setNascimento(data.set(ano, mes, dia));
    }
    public String toString() {
        return "Nome: " + this.nome + " | CPF:" + this.cpf + " | Nascimento: " + this.nascimento.toString() + " | Telefone: " + this.telefone + " | Email: " + this.email;
    }
}
