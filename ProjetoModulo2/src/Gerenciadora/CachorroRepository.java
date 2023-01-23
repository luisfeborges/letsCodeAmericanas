package src.Gerenciadora;
import java.util.ArrayList;
import java.util.List;

import src.Builders.CachorroBuilder;
import src.Classes.Cachorro;

public class CachorroRepository {

    private static final List<Cachorro> listaDeCachorros = new ArrayList<>();
  
    public static void cadastroCachorro(String nome, String dono, String raca, int idade) {
        int tamanho = contagemDeCachorros();
        int id = tamanho + 1;

        Cachorro novoCachorro = new CachorroBuilder()
            .id(id)
            .nome(nome)
            .dono(dono)
            .raca(raca)
            .idade(idade)
            .estaDoente(false)
            .build();  
            
            listaDeCachorros.add(novoCachorro);
    }

    public static void listarCachorros() {
        boolean possuiLista = false;
        for (Cachorro cachorroCadastrado: listaDeCachorros) {
            System.out.println("Cachorro " + cachorroCadastrado.getId() + ":");
            cachorroCadastrado.printInformacoes();
            System.out.println(" ");
            possuiLista = true;
        }

        if(possuiLista == false){
            System.out.println("Não há cachorros cadastrados");
        }
    }

    private static int contagemDeCachorros() {
        int tamanho = listaDeCachorros.size();
        return tamanho;
    }

    public static void printaInfosCachorro(int id) {
        boolean achouCachorro = false;
        for (Cachorro idDeBusca: listaDeCachorros) {
            if (id == idDeBusca.getId()){
                idDeBusca.printInformacoes();
                achouCachorro = true;
            }
        }

        if(achouCachorro == false){
            System.out.println("Cachorro não encontrado");
        }
    }

    public static boolean existeCachorro(int id) {
        boolean achouCachorro = false;
        for (Cachorro idDeBusca: listaDeCachorros) {
            if (id == idDeBusca.getId()){
                achouCachorro = true;
            }
        }
        return achouCachorro;
    }

    public static Cachorro buscaObjetoCachorro(int id) {
        boolean achouCachorro = false;
        Cachorro objetoCachorro = null;

        for (Cachorro idDeBusca: listaDeCachorros) {
            if (id == idDeBusca.getId()){
                objetoCachorro = idDeBusca;
                achouCachorro = true;
            }
        }

        if(achouCachorro == false){
            System.out.println("Cachorro não encontrado");
        }

        return objetoCachorro;
    }

    public static void editarCachorroString(Cachorro cachorro, int opcaoEdicao, String textoParaAlterar) {
        if(opcaoEdicao == 1) {
            cachorro.setNome(textoParaAlterar);
            System.out.println("Cachorro editado");
        } else if(opcaoEdicao == 2) {
            cachorro.setRaca(textoParaAlterar);
            System.out.println("Cachorro editado");
        } else if(opcaoEdicao == 3) {
            cachorro.setDono(textoParaAlterar);
            System.out.println("Cachorro editado");
        } else {
            System.out.println("Não foi possível alterar");
        }}

    public static void editarCachorroInt(Cachorro cachorro, int opcaoEdicao, int idade) {
        if(opcaoEdicao == 4) {
            cachorro.setIdade(idade);
        } else {
            System.out.println("Não foi possível alterar");
        }
    }

    public static void excluirCachorro(int idExcluir) {
        if(idExcluir >= 1 && idExcluir <= listaDeCachorros.size()) {
            printaInfosCachorro(idExcluir);

            int linhaParaExcluir = idExcluir - 1;
            listaDeCachorros.remove(linhaParaExcluir);
            System.out.println("Cachorro excluido!");
        } else {
            System.out.println("Cachorro não cadastrado");
        }
    }
    }
