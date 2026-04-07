public class DVD extends Produto {
    private int duracaoMinutos;

    public DVD(String codigoBarras) {
        this.setCodigoBarras(codigoBarras);
    }

    public DVD(int duracaoMinutos, String codigoBarras) {
        this.duracaoMinutos = duracaoMinutos;
        this.setCodigoBarras(codigoBarras);
    }

    public DVD(String nome, double preco, int duracaoMinutos, String codigoBarras) {
        super(nome, preco);
        this.duracaoMinutos = duracaoMinutos;
        this.setCodigoBarras(codigoBarras);
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duracao minutos: %d min".formatted(duracaoMinutos);
    }
}
