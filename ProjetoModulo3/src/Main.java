package ProjetoModulo3.src;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        try {
            System.out.println("Olá!! Seja bem-vindo ao E-Commerce Belo Calçado!");
            System.out.println("Faça seu login!");
            System.out.println("1. Criar usuário");
            System.out.println("2. Entrar");
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

                    CachorroRepository.cadastroCachorro(nome, dono, raca, idade);

                } else if(opcaoMenuLogin == 2){ 

                }else{

                }
            }while(menuLogin == true);


        } catch (Exception e) {
            System.out.println("Houve um erro!");
        }
    }
}