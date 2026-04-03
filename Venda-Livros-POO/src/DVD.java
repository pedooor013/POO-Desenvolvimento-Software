public class DVD extends Produto{
    private int duracaoMinutos;

    public DVD(){}
    public DVD(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public DVD(String nome, double preco, int duracaoMinutos) {
        super(nome, preco);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString(){
        return super.toString() + " | Duracao minutos: %d min".formatted(duracaoMinutos);
    }
}
