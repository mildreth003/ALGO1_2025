package EXAMEN;

import java.util.Random;
import java.util.Scanner;

public class Pregunta5B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("========================================");
            System.out.println("    PRÁCTICO - GRUPO B");
            System.out.println("========================================");
            System.out.println("1. Pregunta 1B - Serie de números");
            System.out.println("2. Pregunta 2B - Dibujar X con asteriscos");
            System.out.println("3. Pregunta 3B - Simular dados");
            System.out.println("4. Pregunta 4B - Array con máximo/mínimo");
            System.out.println("5. Pregunta 5B - Matriz 9x9 con diagonal");
            System.out.println("0. Salir");
            System.out.println("========================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    pregunta1B();
                    break;
                case 2:
                    pregunta2B();
                    break;
                case 3:
                    pregunta3B();
                    break;
                case 4:
                    pregunta4B();
                    break;
                case 5:
                    pregunta5B();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.\n");
            }

            if (opcion != 0) {
                System.out.print("Presiona Enter para continuar...");
                sc.nextLine(); // Consumir el salto de línea pendiente
                sc.nextLine(); // Esperar Enter del usuario
            }

        } while (opcion != 0);

        sc.close();
    }

    // Método para Pregunta 5B
    public static void pregunta5B() {
        Random rand = new Random();
        int[][] matriz = new int[9][9];

        System.out.println("=== PREGUNTA 5B ===");

        // Llenar la matriz con números aleatorios entre 500 y 900
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = rand.nextInt(401) + 500; // 500 a 900 inclusive
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 9x9 con números aleatorios (500-900):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }

        // Analizar la diagonal principal
        int suma = 0;
        int maximo = matriz[0][0];
        int minimo = matriz[0][0];

        System.out.println("\nNúmeros de la diagonal principal:");
        for (int i = 0; i < 9; i++) {
            int valor = matriz[i][i];
            suma += valor;

            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }

            System.out.print(valor + " ");
        }

        double media = (double) suma / 9;

        System.out.println("\n\n--- ANÁLISIS DE LA DIAGONAL ---");
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + String.format("%.2f", media));

        // Mostrar la matriz destacando la diagonal
        System.out.println("\nMatriz con diagonal destacada:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) { // Elemento de la diagonal
                    System.out.printf("%3s ", matriz[i][j] + "*");
                } else {
                    System.out.printf("%4d ", matriz[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Métodos vacíos para otras preguntas (puedes completarlos luego)
    public static void pregunta1B() {
        System.out.println("Ejecutando pregunta 1B...");
    }

    public static void pregunta2B() {
        System.out.println("Ejecutando pregunta 2B...");
    }

    public static void pregunta3B() {
        System.out.println("Ejecutando pregunta 3B...");
    }

    public static void pregunta4B() {
        System.out.println("Ejecutando pregunta 4B...");
    }
}
