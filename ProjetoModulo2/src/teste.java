package src;
import java.util.Scanner;

public class teste {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    try {

        System.out.println("Olá!! Seja bem-vindo a clínica veterinaria Happy Dog!");
        boolean progamaAtivo = true;
        boolean menuInicial = true;

        do{
            System.out.println("Por favor, digite o número do módulo que deseja acessar");
            System.out.println("1. Módulo 1");
            System.out.println("2. Sair do programa");
            int opcaoEscolhida = scanner.nextInt();

            do{
    
                if(opcaoEscolhida == 1){
                    int opcaoEscolhidaCachorros = 0;
                    System.out.println("Por favor, digite o número do módulo que deseja acessar");
                    System.out.println("1. Funcionalidade 1");
                    System.out.println("2. Sair do módulo");
                    opcaoEscolhidaCachorros = scanner.nextInt();
                    boolean moduloCachorros = true;
    
                    do{
                        if(opcaoEscolhidaCachorros == 1){
                            System.out.println("Funcionalidade 1");
                            moduloCachorros = false;
                        }else if(opcaoEscolhidaCachorros == 2) {
                            System.out.println("Saindo do módulo cachorros");
                            moduloCachorros = false;
                            progamaAtivo = false;
                        }else {
                            System.out.println("Sem resposta");
                            moduloCachorros = false;
                        }
                    }while(moduloCachorros == true);
    
                }else if(opcaoEscolhida == 2) {
                    System.out.println("Programa fechado");
                    progamaAtivo = false;
                    menuInicial = false;
                } else {
                    System.out.println("Redigite a opção");
                }
    
            }while(progamaAtivo == true);

        }while(menuInicial == true);

        
    } catch (Exception e) {
        System.out.println("Erro");
    }}}


                    
                


