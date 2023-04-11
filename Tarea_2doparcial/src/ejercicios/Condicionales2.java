/*********************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                          *
* Fecha Creación: 09/04/23                                                                   *
* Fecha Actualización: 09/04/23                                                              *
* Descripción:El IMC resulta de la división de la masa del individuo (en kilogramos) entre el*
*             cuadrado de la estatura (en metros). El índice de masa corporal es un indicador*
*                                          del peso de una persona en relación con su altura.*
**********************************************************************************************/    
package ejercicios;
import java.util.Scanner;
public class Condicionales2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("PROGRAMA IMC DE PERSONA\n");
        System.out.print("Introduce tu masa en kilogramos: ");
        double masa = input.nextDouble();

        System.out.print("Introduce tu estatura en metros: ");
        double estatura = input.nextDouble();

        double imc = masa / (estatura * estatura);

        System.out.printf("Tu IMC es: %.2f%n", imc);

        if (imc < 16) {
            System.out.println("Criterio de ingreso");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidad premórbida");
        } else if (imc >= 40 && imc <= 45) {
            System.out.println("Obesidad mórbida");
        } else {
            System.out.println("Obesidad hipermórbida");
        }
        
        LibrasIMC(); 
        Mes();
        
    }
    
/****************************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                                 *
* Fecha Creación: 09/04/23                                                                          *
* Fecha Actualización: 09/04/23                                                                     *
* Descripción:Escriba un programa que dado el peso de una persona en libras (1 libra =0.453592 Kg)  *
* y su estatura en centímetros, calcule su IMC e indique como salida el peso en kilogramos, el valor*
*                                     de IMC de la persona y la categoría en la cual fue clasificado*
* ***************************************************************************************************/     
   
        public static void LibrasIMC() {
            // Declaración de variables y constante
            double pesoEnLibras, estaturaEnCm, pesoEnKg, estaturaEnM, imc;
            final double CONVERSION_LIBRAS_KG = 0.453592;
            
            System.out.print("\nPROGRAMA Libras a IMCD\n");

            // Pedir los datos al usuario
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su peso en libras: ");
            pesoEnLibras = sc.nextDouble();
            System.out.print("Ingrese su estatura en centímetros: ");
            estaturaEnCm = sc.nextDouble();

            // Convertir libras a kilogramos y centímetros a metros
            pesoEnKg = pesoEnLibras * CONVERSION_LIBRAS_KG;
            estaturaEnM = estaturaEnCm / 100.0;

            // Calcular el IMC
            imc = pesoEnKg / Math.pow(estaturaEnM, 2);

            // Mostrar resultados
            System.out.printf("Su peso en kilogramos es: %.2f kg\n", pesoEnKg);
            System.out.printf("Su índice de masa corporal es: %.2f\n", imc);
            System.out.print("Usted está clasificado como: ");
            if (imc < 16) {
                System.out.println("Criterio de ingreso");
            } else if (imc >= 16 && imc <= 16.9) {
                System.out.println("Infrapeso");
            } else if (imc >= 17 && imc <= 18.4) {
                System.out.println("Bajo peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Obesidad premórbida");
            } else if (imc >= 40 && imc <= 45) {
                System.out.println("Obesidad mórbida");
            } else {
                System.out.println("Obesidad hipermórbida");
            }
        }
    
/******************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                           *
* Fecha Creación: 09/04/23                                                    *
* Fecha Actualización: 09/04/23                                               *
* Descripción:  Programa JAVA que reciba como entrada un número entre 1 y 12 e*
* imprima el nombre del mes correspondiente. Tome teniendo en cuenta, posibles*
*                                              valores erróneos en la entrada.*
* *****************************************************************************/     
        
           public static void Mes() {
              Scanner sc = new Scanner(System.in);
              int mes;
              String nombreMes;
              
              System.out.print("\nPROGRAMA MES\n");
              // Solicitamos al usuario ingresar el número del mes
              System.out.print("Ingrese un número entre 1 y 12: ");
              mes = sc.nextInt();
              
              // Verificamos que el número ingresado esté dentro del rango válido
              if(mes < 1 || mes > 12) {
                 System.out.println("Número inválido de mes.");
              }
              else {
                 // Asignamos el nombre del mes correspondiente
                 switch(mes) {
                    case 1:
                       nombreMes = "Enero";
                       break;
                    case 2:
                       nombreMes = "Febrero";
                       break;
                    case 3:
                       nombreMes = "Marzo";
                       break;
                    case 4:
                       nombreMes = "Abril";
                       break;
                    case 5:
                       nombreMes = "Mayo";
                       break;
                    case 6:
                       nombreMes = "Junio";
                       break;
                    case 7:
                       nombreMes = "Julio";
                       break;
                    case 8:
                       nombreMes = "Agosto";
                       break;
                    case 9:
                       nombreMes = "Septiembre";
                       break;
                    case 10:
                       nombreMes = "Octubre";
                       break;
                    case 11:
                       nombreMes = "Noviembre";
                       break;
                    default:
                       nombreMes = "Diciembre";
                 }
                 
                 System.out.println("El mes correspondiente al número " + mes + " es " + nombreMes + ".");
              }
           }
        
 
    
    
}









