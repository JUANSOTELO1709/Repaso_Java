// que es un arreglo?
// un arreglo es una estructura de datos que permite almacenar una coleccion de
// elementos del mismo tipo
// ¿como se declara un arreglo?
// tipo de dato[] nombre del arreglo = new tipo de dato[tamaño del arreglo];
// ¿como se inicializa un arreglo?
// nombre del arreglo = new tipo de dato[]{elemento1, elemento2, ..., elementoN}

public class arreglo {
    // este programa enseña la suma de los elementos de un arreglo
    public static void main(String[] args) {

        int[] numeros = new int[5]; // declaracion e inicializacion de un arreglo de enteros
        numeros[0] = 10; // asignacion de valores a los elementos del arreglo
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int suma = 0; // variable para almacenar la suma de los elementos del arreglo

        for (int i = 0; i < numeros.length; i++) { // ciclo para recorrer el arreglo
            suma += numeros[i]; // suma de los elementos del arreglo
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma); // impresion del resultado
    }

}
