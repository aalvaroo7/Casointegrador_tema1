import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculadoraConsumoRecursos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista para almacenar los consumos
        List<Integer> consumos = new ArrayList<>();

        // Ciclo para ingresar los consumos diarios
        System.out.println("Ingrese el consumo diario de recursos (múltiplos de 5). Ingrese -1 para finalizar:");
        int consumoDiario;
        while (true) {
            consumoDiario = scanner.nextInt();
            if (consumoDiario == -1) {
                break;
            }
            if (consumoDiario % 5 != 0) {
                System.out.println("El consumo debe ser un múltiplo de 5.");
                continue;
            }
            consumos.add(consumoDiario);
        }

        // Calcular y mostrar estadísticas
        if (!consumos.isEmpty()) {
            mostrarEstadisticas(consumos);
        } else {
            System.out.println("No se ingresaron consumos.");
        }

        scanner.close();
    }

    // Método para mostrar las estadísticas
    public static void mostrarEstadisticas(List<Integer> consumos) {
        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int consumo : consumos) {
            suma += consumo;
            if (consumo < min) {
                min = consumo;
            }
            if (consumo > max) {
                max = consumo;
            }
        }

        double media = (double) suma / consumos.size();

        System.out.println("Cantidad total de recursos consumidos: " + suma);
        System.out.println("Ritmo de consumo promedio: " + media);
        System.out.println("Mínimo consumo diario: " + min);
        System.out.println("Máximo consumo diario: " + max);

        // Ordenar la lista para poder calcular la mediana
        Collections.sort(consumos);
        int mediana;
        if (consumos.size() % 2 == 0) {
            mediana = (consumos.get(consumos.size() / 2 - 1) + consumos.get(consumos.size() / 2)) / 2;
        } else {
            mediana = consumos.get(consumos.size() / 2);
        }
        System.out.println("Mediana del consumo: " + mediana);
    }
}