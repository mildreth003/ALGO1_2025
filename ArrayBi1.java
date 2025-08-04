public class ArrayBi1 {
    public static void main(String[] args) {
        // como se declara un array de bidimencional
        int[][] n = new int[3][2];

        n[0][0] = 12;
        n[0][1] = 15;
        n[1][0] = 13;
        n[1][1] = 11;
        n[2][0] = 5;
        n[2][1] = 8;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
                
            }
            System.out.println();
        }

    }
}

