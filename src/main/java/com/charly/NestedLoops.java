    package com.charly;

    public class NestedLoops {

        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) { // contrôle les lignes
                for (int j = 4; j >= i ; j--) { // contrôle le nombre d'espaces
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1 ; k++) { // contrôle le nombre d'étoiles
                    System.out.print("*"); // affiche étoile
                }

                System.out.println(); // passe à la ligne suivante
            }
        }
    }
