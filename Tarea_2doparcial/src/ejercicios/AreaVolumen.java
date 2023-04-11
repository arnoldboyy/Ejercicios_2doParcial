/******************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                        *
*Fecha Creación: 09/04/23                                                                 *
*Fecha Actualización: 09/04/23                                                            *
* Descripción:Escribir una función que calcule el área de un círculo y otra que calcule el*
*                                       volumen de un cilindro usando la primera función  *
* *****************************************************************************************/ 
package ejercicios;
public class AreaVolumen {
    public static double circuloArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double cilindroVolumen(double rad, double h) {
        return circuloArea(rad) * h;
    }

public static void main(String[] args) {
    double rad = 5.0;
    double h = 10.0;

    double area = AreaVolumen.circuloArea(rad);
    System.out.println("El área del círculo es: " + area);

    double volume = AreaVolumen.cilindroVolumen(rad, h);
    System.out.println("El volumen del cilindro es: " + volume);
}
}

