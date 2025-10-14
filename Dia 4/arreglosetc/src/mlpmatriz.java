//programa que hara la multiplicacion de dos matrices

public class mlpmatriz {

    int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // aqui se declara la primera matriz
    // 1 2 3 i
    // 4 5 6
    // 7 8 9
    // j

    int[][] matriz2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } }; // aqui se declara la segunda matriz

    // 9 8 7 i
    // 6 5 4
    // 3 2 1
    // j

    int[][] resultado = new int[3][3];// aqui se declara la matriz resultado, aqui se va a guardar el resultado de la
                                      // multiplicacion
    // 0 0 0
    // 0 0 0
    // 0 0 0

    public static void main(String[] args) {
        mlpmatriz m = new mlpmatriz();// creamos un objeto de la clase mlpmatriz

        m.multiplicar(); // llamamos al metodo multiplicar
        m.imprimir(); // llamamos al metodo imprimir
    }

    void multiplicar() { // metodo para multiplicar las matrices
        for (int i = 0; i < 3; i++) { // ciclo para recorrer las filas de la primera matriz

            for (int j = 0; j < 3; j++) { // ciclo para recorrer las columnas de la segunda matriz

                resultado[i][j] = 0; // inicializamos el elemento de la matriz resultado en 0
                for (int k = 0; k < 3; k++) { // ciclo para recorrer las columnas de la primera matriz y las filas de la
                                              // segunda matriz
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]; // multiplicacion y suma de los elementos

                }

            }
        }
    }

    void imprimir() {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

}
