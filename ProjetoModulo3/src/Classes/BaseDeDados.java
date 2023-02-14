package ProjetoModulo3.src.Classes;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {
    public static List<Produto> produtosCadastrados = new ArrayList<>();
    public static List<Usuario> usuariosCadastrados = new ArrayList<>();

    public static void printListaDeProdutos() {
        for (Produto produto : produtosCadastrados) {
            produto.dadosProduto();
        }
    }
}
