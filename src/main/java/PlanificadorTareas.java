import java.util.HashMap;
import java.util.Map;

// Clase para representar un miembro de la tripulación
class MiembroTripulacion {
    private String nombre;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase para representar el planificador de tareas
public class PlanificadorTareas {
    private Map<MiembroTripulacion, String> tareasDiarias;

    public PlanificadorTareas() {
        tareasDiarias = new HashMap<>();
    }

    // Método para asignar una tarea diaria a un miembro de la tripulación
    public void asignarTarea(MiembroTripulacion miembro, String tarea) {
        tareasDiarias.put(miembro, tarea);
    }

    // Método para visualizar las tareas diarias asignadas a cada miembro
    public void visualizarTareas() {
        for (Map.Entry<MiembroTripulacion, String> entry : tareasDiarias.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    // Método para calcular la carga de trabajo óptima (producto escalar)
    public int calcularCargaTrabajoOptima() {
        int cargaTotal = 0;
        for (String tarea : tareasDiarias.values()) {
            cargaTotal += tarea.length(); // En este ejemplo, la carga de trabajo se calcula como la longitud de la tarea
        }
        return cargaTotal;
    }

    // Método main para probar el planificador de tareas
    public static void main(String[] args) {
        PlanificadorTareas planificador = new PlanificadorTareas();

        // Crear miembros de la tripulación
        MiembroTripulacion miembro1 = new MiembroTripulacion("Juan");
        MiembroTripulacion miembro2 = new MiembroTripulacion("María");

        // Asignar tareas diarias a los miembros
        planificador.asignarTarea(miembro1, "Limpiar la cubierta");
        planificador.asignarTarea(miembro2, "Preparar la comida");

        // Visualizar las tareas diarias asignadas a cada miembro
        System.out.println("Tareas Diarias:");
        planificador.visualizarTareas();

        // Calcular la carga de trabajo óptima
        int cargaOptima = planificador.calcularCargaTrabajoOptima();
        System.out.println("\nCarga de Trabajo Óptima: " + cargaOptima);
    }
}