package ProjetoModulo3.src.Gerenciadora;

import java.util.List;

import ProjetoModulo3.src.Classes.BaseDeDados;
import ProjetoModulo3.src.Classes.Produto;

public class AdminRepository {
    static List<Produto> listaDeProdutos = BaseDeDados.produtosCadastrados;

    public <T extends Produto> void cadastrarProduto(T produto) {
        listaDeProdutos.add(produto);
    }

    public void verProdutos() {
        BaseDeDados.printListaDeProdutos();
    }

    public void editarProduto(Produto produto) {
        for (Produto produtoNaLista : listaDeProdutos) {
            if (produtoNaLista.getNome().equals(produto.getNome())) {
                int index = listaDeProdutos.indexOf(produtoNaLista);
                listaDeProdutos.set(index, produto);
                break;
            }
        }
    }

    public void removerProduto(Produto produto) {
        listaDeProdutos.remove(produto);
    }
}
