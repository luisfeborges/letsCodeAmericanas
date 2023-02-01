package ProjetoModulo3.src.Classes;

public class Livro {
    private int qtdPaginas;
    private String generoLivro;
    private String autor;
    
    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public String getGeneroLivro() {
        return generoLivro;
    }
    public String getAutor() {
        return autor;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    public Livro(int qtdPaginas, String generoLivro, String autor) {
        this.qtdPaginas = qtdPaginas;
        this.generoLivro = generoLivro;
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Livro [qtdPaginas=" + qtdPaginas + ", generoLivro=" + generoLivro + ", autor=" + autor + "]";
    }
}
