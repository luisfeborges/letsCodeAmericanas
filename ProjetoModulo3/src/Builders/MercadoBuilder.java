package ProjetoModulo3.src.Builders;

import ProjetoModulo3.src.Classes.Mercado;

public class MercadoBuilder {
    private int id;
    private String nome;
    private Double preco;
    private String categoria;
    private String marca;
    private int quantidade;
    private String nomeMercado;
    private int peso;

    public MercadoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public MercadoBuilder preco(Double preco) {
        this.preco = preco;
        return this;
    }

    public MercadoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public MercadoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public MercadoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }


    public MercadoBuilder quantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public MercadoBuilder nomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
        return this;
    }

    public MercadoBuilder peso(int peso) {
        this.peso = peso;
        return this;
    }
    
    public Mercado build(){
        return new Mercado(id, nome, preco, categoria, marca, quantidade, nomeMercado, peso);
    }
}
