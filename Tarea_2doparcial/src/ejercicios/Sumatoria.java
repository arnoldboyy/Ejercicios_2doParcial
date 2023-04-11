/**************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                    *
*Fecha Creación: 09/04/23                                                             *
*Fecha Actualización: 09/04/23                                                        *
* Descripción:Escribir un programa que pida números positivos al usuario. Mostrar el  *
*  número cuya sumatoria de dígitos fue mayor y la cantidad de números cuya sumatoria *
*    de dígitos fue menor que 10. Utilizar una o más funciones, según sea necesario.  *
* *************************************************************************************/ 
package ejercicios;

import java.util.Scanner;
public class Sumatoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxS = 0;
        int maxN = 0;
        int C = 0;

        System.out.print("Ingrese un número positivo (0 para salir): ");
        int num = input.nextInt();

        while (num > 0) {
            int sum = digitSum(num);

            if (sum > maxS) {
                maxS = sum;
                maxN = num;
            }

            if (sum < 10) {
                C++;
            }

            System.out.print("Ingrese otro número positivo (0 para salir): ");
            num = input.nextInt();
        }

        System.out.println("El número cuya sumatoria de dígitos fue mayor es " + maxN);
        System.out.println("La cantidad de números cuya sumatoria de dígitos fue menor que 10 es " + C);
    }

    public static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
