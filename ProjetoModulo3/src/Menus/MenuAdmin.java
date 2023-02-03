package ProjetoModulo3.src.Menus;

import java.util.Scanner;

import ProjetoModulo3.src.Gerenciadora.ProdutoRepository;

public class MenuAdmin {
    static Scanner scanner = new Scanner(System.in);

    public static boolean menuDeAdmin() {
    try {
        System.out.println("---- MENU ADMIN ----");
        boolean menuAdminAberto = true;

        do{
            System.out.println("Faça seu login!");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Visualizar lista de produtos");
            System.out.println("3. Editar produto");
            System.out.println("4. Remover produto");
            System.out.println("5. Sair");
            int opcaoMenuAdmin = scanner.nextInt();
            boolean menuAdminInicial = true;

            do{
                if(opcaoMenuAdmin == 1) {

                    System.out.println("Selecione a categoria que deseja criar:");
                    System.out.println("1. Livro");
                    System.out.println("2. Mercado");
                    System.out.println("3. Informática");
                    int categoriaSelecionada = scanner.nextInt();

                    if(categoriaSelecionada == 1){
                        System.out.println("Digite o nome do livro:");
                        String nome = scanner.next();
                        System.out.println("Digite o preço do livro:");
                        Double preco = scanner.nextDouble();                       
                        System.out.println("Digite a marca do livro:");
                        String marca = scanner.next();
                        System.out.println("Digite a quantidade de páginas do livro:");
                        int qtdPaginas = scanner.nextInt();
                        System.out.println("Digite o genero do livro:");
                        String genero = scanner.next();
                        System.out.println("Digite o autor do livro:");
                        String autor = scanner.next();
                        

                        ProdutoRepository.CadastroLivro(nome, preco, marca, qtdPaginas, genero, autor);

                    } else if(categoriaSelecionada == 2){
                        System.out.println("Digite o nome do produto:");
                        String nome = scanner.next();
                        System.out.println("Digite o preço do produto:");
                        Double preco = scanner.nextDouble();                       
                        System.out.println("Digite a marca do produto:");
                        String marca = scanner.next();
                        System.out.println("Digite a quantidade do produto:");
                        int quantidade = scanner.nextInt();
                        System.out.println("Digite o nome do supermercado:");
                        String nomeMercado = scanner.next();
                        System.out.println("Digite o peso do produto:");
                        int peso = scanner.nextInt();

                        ProdutoRepository.CadastroMercado(nome, preco, marca, quantidade, nomeMercado, peso);
                        
                    } else if(categoriaSelecionada == 3){
                        System.out.println("Digite o nome do produto:");
                        String nome = scanner.next();
                        System.out.println("Digite o preço do produto:");
                        Double preco = scanner.nextDouble();                       
                        System.out.println("Digite a marca do produto:");
                        String marca = scanner.next();
                        System.out.println("Digite a voltagem do produto:");
                        int voltagem = scanner.nextInt();

                        ProdutoRepository.CadastroInformatica(nome, preco, marca, voltagem);
                    
                    } else{
                        System.out.println("Selecione uma opção válida");
                    }

                    menuAdminInicial = false;
                } else if(opcaoMenuAdmin == 2){


                } else if(opcaoMenuAdmin == 3){

                } else if(opcaoMenuAdmin == 4){

                } else if(opcaoMenuAdmin == 5){
                    System.out.println("Menu Admin fechado!");
                    menuAdminInicial = false;
                    menuAdminAberto = false;
                } else {
                    System.out.println("Digite uma opção válida");
                    menuAdminInicial = false;
                }

            }while(menuAdminInicial == true);

        }while(menuAdminAberto == true);
        
    } catch (Exception e) {
        System.out.println("Houve um erro!");
    }
    return false;
    }
}
