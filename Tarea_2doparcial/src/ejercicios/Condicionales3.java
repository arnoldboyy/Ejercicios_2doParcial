/**********************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                           *
* Fecha Creación: 09/04/23                                                                    *
* Fecha Actualización: 09/04/23                                                               *
* Descripción:Un número de cuatro cifras es feliz si los dos primeros dígitos son mayores que *
*               los dos últimos dígitos. Por ejemplo, 5613 es feliz porque 56 es mayor que 12.*
*             Un número de cuatro cifras es creciente si cada dígito es mayor al anterior. Por*
*                  ejemplo, 1569 es creciente 1 < 5 < 6 < 9 (o 9 > 6 > 5 > 1). Todo número que*
*               es feliz y creciente se dice que es un número muy feliz. Todo número que no es*
*                    feliz ni creciente se dice que es infeliz. Haga un programa que tome como*
*                  entrada un número de cuatro dígitos e imprima el tipo de número encontrado,*
*                                                             según la clasificación descrita.*
***********************************************************************************************/
package ejercicios;

import java.util.Scanner;

public class Condicionales3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMEROS Y SU ESTADO DE ANIMO\n");
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = sc.nextInt();
        
        

        // Se obtienen los dígitos del número ingresado
        int digito4 = numero % 10;
        int digito3 = (numero / 10) % 10;
        int digito2 = (numero / 100) % 10;
        int digito1 = numero / 1000;

        // Se verifica si el número es feliz y/o creciente
        boolean feliz = (digito1 * 10 + digito2) > (digito3 * 10 + digito4);
        boolean creciente = (digito1 < digito2) && (digito2 < digito3) && (digito3 < digito4);

        // Se muestra la clasificación del número
        if (feliz && creciente) {
            System.out.println("El número es MUY FELIZ.");
        } else if (feliz && !creciente) {
            System.out.println("El número es FELIZ.");
        } else if (!feliz && creciente) {
            System.out.println("El número es CRECIENTE.");
        } else {
            System.out.println("El número es INFELIZ.");
        }
        
        Intervalo();
        SegundosDia();
        
    }
    
/***********************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                *
* Fecha Creación: 09/04/23                                                         *
* Fecha Actualización: 09/04/23                                                    *
* Descripción:Dados dos valores X e Y que forman un intervalo cerrado, y un valor W*
*        realice un programa para determinar si W está dentro o fuera del interval *
************************************************************************************/   
    
        public static void Intervalo() {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("\nPROGRAMA INTERVALO\n");
            System.out.print("Ingrese el valor de X: ");
            double x = sc.nextDouble();
            System.out.print("Ingrese el valor de Y: ");
            double y = sc.nextDouble();
            System.out.print("Ingrese el valor de W: ");
            double w = sc.nextDouble();

            // Se verifica si W está dentro o fuera del intervalo
            if (w >= x && w <= y) {
                System.out.println("El valor de W está dentro del intervalo [" + x + ", " + y + "].");
            } else {
                System.out.println("El valor de W está fuera del intervalo [" + x + ", " + y + "].");
            }
        }
    
/******************************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                                   *
* Fecha Creación: 09/04/23                                                                            *
* Fecha Actualización: 09/04/23                                                                       *
* Descripción:Cree un algoritmo que tome como entrada la hora exacta (horas, minutos,segundos y AM/PM)*
*                                       e indique el número de segundos transcurridos durante ese día.*
*******************************************************************************************************/   
        
            public static void SegundosDia() {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("\nPROGRAMA SEGUNDOS DEL DIA\n");
                System.out.print("Ingrese la hora en formato HH:MM:SS AM/PM: ");
                String hora = sc.nextLine();

                // Se separan los componentes de la hora ingresada
                String[] partes = hora.split(":");
                int horas = Integer.parseInt(partes[0]);
                int minutos = Integer.parseInt(partes[1]);
                int segundos = Integer.parseInt(partes[2].substring(0, 2));
                String ampm = hora.substring(hora.length() - 2);

                // Se convierte la hora a formato de 24 horas si es necesario
                if (ampm.equals("PM") && horas != 12) {
                    horas += 12;
                } else if (ampm.equals("AM") && horas == 12) {
                    horas = 0;
                }

                // Se calcula el número de segundos transcurridos durante el día
                int segundosDelDia = horas * 3600 + minutos * 60 + segundos;

                // Se muestra el número de segundos transcurridos durante el día
                System.out.println("El número de segundos transcurridos durante el día es: " + segundosDelDia);
            }
        

    
    
    
    
}

