//Crea un programa en Java que:
//Pida una nota entre 0 y 100.
//Clasifique el resultado según la nota:
//90 - 100: Excelente
//80 - 89: Notable
//70 - 79: Aprobado
//60 - 69: Insuficiente
//0 - 59: Reprobado

import java.util.Scanner;

public class condicionales {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); //aqui agregamos la entrada del scaner de la consola
        System.out.println("ingresa tu nota:");

        int nota= entrada.nextInt();

        if(nota>=90 && nota <=100){   //primera condicion de 90 a 100
            System.out.println("El examen fue excelente");
        } else if (nota>=80) { //segunda de 80 a 89
            System.out.println("El examen fue Notable");
        } else if (nota>=70) { // tercera de 70 a 79
            System.out.println("El examen se aprobo");
        } else if (nota >= 60) { // cuarta de 60 a 69
            System.out.println("Insuficiente");
        } else if (nota >= 0) { // quinta de 0 a 59
            System.out.println("Perdiste");
        }else{
            System.out.println("fuera de rango");
        }
        entrada.close(); //cerrar escaner, es buena practica de programacion
    }
}
