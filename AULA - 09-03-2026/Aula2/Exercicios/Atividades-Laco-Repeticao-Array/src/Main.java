import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Selecione uma Lista de Exercicios ===");

        ShowMenuExercices();
    }

    static void ShowMenuExercices() {
        System.out.println("=== Lista de Exercicícios ===" +
                "\n01) Laços de Repetição;" +
                "\n02) Arrays;" +
                "\n03) Laços de Repetição e Arrays;" +
                "\n04) Sair;");
        System.out.println("Digite: ");
        int userChoice = input.nextInt();

        UserChoiceMenuExercices(userChoice);
    }

    static void UserChoiceMenuExercices(int userChoice) {
        switch (userChoice) {
            case 1:
                ShowMenuRepetExercices();
                break;
            case 2:
                //ShowMenuArraysExercices();
                break;
            case 3:
                //ShowMenuRepeatAndArrays();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                ShowMenuExercices();
                break;
        }
    }

    static void ShowMenuRepetExercices() {
        System.out.println("=== Exercicios de Repetição ===" +
                "\n01) Calculo de tempo para aumento de altura;" +
                "\n02) Média aritmética de uma classe;" +
                "\n03) Ler 500 valores;");

        System.out.println("Digite o execício escolhido: ");
        int userChoice = input.nextInt();

        SelectRepetExercices(userChoice);
    }

    static void SelectRepetExercices(int userChoice) {
        switch (userChoice) {
            case 1:
                CalculateLength();
                break;
            case 2:
                CalculateMediaArithmetic();
                break;
            case 3:
                ReadFiveHundredValues();
                break;
            default:
                System.out.println("Valor inválido! Digite novamente!");
                ShowMenuRepetExercices();
                break;
        }
    }

    static void CalculateLength() {
        float joaoLength = 1.50F;
        float zeLength = 1.10F;
        int countYears = 0;
        while (zeLength < joaoLength) {

            joaoLength += 0.02F;
            zeLength += 0.03F;

            countYears++;
        }

        System.out.println("Foi preciso " + countYears + " anos, para o Zé ser maior do que o João! \n Altura João: " + joaoLength + " \n Altura Zé: " + zeLength);

    }

    static void CalculateMediaArithmetic() {
        float finalMedia = 0F;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
            float nota = input.nextFloat();
            finalMedia += nota;
        }
        finalMedia = finalMedia / 3;
        System.out.println("Media aritmética: " + finalMedia);

    }

    static void ReadFiveHundredValues() {
        float media = 0F;
        float menorNum = 0, maiorNum = 0;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Digite um numero: ");
            float userResponse = input.nextFloat();

            if (i == 0) {
                maiorNum = userResponse;
                menorNum = userResponse;
            }

            media += userResponse;

            if (userResponse > maiorNum) {
                maiorNum = userResponse;
            }
            if (userResponse < menorNum) {
                menorNum = userResponse;
            }
        }

        media = media / i;

        System.out.println("Maior número digitado: " + maiorNum);
        System.out.println("Menor número digitado: " + menorNum);
        System.out.println("Média dos números lidos: " + media);

    }

}