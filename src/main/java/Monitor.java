import java.util.ArrayList;
import java.util.List;

public class Monitor {
    private double radiationLevel;
    private double temperature;
    private double pressure;

    public void monitorRadiation() {
        // código para monitorear el nivel de radiación
    }

    public void monitorTemperature() {
        // código para monitorear la temperatura
    }

    public void monitorPressure() {
        // código para monitorear la presión
    }

    public void alert() {
        // código para alertar a la tripulación si los valores son extremos
    }

    public void suggestAdjustments() {
        // código para sugerir ajustes basados en los valores monitoreados
    }

    public List<Event> identifyCriticalEvents(int n) {
        List<Event> criticalEvents = new ArrayList<>();
        // código para identificar y listar los N primeros eventos raros o críticos
        return criticalEvents;
    }
}

class Event {
    private String description;

    public Event(String description) {
        this.description = description;
    }

    // getters y setters
}

class ProblemDecomposer {
    public List<Integer> decompose(int n) {
        List<Integer> factors = new ArrayList<>();
        // código para descomponer n en factores primos
        return factors;
    }
}
