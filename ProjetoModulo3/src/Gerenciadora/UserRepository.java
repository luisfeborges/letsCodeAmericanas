package ProjetoModulo3.src.Gerenciadora;

import java.util.Collections;
import java.util.List;

import ProjetoModulo3.src.Marcacao.User;
import ProjetoModulo3.src.Classes.Produto;

public class UserRepository{
    static List<Object> listaDeProdutos = ProdutoRepository.listaDeProdutos;

    public static void printListaDeProdutos() {
        boolean existeProdutoCadastrado = false;
        for (Object produtoCadastrado: listaDeProdutos) {
            System.out.println("Produto " + ((Produto) produtoCadastrado).getId() + ":");
            System.out.println(produtoCadastrado);
            System.out.println(" ");
            existeProdutoCadastrado = true;
        }

        if(existeProdutoCadastrado == false){
            System.out.println("Não há produtos cadastrados");
        }
    }

    public static void ordenacaoNomeCrescente() {
        Collections.sort((List listaDeProdutos);
    }
    
    public static boolsean isUser(Object obj) {
        return obj instanceof User;
    }
}
