package EXAMEN;

import java.util.Scanner;
 
public class Pregunta1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;
        
        System.out.println("=== PREGUNTA 1B ===");
        System.out.println("Introduce números (la suma no debe superar 10000):");
        
        while (suma < 10000) {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            
            // Verificar si agregar este número superaría 10000
            if (suma + numero > 10000) {
                System.out.println("El número " + numero + " haría que la suma supere 10000.");
                break;
            }
            
            suma += numero;
            contador++;
            System.out.println("Suma actual: " + suma);
        }
        
        double media = (contador > 0) ? (double) suma / contador : 0;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total acumulado: " + suma);
        System.out.println("Contador de números introducidos: " + contador);
        System.out.println("Media: " + media);
        System.out.println();
    }
     }