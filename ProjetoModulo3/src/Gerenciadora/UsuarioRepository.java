package ProjetoModulo3.src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import ProjetoModulo3.src.Classes.Usuario;
import ProjetoModulo3.src.Builders.UsuarioBuilder;;

public class UsuarioRepository implements Comparable<Usuario> {
    private static final List<Usuario> listaDeUsuarios = new ArrayList<>();

    public static void cadastroUsuario(String login, String senha, int tipoDeAcesso) {
        int tamanho = listaDeUsuarios.size();;
        int id = tamanho + 1;

        Usuario novoUser = new UsuarioBuilder()
            .id(id)
            .login(login)
            .senha(senha)
            .tipoDeAcesso(tipoDeAcesso)
            .build();  
            
            listaDeUsuarios.add(novoUser);
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

    @Override
    public int compareTo(Usuario o) {
        // TODO Auto-generated method stub
        return 0;
    }



}
