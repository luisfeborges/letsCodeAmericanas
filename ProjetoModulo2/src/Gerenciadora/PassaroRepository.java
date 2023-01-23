package src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import src.Builders.PassaroBuilder;
import src.Classes.Passaro;

public class PassaroRepository {
    private static final List<Passaro> listaDePassaros = new ArrayList<>();
  
    public static void cadastroPassaro(String nome, String dono, String raca, int idade) {
        int tamanho = contagemDePassaros();
        int id = tamanho + 1;

        Passaro novoPassaro = new PassaroBuilder()
            .id(id)
            .nome(nome)
            .dono(dono)
            .raca(raca)
            .idade(idade)
            .estaDoente(false)
            .build();  
            
            listaDePassaros.add(novoPassaro);
    }

    public static void listarPassaros() {
        boolean possuiLista = false;
        for (Passaro passaroCadastrado: listaDePassaros) {
            System.out.println("Passaro " + passaroCadastrado.getId() + ":");
            passaroCadastrado.printInformacoes();
            System.out.println(" ");
            possuiLista = true;
        }

        if(possuiLista == false){
            System.out.println("Não há assaros cadastrados");
        }
    }

    private static int contagemDePassaros() {
        int tamanho = listaDePassaros.size();
        return tamanho;
    }

    public static void printaInfosPassaro(int id) {
        boolean achouPassaro = false;
        for (Passaro idDeBusca: listaDePassaros) {
            if (id == idDeBusca.getId()){
                idDeBusca.printInformacoes();
                achouPassaro = true;
            }
        }

        if(achouPassaro == false){
            System.out.println("Passaro não encontrado");
        }
    }

    public static boolean existePassaro(int id) {
        boolean achouPassaro = false;
        for (Passaro idDeBusca: listaDePassaros) {
            if (id == idDeBusca.getId()){
                achouPassaro = true;
            }
        }
        return achouPassaro;
    }

    public static Passaro buscaObjetoPassaro(int id) {
        boolean achouPassaro = false;
        Passaro objetoPassaro = null;

        for (Passaro idDeBusca: listaDePassaros) {
            if (id == idDeBusca.getId()){
                objetoPassaro = idDeBusca;
                achouPassaro = true;
            }
        }

        if(achouPassaro == false){
            System.out.println("Passaro não encontrado");
        }

        return objetoPassaro;
    }

    public static void editarPassaroString(Passaro passaro, int opcaoEdicao, String textoParaAlterar) {
        if(opcaoEdicao == 1) {
            passaro.setNome(textoParaAlterar);
            System.out.println("Passaro editado");
        } else if(opcaoEdicao == 2) {
            passaro.setRaca(textoParaAlterar);
            System.out.println("Passaro editado");
        } else if(opcaoEdicao == 3) {
            passaro.setDono(textoParaAlterar);
            System.out.println("Passaro editado");
        } else {
            System.out.println("Não foi possível alterar");
        }}

    public static void editarPassaroInt(Passaro passaro, int opcaoEdicao, int idade) {
        if(opcaoEdicao == 4) {
            passaro.setIdade(idade);
        } else {
            System.out.println("Não foi possível alterar");
        }
    }

    public static void excluirPassaro(int idExcluir) {
        if(idExcluir >= 1 && idExcluir <= listaDePassaros.size()) {
            printaInfosPassaro(idExcluir);

            int linhaParaExcluir = idExcluir - 1;
            listaDePassaros.remove(linhaParaExcluir);
            System.out.println("Passaro excluido!");
        } else {
            System.out.println("Passaro não cadastrado");
        }
    }
}
