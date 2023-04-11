/*************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                   *
*Fecha Creación: 09/04/23                                                            *
*Fecha Actualización: 09/04/23                                                       *
* Descripción:Haga una función que reciba como entrada un mes del año y determine el *
*  número de días transcurridos desde el comienzo del año hasta el primer día del mes*
* ************************************************************************************/ 
package ejercicios;
public class NumDias {
    public static int diasAño(int mes) {
        int[] dias = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        // Días transcurridos en el inicio de cada mes
        // Se asume que el año no es bisiesto y febrero tiene 28 días

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12");
        }

        return dias[mes - 1];
    }
}
