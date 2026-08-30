package com.charly;

public class DoWhileLoop {

    public  static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
            if (i == 13) {
                break;
            }
        }while (i <= 20);

        System.out.println("End.");
    }
}
