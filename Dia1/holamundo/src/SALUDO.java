import java.util.Scanner;

public class SALUDO {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre =sc.nextLine();

        System.out.println("hola " + nombre + "!,Bienvenido a Java");
    }
}
