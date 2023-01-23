package src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import src.Builders.DonoBuilder;
import src.Classes.Dono;
import src.Util.Validadores;

public class DonoRepository {
    private static final List<Dono> listaDeDonos= new ArrayList<>();
  
    public static void cadastroDono(String nome, int cpf, int telefone, String endereco, String email) {
        int tamanho = contagemDeDonos();
        int id = tamanho + 1;

        boolean checaCpf = Validadores.validaCpf(cpf);
        boolean checaTelefone = Validadores.validaCpf(telefone);
        boolean checaEmail = Validadores.validaEmail(email);

        if(checaCpf == true && checaTelefone == true && checaEmail == true) {
            Dono novoDono = new DonoBuilder()
                .id(id)
                .nome(nome)
                .cpf(cpf)
                .telefone(telefone)
                .endereco(endereco)
                .email(email)
                .build();  
                
                listaDeDonos.add(novoDono);
        } else {
            System.out.println("Não foi possível cadastrar o dono");
        }
    } 
    
    private static int contagemDeDonos() {
        int tamanho = listaDeDonos.size();
        return tamanho;
    }

    public static void listarDonos() {
        boolean possuiLista = false;
        for (Dono donoCadastrado: listaDeDonos) {
            System.out.println("Dono " + donoCadastrado.getId() + ":");
            donoCadastrado.printInformacoes();
            System.out.println(" ");
            possuiLista = true;
        }

        if(possuiLista == false){
            System.out.println("Não há donos cadastrados");
        }
    }

    public static void printaInfosDono(int id) {
        boolean achouDono = false;
        for (Dono idDeBusca: listaDeDonos) {
            if (id == idDeBusca.getId()){
                idDeBusca.printInformacoes();
                achouDono = true;
            }
        }

        if(achouDono == false){
            System.out.println("Dono não encontrado");
        }
    }

    public static boolean existeDono(int id) {
        boolean achouDono = false;
        for (Dono idDeBusca: listaDeDonos) {
            if (id == idDeBusca.getId()){
                achouDono = true;
            }
        }
        return achouDono;
    }

    public static Dono buscaObjetoDono(int id) {
        boolean achouDono = false;
        Dono objetoDono = null;

        for (Dono idDeBusca: listaDeDonos) {
            if (id == idDeBusca.getId()){
                objetoDono = idDeBusca;
                achouDono = true;
            }
        }

        if(achouDono == false){
            System.out.println("Dono não encontrado");
        }

        return objetoDono;
    }

    public static void excluirDono(int idExcluir) {
        if(idExcluir >= 1 && idExcluir <= listaDeDonos.size()) {
            printaInfosDono(idExcluir);

            int linhaParaExcluir = idExcluir - 1;
            listaDeDonos.remove(linhaParaExcluir);
            System.out.println("Dono excluido!");
        } else {
            System.out.println("Dono não cadastrado");
        }
    }

    public static void editarDonoString(Dono dono, int opcaoEdicao, String textoParaAlterar) {
        if(opcaoEdicao == 1) {
            dono.setNome(textoParaAlterar);
            System.out.println("Dono editado");
        } else if(opcaoEdicao == 4) {
            dono.setEndereco(textoParaAlterar);
            System.out.println("Dono editado");
        } else if(opcaoEdicao == 5) {
            boolean validacaoEmail = Validadores.validaEmail(textoParaAlterar);

            if(validacaoEmail == true) {
                dono.setEmail(textoParaAlterar);
                System.out.println("Dono editado");
            } else {
                System.out.println("E-mail invalido");
            }
        } else {
            System.out.println("Não foi possível alterar");
        }}

    public static void editarDonoInt(Dono dono, int opcaoEdicao, int numeroParaAlterar) {
        if(opcaoEdicao == 2) {
            boolean validacaoCpf = Validadores.validaCpf(numeroParaAlterar);

            if(validacaoCpf == true) {
                dono.setCpf(numeroParaAlterar);
                System.out.println("Dono editado");
            } else {
                System.out.println("CPF invalido");
            }
        } else if(opcaoEdicao == 3){
            boolean validacaoTelefone = Validadores.validaTelefone(numeroParaAlterar);

            if(validacaoTelefone == true) {
                dono.setTelefone(numeroParaAlterar);
                System.out.println("Dono editado");
            } else {
                System.out.println("Telefone invalido");
            }

        } else {
            System.out.println("Não foi possível alterar");
        }
    }

}
