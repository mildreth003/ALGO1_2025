public class Array3 {

    public static void main(String[] args) {
        double[] notas = new double[5];

        System.out.println("Para calcular el promedio necesito saber la ");
        System.out.println("nota de cada uno de tus examenes.");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del examen n° " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " - ");
            suma = suma + notas[i];
        }

        System.out.println("El promedio es " + suma / 5);
    }
}
