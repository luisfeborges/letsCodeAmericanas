package ProjetoModulo3.src.Gerenciadora;

import java.util.List;

import ProjetoModulo3.src.Classes.Produto;
import ProjetoModulo3.src.Marcacao.Admin;

public class AdminRepository {
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

    public static void editarProduto(Object produto) {
        System.out.println("Ainda não implementado");
    }

    public static void removerProduto(int id) {
        boolean achouProduto = existeProduto(id);

        if(achouProduto == true) {
            for (Object idDeBusca: listaDeProdutos) {
                if (id == ((Produto) idDeBusca).getId()){
                    int linhaParaExcluir = id - 1;
                    listaDeProdutos.remove(linhaParaExcluir);
                    System.out.println("O produto " + ((Produto) idDeBusca).getNome() + " foi deletado!");
                }
            }
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static boolean existeProduto(int id) {
        boolean achouProduto = false;
        for (Object produto: listaDeProdutos) {
            if (id == ((Produto) produto).getId()){
                achouProduto = true;
            }
        }
        return achouProduto;
    }

    public static boolean isAdmin(Object obj) {
        return obj instanceof Admin;
    }

}
