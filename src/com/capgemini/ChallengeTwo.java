package com.capgemini;

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");

        String pass = scan.next();

        int passChar = checkPass(pass);

        if(passChar < 6 && passChar != 0){
            System.out.println("Sua senha precisa ter mais " + passChar + " caracteres.");
        }else{
            System.out.println("Senha forte.");
        }

    }
    public static int checkPass(String pass) {
        int minLenght = 6;
        int passLength = pass.length();

        if (passLength < minLenght){
            return (minLenght - passLength);
        }else return 0;
    }
}
