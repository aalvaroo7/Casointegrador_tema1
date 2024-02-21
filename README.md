# https://github.com/aalvaroo7/Casointegrador_tema1.git
## Ejercicio 1)
Este código Java define una clase llamada CronometroCosmico que se utiliza para convertir el tiempo de la Tierra a un planeta ficticio llamado Xenon. La clase tiene varios campos constantes que representan los factores de conversión para las unidades de tiempo de Xenon:

SEGUNDOS_XENON representa el número de segundos en un día de Xenon.
MINUTOS_XENON representa el número de minutos en un día de Xenon.
HORAS_XENON representa el número de horas en un día de Xenon.
DIAS_XENON representa el número de días en un año de Xenon.
El método principal es el punto de entrada del programa. Inicializa una variable tiempoTerrestre con un valor que representa el tiempo en la Tierra en segundos. Luego llama al método convertirTiempoXenon para convertir este tiempo a tiempo de Xenon. Los resultados se imprimen en la consola. El método convertirTiempoXenon recibe un valor de tiempo en segundos de la Tierra y lo convierte a tiempo de Xenon. Lo hace primero convirtiendo los segundos de la Tierra a segundos de Xenon, luego a minutos de Xenon, horas de Xenon, días de Xenon y finalmente años de Xenon. Sin embargo, solo se devuelven los segundos de Xenon en el método. Las otras conversiones (a minutos, horas, días y años) se calculan pero no se utilizan
