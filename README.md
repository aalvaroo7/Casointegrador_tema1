# https://github.com/aalvaroo7/Casointegrador_tema1.git
## Ejercicio 1)
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

