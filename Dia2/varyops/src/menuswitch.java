//edir al usuario dos números.
//Mostrar un menú de operaciones:
// 1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Leer la opción y ejecutar la operación correspondiente.
//Si elige “Dividir”, debe validar que el divisor no sea cero.
//Si elige “Salir”, debe mostrar un mensaje de despedida.





import java.util.Scanner;

public class menuswitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresa valor del menu");
        System.out.println("menu-----");
        System.out.println("1. Sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. salir");
        int menu = entrada.nextInt();

        switch(menu){
            case 1:
                System.out.println("el menu es sumar");
                System.out.println("ingresa el numero 1");
                int n1 = entrada.nextInt();
                System.out.println("ingresa el numero 2");
                int n2 = entrada.nextInt();
                System.out.println("la suma de "+ n1 +"+"+n2 +" es " + (n1+ n2));

                break;

            case  2:
                System.out.println("el menu es Restar");
                break;

            case 3:
                System.out.println("el menu es multiplicar");
                break;
            case 4:
                System.out.println("el menu es dividir");
                break;
            case 5:
                System.out.println("Muchas gracias me retirare ahora");
                break;
            default:
                System.out.println("no esta en rango");
        }
        entrada.close();
    }
}
