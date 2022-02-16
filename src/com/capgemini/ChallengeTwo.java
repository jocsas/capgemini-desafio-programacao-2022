package com.capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**                                          Questão #2

    Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
    Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que
    devem ser adicionados para uma string qualquer ser considerada segura.

 @jocsas

*/

public class ChallengeTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");

        String pass = scan.next();

        int minLenght = 6;

        int passLenght = pass.length();

        int nChar = minLenght - passLenght;

        if(nChar == 0 && !isValid(pass)){
            System.out.println("A senha deve conter pelo menos uma letra minúscula, " +
                                "um caractere especial, um número," +
                                " uma letra maiúscula");
            return;
        }

        if(!isValid(pass)){
            System.out.println("Faltam pelo menos " + nChar +
                                " caracteres, incluindo um número, " +
                                "um caractere especial e uma letra maiúscula e uma minúscula.");
        }else{
            System.out.println("Senha válida");
        }


    }
    public static boolean isValid(String pass) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{6,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);

        return matcher.matches();

    }
}
