package src.Builders;

import src.Classes.Passaro;

public class PassaroBuilder {

    private int id;
    private String nome;
    private String dono;
    private String raca;
    private int idade;
    private boolean estaDoente;

    public PassaroBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PassaroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PassaroBuilder dono(String dono) {
        this.dono = dono;
        return this;
    }

    public PassaroBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public PassaroBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public PassaroBuilder estaDoente(Boolean estaDoente) {
        this.estaDoente = estaDoente;
        return this;
    }
    
    public Passaro build(){
        return new Passaro(id, nome, dono, raca, idade, estaDoente);
    }
}