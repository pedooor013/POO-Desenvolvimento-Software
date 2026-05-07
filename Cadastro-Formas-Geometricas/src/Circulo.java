public class Circulo extends Forma2D {
    private double pi = 3.14;

    public Circulo(double raio) {
        super(raio, "Circulo");
    }

    @Override
    public String toString() {
        return "Circulo: \nRaio: " + this.getLargura() + "\nÁrea: " + this.calcularArea();
    }

    @Override
    public double calcularArea() {
        return pi * (getLargura() * getLargura());
    }
}
