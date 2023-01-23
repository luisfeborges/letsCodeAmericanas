package src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import src.Builders.GatoBuilder;
import src.Classes.Gato;

public class GatoRepository {
    private static final List<Gato> listaDeGatos = new ArrayList<>();
  
    public static void cadastroGato(String nome, String dono, String raca, int idade) {
        int tamanho = contagemDeGatos();
        int id = tamanho + 1;

        Gato novoGato = new GatoBuilder()
            .id(id)
            .nome(nome)
            .dono(dono)
            .raca(raca)
            .idade(idade)
            .estaDoente(false)
            .build();  
            
            listaDeGatos.add(novoGato);
    }

    public static void listarGatos() {
        boolean possuiLista = false;
        for (Gato gatoCadastrado: listaDeGatos) {
            System.out.println("Gato " + gatoCadastrado.getId() + ":");
            gatoCadastrado.printInformacoes();
            System.out.println(" ");
            possuiLista = true;
        }

        if(possuiLista == false){
            System.out.println("Não há gatos cadastrados");
        }
    }

    private static int contagemDeGatos() {
        int tamanho = listaDeGatos.size();
        return tamanho;
    }

    public static void printaInfosGato(int id) {
        boolean achouGato = false;
        for (Gato idDeBusca: listaDeGatos) {
            if (id == idDeBusca.getId()){
                idDeBusca.printInformacoes();
                achouGato = true;
            }
        }

        if(achouGato == false){
            System.out.println("Gato não encontrado");
        }
    }

    public static boolean existeGato(int id) {
        boolean achouGato = false;
        for (Gato idDeBusca: listaDeGatos) {
            if (id == idDeBusca.getId()){
                achouGato = true;
            }
        }
        return achouGato;
    }

    public static Gato buscaObjetoGato(int id) {
        boolean achouGato = false;
        Gato objetoGato = null;

        for (Gato idDeBusca: listaDeGatos) {
            if (id == idDeBusca.getId()){
                objetoGato = idDeBusca;
                achouGato = true;
            }
        }

        if(achouGato == false){
            System.out.println("Gato não encontrado");
        }

        return objetoGato;
    }

    public static void editarGatoString(Gato gato, int opcaoEdicao, String textoParaAlterar) {
        if(opcaoEdicao == 1) {
            gato.setNome(textoParaAlterar);
            System.out.println("Gato editado");
        } else if(opcaoEdicao == 2) {
            gato.setRaca(textoParaAlterar);
            System.out.println("Gato editado");
        } else if(opcaoEdicao == 3) {
            gato.setDono(textoParaAlterar);
            System.out.println("Gato editado");
        } else {
            System.out.println("Não foi possível alterar");
        }}

    public static void editarGatoInt(Gato gato, int opcaoEdicao, int idade) {
        if(opcaoEdicao == 4) {
            gato.setIdade(idade);
        } else {
            System.out.println("Não foi possível alterar");
        }
    }

    public static void excluirGato(int idExcluir) {
        if(idExcluir >= 1 && idExcluir <= listaDeGatos.size()) {
            printaInfosGato(idExcluir);

            int linhaParaExcluir = idExcluir - 1;
            listaDeGatos.remove(linhaParaExcluir);
            System.out.println("Gato excluido!");
        } else {
            System.out.println("Gato não cadastrado");
        }
    }
}
