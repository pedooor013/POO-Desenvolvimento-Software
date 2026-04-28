import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        showAnimalsMenu();
    }

    static void showAnimalsMenu() {
        System.out.println("=== Create new Animals Menu ===");
        System.out.println("1. Register new animal;");
        System.out.println("2. Show all animals;");
        System.out.println("3. Move animals;");
        System.out.println("4. Edit animal;");
        System.out.println("5. Exit;");

        System.out.println("Select: ");
        int userChoice = sc.nextInt();

        choiceAnimalMenu(userChoice);
    }

    static void choiceAnimalMenu(int userChoice) {
        switch (userChoice) {
            case 1:
                System.out.println("=== Register new animal ===");
                showMenuRegisterNewAnimal();
                showAnimalsMenu();
                break;
            case 2:
                System.out.println("=== Show all animals ===");
                showAllAnimals();
                showAnimalsMenu();
                break;
            case 3:
                System.out.println("=== Move animal ===");
                showMoveAnimalMenu();
                showAnimalsMenu();
                break;
            case 4:
                System.out.println("=== Edit animal ===");
                showEditAnimalMenu();
                showAnimalsMenu();
                break;
            case 5:
                System.out.println("Exiting....");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                showAnimalsMenu();
                break;
        }
    }

    static void showMenuRegisterNewAnimal() {
        System.out.println("=== Select the Species === ");
        System.out.println("1. Animal (Geral);");
        System.out.println("2. Fish;");
        System.out.println("3. Bird;");

        int userChoice = sc.nextInt();
        choiceMenuRegisterNewAnimal(userChoice);
    }

    static void choiceMenuRegisterNewAnimal(int userChoice) {
        System.out.println("Write the animal's name: ");
        String name = sc.next();

        System.out.println("Write the animal's paws:");
        int paws = sc.nextInt();

        System.out.println("Write the animal's speed:");
        double speed = sc.nextDouble();

        System.out.println("Write the animal's localization:");
        int localization = sc.nextInt();

        switch (userChoice) {
            case 1:
                animals.add(new Animal(name, paws, speed, localization));
                System.out.println("Create new animal successfully!");
                break;
            case 2:
                System.out.println("Write the fish's water type (0 > Freshwater; 1 > Sea Water)  : ");
                byte waterType = sc.nextByte();
                animals.add(new Fish(name, paws, speed, localization, waterType));
                System.out.println("Create new fish successfully!");
                break;
            case 3:
                animals.add(new Bird(name, paws, speed, localization));
                System.out.println("Create new bird successfully!");
                break;
        }
    }

    static void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("There are no animals!!");
            showAnimalsMenu();
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i).toString());
            }
        }
    }

    static void showMoveAnimalMenu() {
        showAllAnimals();

        System.out.println("Select: ");
        int userChoice = sc.nextInt();

        animals.get(userChoice - 1).move();
    }

    static void showEditAnimalMenu() {
        showAllAnimals();
        System.out.println("Select: ");
        int userChoice = sc.nextInt();

        System.out.println("Write the animal's name: ");
        String name = sc.next();
        animals.get(userChoice - 1).setName(name);

        System.out.println("Write the animal's paws:");
        int paws = sc.nextInt();
        animals.get(userChoice - 1).setPaws(paws);

        System.out.println("Write the animal's speed:");
        double speed = sc.nextDouble();
        animals.get(userChoice - 1).setSpeed(speed);

        System.out.println("Write the animal's localization:");
        int localization = sc.nextInt();
        animals.get(userChoice - 1).setLocalization(localization);

        if (animals.get(userChoice - 1) instanceof Fish) {
            System.out.println("Write the fish's water type (0 > Freshwater; 1 > Sea Water): ");
            byte waterType = sc.nextByte();
            ((Fish) animals.get(userChoice - 1)).setWaterType(waterType);
        }

        System.out.println("Edit animal successfully!");
    }
}