package ProjetoModulo3.src;

import java.util.Scanner;

import ProjetoModulo3.src.Classes.Informatica;
import ProjetoModulo3.src.Classes.Livro;
import ProjetoModulo3.src.Classes.Mercado;
import ProjetoModulo3.src.Classes.Usuario;
import ProjetoModulo3.src.Gerenciadora.AdminRepository;
import ProjetoModulo3.src.Gerenciadora.UserRepository;
import ProjetoModulo3.src.Gerenciadora.UsuarioRepository;


public class Main {
    static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        //Criando usuario
        Usuario usuarioAdmin = new Usuario("usuario1", "usuario1", "admin");
        UsuarioRepository.cadastroUsuario(usuarioAdmin);
        Usuario usuarioUser = new Usuario("usuario2", "usuario2", "user");
        UsuarioRepository.cadastroUsuario(usuarioUser);

        //Comandos ADMIN
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("MENU ADMIN");
        System.out.println("--------------------");
        System.out.println("");

            //Criando produtos
        Livro Livro1 = new Livro("Brás Cubas", 35.50, "Livro", "Livraria Cultura", 280, "História", "Machado de Assis");
        Informatica Informatica1 = new Informatica("Mouse", 18.90, "Informática", "Lenovo", 220);
        Mercado Mercado1 = new Mercado("Arroz", 27.89, "Mercado", "Broto Legal", "Savegnago", 5);

            // Adicionando na lista de produtos
        AdminRepository.cadastrarProduto(Livro1);
        System.out.println("");
        AdminRepository.cadastrarProduto(Informatica1);
        System.out.println("");
        AdminRepository.cadastrarProduto(Mercado1);
        System.out.println("");

            // Printando a lista
        AdminRepository.verProdutos();
        System.out.println("");

            // Editando produto produto
        Mercado Mercado2 = new Mercado("Arroz", 20.55, "Mercado", "Broto Legal", "Big Compra", 5);
        AdminRepository.editarProduto(Mercado2);
        System.out.println("");
        AdminRepository.verProdutos();
        System.out.println("");

            // Removendo produto
        AdminRepository.removerProduto(Mercado2);
        System.out.println("");
        
        //Comandos USER
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("MENU USUÁRIO");
        System.out.println("--------------------");
        System.out.println("");

            // Visualizar lista de produtos
        UserRepository.printListaDeProdutos();
        System.out.println("");

            // Filtrar por categoria
        UserRepository.filtroPorCategoria("Livro");

            // Filtrar por marca
        UserRepository.filtroPorMarca("Lenovo");

            // Ordenar por preço
        UserRepository.ordenarPorPreco();

        // Ordenar por nome
        UserRepository.ordenacaoPorNome();

    }
}