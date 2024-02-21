# https://github.com/aalvaroo7/Casointegrador_tema1.git

# Ejercicio 1)
Este código Java define una clase llamada CronometroCosmico, que incluye un método main() y un método adicional convertirTiempoXenon() para realizar conversiones de tiempo entre la Tierra y el planeta ficticio Xenon. Aquí está el desglose del código:

Constantes:

Se definen constantes para el factor de conversión entre el tiempo en la Tierra y el tiempo en Xenon. Estas constantes representan cuántos segundos, minutos, horas y días hay en un día y año xenoniano.
Método main(String[] args):

Este método es el punto de entrada del programa.
Inicializa una variable tiempoTerrestre con un valor de ejemplo en segundos (6000 segundos).
Llama al método convertirTiempoXenon() para convertir este tiempo a tiempo en Xenon.
Muestra los resultados en la consola.
Método convertirTiempoXenon(double tiempoTerrestre):

Este método toma un tiempo dado en segundos en la Tierra y lo convierte a segundos en el tiempo xenoniano.
Primero, multiplica el tiempo terrestre por el factor de conversión para obtener el tiempo en segundos en Xenon.
Luego, calcula el equivalente en minutos, horas, días y años xenonianos.
Finalmente, devuelve el tiempo en segundos en Xenon.
En resumen, este programa toma un tiempo en la Tierra en segundos y lo convierte a tiempo en Xenon utilizando factores de conversión predefinidos para los días y años xenonianos. Esto es útil para hacer cálculos o comparaciones de tiempo entre la Tierra y un mundo ficticio como Xenon.

# Ejercicio 2)
1. **Importaciones de paquetes:**
   ```java
   import java.util.ArrayList;
   import java.util.Collections;
   import java.util.List;
   import java.util.Scanner;
   ```
   - `java.util.ArrayList`: Esta clase proporciona una implementación de la interfaz List utilizando una matriz redimensionable.
   - `java.util.Collections`: Proporciona métodos de utilidad para operaciones en colecciones, como ordenar, buscar y sincronizar colecciones.
   - `java.util.List`: Es una interfaz que representa una lista ordenada de elementos.
   - `java.util.Scanner`: Esta clase se utiliza para obtener la entrada del usuario en la consola.

2. **Clase `CalculadoraConsumoRecursos`:**
   - Esta es la clase principal del programa.

3. **Método `main(String[] args)`:**
   - Este método es el punto de entrada del programa.
   - Crea un objeto `Scanner` para leer la entrada del usuario.
   - Crea una lista llamada `consumos` para almacenar los consumos diarios de recursos.
   - Solicita al usuario ingresar los consumos diarios de recursos, asegurándose de que sean múltiplos de 5.
   - Una vez que el usuario ingresa -1, el ciclo termina.
   - Llama al método `mostrarEstadisticas()` para calcular y mostrar las estadísticas.

4. **Método `mostrarEstadisticas(List<Integer> consumos)`:**
   - Este método toma una lista de consumos como entrada y calcula varias estadísticas sobre esos consumos.
   - Itera sobre la lista de consumos para calcular la suma total, el mínimo y el máximo consumo diario.
   - Calcula el ritmo de consumo promedio dividiendo la suma total entre el número de consumos.
   - Muestra la cantidad total de recursos consumidos, el ritmo de consumo promedio, el mínimo y máximo consumo diario.
   - Ordena la lista de consumos para calcular la mediana.
   - Calcula y muestra la mediana del consumo.
   
Esencialmente, este programa solicita al usuario ingresar los consumos diarios de recursos, luego calcula y muestra varias estadísticas sobre esos consumos, como la cantidad total de recursos consumidos, el ritmo de consumo promedio, el mínimo y máximo consumo diario, y la mediana del consumo.

# Ejercicio 3)
## Factor critico 
Este código implementa un sistema de alerta y monitoreo que supervisa factores críticos como la radiación, la temperatura y la presión. Aquí tienes una explicación detallada de cada parte del código:

Clase SistemaAlertaMonitoreo: Esta es la clase principal que contiene toda la lógica del sistema de alerta y monitoreo.

Atributos:

factoresCriticos: Una lista que contiene los factores críticos que el sistema debe monitorear.
Constructor:

SistemaAlertaMonitoreo(): Inicializa la lista de factores críticos como una instancia de ArrayList.
Método agregarFactorCritico:

void agregarFactorCritico(FactorCritico factorCritico): Agrega un factor crítico a la lista de factores a monitorear.
Método monitorear:

void monitorear(): Itera sobre cada factor crítico en la lista y verifica si su valor actual está fuera del rango aceptable. Si es así, emite una alerta indicando el nombre del factor y que está fuera del rango aceptable.
Método listarNPrimos:

List<Integer> listarNPrimos(int n): Genera y devuelve una lista de los primeros N números primos. Utiliza el método privado esPrimo para verificar si un número es primo.
Método esPrimo:

private boolean esPrimo(int numero): Verifica si un número dado es primo o no. Itera desde 2 hasta la raíz cuadrada del número y verifica si el número es divisible por algún número en ese rango.
Método main:

El método principal main crea una instancia del SistemaAlertaMonitoreo, agrega algunos factores críticos (radiación, temperatura y presión), simula el monitoreo y luego lista los primeros 10 números primos.
En resumen, este código proporciona una estructura básica para un sistema de alerta y monitoreo que puede ser extendido y mejorado según sea necesario para adaptarse a un entorno de aplicación específico.

## Sistema alerta monitoreo

Este código Java define una clase llamada FactorCritico, que representa un factor crítico a ser monitoreado en un sistema de alerta y monitoreo. Aquí está la explicación de cada parte del código:

Atributos:

nombre: Una cadena que representa el nombre del factor crítico.
valorActual: Un número de punto flotante que representa el valor actual del factor crítico.
limiteInferior: Un número de punto flotante que representa el límite inferior aceptable para el factor crítico.
limiteSuperior: Un número de punto flotante que representa el límite superior aceptable para el factor crítico.
Constructor:

FactorCritico(String nombre, double limiteInferior, double limiteSuperior): Un constructor que inicializa los atributos nombre, limiteInferior y limiteSuperior del factor crítico.
Método actualizarValor:

void actualizarValor(double valor): Un método que actualiza el valor actual del factor crítico con el valor proporcionado como argumento.
Método esValorCritico:

boolean esValorCritico(): Un método que verifica si el valor actual del factor crítico está fuera del rango aceptable definido por los límites inferior y superior. Retorna true si el valor actual es menor que el límite inferior o mayor que el límite superior; de lo contrario, retorna false.
Getters:

getNombre(): Un método que devuelve el nombre del factor crítico.
getLimiteInferior(): Un método que devuelve el límite inferior aceptable para el factor crítico.
getLimiteSuperior(): Un método que devuelve el límite superior aceptable para el factor crítico.
En resumen, esta clase encapsula la información y el comportamiento relacionados con un factor crítico, permitiendo que sea fácilmente manipulado y consultado en el contexto de un sistema de alerta y monitoreo.
