public abstract class Forma2D {
    private double largura;
    private double altura;
    private String nome;

    Forma2D() {
        largura = altura = 0.0;
        nome = "Nada";
    }

    Forma2D(double largura, double altura, String nome) {
        this.largura = largura;
        this.altura = altura;
        this.nome = nome;
    }

    public Forma2D(double largura, String nome) {
        this.altura = this.largura = largura;
        this.nome = nome;

    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Forma 2D: \nAltura: " + this.altura + "\nLargura: " + this.largura + "\nNome: " + this.nome;
    }
}
