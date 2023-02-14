package ProjetoModulo3.src.Gerenciadora;

import java.util.List;

import ProjetoModulo3.src.Classes.BaseDeDados;
import ProjetoModulo3.src.Classes.Produto;

public class AdminRepository {
    static List<Produto> listaDeProdutos = BaseDeDados.produtosCadastrados;

    public static <T extends Produto> void cadastrarProduto(T produto) {
        listaDeProdutos.add(produto);
        System.out.println("O " + produto.getNome() + " foi cadastrado!");
    }

    public static void verProdutos() {
        BaseDeDados.printListaDeProdutos();
    }

    public static void editarProduto(Produto produto) {
        for (Produto produtoNaLista : listaDeProdutos) {
            if (produtoNaLista.getNome().equals(produto.getNome())) {
                int index = listaDeProdutos.indexOf(produtoNaLista);
                listaDeProdutos.set(index, produto);
                break;
            }
        }

        System.out.println("O " + produto.getNome() + " foi editado!");
    }

    public static void removerProduto(Produto produto) {
        listaDeProdutos.remove(produto);
        System.out.println("O " + produto.getNome() + " foi removido!");
    }
}
