package EXAMEN;

import java.util.Random;

public class Pregunta3B {
     public static void main(String[] args) {
    Random rand = new Random();
        int dado1, dado2;
        int tiradas = 0;
        
        System.out.println("=== PREGUNTA 3B ===");
        System.out.println("Simulando tiradas de dados hasta que ambos tengan el mismo valor:");
        
        do {
            dado1 = rand.nextInt(6) + 1; // Números del 1 al 6
            dado2 = rand.nextInt(6) + 1;
            tiradas++;
            
            System.out.println("Tirada " + tiradas + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
            
        } while (dado1 != dado2);
        
        System.out.println("\n¡Los dados tienen el mismo valor (" + dado1 + ")!");
        System.out.println("Número total de tiradas: " + tiradas);
        System.out.println();
    }
}
