package ejercicios;
import java.util.Scanner;


/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 09/04/23                                                                *
* Fecha Actualización: 09/04/23                                                           *
* Descripción:Escribir un programa que pida al usuario dos números y muestre por pantalla *
*        su división. Si el divisor es cero, el programa debe mostrar un mensaje de error.*                      *
*******************************************************************************************/     

public class Condicionales1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("PROGRAMA DIVISOR\n");

        System.out.print("Introduce el dividendo: ");
        double dividendo = input.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = input.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: no se puede dividir por cero.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
        
       Impuestos(); 
       Capicua();
        
        
    }
 
    
/************************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                             *
* Fecha Creación: 09/04/23                                                                      *
* Fecha Actualización: 09/04/23                                                                 *
* Descripción:Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos   *
* ingresos iguales o superiores a 500$ mensuales. Escribir un programa que pregunte al usuario  *
* su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.*
*************************************************************************************************/ 
   
        public static void Impuestos() {
            Scanner input = new Scanner(System.in);
            
            System.out.print("\nPROGRAMA IMPUESTOS\n");

            System.out.print("Introduce tu edad: ");
            int edad = input.nextInt();
            System.out.print("Introduce tus ingresos mensuales en dólares: ");
            double ingresos = input.nextDouble();

            if (edad > 16 && ingresos >= 500) {
                System.out.println("Debes tributar el impuesto.");
            } else {
                System.out.println("No debes tributar el impuesto.");
            }
        }
    
/*****************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                       *
*Fecha Creación: 09/04/23                                                                *
*Fecha Actualización: 09/04/23                                                           *
* Descripción:Realice un programa que imprima “Capicúa” si un número de entrada de cuatro*
*          dígitos es capicúa, o “No lo es” en caso contrario. Un número es capicúa si se*
*            escribe igual al derecho y al revés. Por ejemplo, 1551 es un número capicúa.*
* ****************************************************************************************/ 
       
            public static void Capicua() {
                Scanner input = new Scanner(System.in);
                
                System.out.print("\nPROGRAMA CAPICUA\n");

                System.out.print("Introduce un número de cuatro dígitos: ");
                int numero = input.nextInt();

                int unidad = numero % 10;
                int decena = (numero / 10) % 10;
                int centena = (numero / 100) % 10;
                int millar = numero / 1000;

                if (unidad == millar && decena == centena) {
                    System.out.println("Capicúa");
                } else {
                    System.out.println("No lo es");
                }
            }
        

    
    
    
    
}




