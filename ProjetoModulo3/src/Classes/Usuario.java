package ProjetoModulo3.src.Classes;

public class Usuario {
    protected int id;
    protected String login;
    protected String senha;
    protected int tipoDeAcesso;

    public int getTipoDeAcesso() {
        return tipoDeAcesso;
    }
    public void setTipoDeAcesso(int tipoDeAcesso) {
        this.tipoDeAcesso = tipoDeAcesso;
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(int id, String login, String senha, int tipoDeAcesso) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.tipoDeAcesso = tipoDeAcesso;
    }
    
    
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", tipoDeAcesso=" + tipoDeAcesso + "]";
    }


}
