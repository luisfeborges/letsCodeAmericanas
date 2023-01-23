
package src.Builders;

import src.Classes.Dono;

public class DonoBuilder {

    private int id;
    private String nome;
    private int cpf;
    private int telefone;
    private String endereco;
    private String email;

    public DonoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public DonoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public DonoBuilder cpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public DonoBuilder telefone(int telefone) {
        this.telefone = telefone;
        return this;
    }

    public DonoBuilder endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public DonoBuilder email(String email) {
        this.email = email;
        return this;
    }
    
    public Dono build(){
        return new Dono(id, nome, cpf, telefone, endereco, email);
    }
}
