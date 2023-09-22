/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL_1.EstructurasRepetitivas.EjerciciosForDeVelocidad;

/**
 *
 * @author EEY TM
 */
public class EjerciciosForMargenAsteriscos {
    
    public static void main (String[]args) {
        // La estructura for se utiliza para repetir una serie de instrucciones un número específico de veces.

        // El ciclo for inicia con una declaración que establece el valor inicial de la variable 'i' en 0.
        // Luego, se especifica la condición de continuación del bucle (i<=80), que indica que el bucle se
        // ejecutará mientras el valor de 'i' sea menor o igual a 80.
        // Después de cada iteración, se ejecuta la expresión de actualización (i++), que incrementa el valor de 'i' en 1.
          for(int i=0; i<=80; i++) {
            
            // Se imprime "*" 80 veces y no se deja espaciado para que se imprima en la mismna linea
            System.out.print("*");
            
        }
        
          for(int i=0; i<=24; i++) {
           
            // Se imprime "*" 24 veces y se deja espaciado para que no se imprima en la mismna linea
            System.out.println("*                                                                                *");
            
        }
          
        for(int i=0; i<=80; i++) {
           
            // Se imprime "*" 80 veces y no se deja espaciado para que se imprima en la mismna linea
            System.out.print("*");
            
        }
    }
    
}
