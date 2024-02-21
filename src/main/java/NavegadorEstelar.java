import java.util.Arrays;

public class NavegadorEstelar {

    // Método para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        // Ejemplo de matrices de terreno y construcción
        int[][] terreno = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int[][] construcciones = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        // Multiplicar matrices para optimizar rutas y recursos
        int[][] resultado = multiplicarMatrices(terreno, construcciones);

        // Imprimir el resultado
        System.out.println("Resultado de la multiplicación de matrices:");
        imprimirMatriz(resultado);
    }
}