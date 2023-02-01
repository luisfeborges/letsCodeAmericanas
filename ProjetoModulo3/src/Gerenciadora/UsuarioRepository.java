package ProjetoModulo3.src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import ProjetoModulo3.src.Classes.Usuario;
import ProjetoModulo3.src.Builders.UsuarioBuilder;;

public class UsuarioRepository {
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
}
