import java.util.Arrays;

public class NavegadorEstelar {

    /**
     * Multiplica dos matrices.
     * @param matrizA Primera matriz.
     * @param matrizB Segunda matriz.
     * @return Resultado de la multiplicación.
     * @throws IllegalArgumentException Si las matrices no tienen dimensiones compatibles para la multiplicación.
     */
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        if (columnasA != matrizB.length) {
            throw new IllegalArgumentException("Las matrices no tienen dimensiones compatibles para la multiplicación.");
        }

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

    /**
     * Imprime una matriz.
     * @param matriz Matriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz) {
            sb.append(Arrays.toString(fila)).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Ejemplo de matrices de terreno y construcción
        int[][] terreno = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int[][] construcciones = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        try {
            // Multiplicar matrices para optimizar rutas y recursos
            int[][] resultado = multiplicarMatrices(terreno, construcciones);

            // Imprimir el resultado
            System.out.println("Resultado de la multiplicación de matrices:");
            imprimirMatriz(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}