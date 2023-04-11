/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 09/04/23                                                                *
* Fecha Actualización: 09/04/23                                                           *
* Descripción:Escribir un programa que pida al usuario un número entero positivo y muestre*
*                          por pantalla todos los números impares desde 1 hasta ese número*
*******************************************************************************************/
package ejercicios;

import java.util.Scanner;
public class Iterativas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("IMPARES\n");
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        // Se muestran por pantalla todos los números impares desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        Primo();
        Serie();
    }
    
/*************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                  *
* Fecha Creación: 09/04/23                                                           *
* Fecha Actualización: 09/04/23                                                      *
* Descripción:Escribir un programa que pida al usuario un número entero y muestre por*
*                                                pantalla si es un número primo o no.*
**************************************************************************************/ 
   
        public static void Primo() {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("\nPRIMO\n");
            System.out.print("Ingrese un número entero: ");
            int n = sc.nextInt();

            // Se verifica si el número es primo o no
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Se muestra por pantalla si el número es primo o no
            if (esPrimo && n > 1) {
                System.out.println(n + " es un número primo.");
            } else {
                System.out.println(n + " no es un número primo.");
            }
        }
    
        
/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 09/04/23                                                                *
* Fecha Actualización: 09/04/23                                                           *
* Descripción:Escriba un programa que calcule el valor 𝑛 aproximado de usando la serie:   *
*******************************************************************************************/        
       
            public static void Serie() {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nSERIE\n");
                System.out.print("Ingrese la cantidad de términos a utilizar en la aproximación: ");
                int n = sc.nextInt();

                double pi = 0;
                int signo = 1;
                for (int i = 1; i <= n; i++) {
                    pi += signo * 4.0 / (2 * i - 1);
                    signo *= -1;
                }

                System.out.println("El valor aproximado de pi utilizando " + n + " términos es: " + pi);
            }
        

    
    
    
    
    
}
