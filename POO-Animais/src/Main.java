import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] animais = new Animal[10];

        animais[0] = new Animal("Gato", 4, 1, 0);
        System.out.println(animais[0].toString());
        //Peixe
        animais[1] = new Fish("Bolota", 0, 3, 0, (byte) 1);
        System.out.println(animais[1].toString());

    }
}