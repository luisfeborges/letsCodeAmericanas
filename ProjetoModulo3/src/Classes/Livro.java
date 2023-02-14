package ProjetoModulo3.src.Classes;

import java.util.UUID;

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
    
    public Livro(String nome, Double preco, String categoria, String marca, int qtdPaginas, String genero, String autor) {
        super(UUID.randomUUID(), nome, preco, categoria, marca); 
        this.qtdPaginas = qtdPaginas;
        this.genero = genero;
        this.autor = autor;
    }


    @Override
    public void dadosProduto() {
        super.dadosProduto();
        System.out.println("Quantidade de páginas: " + qtdPaginas);
        System.out.println("Gênero: " + genero);
        System.out.println("Autor: " + autor);
    }
}
