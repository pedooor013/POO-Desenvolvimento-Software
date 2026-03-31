public class Calculadora {
    private double primeiroNum;
    private double segundoNum;

    public Calculadora(double primeiroNum, double segundoNum) {
        this.primeiroNum = primeiroNum;
        this.segundoNum = segundoNum;
    }

    public double getPrimeiroNum() {
        return primeiroNum;
    }

    public void setPrimeiroNum(double primeiroNum) {
        this.primeiroNum = primeiroNum;
    }

    public double getSegundoNum() {
        return segundoNum;
    }

    public void setSegundoNum(double segundoNum) {
        this.segundoNum = segundoNum;
    }

    public void soma(){
        System.out.println("Resultado:");
        System.out.println(this.primeiroNum + " + " + this.segundoNum + " = " + (this.primeiroNum + this.segundoNum));
    }
    public void subtracao(){
        System.out.println("Resultado:");
        System.out.println(this.primeiroNum + " - " + this.segundoNum + " = " + (this.primeiroNum - this.segundoNum));
    }
    public void divisao(){
        System.out.println("Resultado:");
        System.out.println(this.primeiroNum + " ÷ " + this.segundoNum + " = " + (this.primeiroNum / this.segundoNum));
    }
    public void multiplicacao(){
        System.out.println("Resultado:");
        System.out.println(this.primeiroNum + " X " + this.segundoNum + " = " + (this.primeiroNum * this.segundoNum));
    }
}
