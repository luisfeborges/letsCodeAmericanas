package ProjetoModulo3.src.Gerenciadora;

import java.util.List;

import ProjetoModulo3.src.Classes.BaseDeDados;
import ProjetoModulo3.src.Classes.Usuario;

public class UsuarioRepository {

    static List<Usuario> listaDeUsuarios = BaseDeDados.usuariosCadastrados;

    public <T extends Usuario> void cadastroUsuario(T usuario) {
        listaDeUsuarios.add(usuario);
    }

    public static boolean verificaCadastro(String login, String senha) {
        boolean achouUsuario = false;

        for (Usuario objetoUsuario: listaDeUsuarios) {
            int confirmacaoLogin = compareToLogin(login,objetoUsuario);
            int confirmacaoSenha = compareToSenha(senha,objetoUsuario);
            if (confirmacaoLogin == 0 && confirmacaoSenha == 0){
                achouUsuario = true;
            }
        }

        return achouUsuario;
    }

    public static int compareToLogin(String login, Usuario objeto){
        int retorno = 1;

        if(login == objeto.getLogin()){
            retorno = 0;
        }

        return retorno;        
    }

    public static int compareToSenha(String senha, Usuario objeto){
        int retorno = 1;

        if(senha == objeto.getSenha()){
            retorno = 0;
        }

        return retorno;        
    }

    public static int retornoTipoDeAcesso(String login){
        int tipoDeAcesso = 0;

        for (Usuario objetoUsuario: listaDeUsuarios) {
            if(objetoUsuario.getLogin() == login){
                tipoDeAcesso = objetoUsuario.getTipoDeAcesso();
            }
        }

        return tipoDeAcesso;
    }
}
