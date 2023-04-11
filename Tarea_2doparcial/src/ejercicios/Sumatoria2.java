/************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                 *
*Fecha Creación: 09/04/23                                                          *
*Fecha Actualización: 09/04/23                                                     *
* Descripción:Solicitar números al usuario hasta que ingrese el cero. Por cada uno,*
*   mostrar la suma de sus dígitos (utilizando una función que realice dicha suma).*
* **********************************************************************************/ 
package ejercicios;
import java.util.Scanner;

public class Sumatoria2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese números enteros (0 para terminar):");

        int num = input.nextInt();

        while (num != 0) {
            int sum = sumDigits(num);
            System.out.println("La suma de los dígitos de " + num + " es " + sum);
            num = input.nextInt();
        }

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
