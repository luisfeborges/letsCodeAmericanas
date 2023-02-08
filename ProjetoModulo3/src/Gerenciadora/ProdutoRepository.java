package ProjetoModulo3.src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import ProjetoModulo3.src.Builders.InformaticaBuilder;
import ProjetoModulo3.src.Builders.LivroBuilder;
import ProjetoModulo3.src.Builders.MercadoBuilder;
import ProjetoModulo3.src.Classes.Informatica;
import ProjetoModulo3.src.Classes.Livro;
import ProjetoModulo3.src.Classes.Mercado;

public interface ProdutoRepository {
    static final List<Object> listaDeProdutos = new ArrayList<Object>();

    public static void CadastroInformatica(String nome, Double preco, String marca, int voltagem) {
        int tamanho = listaDeProdutos.size();
        int id = tamanho + 1;

        Informatica novoInformatica = new InformaticaBuilder()
            .id(id)
            .nome(nome)
            .preco(preco)
            .categoria("Informatica")
            .marca(marca)
            .voltagem(voltagem)
            .build();  
            
            listaDeProdutos.add(novoInformatica);
    }

    public static void CadastroMercado(String nome, Double preco, String marca, int quantidade, String nomeMercado, int peso) {
        int tamanho = listaDeProdutos.size();
        int id = tamanho + 1;

        Mercado novoMercado = new MercadoBuilder()
            .id(id)
            .nome(nome)
            .preco(preco)
            .categoria("Mercado")
            .marca(marca)
            .quantidade(quantidade)
            .nomeMercado(nomeMercado)
            .peso(peso)
            .build();  
            
            listaDeProdutos.add(novoMercado);
    }

    public static void CadastroLivro(String nome, Double preco, String marca, int qtdPaginas, String genero, String autor) {
        int tamanho = listaDeProdutos.size();
        int id = tamanho + 1;

        Livro novoLivro = new LivroBuilder()
            .id(id)
            .nome(nome)
            .preco(preco)
            .categoria("Livro")
            .marca(marca)
            .qtdPaginas(qtdPaginas)
            .genero(genero)
            .autor(autor)
            .build();  
            
            listaDeProdutos.add(novoLivro);
    }
}
