package com.charly;

public class LogicalOperatorsExample {

    public static void main (String[] args) {

        int age = 20;
        boolean hasLicense = true;

        System.out.println("AND (&&): " + (age >= 18 && hasLicense));
        System.out.println("OR (||): " + (age >= 18 || hasLicense));
        System.out.println("NOT (!): " + (!hasLicense));

    }
}
