
/***********************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                 *
*Fecha Creación: 09/04/23                                                          *
*Fecha Actualización: 09/04/23                                                     *
* Descripción:Solicitar números al usuario hasta que ingrese el cero. Por cada uno,* 
*   mostrar la suma de sus dígitos. Al finalizar, mostrar la sumatoria de todos los*
*  números ingresados y la suma de sus dígitos.                                    *
* *********************************************************************************/ 

package ejercicios;
import java.util.Scanner;

public class Sumatoria3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumTotal = 0;
        int sumDigitsTotal = 0;

        System.out.println("Ingrese números enteros (0 para terminar):");

        int number = input.nextInt();

        while (number != 0) {
            int sumDigits = sumDigits(number);
            System.out.println("La suma de los dígitos de " + number + " es " + sumDigits);

            sumTotal += number;
            sumDigitsTotal += sumDigits;

            number = input.nextInt();
        }

        System.out.println("La sumatoria de los números ingresados es " + sumTotal);
        System.out.println("La suma de los dígitos de los números ingresados es " + sumDigitsTotal);
        System.out.println("Fin del programa.");
    }

    public static int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}

