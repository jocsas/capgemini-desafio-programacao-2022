package com.capgemini;

import java.util.Scanner;

/*                                            # Questão 01

   Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
   A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

*/

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = scan.nextInt();

        StringBuilder degree = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                degree.append(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                degree.append("*");
            }
            if (i != num - 1) {
                degree.append("\n");
            }
        }
        String stair = String.valueOf(degree);

        System.out.println(stair);
    }
}
