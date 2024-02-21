# https://github.com/aalvaroo7/Casointegrador_tema1.git
## Ejercicio 1)
Este código Java define una clase llamada CronometroCosmico que se utiliza para convertir el tiempo de la Tierra a un planeta ficticio llamado Xenon. La clase tiene varios campos constantes que representan los factores de conversión para las unidades de tiempo de Xenon:

SEGUNDOS_XENON representa el número de segundos en un día de Xenon.
MINUTOS_XENON representa el número de minutos en un día de Xenon.
HORAS_XENON representa el número de horas en un día de Xenon.
DIAS_XENON representa el número de días en un año de Xenon.
El método principal es el punto de entrada del programa. Inicializa una variable tiempoTerrestre con un valor que representa el tiempo en la Tierra en segundos. Luego llama al método convertirTiempoXenon para convertir este tiempo a tiempo de Xenon. Los resultados se imprimen en la consola. El método convertirTiempoXenon recibe un valor de tiempo en segundos de la Tierra y lo convierte a tiempo de Xenon. Lo hace primero convirtiendo los segundos de la Tierra a segundos de Xenon, luego a minutos de Xenon, horas de Xenon, días de Xenon y finalmente años de Xenon. Sin embargo, solo se devuelven los segundos de Xenon en el método. Las otras conversiones (a minutos, horas, días y años) se calculan pero no se utilizan

## Ejercicio 2)
### parte 1(resource))
Este código en Java define una clase llamada Resource (Recurso).  La clase Resource tiene dos atributos privados: name (nombre) y dailyConsumption (consumo diario).  
name es una cadena de texto que representa el nombre del recurso.
dailyConsumption es un número de tipo double que representa la cantidad del recurso que se consume diariamente.
La clase tiene un constructor que toma dos parámetros: name y dailyConsumption. Este constructor se utiliza para crear una nueva instancia de Resource, inicializando los atributos name y dailyConsumption con los valores proporcionados.  Además, la clase Resource tiene dos métodos públicos: getName y getDailyConsumption.  
El método getName devuelve el nombre del recurso.
El método getDailyConsumption devuelve la cantidad del recurso que se consume diariamente.
En resumen, esta clase se utiliza para representar un recurso con un nombre y una tasa de consumo diario.

### parte 2(resource calculator))

Este código en Java define una clase llamada ResourceCalculator (Calculadora de Recursos).  La clase ResourceCalculator tiene un atributo privado resources que es una lista de objetos de la clase Resource.  El constructor de ResourceCalculator toma una lista de recursos como parámetro y la asigna al atributo resources.  La clase ResourceCalculator tiene cuatro métodos públicos:  
calculateTotalConsumption(int days): Este método calcula el consumo total de todos los recursos en un número dado de días. Para cada recurso en la lista resources, multiplica el consumo diario del recurso por el número de días y suma estos valores para obtener el consumo total.  
calculateAverageConsumption(int days): Este método calcula el consumo promedio de todos los recursos en un número dado de días. Llama al método calculateTotalConsumption(int days) para obtener el consumo total y luego lo divide por el número de recursos.  
calculateMaxConsumption(int days): Este método encuentra el consumo máximo de todos los recursos en un número dado de días. Para cada recurso en la lista resources, multiplica el consumo diario del recurso por el número de días y mantiene el valor máximo encontrado.  
calculateMinConsumption(int days): Este método encuentra el consumo mínimo de todos los recursos en un número dado de días. Para cada recurso en la lista resources, multiplica el consumo diario del recurso por el número de días y mantiene el valor mínimo encontrado.  
En resumen, esta clase se utiliza para calcular el consumo total, promedio, máximo y mínimo de una lista de recursos en un número dado de días.
