package ProjetoModulo3.src;

import java.util.Scanner;

import ProjetoModulo3.src.Gerenciadora.UsuarioRepository;
import ProjetoModulo3.src.Menus.MenuAdmin;
import ProjetoModulo3.src.Menus.MenuUser;

public class Main {
    static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        try {
            System.out.println("Olá!! Seja bem-vindo ao E-Commerce Belo Calçado!");
            boolean programaAberto = true;

            do{
                System.out.println("Faça seu login!");
                System.out.println("1. Criar usuário");
                System.out.println("2. Entrar");
                System.out.println("3. Sair");
                int opcaoMenuLogin = scanner.nextInt();
                boolean menuLogin = true;

                do{
                    if(opcaoMenuLogin == 1) {
                        System.out.println("Digite o login:");
                        String loginCadastrado = scanner.next();
                        System.out.println("Digite a senha:");
                        String senhaCadastrada = scanner.next();
                        System.out.println("Digite o tipo de acesso, 1 - Admin | 2 - Usuário:");
                        int tipoDeAcessoCadastrado = scanner.nextInt();

                        UsuarioRepository.cadastroUsuario(loginCadastrado, senhaCadastrada, tipoDeAcessoCadastrado);
                        menuLogin = false;

                    } else if(opcaoMenuLogin == 2){ 
                        System.out.println("Digite o login:");
                        String loginCadastrado = scanner.next();
                        System.out.println("Digite a senha:");
                        String senhaCadastrada = scanner.next();     
                        
                        if(UsuarioRepository.verificaCadastro(loginCadastrado, senhaCadastrada) == true){
                            if(UsuarioRepository.retornoTipoDeAcesso(loginCadastrado) == 1){
                                MenuAdmin.menuDeAdmin();
                            } else{
                                MenuUser.menuDeUsuario();
                            }

                            // eles vão rodar até o do{}while() boolean for true, dps disso segue o fluxo do código
                        }else{
                            System.out.println("Login e/ou senha incorretos");
                            menuLogin = false;
                        }
                } else if(opcaoMenuLogin == 3){
                    System.out.println("Sistem fechado!");
                    menuLogin = false;
                    programaAberto = false;
                } 
                else{ 
                    System.out.println("Digite uma opção válida");
                    menuLogin = false;
                }

                }while(menuLogin == true);

        }while(programaAberto == true);
        } catch (Exception e) {
            System.out.println("Houve um erro!");
        }
    }
}