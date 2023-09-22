/*
 * Chimaltenango 05 de agosto de 2023
 * Programador: Eleazar Yoc
 * Descripcion del programa: Fichero
 * Este código Java presenta un programa que le permite al usuario ingresar una serie de números
 * y calcular el promedio de dichos números. El programa utiliza una estructura repetitiva do-while
 * para solicitar al usuario los números de entrada y una vez que el usuario ingresa el número 0
 * o se han ingresado un máximo de 10 números, el programa detiene la entrada y calcula el promedio.
 */
package PARCIAL_1.Ficheros;

/**
 *
 * @author EEY TM
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichero {
    


    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String cadena;
  
        try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
            PrintWriter salida = new PrintWriter(fw)) {   
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }          
    }
    
}

    

