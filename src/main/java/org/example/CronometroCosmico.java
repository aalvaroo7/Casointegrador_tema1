package org.example;

public class CronometroCosmico {
    // Factor de conversión para Xenon
    private static final double SEGUNDOS_XENON = 86400.0; // Segundos en un día xenoniano
    private static final double MINUTOS_XENON = 1440.0; // Minutos en un día xenoniano
    private static final double HORAS_XENON = 24.0; // Horas en un día xenoniano
    private static final double DIAS_XENON = 400.0; // Días en un año xenoniano

    public static void main(String[] args) {
        // Tiempo en la Tierra (ejemplo: 6000 segundos)
        double tiempoTerrestre = 6000.0;

        // Convertir a tiempo en Xenon
        double tiempoXenon = convertirTiempoXenon(tiempoTerrestre);

        // Mostrar resultados
        System.out.println("Tiempo en la Tierra: " + tiempoTerrestre + " segundos");
        System.out.println("Tiempo en Xenon: " + tiempoXenon + " segundos");
    }

    public static double convertirTiempoXenon(double tiempoTerrestre) {
        // Convertir segundos a minutos, horas, días y años en Xenon
        double segundosXenon = tiempoTerrestre * (SEGUNDOS_XENON / 86400.0);
        double minutosXenon = segundosXenon / 60.0;
        double horasXenon = minutosXenon / 60.0;
        double diasXenon = horasXenon / 24.0;
        double anosXenon = diasXenon / DIAS_XENON;

        return segundosXenon;
    }
}