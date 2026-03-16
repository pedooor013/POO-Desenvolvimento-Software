import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Verificador Fibonacci ===");

        System.out.println("Digite um número");
        int numUser = input.nextInt();


        int numFibonacci = 0;
        int numTranscicao = 0;
        int numFinal = 1;
        int countFebonacci = 0;

        do {


            countFebonacci++;
            numTranscicao = numFinal;
            numFinal = numFinal + numFibonacci;
            numFibonacci = numTranscicao;
        } while (numUser > numFinal);

        if(numUser == numFinal){
            System.out.println("O numero " + numUser + ", está contido na " + countFebonacci + "ª posição da sequência de Fibonacci!");
        }else{
            System.out.println("O número " + numUser + ", não está contido na sequência de Fibonacci!");
        }


    }
}