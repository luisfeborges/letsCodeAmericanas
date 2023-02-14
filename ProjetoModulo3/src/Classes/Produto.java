package ProjetoModulo3.src.Classes;

import java.util.UUID;

public abstract class Produto {
    protected UUID id;
    protected String nome;
    protected double preco;
    protected String categoria;
    protected String marca;

    //Mercado
    protected String nomeMercado;
    protected int peso;

    //Livro
    protected int qtdPaginas;
    protected String genero;
    protected String autor;

    //Informática
    protected int voltagem;

    public Produto(UUID id, String nome, Double preco, String categoria, String marca) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
        
    public void dadosProduto() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("---------------------------");

    }

    
}
