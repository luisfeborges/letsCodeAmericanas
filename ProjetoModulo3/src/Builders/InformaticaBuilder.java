package ProjetoModulo3.src.Builders;

import ProjetoModulo3.src.Classes.Informatica;

public class InformaticaBuilder {
    private int id;
    private String nome;
    private Double preco;
    private String categoria;
    private String marca;
    private int voltagem;

    public InformaticaBuilder id(int id) {
        this.id = id;
        return this;
    }

    public InformaticaBuilder preco(Double preco) {
        this.preco = preco;
        return this;
    }

    public InformaticaBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public InformaticaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public InformaticaBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }


    public InformaticaBuilder voltagem(int voltagem) {
        this.voltagem = voltagem;
        return this;
    }
    
    public Informatica build(){
        return new Informatica(id, nome, preco, categoria, marca, voltagem);
    }
}
