public class Retangulo extends Forma2D {

    public Retangulo(){
        super();
    }

    public Retangulo(double x){
        super(x, "retangulo quadrado");
    }

    public Retangulo(double w, double h){
        super(w, h,"retangulo");
    }
    @Override
    public double calcularArea() {
        return getAltura() * getLargura();
    }
}
