public class CD extends Produto {
    private int NumFaixas;

    public CD() {
    }

    public CD(int numFaixas) {
        NumFaixas = numFaixas;
    }

    public CD(String nome, double preco, int numFaixas) {
        super(nome, preco);
        NumFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return NumFaixas;
    }

    public void setNumFaixas(int numFaixas) {

        NumFaixas = numFaixas;
    }
    @Override
    public String toString(){
        return super.toString() + " | Numero de Faixas: %d".formatted(getNumFaixas());
    }
}