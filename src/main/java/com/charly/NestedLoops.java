package com.charly;

public class NestedLoops {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        for (i = 0; i < 10; i++) {
            System.out.println(i);
            i++;
            for (j = 0; j < 12; j++) {
                System.out.println(j);
                j++;
            }

        }


    }

}
