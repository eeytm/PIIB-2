/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL_1.Metodos;
import java.util.Scanner;
/**
 *
 * @author EEY TM
 */
public class CalculadoraAritmetica {
    
    Scanner Entrada = new Scanner(System.in);

    // Método Sumar
    public void Sumar() {
        float a, b, c;
        System.out.println("***************************");
        System.out.println("      Operación Suma       ");
        System.out.println("***************************");
        System.out.print("Ingrese primer valor: ");
        a = Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b = Entrada.nextFloat();
        c = a + b;
        System.out.println("El resultado de la suma es: " + c);
    }

    // Método Restar
    public void Restar() {
        float a, b, c;
        System.out.println("***************************");
        System.out.println("     Operación Resta       ");
        System.out.println("***************************");
        System.out.print("Ingrese primer valor: ");
        a = Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b = Entrada.nextFloat();
        c = a - b;
        System.out.println("El resultado de la resta es: " + c);
    }

    // Método Multiplicar
    public void Multiplicar() {
        float a, b, c;
        System.out.println("***************************");
        System.out.println("  Operación Multiplicación ");
        System.out.println("***************************");
        System.out.print("Ingrese primer valor: ");
        a = Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b = Entrada.nextFloat();
        c = a * b;
        System.out.println("El resultado de la multiplicación es: " + c);
    }

    // Método Dividir
    public void Dividir() {
        float a, b, c;
        System.out.println("***************************");
        System.out.println("    Operación División     ");
        System.out.println("***************************");
        System.out.print("Ingrese dividendo: ");
        a = Entrada.nextFloat();
        System.out.print("Ingrese divisor: ");
        b = Entrada.nextFloat();
        if (b != 0) {
            c = a / b;
            System.out.println("El resultado de la división es: " + c);
        } else {
            System.out.println("¡Error! No se puede dividir por cero.");
        }
    }

    // Método main()
    public static void main(String[] args) {
        int opcion;
        // En la siguiente línea se declara el objeto: invocametodos
        // que servirá como enlace para llamar o invocar a los métodos:
        // Sumar(), Restar(), Multiplicar(), Dividir()
        CalculadoraAritmetica invocametodos = new CalculadoraAritmetica();
        Scanner Entrada = new Scanner(System.in);
        do {
            System.out.println("---------------------------");
            System.out.println("  Calculadora Aritmética   ");
            System.out.println("---------------------------");
            System.out.println("1....Suma");
            System.out.println("2....Resta");
            System.out.println("3....Multiplicacion");
            System.out.println("4....Division");
            System.out.println("5.... Salir");
            System.out.print("Selecciones su opción: ");
            opcion = Entrada.nextInt();
            switch (opcion) {
                case 1: {
                    invocametodos.Sumar(); // Llamar o invocar al método Sumar()
                    break;
                }
                case 2: {
                    invocametodos.Restar(); // Llamar o invocar al método Restar()
                    break;
                }
                case 3: {
                    invocametodos.Multiplicar(); // Llamar o invocar al método Multiplicar()
                    break;
                }
                case 4: {
                    invocametodos.Dividir(); // Llamar o invocar al método Dividir()
                    break;
                }
                default: {
                    System.out.println("******Por favor seleccione una opción del menú, Gracias!!****");
                    break;
                }
            }
        } while (opcion != 5);
    }
}

