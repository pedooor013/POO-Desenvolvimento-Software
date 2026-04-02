import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", 12.5f, 12);
        System.out.println(horse.toString());

        horse.walk();
        System.out.println(horse.toString());

        Bird parrot = new Bird("Home", false);
        System.out.println(parrot.toString());
        parrot.walk();
        System.out.println(parrot.toString());
    }
}1