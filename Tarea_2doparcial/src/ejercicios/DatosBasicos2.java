package ejercicios;

import java.util.Scanner;

/*********************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                              *
* Fecha Creación: 09/04/23                                                       *
* Fecha Actualización: 09/04/23                                                  *
* Descripción: Escribir un programa que pida al usuario dos números enteros      *
*  y muestre por pantalla el siguiente mensaje:                                  *
*     “<n> entre <m> da un cociente <c> y un resto <r>”, donde <n> y <m> son los *
*     números introducidos por el usuario, y <c> y <r> son el cociente y el resto*
*     de la división entera respectivamente                                      *
**********************************************************************************/

public class DatosBasicos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("MENSAJE DIVISION");

        System.out.print("Ingrese el primer número entero: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int m = scanner.nextInt();

        int cociente = n / m;
        int resto = n % m;

        System.out.println(n + " entre " + m + " da un cociente " + cociente + " y un resto " + resto);
    
        Hipotenusa();
        NumeroReverso();
        
        
    }
    
/****************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                         *
* Fecha Creación: 09/04/23                                                  *
* Fecha Actualización: 09/04/23                                             *
* Descripción:Escriba un programa que, dadas las longitudes de los          *
* catetos de un triángulo rectángulo, calcule la longitud de su hipotenusa  *
 *****************************************************************************/
    
    public static void Hipotenusa() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nHIPOTENUSA");
        
        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
    }
    
    
/***********************************************************************
* Autor:Kevin Arnold Cortés pacheco                                   *
* Fecha Creación: 09/04/23                                            *
* Fecha Actualización: 09/04/23                                       *
* Descripción:Escriba un programa que lea un número de cuatro dígitos *
* y muestre en pantalla el número escrito en reverso. Por ejemplo, si *
*                el número leído es 5432, la salida debería ser 2345. *
 ***********************************************************************/
    
    public static void NumeroReverso() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nNUMERO REVERSO");

        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = scanner.nextInt();

        int digito1 = numero % 10;
        int digito2 = (numero / 10) % 10;
        int digito3 = (numero / 100) % 10;
        int digito4 = numero / 1000;

        int numeroReverso = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;

        System.out.println("El número en reverso es: " + numeroReverso);
    }
}
