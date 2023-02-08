package ProjetoModulo3.src.Menus;

import java.util.Scanner;

import ProjetoModulo3.src.Gerenciadora.UserRepository;
public class MenuUser {
    static Scanner scanner = new Scanner(System.in);

    public static boolean menuDeUsuario() {
        System.out.println("---- MENU USUÁRIO ----");
        boolean menuUsuarioAberto = true;

        do{
            System.out.println("Escolha a opção desejada");
            System.out.println("1. Visualizar lista de produtos");
            System.out.println("2. Filtrar por marca");
            System.out.println("3. Filtrar por categoria");
            System.out.println("4. Ordenar por nome - crescente");
            System.out.println("5. Ordenar por nome - decrescente");
            System.out.println("6. Ordenar por preço - crescente");
            System.out.println("7. Ordenar por preço - decrescente");
            System.out.println("8. Sair");
            int opcaoMenuUsuario = scanner.nextInt();
            boolean menuUsuarioInicial = true;

            do{
                if(opcaoMenuUsuario == 1) {

                    menuUsuarioInicial = false;
                } else if(opcaoMenuUsuario == 2){
                    UserRepository.printListaDeProdutos();
                    menuUsuarioInicial = false;

                } else if(opcaoMenuUsuario == 3){

                    menuUsuarioInicial = false;

                } else if(opcaoMenuUsuario == 4){
               
                    menuUsuarioInicial = false;

                } else if(opcaoMenuUsuario == 5){
                    menuUsuarioInicial = false;
                    
                } else if(opcaoMenuUsuario == 6){
                    menuUsuarioInicial = false;


                } else if(opcaoMenuUsuario == 7){
                    menuUsuarioInicial = false;


                } else if(opcaoMenuUsuario == 8){
                    System.out.println("Menu Usuario fechado!");
                    menuUsuarioInicial = false;
                    menuUsuarioAberto = false;

                } else {
                    System.out.println("Digite uma opção válida");
                    menuUsuarioInicial = false;
                }

            }while(menuUsuarioInicial == true);

        }while(menuUsuarioAberto == true);


        return false;

    }

}
