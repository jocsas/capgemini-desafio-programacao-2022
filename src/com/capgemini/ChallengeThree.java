package com.capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        int strSz;
        String str = "", temp = "";

        System.out.println("Digite uma palavra: ");
        Scanner scan = new Scanner(System.in);

        str = scan.next();
        strSz = str.length();

        int p = 0, anagramsCount = 0;
        int z = (strSz * strSz) - (((strSz * strSz) - strSz) / 2);
        String[] position = new String[z];

        for (int i = 0; i < strSz; i++) {
            for (int j = 0; j < strSz; j++) {
                if (i <= j) {
                    temp = str.substring(i, j + 1);
                    char[] c = temp.toCharArray();
                    Arrays.sort(c);
                    temp = new String(c);
                    position[p] = temp;
                    p++;
                }
            }
        }
        for (int i = 0; i < z; i++) {
            for (int j = i + 1; j < z; j++) {
                if (position[i].equals(position[j])) {
                    anagramsCount++;
                }
            }
        }
        System.out.println(anagramsCount);

    }
}