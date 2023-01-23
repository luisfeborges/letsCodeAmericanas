package src.Builders;

import src.Classes.Cachorro;

public class CachorroBuilder {

    private int id;
    private String nome;
    private String dono;
    private String raca;
    private int idade;
    private boolean estaDoente;

    public CachorroBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CachorroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public CachorroBuilder dono(String dono) {
        this.dono = dono;
        return this;
    }

    public CachorroBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public CachorroBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public CachorroBuilder estaDoente(Boolean estaDoente) {
        this.estaDoente = estaDoente;
        return this;
    }
    
    public Cachorro build(){
        return new Cachorro(id, nome, dono, raca, idade, estaDoente);
    }
}