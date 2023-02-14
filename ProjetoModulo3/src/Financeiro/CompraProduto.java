package ProjetoModulo3.src.Financeiro;

import java.util.List;

import ProjetoModulo3.src.Classes.Pagamento;
import ProjetoModulo3.src.Classes.Usuario;
import ProjetoModulo3.src.Classes.BaseDeDados;
import ProjetoModulo3.src.Classes.Produto;

public class CompraProduto {
    static List<Produto> listaDeProdutos = BaseDeDados.produtosCadastrados;

    public static void comprarProduto(Usuario usuario, Produto produto, String formaDePagamento) {
        if(formaDePagamento == "boleto"){
            Pagamento boletoDePagamento = new Pagamento(usuario.getLogin(), produto.getPreco());
            System.out.println("");
            System.out.println("Os dados do boleto de pagamento são:");
            boletoDePagamento.dadosPagamento();

        } else if(formaDePagamento == "pix"){
            Pagamento pixDePagamento = new Pagamento(usuario.getLogin(), produto.getPreco());
            boolean validPix = ValidacaoPix.ValidarPix(pixDePagamento);

            if(validPix == true){
                System.out.println("Os dados do pix de pagamento são:");
                pixDePagamento.dadosPagamento();
            } else{
                System.out.println("Valor de pix inválido!");
            }

        } else if(formaDePagamento == "cartão"){
            Pagamento cartaoDePagamento = new Pagamento(usuario.getLogin(), produto.getPreco());
            boolean validCartao = ValidacaoPix.ValidarPix(cartaoDePagamento);

            if(validCartao == true){
                System.out.println("Os dados do pagamento são:");
                cartaoDePagamento.dadosPagamento();
            } else{
                System.out.println("Valor para cartão de crédito inválido!");
            }

        } else {
            System.out.println("Forma de pagamento não encontrada");
        }
    }

}
