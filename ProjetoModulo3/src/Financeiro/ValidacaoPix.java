package ProjetoModulo3.src.Financeiro;

import ProjetoModulo3.src.Classes.Pagamento;

public class ValidacaoPix {
    public static boolean ValidarPix(Pagamento pix){
        boolean validPix = false;

        if(pix.getValorPagamento() < 1000){
            validPix = true;
        }

        return validPix;
    }
}

