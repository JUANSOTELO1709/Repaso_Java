public class matriz {
    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; // declaracion e inicializacion de una matriz de enteros
        for (int i = 0; i < matriz.length; i++) { // ciclo para recorrer las filas de la matriz
            for (int col = 0; col < matriz[i].length; col++) { // ciclo para recorrer las columnas de la matriz
                System.out.println(matriz[i][col]); // impresion de los elementos de la matriz

            }
            System.out.println("---"); // impresion de un separador entre filas
        }
    }

}
