import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;

        System.out.println("The result is: " + sum);

        input.close();
    }
}