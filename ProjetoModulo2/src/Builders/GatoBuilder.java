package src.Builders;

import src.Classes.Gato;

public class GatoBuilder {

    private int id;
    private String nome;
    private String dono;
    private String raca;
    private int idade;
    private boolean estaDoente;

    public GatoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public GatoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public GatoBuilder dono(String dono) {
        this.dono = dono;
        return this;
    }

    public GatoBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public GatoBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public GatoBuilder estaDoente(Boolean estaDoente) {
        this.estaDoente = estaDoente;
        return this;
    }
    
    public Gato build(){
        return new Gato(id, nome, dono, raca, idade, estaDoente);
    }
}