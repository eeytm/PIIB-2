/*
 * Chimaltenango 29 de julio de 2023
 * Programador: Eleazar Yoc
 * Descripcion del programa: Mi primer ejemplo en Java
 */

package PARCIAL_1.EstructurasRepetitivas;
// Importar la clase Scanner para leer entrada del usuario
import java.util.Scanner;

public class EstructuraRepetitivaWhile {//Inicio de la clase EstructuraRepetitivaWhile

    public static void main(String[] args) {

        // Declaración e inicialización de variables
        int i = 1; // Variable para contar la cantidad de notas ingresadas (inicia en 1)
        int notasMayoresA7 = 0; // Variable para contar la cantidad de notas mayores a 7 (inicia en 0)
        int notasMenoresOIgualA7 = 0; // Variable para contar la cantidad de notas menores o iguales a 7 (inicia en 0)

        // Creación de un objeto de la clase Scanner para leer entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Inicio de un bucle while (repetitivo) que se ejecutará mientras i sea menor o igual a 10
        while (i <= 10) {
            // Solicitar al usuario que ingrese una nota
            System.out.print("Ingrese la nota número " + i + ": ");
            int nota = scanner.nextInt(); // Leer la nota ingresada por el usuario

            // Comprobar si la nota es mayor que 7
            if (nota > 7) {
                notasMayoresA7++; // Incrementar el contador de notas mayores a 7
            } else {
                notasMenoresOIgualA7++; // Incrementar el contador de notas menores o iguales a 7
            }

            i++; // Incrementar la variable i para avanzar al siguiente número de nota
        }

        // Imprimir la cantidad de alumnos con notas mayores a 7
        System.out.println("Cantidad de alumnos con notas mayores a 7: " + notasMayoresA7);
        
        // Imprimir la cantidad de alumnos con notas menores o iguales a 7
        System.out.println("Cantidad de alumnos con notas menores o iguales a 7: " + notasMenoresOIgualA7);
    }

}
