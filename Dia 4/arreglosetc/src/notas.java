
// Programa que lea las notas de 10 alumnos y diga cuántos han aprobado y cuántos han suspendido.
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[10];
        int aprobados = 0;
        int suspendidos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("introduce la nota del alumno" + (i + 1) + ":");
            notas[i] = scanner.nextInt();

            if (notas[i] > 5) {
                aprobados++;
                System.out.println("el alumno ha aprobado" + (i + 1));
                System.out.println("aprobados:" + aprobados);
            } else {
                suspendidos++;
                System.out.println("el alumno ha suspendido" + (i + 1));
                System.out.println("suspendidos:" + suspendidos);
            }

        }
        scanner.close();
        System.out.println("total de aprobados:" + aprobados);
        System.out.println("total de suspendidos:" + suspendidos);
    }

}
