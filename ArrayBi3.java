public class ArrayBi3 {
      public static void main(String[] args) {
        double[] notas = new double[4];

        System.out.println("Para calcular la nota promedio necesito la notas de cada examen: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del examen n° "+(i+1)+": ");
            notas[i]= Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");
        double suma = 0;

        for (double n : notas) {
            System.out.print(n + " ");
            suma = suma + n;
        }

        System.out.println("\nEl promedio es "+suma/4);

    }

}
