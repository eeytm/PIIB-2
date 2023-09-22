/**
 * Chimaltenango 29 de julio de 2023
 * Programador: Eleazar Yoc
 * Descripción del programa: Mi primer ejemplo en Java
 * Este programa en Java es un ejemplo sencillo que utiliza una estructura repetitiva for
 * para imprimir la tabla de multiplicar del número 5. El programa muestra los resultados
 * de multiplicar el número 5 por los enteros del 1 al 10.
 */

// Importación de paquetes y clases no necesarios para el funcionamiento del programa.


package PARCIAL_1.EstructurasRepetitivas;

public class EstructuraRepetitivaFor {//Inicio de la clase EstructuraRepetitivaFor
    
    public static void main (String[]args) {
        // La estructura for se utiliza para repetir una serie de instrucciones un número específico de veces.

        // El ciclo for inicia con una declaración que establece el valor inicial de la variable 'i' en 1.
        // Luego, se especifica la condición de continuación del bucle (i<=10), que indica que el bucle se
        // ejecutará mientras el valor de 'i' sea menor o igual a 10.
        // Después de cada iteración, se ejecuta la expresión de actualización (i++), que incrementa el valor de 'i' en 1.

        for(int i=1; i<=10; i++) {
            // El bucle imprimirá la tabla de multiplicar del número 5, mostrando el resultado de multiplicar
            // el número 5 por los enteros del 1 al 10. La expresión (5*i) representa la multiplicación y se
            // imprime en pantalla junto con el número 'i' y un mensaje descriptivo.

            System.out.println("5 X " + i + " = " + (5*i));
        }
    }
    
}
