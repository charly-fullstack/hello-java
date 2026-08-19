package com.charly;

public class ExercisesBreakContinueFinal {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                continue;
            }
            if (i == 23) {
                break;
            }
            System.out.println("Iteration: " + i);
        }

        System.out.println("End.");
    }
}
