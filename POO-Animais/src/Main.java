import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] animals = new Animal[3];

        //Animais em geral
        animals[0] = new Animal("Gato", 4, 1, 0);
        System.out.println(animals[0].toString());

        //Peixe
        animals[1] = new Fish("Bolota", 0, 3, 0, (byte) 1);
        System.out.println(animals[1].toString());

        //Aves
        animals[2] = new Bird("Piupiu Pistola", 2, 15, 0);
        System.out.println(animals[0].toString());

        for (Animal a : animals) {
            a.move();
            System.out.println("Localization: " + a.getLocalization());
        }
    }
}