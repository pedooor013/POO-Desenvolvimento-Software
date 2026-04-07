public class CD extends Produto {
    private int NumFaixas;

    public CD(String codigoBarras) {
        this.setCodigoBarras(codigoBarras);
    }

    public CD(int numFaixas, String codigoBarras) {
        NumFaixas = numFaixas;
        this.setCodigoBarras(codigoBarras);
    }

    public CD(String nome, double preco, int numFaixas, String codigoBarras) {
        super(nome, preco);
        NumFaixas = numFaixas;
        this.setCodigoBarras(codigoBarras);
    }

    public int getNumFaixas() {
        return NumFaixas;
    }

    public void setNumFaixas(int numFaixas) {

        NumFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Numero de Faixas: %d".formatted(getNumFaixas());
    }
}