package ProjetoModulo3.src.Builders;

import ProjetoModulo3.src.Classes.Usuario;

public class UsuarioBuilder {

    private int id;
    private String login;
    private String senha;
    private int tipoDeAcesso;

    public UsuarioBuilder id(int id) {
        this.id = id;
        return this;
    }

    public UsuarioBuilder login(String login) {
        this.login = login;
        return this;
    }

    public UsuarioBuilder senha(String senha) {
        this.senha = senha;
        return this;
    }


    public UsuarioBuilder tipoDeAcesso(int tipoDeAcesso) {
        this.tipoDeAcesso = tipoDeAcesso;
        return this;
    }

    
    public Usuario build(){
        return new Usuario(id, login, senha, tipoDeAcesso);
    }
}