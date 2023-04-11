/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 09/04/23                                                                *
* Fecha Actualización: 09/04/23                                                           *
* Descripción: Dada una secuencia de números terminada en cero, elaborar un algoritmo para*
*              calcular el porcentaje y la suma de los números impares, el porcentaje y la*
*                     suma de los números pares, y la suma de todos los números, y cuántos*
*                                                               números fueron ingresados.*
*******************************************************************************************/
package ejercicios;

import java.util.Scanner;
public class Iterativas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumO = 0;
        int contO = 0;
        int sumE = 0;
        int contE = 0;
        int sumA = 0;
        int contA = 0;

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                sumE += num;
                contE++;
            } else {
                sumO += num;
                contO++;
            }

            sumA += num;
            contA++;
        }

        double porcentajeO = (double) contO / contA * 100;
        double porcentajeE = (double) contE / contA * 100;

        System.out.println("Suma de los números impares: " + sumO);
        System.out.println("Porcentaje de los números impares: " + porcentajeO + "%");
        System.out.println("Suma de los números pares: " + sumE);
        System.out.println("Porcentaje de los números pares: " + porcentajeE + "%");
        System.out.println("Suma de todos los números: " + sumA);
        System.out.println("Cantidad de números ingresados: " + contA);
        
        Primos();
       MayorMenor();
       
        
    }
    
    
    /*******************************************************************************************
    * Autor:Kevin Arnold Cortés pacheco                                                        *
    * Fecha Creación: 09/04/23                                                                 *
    * Fecha Actualización: 09/04/23                                                            *
    * Descripción:Escribir un programa que solicite el ingreso de una cantidad indeterminada de*
    *                  números mayores que 1, finalizando cuando se reciba un cero. Imprimir la*
    *                                                    cantidad de números primos ingresados.*
    ********************************************************************************************/
    
        public static void Primos() {
            Scanner scanner = new Scanner(System.in);

            int contPrims = 0;

            while (true) {
                System.out.print("Ingrese un número (0 para terminar): ");
                int numero = scanner.nextInt();

                if (numero == 0) {
                    break;
                }

                if (isPrime(numero)) {
                    contPrims++;
                }
            }

            System.out.println("Cantidad de números primos ingresados: " + contPrims);
        }

        public static boolean isPrime(int numero) {
            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        }
    

    
    
/*****************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                      *
* Fecha Creación: 09/04/23                                                               *
* Fecha Actualización: 09/04/23                                                          *
* Descripción: Leer números enteros positivos de teclado, hasta que el usuario ingrese el*
*                    número cero e informar cuál fue el mayor y el menor número ingresado*
******************************************************************************************/    
    import java.util.Scanner;

  
        public static void MayorMenor() {
            Scanner scanner = new Scanner(System.in);

            int maxNum = Integer.MIN_VALUE;
            int minNum = Integer.MAX_VALUE;

            while (true) {
                System.out.print("Ingrese un número (0 para terminar): ");
                int num = scanner.nextInt();

                if (num == 0) {
                    break;
                }

                if (num > maxNum) {
                    maxNum = num;
                }

                if (num < minNum) {
                    minNum = num;
                }
            }

            if (maxNum == Integer.MIN_VALUE && minNum == Integer.MAX_VALUE) {
                System.out.println("No se ingresaron números.");
            } else {
                System.out.println("El número máximo ingresado fue: " + maxNum);
                System.out.println("El número mínimo ingresado fue: " + minNum);
            }
        }
    

    
    
    
    
}

