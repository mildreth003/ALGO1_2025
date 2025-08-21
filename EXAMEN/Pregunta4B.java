package EXAMEN;

import java.util.Random;
import java.util.Scanner;

public class Pregunta4B {
    public static void main(String[] args) {

        int[] numeros = new int[100];

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);



        for (int i = 0; i < 100; i++) {

            numeros[i] = random.nextInt(501);

        }



        System.out.println("Array original:");

        mostrarArray(numeros, -1, -1);



        int maximo = numeros[0];

        int minimo = numeros[0];

        for (int i = 1; i < 100; i++) {

            if (numeros[i] > maximo) {

                maximo = numeros[i];

            }

            if (numeros[i] < minimo) {

                minimo = numeros[i];

            }

        }



        System.out.println("\n¿Qué valor desea destacar? (1 para máximo, 2 para mínimo): ");

        int opcion = scanner.nextInt();



        if (opcion == 1) {

            System.out.println("\nArray con el máximo destacado (**" + maximo + "**):");

            mostrarArray(numeros, maximo, 1);

        } else if (opcion == 2) {

            System.out.println("\nArray con el mínimo destacado (**" + minimo + "**):");

            mostrarArray(numeros, minimo, 2);

        } else {

            System.out.println("Opción inválida. No se destacará ningún valor.");

            mostrarArray(numeros, -1, -1);

        }



        scanner.close();

    }



    public static void mostrarArray(int[] arr, int valorDestacado, int tipoDestacado) {

        for (int i = 0; i < arr.length; i++) {

            if ((tipoDestacado == 1 && arr[i] == valorDestacado) || (tipoDestacado == 2 && arr[i] == valorDestacado)) {

                System.out.print("**" + arr[i] + "** ");

            } else {

                System.out.print(arr[i] + " ");

            }

            if ((i + 1) % 10 == 0) {

                System.out.println();

            }

        }

        System.out.println();

    }
    }