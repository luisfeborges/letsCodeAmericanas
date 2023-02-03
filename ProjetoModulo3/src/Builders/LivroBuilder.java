package ProjetoModulo3.src.Builders;

import ProjetoModulo3.src.Classes.Livro;

public class LivroBuilder {
    private int id;
    private String nome;
    private Double preco;
    private String categoria;
    private String marca;
    private int qtdPaginas;
    private String genero;
    private String autor;

    public LivroBuilder id(int id) {
        this.id = id;
        return this;
    }

    public LivroBuilder preco(Double preco) {
        this.preco = preco;
        return this;
    }

    public LivroBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public LivroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public LivroBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }


    public LivroBuilder qtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
        return this;
    }

    public LivroBuilder genero(String genero) {
        this.genero = genero;
        return this;
    }

    public LivroBuilder autor(String autor) {
        this.autor = autor;
        return this;
    }
    
    public Livro build(){
        return new Livro(id, nome, preco, categoria, marca, qtdPaginas, genero, autor);
    }
}