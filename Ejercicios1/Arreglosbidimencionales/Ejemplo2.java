package Ejercicios1.Arreglosbidimencionales;

public class Ejemplo2 {
    public static void main(String[] args) {
                int[][] num = new int[4][5];

        int f, c;

        for ( f = 0; f < 4; f++) {
            for ( c = 0; c < 5; c++) {
                num[f][c] = (int) (Math.random()*101);
            }
        }

        int sumaFila;
        for ( f = 0; f < 4; f++) {
            sumaFila = 0;
            for ( c = 0; c < 5; c++) {
                System.out.printf("%7d   ", num[f][c]);
                sumaFila = sumaFila + num[f][c];
            }
            System.out.printf("| %7d\n", sumaFila);
        }
    }
}
    
