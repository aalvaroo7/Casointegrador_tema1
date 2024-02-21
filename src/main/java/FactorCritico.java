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

    // Getters para los límites y el nombre
    public double getLimiteInferior() {
        return limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public String getNombre() {
        return nombre;
    }
}

