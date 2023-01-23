package src.Gerenciadora;

import java.util.ArrayList;
import java.util.List;

import src.Classes.Animal;

public class HospitalRepository {
    private static final List<Object> listaDeHospitalizados = new ArrayList<>();

    public static void entradaHospital(Object animal) {
        boolean estaDoente = checaSeEstaDoente(animal);

        if(estaDoente == true) {
            System.out.println("Animal já está no hospital");
        } else {    
            Object novoPaciente = animal;
            ((Animal) animal).setEstaDoente(true);
            listaDeHospitalizados.add(novoPaciente);
            System.out.println("Animal deu entrada no hospital!");
        }
    }

    private static boolean checaSeEstaDoente(Object animal) {
        boolean estaDoente = ((Animal) animal).getEstaDoente();
        if(estaDoente == true) {
            return true;
        }

        return false;
    }

    public static void listaPacientes() {
        boolean possuiLista = false;
        for (Object animalCadastrado: listaDeHospitalizados) {
            System.out.println("Animal " + ((Animal) animalCadastrado).getId() + ":");
            ((Animal) animalCadastrado).printInformacoes();
            System.out.println(" ");
            possuiLista = true;
        }

        if(possuiLista == false){
            System.out.println("Não há animais no hospital");
        }
    }

    public static void buscaAnimalPorId(int id) {
        boolean achouPaciente = false;
        for (Object idDeBusca: listaDeHospitalizados) {
            if (id == ((Animal) idDeBusca).getId()){
                ((Animal) idDeBusca).printInformacoes();
                achouPaciente = true;
            }
        }

        if(achouPaciente == false){
            System.out.println("Animal não encontrado");
        }
    }

    public static void altaNoPaciente(int id) {
        boolean achouPaciente = existePaciente(id);

        if(achouPaciente == true) {
            for (Object idDeBusca: listaDeHospitalizados) {
                if (id == ((Animal) idDeBusca).getId()){
                    ((Animal) idDeBusca).setEstaDoente(false);
                    int linhaParaExcluir = id - 1;
                    listaDeHospitalizados.remove(linhaParaExcluir);
                    System.out.println("O animal " + ((Animal) idDeBusca).getNome() + " deu alta da clínica veterinária");
                }
            }
        } else {
            System.out.println("Animal não encontrado");
        }
    }
           

        public static boolean existePaciente(int id) {
            boolean achouPaciente = false;
            for (Object idDeBusca: listaDeHospitalizados) {
                if (id == ((Animal) idDeBusca).getId()){
                    achouPaciente = true;
                }
            }
            return achouPaciente;
        }
    }

