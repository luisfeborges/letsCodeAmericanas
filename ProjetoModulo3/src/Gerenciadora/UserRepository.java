package ProjetoModulo3.src.Gerenciadora;

import ProjetoModulo3.src.Marcacao.User;

public class UserRepository {
    
    public static boolean isUser(Object obj) {
        return obj instanceof User;
    }
}
