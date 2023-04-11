/****************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                         *
* Fecha Creación: 09/04/23                                                  *
* Fecha Actualización: 09/04/23                                             *
* Descripción:Escribir un programa que pregunte al usuario por el número de *
*horas trabajadas y el coste por hora. Después debe mostrar por la pantalla *
*                               la paga total que le corresponde al usuario.*
*****************************************************************************/


package ejercicios;

import java.util.Scanner;

public class DatosBasicos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("PROGRAMA PAGO POR HORA\n");
        
        System.out.print("Introduce el número de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Introduce el coste por hora: ");
        double costePorHora = scanner.nextDouble();
        
        double pagaTotal = horasTrabajadas * costePorHora;
        
        System.out.println("Tu paga total es: " + pagaTotal);
    
    
    OperacionAritmetica1();
    OperacionAritmetica2();
}


/************************************************************
* Autor:Kevin Arnold Cortés pacheco                         *
* Fecha Creación: 09/04/23                                  *
* Fecha Actualización: 09/04/23                             *
* Descripción: Escribir un programa que realice la siguiente*
*              operación aritmética:   x+y/a*b              *
*************************************************************/

public static void OperacionAritmetica1() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("\nOPERACION ARITMETICA 1");

    System.out.print("Ingrese el valor de x: ");
    double x = scanner.nextDouble();

    System.out.print("Ingrese el valor de y: ");
    double y = scanner.nextDouble();

    System.out.print("Ingrese el valor de a: ");
    double a = scanner.nextDouble();

    System.out.print("Ingrese el valor de b: ");
    double b = scanner.nextDouble();
    double resultado = x + y / (a * b);

    System.out.println("El resultado de la operación es: " + resultado);
}  


/************************************************************
* Autor:Kevin Arnold Cortés pacheco                         *
* Fecha Creación: 09/04/23                                  *
* Fecha Actualización: 09/04/23                             *
* Descripción: Escribir un programa que realice la siguiente*
*              operación aritmética:   √(x+y*z)^5           *
*************************************************************/
public static void OperacionAritmetica2() {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("\nOPERACION ARITMETICA 2");
    
    System.out.print("Ingrese el valor de x: ");
    double x = scanner.nextDouble();

    System.out.print("Ingrese el valor de y: ");
    double y = scanner.nextDouble();

    System.out.print("Ingrese el valor de z: ");
    double z = scanner.nextDouble();

    double resultado = Math.pow(x + y * z, 5);
    resultado = Math.sqrt(resultado);

    System.out.println("El resultado de la operación es: " + resultado);
}
}


