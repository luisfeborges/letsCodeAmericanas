import java.util.Scanner;

public class Aula4Exercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercício 1
        System.out.println("Digite a nota do aluno:");
        int notaAluno = input.nextInt();

        System.out.println("Exercício 1");
        notaDoAluno(notaAluno);

        //Exercício 2
        System.out.println("Digite um número para transformar em um mês:");
        int mesNumero = input.nextInt();

        System.out.println("Exercício 2");
        mesString(mesNumero);
        input.close();
    }

    public static String notaDoAluno (int nota) {
        String avaliacaoFinal = "";

        if (nota >= 90) {
            avaliacaoFinal = "A";
        } else if (nota >= 80) {
            avaliacaoFinal = "B";
        } else if (nota >= 70) {
            avaliacaoFinal = "C";
        } else if (nota >= 60) {
            avaliacaoFinal = "D";
        } else {
            avaliacaoFinal = "E";
        }

        System.out.println(avaliacaoFinal);
        return avaliacaoFinal;
    }


    public static String mesString (int mesNumero) {
        String mes = "";

        switch(mesNumero) {
            case 1:
            mes = "Janeiro";
            break;
            
            case 2:
            mes = "Fevereiro";
            break;

            case 3:
            mes = "Março";
            break;

            case 4:
            mes = "Abril";
            break;

            case 5:
            mes = "Maio";
            break;

            case 6:
            mes = "Junho";
            break;

            case 7:
            mes = "Julho";
            break;

            case 8:
            mes = "Agosto";
            break;

            case 9:
            mes = "Setembro";
            break;

            case 10:
            mes = "Outubro";
            break;

            case 11:
            mes = "Novembro";
            break;

            case 12:
            mes = "Dezembro";
            break;

            default:
            mes = "Mês invalido. Por favor, insira um número de 1 a 12.";
            break;
        }
        System.out.println(mes);
        return mes;
    }
}
