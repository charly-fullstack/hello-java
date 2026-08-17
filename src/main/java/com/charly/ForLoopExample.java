package com.charly;

public class ForLoopExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (i % 2 != 0) {
                continue;
            } else if (i == 20) {
                break;
            } else {
                System.out.println("Nombre: " + i);
            }
        }
    }
}
