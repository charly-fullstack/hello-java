package com.charly;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 30) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            if (i == 23) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("End.");
    }
}
