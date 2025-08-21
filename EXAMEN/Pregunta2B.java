package EXAMEN;

import java.util.Scanner;

public class Pregunta2B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PREGUNTA 2B ===");
        System.out.print("Por favor, introduce la altura de la X: ");
        int altura = sc.nextInt();

        // Verificar que la altura sea par mayor o igual a 3
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
            return;
        }

        System.out.println("\nX de altura " + altura + ":");

        // Dibujar la X
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Condición para dibujar asteriscos en las diagonales
                if (j == i || j == altura - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
