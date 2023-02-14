package ProjetoModulo3.src.Financeiro;

import ProjetoModulo3.src.Classes.Pagamento;

public class ValidacaoCartao {
    public static boolean ValidarCartao(Pagamento cartao){
        boolean validCartao = false;

        if(cartao.getValorPagamento() < 2000){
            validCartao = true;
        }

        return validCartao;
    }
}

