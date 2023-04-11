/**************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                    *
*Fecha Creación: 09/04/23                                                             *
*Fecha Actualización: 09/04/23                                                        *
* Descripción:Haga un algoritmo para una función que reciba dos parámetros N y K y que*
*           retorne los K dígitos más a la izquierda de N. Por ejemplo, extraerDigitos*
*                                                         (542207, 2) debe retornar 54*
* *************************************************************************************/ 
package ejercicios;
public class ExtraerDigitos {
    public static int main(int n, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("El valor de k debe ser mayor que cero");
        }

        String numS = Integer.toString(n);
        int numD = numS.length();

        if (k >= numD) {
            return n; // Si k es mayor o igual al número de dígitos, se retorna el número completo
        }

        String izqDigit = numS.substring(0, k);
        int derDigit = Integer.parseInt(izqDigit);

        return derDigit;
    }
}
