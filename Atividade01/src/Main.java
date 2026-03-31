import java.util.Scanner;
import java.util.Calendar;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nomeUser =  input.nextLine();

        System.out.println("Digite um CPF: ");
        String cpfUser =  input.nextLine();

        System.out.println("Digite um email: ");
        String emailUser =  input.nextLine();

        System.out.println("");
        Calendar data = Calendar.getInstance();

        Pessoa pessoa = new Pessoa(nomeUser, cpfUser, emailUser);
    }
}