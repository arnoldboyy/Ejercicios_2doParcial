/*******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                        *
* Fecha Creación: 09/04/23                                                                 *
* Fecha Actualización: 09/04/23                                                            *
* Descripción: Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas.*
* Suele hacer venta por correo y la empresa de logística les cobra por peso de cada paquete*
* así que deben calcular el peso de los payasos y muñecas que saldrán en cada paquete a    *
* demanda. Cada payaso tiene un peso de 112 g y  cada muñeca 75 g. Escribe un programa que *
* lea el número de payasos y muñecas vendidos en el último pedido y calcule el peso total  *
* del paquete que será enviado.                                                            *
********************************************************************************************/

package ejercicios;

import java.util.Scanner;
public class DatosBasicos3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("PROGRAMA JUGUETERIA\n");

        System.out.print("Introduce el número de payasos vendidos: ");
        int numPayasos = input.nextInt();
        System.out.print("Introduce el número de muñecas vendidas: ");
        int numMunecas = input.nextInt();

        int pesoPayasos = numPayasos * 112;
        int pesoMunecas = numMunecas * 75;

        int pesoTotal = pesoPayasos + pesoMunecas;

        System.out.println("El peso total del paquete es de " + pesoTotal + " gramos.");
        Velocidad();
        SegundoGrado();
    }
    
  
    
/****************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                         *
* Fecha Creación: 09/04/23                                                  *
* Fecha Actualización: 09/04/23                                             *
* Descripción:Escribir un programa que pregunte al usuario por el número de *
*horas trabajadas y el coste por hora. Después debe mostrar por la pantalla *
*la paga total que le corresponde al usuario.                               *
*****************************************************************************/


        public static void Velocidad() {
            Scanner input = new Scanner(System.in);
            
            System.out.print("\nPROGRAMA VELOCIDAD\n");

            System.out.print("Introduce la distancia recorrida en metros: ");
            double distancia = input.nextDouble();
            System.out.print("Introduce el tiempo que tomó en segundos: ");
            double tiempo = input.nextDouble();

            double velocidad = distancia / tiempo;

            System.out.println("La velocidad es de " + velocidad + " m/s.");
        }
    
/***********************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                *
* Fecha Creación: 09/04/23                                                         *
* Fecha Actualización: 09/04/23                                                    *
* Descripción:Escriba un programa que reciba como entrada los coeficientes A, B y C*
* de una ecuación de segundo grado, e imprima por pantalla los valores de x. Asuma *
* que la ecuación siempre tiene solución en número reales.                         *
************************************************************************************/        
        public static void SegundoGrado() {
            Scanner input = new Scanner(System.in);
            
            System.out.print("\nPROGRAMA ECUACION SEGUNDO GRADO\n");

            System.out.print("Introduce el coeficiente A: ");
            double a = input.nextDouble();
            System.out.print("Introduce el coeficiente B: ");
            double b = input.nextDouble();
            System.out.print("Introduce el coeficiente C: ");
            double c = input.nextDouble();

            double discriminante = Math.pow(b, 2) - 4 * a * c;

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Los valores de x son: " + x1 + " y " + x2);
        }
    }

    
    


