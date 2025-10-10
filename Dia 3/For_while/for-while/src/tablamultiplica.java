//Vamos a hacer un programa para mostrar la tabla de multiplicar de un número:

import java.util.Scanner;

public class tablamultiplica {
    public static void main(String[] args) {
        System.out.println("ingresa numero");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        for(int i=0 ; i <= 10 ; i++){
            int rta= (i*num);
            System.out.println(num + "*" + i + " = " + rta );
        }
    
    numero.close();
    }

}
