import Objetos.Carro;

class Main {
    public static void main(String[] args) {
        //Utilizando contrutor CHEIO
        Carro car = new Carro("Gol", "Branco", "AWC-0E92", 4);

        System.out.println(car.toString());

        //Utilizando contrutor VAZIO
        Carro car2 = new Carro();

        car2.setPlaca("LAZ-5716");

        System.out.println(car2.toString());
    }
}