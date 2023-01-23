// 1. Encontre a média aritmética dos números de um array específico.
// Array original: 
// [1, 4, 17, 7, 25, 3, 100]

// 2. Escreva um programa Java para imprimir o resultado das seguintes operações:
//     Dados Inseridos:
//     a. -5 + 8 * 6
//     b. (55+9) % 9
//     c. 20 + -3*5 / 8
//     d. 5 + 15 / 3 * 2 - 8 % 3

import java.util.Arrays;

public class Aula3Exercicios {

    public static void main(String[] args) {
    // Exercício 1
    System.out.println("Exerício 1");
    double[] vetorPassado = {1, 4, 17, 7, 25, 3, 100};
    double media = Arrays.stream(vetorPassado).average().getAsDouble();
    System.out.printf("A média do vetor é: %.2f \n", media);


    // Exercício 2
    System.out.println("Exerício 2");
    int a = -5 + 8 * 6;
    int b = (55+9) % 9;
    int c = 20 + -3*5 / 8;
    int d = 5 + 15 / 3 * 2 - 8 % 3;
    System.out.println("a. -5 + 8 * 6 = " + a);
    System.out.println("b. (55+9) % 9 = " + b);
    System.out.println("c. 20 + -3*5 / 8 = " +  c);
    System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + d);

    }
}