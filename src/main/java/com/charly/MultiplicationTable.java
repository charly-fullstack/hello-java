package com.charly;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10; j++) {
                // utilisation de printf avec \n pour le saut de ligne
                System.out.printf("%d * %d = %d%n", i, j, i * j);

            }

            System.out.println(); // saut de ligne entre les tables
        }
    }
}
