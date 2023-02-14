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

    public Usuario(String login, String senha, int tipoDeAcesso) {
        this.login = login;
        this.senha = senha;
        this.tipoDeAcesso = tipoDeAcesso;
    }
}
