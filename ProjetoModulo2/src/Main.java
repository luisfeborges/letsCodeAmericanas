package src;
import java.util.Scanner;

import src.Classes.Cachorro;
import src.Classes.Dono;
import src.Classes.Gato;
import src.Classes.Passaro;
import src.Gerenciadora.CachorroRepository;
import src.Gerenciadora.DonoRepository;
import src.Gerenciadora.GatoRepository;
import src.Gerenciadora.HospitalRepository;
import src.Gerenciadora.PassaroRepository;

public class Main {
    static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        try {
            System.out.println("Olá!! Seja bem-vindo a clínica veterinaria Happy Dog!");
            boolean progamaAtivo = true;
            boolean menuInicial = true;

            do {
                System.out.println("Por favor, digite o número do módulo que deseja acessar");
                System.out.println("1. Módulo cachorro");
                System.out.println("2. Módulo gato");
                System.out.println("3. Módulo pássaro");
                System.out.println("4. Módulo dono");
                System.out.println("5. Módulo hospital animal");
                System.out.println("6. Fechar sistema");
                int opcaoEscolhida = 0;
                opcaoEscolhida = scanner.nextInt();

                do{
                    if(opcaoEscolhida == 1) {
                        System.out.println("Por favor, digite o número da opção desejada");
                        System.out.println("1. Cadastrar cachorro");
                        System.out.println("2. Editar cachorro cadastrado");
                        System.out.println("3. Excluir cachorro cadastrado");
                        System.out.println("4. Listar cachorros");
                        System.out.println("5. Buscar cachorro");
                        System.out.println("6. Voltar para o menu inicial");
                        int opcaoEscolhidaCachorros = scanner.nextInt();
                        boolean menuCachorro = true;

                        do {
                            if(opcaoEscolhidaCachorros == 1) {
                                System.out.println("Informe o número de cachorros que deseja cadastrar:");
                                int numCadastros = scanner.nextInt();

                                for(int i=0; i<numCadastros; i++) {
                                    System.out.println("Insira o nome do cachorro:");
                                    String nome = scanner.next();
                                    System.out.println("Insira o nome do dono:");
                                    String dono = scanner.next();
                                    System.out.println("Insira o nome da raça:");
                                    String raca = scanner.next();
                                    System.out.println("Insira a idade do cachorro:");
                                    int idade = scanner.nextInt();
        
                                    CachorroRepository.cadastroCachorro(nome, dono, raca, idade);
                                }

                                menuCachorro = false;

                            } else if(opcaoEscolhidaCachorros == 2) {
                                System.out.println("Informe o número do cachorro que deseja editar:");
                                int numEdicaoCachorro = scanner.nextInt();
                                boolean achouCachorro = CachorroRepository.existeCachorro(numEdicaoCachorro);

                                if(achouCachorro == true) {
                                    CachorroRepository.printaInfosCachorro(numEdicaoCachorro);
                                    System.out.println("Esse é o cachorro que deseja editar? S/N");
                                    String confirmacaoCachorroEdicao = scanner.next();

                                    if(confirmacaoCachorroEdicao.equals("S") || confirmacaoCachorroEdicao.equals("N")) {
                                        if(confirmacaoCachorroEdicao.equals("S")) {
                                            Cachorro objetoCachorroParaEdicao = CachorroRepository.buscaObjetoCachorro(numEdicaoCachorro);
                                            System.out.println("Digite o que deseja alterar");
                                            System.out.println("1. Nome");
                                            System.out.println("2. Raça");
                                            System.out.println("3. Dono");
                                            System.out.println("4. Idade");  
                                            int opcaoEdicaoCachorros = scanner.nextInt();
                                            
                                            if(opcaoEdicaoCachorros == 1) {
                                                System.out.println("Insira o nome do cachorro:");
                                                String palavraEdicaoCachorro = scanner.next();    
                                                CachorroRepository.editarCachorroString(objetoCachorroParaEdicao, opcaoEdicaoCachorros, palavraEdicaoCachorro);
                                            } else if(opcaoEdicaoCachorros == 2) {
                                                System.out.println("Insira a raça do cachorro:");
                                                String palavraEdicaoCachorro = scanner.next();    
                                                CachorroRepository.editarCachorroString(objetoCachorroParaEdicao, opcaoEdicaoCachorros, palavraEdicaoCachorro);
                                            } else if(opcaoEdicaoCachorros == 3) {
                                                System.out.println("Insira o dono do cachorro:");
                                                String palavraEdicaoCachorro = scanner.next();    
                                                CachorroRepository.editarCachorroString(objetoCachorroParaEdicao, opcaoEdicaoCachorros, palavraEdicaoCachorro);
                                            } else if(opcaoEdicaoCachorros == 4) {
                                                System.out.println("Insira a idade do cachorro:");
                                                int idadeEdicaoCachorro = scanner.nextInt();    
                                                CachorroRepository.editarCachorroInt(objetoCachorroParaEdicao, opcaoEdicaoCachorros, idadeEdicaoCachorro);
                                            } else {
                                                System.out.println("Opção não encontrada");
                                            }
                                                                                
                                        } else{
                                            System.out.println("Caiu no else");
                                        }
                                    } else {
                                        System.out.println("Digite S para Sim e N para Não");
                                    }

                                } else {
                                    System.out.println("Cachorro não encontrado");
                                }

                                menuCachorro = false;

                            } else if(opcaoEscolhidaCachorros == 3) {
                                System.out.println("Informe o número do cachorro que deseja excluir:");
                                int numExcluirCachorro = scanner.nextInt();
                                CachorroRepository.printaInfosCachorro(numExcluirCachorro);

                                System.out.println("Esse é o cachorro que deseja excluir? S/N");
                                String confirmacaoCachorroExcluir = scanner.next();

                                if(confirmacaoCachorroExcluir.equals("S") || confirmacaoCachorroExcluir.equals("N")) {
                                    if(confirmacaoCachorroExcluir.equals("S")) {
                                        CachorroRepository.excluirCachorro(numExcluirCachorro);
                                    }
                                } else {
                                    System.out.println("Digite S para Sim e N para Não");
                                }                     
                                
                                menuCachorro = false;
                            } else if(opcaoEscolhidaCachorros == 4) {
                
                                CachorroRepository.listarCachorros();
                                menuCachorro = false;

                            } else if(opcaoEscolhidaCachorros == 5) {
                                System.out.println("Informe o ID do cachorro que deseja buscar:");
                                int numIdDeBuscaCachorro = scanner.nextInt();
                
                                CachorroRepository.printaInfosCachorro(numIdDeBuscaCachorro);
                                menuCachorro = false;
                            } else if(opcaoEscolhidaCachorros == 6) {
                                menuCachorro = false;
                                progamaAtivo = false;
                            } else {
                                System.out.println("Atendimento finalizado!");     
                                menuCachorro = false;       
                            }
                        } while(menuCachorro == true);

                    } else if(opcaoEscolhida == 2) {                    

                        System.out.println("Por favor, digite o número da opção desejada");
                        System.out.println("1. Cadastrar gato");
                        System.out.println("2. Editar gato cadastrado");
                        System.out.println("3. Excluir gato cadastrado");
                        System.out.println("4. Listar gatos");
                        System.out.println("5. Buscar gato");
                        System.out.println("6. Voltar para o menu inicial");
                        int opcaoEscolhidaGatos = scanner.nextInt();
                        boolean menuGato = true;

                        do {
                            if(opcaoEscolhidaGatos == 1) {
                                System.out.println("Informe o número de gatos que deseja cadastrar:");
                                int numCadastros = scanner.nextInt();

                                for(int i=0; i<numCadastros; i++) {
                                    System.out.println("Insira o nome do gato:");
                                    String nome = scanner.next();
                                    System.out.println("Insira o nome do dono:");
                                    String dono = scanner.next();
                                    System.out.println("Insira o nome da raça:");
                                    String raca = scanner.next();
                                    System.out.println("Insira a idade do gato:");
                                    int idade = scanner.nextInt();
        
                                    GatoRepository.cadastroGato(nome, dono, raca, idade);
                                }

                                menuGato = false;

                            } else if(opcaoEscolhidaGatos == 2) {
                                System.out.println("Informe o número do gato que deseja editar:");
                                int numEdicaoGato = scanner.nextInt();
                                boolean achouGato = GatoRepository.existeGato(numEdicaoGato);

                                if(achouGato == true) {
                                    GatoRepository.printaInfosGato(numEdicaoGato);
                                    System.out.println("Esse é o gato que deseja editar? S/N");
                                    String confirmacaoGatoEdicao = scanner.next();

                                    if(confirmacaoGatoEdicao.equals("S") || confirmacaoGatoEdicao.equals("N")) {
                                        if(confirmacaoGatoEdicao.equals("S")) {
                                            Gato objetoGatoParaEdicao = GatoRepository.buscaObjetoGato(numEdicaoGato);
                                            System.out.println("Digite o que deseja alterar");
                                            System.out.println("1. Nome");
                                            System.out.println("2. Raça");
                                            System.out.println("3. Dono");
                                            System.out.println("4. Idade");  
                                            int opcaoEdicaoGatos = scanner.nextInt();
                                            
                                            if(opcaoEdicaoGatos == 1) {
                                                System.out.println("Insira o nome do gato:");
                                                String palavraEdicaoGato = scanner.next();    
                                                GatoRepository.editarGatoString(objetoGatoParaEdicao, opcaoEdicaoGatos, palavraEdicaoGato);
                                            } else if(opcaoEdicaoGatos == 2) {
                                                System.out.println("Insira a raça do gato:");
                                                String palavraEdicaoGato = scanner.next();    
                                                GatoRepository.editarGatoString(objetoGatoParaEdicao, opcaoEdicaoGatos, palavraEdicaoGato);
                                            } else if(opcaoEdicaoGatos == 3) {
                                                System.out.println("Insira o dono do gato:");
                                                String palavraEdicaoGato = scanner.next();    
                                                GatoRepository.editarGatoString(objetoGatoParaEdicao, opcaoEdicaoGatos, palavraEdicaoGato);
                                            } else if(opcaoEdicaoGatos == 4) {
                                                System.out.println("Insira a idade do gato:");
                                                int idadeEdicaoGato = scanner.nextInt();    
                                                GatoRepository.editarGatoInt(objetoGatoParaEdicao, opcaoEdicaoGatos, idadeEdicaoGato);
                                            } else {
                                                System.out.println("Opção não encontrada");
                                            }
                                                                                
                                        } else{
                                            System.out.println("Caiu no else");
                                        }
                                    } else {
                                        System.out.println("Digite S para Sim e N para Não");
                                    }

                                } else {
                                    System.out.println("Gato não encontrado");
                                }

                                menuGato = false;

                            } else if(opcaoEscolhidaGatos == 3) {
                                System.out.println("Informe o número do gato que deseja excluir:");
                                int numExcluirGato = scanner.nextInt();
                                GatoRepository.printaInfosGato(numExcluirGato);

                                System.out.println("Esse é o gato que deseja excluir? S/N");
                                String confirmacaoGatoExcluir = scanner.next();

                                if(confirmacaoGatoExcluir.equals("S") || confirmacaoGatoExcluir.equals("N")) {
                                    if(confirmacaoGatoExcluir.equals("S")) {
                                        CachorroRepository.excluirCachorro(numExcluirGato);
                                    }
                                } else {
                                    System.out.println("Digite S para Sim e N para Não");
                                }                     
                                
                                menuGato = false;
                            } else if(opcaoEscolhidaGatos == 4) {
                
                                GatoRepository.listarGatos();
                                menuGato = false;

                            } else if(opcaoEscolhidaGatos == 5) {
                                System.out.println("Informe o ID do gato que deseja buscar:");
                                int numIdDeBuscaGato = scanner.nextInt();

                                GatoRepository.printaInfosGato(numIdDeBuscaGato);                
                                menuGato = false;
                            } else if(opcaoEscolhidaGatos == 6) {
                                menuGato = false;
                                progamaAtivo = false;
                            } else {
                                System.out.println("Atendimento finalizado!");     
                                menuGato = false;       
                            }
                        } while(menuGato == true);

                    } else if(opcaoEscolhida == 3) {

                        System.out.println("Por favor, digite o número da opção desejada");
                        System.out.println("1. Cadastrar pássaro");
                        System.out.println("2. Editar pássaro cadastrado");
                        System.out.println("3. Excluir pássaro cadastrado");
                        System.out.println("4. Listar pássaro");
                        System.out.println("5. Buscar pássaro");
                        System.out.println("6. Voltar para o menu inicial");
                        int opcaoEscolhidaPassaros = scanner.nextInt();
                        boolean menuPassaro = true;

                        do {
                            if(opcaoEscolhidaPassaros == 1) {
                                System.out.println("Informe o número de pássaros que deseja cadastrar:");
                                int numCadastros = scanner.nextInt();

                                for(int i=0; i<numCadastros; i++) {
                                    System.out.println("Insira o nome do pássaro:");
                                    String nome = scanner.next();
                                    System.out.println("Insira o nome do dono:");
                                    String dono = scanner.next();
                                    System.out.println("Insira o nome da raça:");
                                    String raca = scanner.next();
                                    System.out.println("Insira a idade do pássaro:");
                                    int idade = scanner.nextInt();
        
                                    PassaroRepository.cadastroPassaro(nome, dono, raca, idade);
                                }

                                menuPassaro = false;

                            } else if(opcaoEscolhidaPassaros == 2) {
                                System.out.println("Informe o número do pássaro que deseja editar:");
                                int numEdicaoPassaro = scanner.nextInt();
                                boolean achouPassaro = PassaroRepository.existePassaro(numEdicaoPassaro);

                                if(achouPassaro == true) {
                                    GatoRepository.printaInfosGato(numEdicaoPassaro);
                                    System.out.println("Esse é o pássaro que deseja editar? S/N");
                                    String confirmacaoPassaroEdicao = scanner.next();

                                    if(confirmacaoPassaroEdicao.equals("S") || confirmacaoPassaroEdicao.equals("N")) {
                                        if(confirmacaoPassaroEdicao.equals("S")) {
                                            Passaro objetoPassaroParaEdicao = PassaroRepository.buscaObjetoPassaro(numEdicaoPassaro);
                                            System.out.println("Digite o que deseja alterar");
                                            System.out.println("1. Nome");
                                            System.out.println("2. Raça");
                                            System.out.println("3. Dono");
                                            System.out.println("4. Idade");  
                                            int opcaoEdicaoPassaros = scanner.nextInt();
                                            
                                            if(opcaoEdicaoPassaros == 1) {
                                                System.out.println("Insira o nome do pássaro:");
                                                String palavraEdicaoPassaro = scanner.next();
                                                PassaroRepository.editarPassaroString(objetoPassaroParaEdicao, opcaoEdicaoPassaros, palavraEdicaoPassaro);    
                                            } else if(opcaoEdicaoPassaros == 2) {
                                                System.out.println("Insira a raça do pássaro:");
                                                String palavraEdicaoPassaro = scanner.next();    
                                                PassaroRepository.editarPassaroString(objetoPassaroParaEdicao, opcaoEdicaoPassaros, palavraEdicaoPassaro);    
                                            } else if(opcaoEdicaoPassaros == 3) {
                                                System.out.println("Insira o dono do pássaro:");
                                                String palavraEdicaoPassaro = scanner.next();    
                                                PassaroRepository.editarPassaroString(objetoPassaroParaEdicao, opcaoEdicaoPassaros, palavraEdicaoPassaro);    
                                            } else if(opcaoEdicaoPassaros == 4) {
                                                System.out.println("Insira a idade do pássaro:");
                                                int idadeEdicaoPassaro = scanner.nextInt();    
                                                PassaroRepository.editarPassaroInt(objetoPassaroParaEdicao, opcaoEdicaoPassaros, idadeEdicaoPassaro);
                                            } else {
                                                System.out.println("Opção não encontrada");
                                            }
                                                                                
                                        } else{
                                            System.out.println("Caiu no else");
                                        }
                                    } else {
                                        System.out.println("Digite S para Sim e N para Não");
                                    }

                                } else {
                                    System.out.println("Pássaro não encontrado");
                                }

                                menuPassaro = false;

                            } else if(opcaoEscolhidaPassaros == 3) {
                                System.out.println("Informe o número do pássaro que deseja excluir:");
                                int numExcluirPassaro = scanner.nextInt();
                                PassaroRepository.printaInfosPassaro(numExcluirPassaro);

                                System.out.println("Esse é o pássaro que deseja excluir? S/N");
                                String confirmacaoPassaroExcluir = scanner.next();

                                if(confirmacaoPassaroExcluir.equals("S") || confirmacaoPassaroExcluir.equals("N")) {
                                    if(confirmacaoPassaroExcluir.equals("S")) {
                                        CachorroRepository.excluirCachorro(numExcluirPassaro);
                                    }
                                } else {
                                    System.out.println("Digite S para Sim e N para Não");
                                }                     
                                
                                menuPassaro = false;
                            } else if(opcaoEscolhidaPassaros == 4) {
                
                                PassaroRepository.listarPassaros();
                                menuPassaro = false;

                            } else if(opcaoEscolhidaPassaros == 5) {
                                System.out.println("Informe o ID do pássaro que deseja buscar:");
                                int numIdDeBuscaPassaro = scanner.nextInt();

                                PassaroRepository.printaInfosPassaro(numIdDeBuscaPassaro);
                                menuPassaro = false;
                            } else if(opcaoEscolhidaPassaros == 6) {
                                menuPassaro = false;
                                progamaAtivo = false;
                            } else {
                                System.out.println("Atendimento finalizado!");     
                                menuPassaro = false;       
                            }
                        } while(menuPassaro == true);

                    } else if(opcaoEscolhida == 4) {

                        System.out.println("Por favor, digite o número da opção desejada");
                        System.out.println("1. Cadastrar dono");
                        System.out.println("2. Editar dono cadastrado");
                        System.out.println("3. Excluir dono cadastrado");
                        System.out.println("4. Listar dono");
                        System.out.println("5. Buscar dono");
                        System.out.println("6. Voltar para o menu inicial");
                        int opcaoEscolhidaDonos = scanner.nextInt();
                        boolean menuDono = true;

                        do {
                            if(opcaoEscolhidaDonos == 1) {
                                System.out.println("Informe o número de donos que deseja cadastrar:");
                                int numCadastros = scanner.nextInt();

                                for(int i=0; i<numCadastros; i++) {
                                    System.out.println("Insira o nome do dono:");
                                    String nome = scanner.next();
                                    System.out.println("Insira o CPF do dono:");
                                    int cpf = scanner.nextInt();
                                    System.out.println("Insira o telefone do dono:");
                                    int telefone = scanner.nextInt();
                                    System.out.println("Insira o endereço do dono:");
                                    String endereco = scanner.next();
                                    System.out.println("Insira o e-mail do dono:");
                                    String email = scanner.next();
        
                                    DonoRepository.cadastroDono(nome, cpf, telefone, endereco, email);
                                }

                                menuDono = false;
                            } else if(opcaoEscolhidaDonos == 2) {
                                System.out.println("Informe o número do dono que deseja editar:");
                                int numEdicaoDono = scanner.nextInt();
                                boolean achouDono = DonoRepository.existeDono(numEdicaoDono);

                                if(achouDono == true) {
                                    DonoRepository.printaInfosDono(numEdicaoDono);;
                                    System.out.println("Esse é o dono que deseja editar? S/N");
                                    String confirmacaoDonoEdicao = scanner.next();

                                    if(confirmacaoDonoEdicao.equals("S") || confirmacaoDonoEdicao.equals("N")) {
                                        if(confirmacaoDonoEdicao.equals("S")) {
                                            Dono objetoDonoParaEdicao = DonoRepository.buscaObjetoDono(numEdicaoDono);
                                            System.out.println("Digite o que deseja alterar");
                                            System.out.println("1. Nome");
                                            System.out.println("2. CPF");
                                            System.out.println("3. Telefone");
                                            System.out.println("4. Endereço");  
                                            System.out.println("5. E-mail");  
                                            int opcaoEdicaoDonos = scanner.nextInt();
                                            
                                            if(opcaoEdicaoDonos == 1) {
                                                System.out.println("Insira o nome do dono:");
                                                String palavraEdicaoDono = scanner.next();    
                                                DonoRepository.editarDonoString(objetoDonoParaEdicao, opcaoEdicaoDonos, palavraEdicaoDono);
                                            } else if(opcaoEdicaoDonos == 2) {
                                                System.out.println("Insira a CPF do dono:");
                                                int numeroEdicaoDono = scanner.nextInt(); 
                                                DonoRepository.editarDonoInt(objetoDonoParaEdicao, opcaoEdicaoDonos, numeroEdicaoDono);
                                            } else if(opcaoEdicaoDonos == 3) {
                                                System.out.println("Insira o telefone do dono:");
                                                int numeroEdicaoDono = scanner.nextInt(); 
                                                DonoRepository.editarDonoInt(objetoDonoParaEdicao, opcaoEdicaoDonos, numeroEdicaoDono);
                                            } else if(opcaoEdicaoDonos == 4) {
                                                System.out.println("Insira o endereço do dono:");
                                                String palavraEdicaoDono = scanner.next();    
                                                DonoRepository.editarDonoString(objetoDonoParaEdicao, opcaoEdicaoDonos, palavraEdicaoDono);
                                            } else if(opcaoEdicaoDonos == 5) {
                                                System.out.println("Insira o e-mail do dono:");
                                                String palavraEdicaoDono = scanner.next();    
                                                DonoRepository.editarDonoString(objetoDonoParaEdicao, opcaoEdicaoDonos, palavraEdicaoDono);
                                            } else {
                                                System.out.println("Opção não encontrada");
                                            }
                                                                                
                                        } else{
                                            System.out.println("Caiu no else");
                                        }
                                    } else {
                                        System.out.println("Digite S para Sim e N para Não");
                                    }

                                } else {
                                    System.out.println("Dono não encontrado");
                                }

                                menuDono = false;

                            } else if(opcaoEscolhidaDonos == 3) {
                                System.out.println("Informe o número do dono que deseja excluir:");
                                int numExcluirDono = scanner.nextInt();
                                DonoRepository.printaInfosDono(numExcluirDono);

                                System.out.println("Esse é o dono que deseja excluir? S/N");
                                String confirmacaoDonoExcluir = scanner.next();

                                if(confirmacaoDonoExcluir.equals("S") || confirmacaoDonoExcluir.equals("N")) {
                                    if(confirmacaoDonoExcluir.equals("S")) {
                                        CachorroRepository.excluirCachorro(numExcluirDono);
                                    }
                                } else {
                                    System.out.println("Digite S para Sim e N para Não");
                                }                     
                                
                                menuDono = false;
                            } else if(opcaoEscolhidaDonos == 4) {
                                DonoRepository.listarDonos();
                                menuDono = false;

                            } else if(opcaoEscolhidaDonos == 5) {
                                System.out.println("Informe o ID do dono que deseja buscar:");
                                int numIdDeBuscaDono = scanner.nextInt();

                                DonoRepository.printaInfosDono(numIdDeBuscaDono);
                                menuDono = false;
                            } else if(opcaoEscolhidaDonos == 6) {
                                menuDono = false;
                                progamaAtivo = false;
                            } else {
                                System.out.println("Atendimento finalizado!");     
                                menuDono = false;       
                            }
                        } while(menuDono == true);

                    } else if(opcaoEscolhida == 5) {
                        System.out.println("Por favor, digite o número da opção desejada");
                        System.out.println("1. Dar entrada em animal");
                        System.out.println("2. Listar animais hospitalizados");
                        System.out.println("3. Buscar animais hospitalizados por ID");
                        System.out.println("4. Dar alta em animal");
                        System.out.println("5. Voltar para o menu inicial");
                        int opcaoEscolhidaAnimais = scanner.nextInt();
                        boolean menuHospital = true;

                        do {
                            if(opcaoEscolhidaAnimais == 1) {
                                System.out.println("Informe o animal que você deseja dar entrada:");
                                System.out.println("1. Cachorro");
                                System.out.println("2. Gato");
                                System.out.println("3. Pássaro");
                                int numAnimal = scanner.nextInt();

                                System.out.println("Informe o ID do animal que entrará no hospital:");
                                int numIdAnimal = scanner.nextInt();

                                if(numAnimal == 1){
                                    Cachorro cachorro = CachorroRepository.buscaObjetoCachorro(numIdAnimal);
                                    HospitalRepository.entradaHospital(cachorro);
                                }else if(numAnimal == 2){
                                    Gato gato = GatoRepository.buscaObjetoGato(numIdAnimal);
                                    HospitalRepository.entradaHospital(gato);
                                }else if(numAnimal == 3){
                                    Passaro passaro = PassaroRepository.buscaObjetoPassaro(numIdAnimal);
                                    HospitalRepository.entradaHospital(passaro);
                                }else{
                                    System.out.println("Digite a opção corretamente");
                                }

                                menuHospital = false;  
                            } else if(opcaoEscolhidaAnimais == 2){
                                HospitalRepository.listaPacientes();
                                menuHospital = false;  
                            } else if(opcaoEscolhidaAnimais == 3){
                                System.out.println("Informe o ID do animal que você deseja buscar:");
                                int numAnimal = scanner.nextInt();

                                HospitalRepository.buscaAnimalPorId(numAnimal);
                                menuHospital = false;  
                            } else if(opcaoEscolhidaAnimais == 4){
                                System.out.println("Informe o ID do animal que você irá ter alta:");
                                int numAnimal = scanner.nextInt();

                                HospitalRepository.altaNoPaciente(numAnimal);
                                menuHospital = false;    
                            }else if(opcaoEscolhidaAnimais == 5){
                                menuHospital = false;
                                progamaAtivo = false;
                            } else{
                                System.out.println("Atendimento finalizado!");     
                                menuHospital = false;     
                            }

                        }while(menuHospital);


                    } else if(opcaoEscolhida == 6) {
                        System.out.println("Sistem fechado!");
                        progamaAtivo = false;
                        menuInicial = false;
                    } else {
                        System.out.println("Opção não encontrada");
                        menuInicial = false;
                    }

                }while(progamaAtivo == true);
            } while(menuInicial == true);

            } catch (Exception e) {
                System.out.println("Houve um erro!");
            }
    }

}