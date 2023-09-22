/*
 * Chimaltenango 29 de julio de 2023
 * Programador: Eleazar Yoc
 * Descripcion del programa: Mi primer ejemplo en Java
 * Este código Java presenta un programa que le permite al usuario ingresar una serie de números
 * y calcular el promedio de dichos números. El programa utiliza una estructura repetitiva do-while
 * para solicitar al usuario los números de entrada y una vez que el usuario ingresa el número 0
 * o se han ingresado un máximo de 10 números, el programa detiene la entrada y calcula el promedio.
 */

package PARCIAL_1.EstructurasRepetitivas;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile { //Inicio de la clase EstructuraRepetitivaDoWhile

    public static void main(String[] args) {

        int i = 1; // Contador para llevar la cuenta de la posición actual del número ingresado.
        int numero; // Variable para almacenar el número ingresado por el usuario en cada iteración.
        int suma = 0; // Variable para almacenar la suma de todos los números ingresados.
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario.

        do {
            // Solicitar al usuario que ingrese el número en la posición i.
            System.out.print("Ingrese el número en la posición " + i + " (Ingrese 0 para finalizar): ");
            numero = scanner.nextInt(); // Leer el número ingresado por el usuario.

            if (numero != 0) {
                suma += numero; // Si el número ingresado no es cero, se suma al valor acumulado.
                i++; // Incrementar el contador para la siguiente posición de número.
            }
        } while (numero != 0 && i <= 10); // Continuar la repetición mientras el número sea diferente de cero y no se hayan ingresado 10 números.

        // Verificar si no se ingresaron números o solo se ingresó el valor cero.
        if (i == 1) {
            System.out.println("No se ingresaron números.");
        } else {
            // Calcular el promedio de los números ingresados (excluyendo el cero).
            double promedio = (double) suma / (i - 1);
            System.out.println("El promedio de los números ingresados es: " + promedio);
        }
    }
}
