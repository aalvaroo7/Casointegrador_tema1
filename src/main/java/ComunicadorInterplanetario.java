import java.util.Scanner;

public class ComunicadorInterplanetario {

    // Función para contar vocales en un mensaje
    public static int contarVocales(String mensaje) {
        int contador = 0;
        for (char letra : mensaje.toCharArray()) {
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Función para invertir un mensaje
    public static String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();
    }

    // Función para verificar si un mensaje es palíndromo
    public static boolean esPalindromo(String mensaje) {
        String limpio = mensaje.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String invertido = invertirMensaje(limpio);
        return limpio.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.print("Por favor, ingresa un mensaje: ");
        String mensaje = scanner.nextLine();

        // Contar vocales
        int vocales = contarVocales(mensaje);
        System.out.println("Número de vocales en el mensaje: " + vocales);

        // Invertir mensaje
        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        // Verificar si es palíndromo
        boolean palindromo = esPalindromo(mensaje);
        if (palindromo) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }

        scanner.close();
    }
}
