package ProjetoModulo3.src.Classes;

public class Livro extends Produto{
    private int qtdPaginas;
    private String genero;
    private String autor;
    
    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public String getgenero() {
        return genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public void setgenero(String genero) {
        this.genero = genero;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    public Livro(int id, String nome, Double preco, String categoria, String marca, int qtdPaginas, String genero, String autor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;        
        this.qtdPaginas = qtdPaginas;
        this.genero = genero;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro [qtdPaginas=" + qtdPaginas + ", genero=" + genero + ", autor=" + autor + "]";
    }
}
