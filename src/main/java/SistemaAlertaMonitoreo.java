import java.util.ArrayList;
import java.util.List;

// Clase principal para el sistema de alerta y monitoreo
public class SistemaAlertaMonitoreo {
    private List<FactorCritico> factoresCriticos;

    // Constructor
    public SistemaAlertaMonitoreo() {
        factoresCriticos = new ArrayList<>();
    }

    // Método para agregar un factor crítico a la lista de factores a monitorear
    public void agregarFactorCritico(FactorCritico factorCritico) {
        factoresCriticos.add(factorCritico);
    }

    // Método para monitorear los factores críticos y emitir alertas si es necesario
    public void monitorear() {
        for (FactorCritico factor : factoresCriticos) {
            if (factor.esValorCritico()) {
                System.out.println("Alerta: " + factor.getNombre() + " fuera del rango aceptable.");
                // Aquí se puede agregar lógica para sugerir ajustes
            }
        }
    }

    // Método para listar los primeros N números primos
    public List<Integer> listarNPrimos(int n) {
        List<Integer> numerosPrimos = new ArrayList<>();
        int numero = 2;
        while (numerosPrimos.size() < n) {
            if (esPrimo(numero)) {
                numerosPrimos.add(numero);
            }
            numero++;
        }
        return numerosPrimos;
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método main para probar el sistema
    public static void main(String[] args) {
        SistemaAlertaMonitoreo sistema = new SistemaAlertaMonitoreo();

        // Agregar factores críticos
        sistema.agregarFactorCritico(new FactorCritico("Radiación", 0, 100));
        sistema.agregarFactorCritico(new FactorCritico("Temperatura", -10, 40));
        sistema.agregarFactorCritico(new FactorCritico("Presión", 800, 1200));

        // Simular monitoreo
        sistema.monitorear();

        // Listar los primeros 10 números primos
        List<Integer> primos = sistema.listarNPrimos(10);
        System.out.println("Los primeros 10 números primos son: " + primos);
    }
}
