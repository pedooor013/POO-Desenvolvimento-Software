public class Triangulo extends Forma2D {
    private String style;

    Triangulo() {
        super();
        style = "nada";
    }

    Triangulo(String s, double w, double h) {
        super(w, h, "Triangulo");
        style = s;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Triangulo: " + "\nStyle: " + this.style + "\nAltura: " + getAltura() + "\nLargura: " + getLargura() + "\nNome: " + getNome();
    }

    @Override
    public double calcularArea() {
        return (getAltura() * getLargura()) / 2;
    }
}
