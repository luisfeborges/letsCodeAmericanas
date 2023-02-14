package ProjetoModulo3.src.Gerenciadora;

import java.util.List;

import ProjetoModulo3.src.Classes.BaseDeDados;
import ProjetoModulo3.src.Classes.Produto;

public class UserRepository{
    static List<Produto> listaDeProdutos = BaseDeDados.produtosCadastrados;

    public static void printListaDeProdutos() {
        if(listaDeProdutos.size() == 0){
            System.out.println("Não há produtos cadastrados");
        } else{
            for (Produto produto : listaDeProdutos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
            }
        }
    }

    public void filtroPorCategoria(String categoria) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getCategoria().equals(categoria)) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
            }
        }
    }

    public void filtroPorMarca(String marca) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getMarca().equals(marca)) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
            }
        }
    }

    public void ordenacaoPorNome() {
        listaDeProdutos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));

        for (Produto produto : listaDeProdutos) {
            System.out.println("Id: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Marca: " + produto.getMarca());
            System.out.println("---------------------------------");
        }
    }

    public void ordenarPorPreco() {
        listaDeProdutos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

        for (Produto produto : listaDeProdutos) {
            System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
        }
    }
}
