public class Livro extends Produto {
    private String autor;

    public Livro() {
    }

    public Livro(String autor, String codigoBarras) {
        this.autor = autor;
        this.setCodigoBarras(codigoBarras);
    }

    public Livro(String nome, double preco, String autor, String codigoBarras) {
        super(nome, preco);
        this.autor = autor;
        this.setCodigoBarras(codigoBarras);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: %s".formatted(getAutor());
    }
}
