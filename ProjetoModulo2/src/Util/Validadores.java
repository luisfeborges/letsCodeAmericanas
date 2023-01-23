package src.Util;

import java.util.Objects;

public class Validadores {
    
    public static boolean validaCpf(int cpf) {
        if(String.valueOf(cpf).length() == 11) {
            return true;
        }

        return false;
    }

    public static boolean validaTelefone(int telefone) {
        if(String.valueOf(telefone).length() == 11) {
            return true;
        }

        return false;
    }

    public static boolean validaEmail(String email) {
        // InternetAddress emailAddr = new InternetAddress(email);
        // emailAddr.validate();
        if(Objects.isNull(email) || email.isEmpty()){
            return false;
        }

        return true;
    }



}
