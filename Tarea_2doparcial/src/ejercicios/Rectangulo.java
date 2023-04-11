

/******************************************************************************************
*Autor:Kevin Arnold Cortés pacheco                                                        *
*Fecha Creación: 09/04/23                                                                 *
*Fecha Actualización: 09/04/23                                                            *
* Descripción:Haga una función para determinar si un punto (X, Y) está dentro de un       *
*       rectángulo. El rectángulo es definido por la coordenada del vértice superior      *
*                                         izquierdo, su altura y su ancho.                *
* *****************************************************************************************/ 

package ejercicios;
public class Rectangulo {
    public static boolean puntosRectangulo(double x, double y, double rectX, double rectY, double rectW, double rectH) {
        if (x < rectX || x > rectX + rectW) {
            return false;
        }

        if (y < rectY || y > rectY + rectH) {
            return false;
        }

        return true;
    }
}

