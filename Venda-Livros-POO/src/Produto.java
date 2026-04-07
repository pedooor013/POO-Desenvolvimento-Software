public class Produto {
    private String nome;
    private double preco;
    private String codigoBarras;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Nome: %s | Preço: %.2f | Codigo de Barras: %s".formatted(getNome(), getPreco(), getCodigoBarras());
    }
    public boolean ehRepetido(String codigoBarras){
        if(this.codigoBarras.equals(codigoBarras)){
            return true;
        }else{
            return false;
        }
    }
}
