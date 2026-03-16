import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int[] arrayNumeros = new int[10];

        System.out.println("Digite " + arrayNumeros.length + " números:");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println((i + 1) + "º número: ");
            arrayNumeros[i] = input.nextInt();
        }

        int inicio, fim;

        do {
            System.out.println("Escolha um intevalo de números para ");

            System.out.println("Digite o início do intervalo: ");
            inicio = input.nextInt();

            System.out.println("Digite o final do intervalo: ");
            fim = input.nextInt();

            if (inicio > fim) {
                System.out.println("Valor inválido!");
            }

        } while (inicio > fim);

        System.out.println("Numeros no intevalo selecionado: ");
        for (int i = 0; i < arrayNumeros.length; i++) {
            if ((arrayNumeros[i] >= inicio) && arrayNumeros[i] <= fim) {
                System.out.println(arrayNumeros[i]);
            }
        }
*/
        int vetorUm[] = new int[3];
        int vetorDois[] = new int[3];
        int vetorFinal[] = new int[3];

        System.out.println("Primeiro array: ");
        for (int i = 0; i < vetorUm.length; i++) {
            System.out.println("Digite um número: ");
            vetorUm[i] = input.nextInt();
        }

        System.out.println("Segundo array: ");
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.println("Digite um número: ");
            vetorDois[i] = input.nextInt();
        }

        int countVetorFinal = 0;

        for (int i = 0; i < vetorUm.length; i++) {
            for (int c = 0; c < vetorDois.length; c++) {

                if (vetorUm[i] == vetorDois[c]) {
                    if (!EhContido(vetorUm[i], vetorFinal)) {
                        vetorFinal[countVetorFinal] = vetorUm[i];
                        countVetorFinal++;
                    }
                }
            }
        }
        System.out.println("=== Vetor Final ===");

        for (int i = 0; i < vetorFinal.length; i++) {
            if(vetorFinal[i] == 0 && vetorFinal[i+1] == 0){
                return;
            }
            System.out.println(i + 1 + "- " + vetorFinal[i]);
        }
    }

    public static boolean EhContido(int valorVetorUm, int[] vetorFinal) {
        for (int i = 0; i < vetorFinal.length; i++) {
            if (valorVetorUm == vetorFinal[i]) {
                return true;
            }
            return false;
        }
        return false;
    }
}