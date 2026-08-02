package com.charly;

public class ElseIfExample {

    public static void main(String[] args) {

        int score = 75;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("End of program.");
    }
}
