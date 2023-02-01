package ProjetoModulo3.src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import ProjetoModulo3.src.Classes.Produto;
import ProjetoModulo3.src.Classes.Usuario;
import ProjetoModulo3.src.Marcacao.Admin;

public class AdminRepository {
    private static final List<Object> listaDeProdutos = new ArrayList<>();

    public static void cadastrarProduto(Object produto) {
        listaDeProdutos.add(produto);
        System.out.println("Produto cadastrado!");
    }

    public static void printListaDeProdutos(Object produto) {
        boolean existeProdutoCadastrado = false;
        for (Object produtoCadastrado: listaDeProdutos) {
            System.out.println("Produto " + ((Produto) produtoCadastrado).getId() + ":");
            System.out.println(produto);
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
                    System.out.println("O animal " + ((Produto) idDeBusca).getNome() + " foi deletado!");
                }
            }
        } else {
            System.out.println("Animal não encontrado");
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
