import java.util.ArrayList;
import java.util.List;

// Clase para representar un factor crítico
class FactorCritico {
    private String nombre;
    private double valorActual;
    private double limiteInferior;
    private double limiteSuperior;

    public FactorCritico(String nombre, double limiteInferior, double limiteSuperior) {
        this.nombre = nombre;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public void actualizarValor(double valor) {
        this.valorActual = valor;
    }

    public boolean esValorCritico() {
        return valorActual < limiteInferior || valorActual > limiteSuperior;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorActual() {
        return valorActual;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }
}

// Clase principal para el sistema de alerta y monitoreo
public class SistemaAlertaMonitoreo {
    private List<FactorCritico> factoresCriticos;

    public SistemaAlertaMonitoreo() {
        factoresCriticos = new ArrayList<>();
    }

    public void agregarFactorCritico(FactorCritico factorCritico) {
        factoresCriticos.add(factorCritico);
    }

    public void monitorear() {
        for (FactorCritico factor : factoresCriticos) {
            if (factor.esValorCritico()) {
                System.out.println("Alerta: " + factor.getNombre() + " fuera del rango aceptable.");
                // Aquí se puede agregar lógica para sugerir ajustes
            }
        }
    }

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
