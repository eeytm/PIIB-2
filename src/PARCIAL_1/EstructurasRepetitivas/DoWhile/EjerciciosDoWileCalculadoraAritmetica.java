/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL_1.EstructurasRepetitivas.DoWhile;

import java.util.Scanner;

/**
 *
 * @author EEY TM
 */
public class EjerciciosDoWileCalculadoraAritmetica {
    public static void main (String [] args)    {
            
            Scanner Entrada=new Scanner(System.in);
            
            
            int opcion = 0;
            float a,b,c;
             
             
            do  {
            System.out.println("Calculadora Artimetica");
            System.out.println("1. ------ SUMA -------");
            System.out.println("2. ------ RESTA ------");
            System.out.println("3. - MULTIPLICACION --");
            System.out.println("4. ---- DIVISION -----");
            System.out.println("5. ------ SALIR ------");
            System.out.println(" SELECCIONE UNA OPCION");
            opcion = Entrada.nextInt();
            
         
            
       
            

            switch (opcion)    {
                case 1:    {
                    System.out.println("Suma");

                    System.out.println("Ingrese el primer numero");
                    a=Entrada.nextFloat();

                    System.out.println("Ingrese el segundo numero");
                     b=Entrada.nextFloat();
                     c=a+b;
                     System.out.println("La suma es: "+c);

                     break;
                    
                }//Fin case 1
                
                case 2:    {
                    System.out.println("Resta");

                    System.out.println("Ingrese el primer numero");
                    a=Entrada.nextFloat();

                    System.out.println("Ingrese el segundo numero");
                     b=Entrada.nextFloat();
                     c=a-b;
                     System.out.println("La resta es: "+c);

                     break;
                    
                }//Fin case 2
                
                case 3:    {
                    System.out.println("Multiplicacion");

                    System.out.println("Ingrese el primer numero");
                    a=Entrada.nextFloat();

                    System.out.println("Ingrese el segundo numero");
                     b=Entrada.nextFloat();
                     c=a*b;
                     System.out.println("La multiplicacion es: "+c);

                     break;
                    
                }//Fin case 3
                
                case 4:    {
                    System.out.println("Division");

                    System.out.println("Ingrese el primer numero");
                    a=Entrada.nextFloat();

                    
                     
                     if ((int) a == 0){
                         System.out.println("El numerador no puede ser cero");
                     
                     } else{
                         
                     System.out.println("Ingrese el segundo numero");
                     b=Entrada.nextFloat();
                         
                     c=a/b;
                     
                     System.out.println("La multiplicacion es: "+c);
                     
                     }
                     
                     break;
                       
                     
                }//Fin case 4
                
                
                 case 5:    {
                  

                    System.out.println("Gracias por usar el Programa!!! c:");
                   

                     break;
                    
                }//Fin case 5
                 
                 default :  {
                     
                     System.out.println("Ingrese una opcion valida por favor");
                     
                     break;
                }//Fin default


            }//Fin Switch Case
       
         } while (opcion != 5 );
        
    }//Fin metodo main ()
    
}//Fin de class
