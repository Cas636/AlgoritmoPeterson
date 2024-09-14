# Algoritmo de Peterson en Java

Este proyecto es una implementación en Java del algoritmo de Peterson para la exclusión mutua en la programación concurrente. El algoritmo de Peterson es una solución clásica para coordinar el acceso a una sección crítica entre dos hilos.

## Descripción

El código está compuesto por tres clases:

1. **`SharedData`**: Contiene los datos compartidos entre los hilos, específicamente los indicadores `flag` y `turn` utilizados para la sincronización.
2. **`Peterson`**: Implementa el algoritmo de Peterson y realiza la lógica de la sección crítica y la espera activa.
3. **`Mainmethod`**: Contiene el método principal que crea e inicia dos hilos, cada uno ejecutando una instancia de la clase `Peterson`.

## Ejecución
Clona este repositorio en tu máquina local.
Compila las clases Java:
**`javac peterson/SharedData.java peterson/Peterson.java peterson/Mainmethod.java`**
Ejecuta el programa:
 **`java peterson.Mainmethod`**

## Salida Esperada
La salida del programa mostrará mensajes sobre el estado de cada hilo en la consola:

Mensajes indicando cuándo un hilo está en espera.
Mensajes indicando cuándo un hilo está usando la sección crítica.
